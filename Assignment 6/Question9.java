import java.util.Scanner;

public class Question9 {
    public static boolean passwordValidation(String str){
        int isDigit = 0;
        int otherCharacter = 0;
        for (int i = 0 ; i< str.length() ; i++){
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                isDigit++;
            }else if (!Character.isLetter(ch)){
                otherCharacter++;
            }
        }

        return str.length() >= 8 && isDigit >= 2 && otherCharacter == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        if (passwordValidation(password)){
            System.out.println("It is a valid password");
        } else {
            System.out.println("It is a Invalid Password");
        }
    }
}
