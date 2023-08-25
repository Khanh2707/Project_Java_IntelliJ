import model.User;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String s[] = new String[7];
        Optional<String> checkNull = Optional.ofNullable(s[4]);

        if (checkNull.isPresent()) {
            String lowerCase = s[4].toLowerCase();
            System.out.println(lowerCase);
        }
        else {
            System.out.println("String isn't present");
        }

        Optional<User> user1 = Optional.empty();
        if (user1.isPresent()) {
            System.out.println("user1 is present");
        }
        else {
            System.out.println("user1 isn't present");
        }

        User user2 = new User(27,"Khánh","Male");
        Optional<User> checkEmpty = Optional.of(user2);
        if (checkEmpty.isPresent()) {
            System.out.println("user2 is present");
        }
        else {
            System.out.println("user2 isn't present");
        }
    }
}