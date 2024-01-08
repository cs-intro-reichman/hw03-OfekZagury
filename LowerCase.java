
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }
    public static String lowerCase(String s) {
        String lowerCased = "";
        for (int i = 0; i < s.length(); i++) {
            if ( 64 < s.charAt(i) && s.charAt(i) < 91)  {
                lowerCased += "" + (char) (s.charAt(i) + 32);
            } else 
               lowerCased += "" + (char) (s.charAt(i));
        }
        return lowerCased;
    }
}
