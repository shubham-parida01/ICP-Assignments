public class Question8 {
    public static boolean isPalindrome(String str) {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return str.equals(rev.toString());
    }
    
    public static void main(String[] args) {
        
    }
}
