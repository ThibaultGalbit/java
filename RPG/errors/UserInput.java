package errors;

public class UserInput {

    public UserInput() {}

    public static boolean isInteger(String s) {
        return isInteger(s,10);
    }

    public static boolean isInteger(String s, int radix) {
        if (s.isEmpty())
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                if (s.length() == 1)
                    return false;
                else
                    continue;
            }
            if (Character.digit(s.charAt(i), radix) < 0)
                return false;
        }
        return true;
    }

    public static boolean checkErrors(String user_input) {

        if (user_input == null || user_input.equals("")) 
            return (false);
        if (!user_input.equals("z") && !user_input.equals("q") && !user_input.equals("s") && !user_input.equals("d"))
            return (false);
        else 
            return (true);
    }

    /*public static boolean checkErrors(String user_input, int max) {
        return true;
    }*/
}