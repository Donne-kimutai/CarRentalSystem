import java.io.Console;

public class LoginSystem {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console not available. Run from command line.");
            return;
        }

        int attempts = 3;

        while (attempts > 0) {
            String inputUsername = console.readLine("Enter Username: ");
            char[] passwordChars = console.readPassword("Enter Password: ");
            String inputPassword = new String(passwordChars);

            if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
                System.out.println("Login successful!");
                break;
            } else {
                attempts--;
                System.out.println("Invalid credentials. Attempts left: " + attempts);
            }

            if (attempts == 0) {
                System.out.println("Account locked. Try again later.");
            }
        }
    }
}
