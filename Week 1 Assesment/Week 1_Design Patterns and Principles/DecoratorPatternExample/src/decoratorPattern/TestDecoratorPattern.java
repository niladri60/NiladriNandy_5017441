package decoratorPattern;

public class TestDecoratorPattern {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("This is an email notification.");

        Notifier emailAndSmsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        emailAndSmsNotifier.send("This is an email and SMS notification.");

        Notifier emailSmsSlackNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        emailSmsSlackNotifier.send("This is an email, SMS, and Slack notification.");
    }
}
