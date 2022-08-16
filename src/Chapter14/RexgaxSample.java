package Chapter14;

public class RexgaxSample {
    public static boolean isValidPhoneNumber(String phoneNumber){
        return phoneNumber.matches("[+][2][3][4][-]?[7-9][0-1]\\d{8}");
    }

}
