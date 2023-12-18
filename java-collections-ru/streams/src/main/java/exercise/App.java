package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {

    public static long getCountOfFreeEmails(List<String> emailList){
        return emailList.stream()
                .filter(email -> isEmailOnFreeDomain(email))
                .count();
    }

    private static boolean isEmailOnFreeDomain(String email){
        return (email.contains("@gmail.com") || email.contains("@yandex.ru") || email.contains("@hotmail.com"));
    }
}
// END
