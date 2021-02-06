package PracticeJava;

import org.testng.annotations.Test;

public class passwordValidation {

    @Test
    public void test1(){

        String password="abc123";


        String lowercase="(.*[a-z].*)";
        String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialChars="(.*[ -/, :-@].*)";

        boolean hasLower=password.matches(lowercase);
        boolean hasUpper=password.matches(uppercase);
        boolean hasNumbers=password.matches(numbers);
        boolean hasSpecialChar=password.matches(specialChars);

        boolean validation=false;


        if (password.length()>6 && password.contains(" ")) {

            if (hasLower &&hasNumbers && hasUpper && hasSpecialChar) {
                validation=true;
            }
        }

        System.out.println("validation = " + validation);
    }
}
