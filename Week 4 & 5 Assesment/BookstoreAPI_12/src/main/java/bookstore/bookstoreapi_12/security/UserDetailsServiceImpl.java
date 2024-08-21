package bookstore.bookstoreapi_12.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository; // Assume you have a UserRepository to fetch user data

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username); // Adjust according to your repository method
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new MyUserDetails(user); // MyUserDetails is a custom implementation of UserDetails
    }
}
