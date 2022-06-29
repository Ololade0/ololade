package ClassActivities;

public class StringRegularExpression {
    public static void main(String[] args) {
        int count = 0;

        String  s ="abcdabcdabca";
        for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)  == 'a'){
                    count++;
                    System.out.println(s.charAt(i));
                }
        }
        System.out.print("Total a's in String s : " + count);

    }
}
