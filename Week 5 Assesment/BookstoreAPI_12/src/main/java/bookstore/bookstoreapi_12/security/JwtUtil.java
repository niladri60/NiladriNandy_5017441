package bookstore.bookstoreapi_12.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class JwtUtil {
    @Value("${jwt.secret}")
    private String secretKey;

    @Value("${jwt.expiration}")
    private long expirationTime;

    public String generateToken(UserDetails userDetails) {
        return Jwts.builder()
                .setClaims(new Claims() {
                    @Override
                    public int size() {
                        return 0;
                    }

                    @Override
                    public boolean isEmpty() {
                        return false;
                    }

                    @Override
                    public boolean containsKey(Object key) {
                        return false;
                    }

                    @Override
                    public boolean containsValue(Object value) {
                        return false;
                    }

                    @Override
                    public Object get(Object key) {
                        return null;
                    }

                    @Override
                    public Object put(String key, Object value) {
                        return null;
                    }

                    @Override
                    public Object remove(Object key) {
                        return null;
                    }

                    @Override
                    public void putAll(Map<? extends String, ?> m) {

                    }

                    @Override
                    public void clear() {

                    }

                    @Override
                    public Set<String> keySet() {
                        return Set.of();
                    }

                    @Override
                    public Collection<Object> values() {
                        return List.of();
                    }

                    @Override
                    public Set<Entry<String, Object>> entrySet() {
                        return Set.of();
                    }

                    @Override
                    public boolean equals(Object o) {
                        return false;
                    }

                    @Override
                    public int hashCode() {
                        return 0;
                    }

                    @Override
                    public String getIssuer() {
                        return "";
                    }

                    @Override
                    public Claims setIssuer(String s) {
                        return null;
                    }

                    @Override
                    public String getSubject() {
                        return "";
                    }

                    @Override
                    public Claims setSubject(String s) {
                        return null;
                    }

                    @Override
                    public String getAudience() {
                        return "";
                    }

                    @Override
                    public Claims setAudience(String s) {
                        return null;
                    }

                    @Override
                    public Date getExpiration() {
                        return null;
                    }

                    @Override
                    public Claims setExpiration(Date date) {
                        return null;
                    }

                    @Override
                    public Date getNotBefore() {
                        return null;
                    }

                    @Override
                    public Claims setNotBefore(Date date) {
                        return null;
                    }

                    @Override
                    public Date getIssuedAt() {
                        return null;
                    }

                    @Override
                    public Claims setIssuedAt(Date date) {
                        return null;
                    }

                    @Override
                    public String getId() {
                        return "";
                    }

                    @Override
                    public Claims setId(String s) {
                        return null;
                    }

                    @Override
                    public <T> T get(String s, Class<T> aClass) {
                        return null;
                    }
                })
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
    }

    public String extractUsername(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public boolean isTokenExpired(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody()
                .getExpiration()
                .before(new Date());
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        return (userDetails.getUsername().equals(extractUsername(token)) && !isTokenExpired(token));
    }
}
