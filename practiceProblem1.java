import java.util.Scanner;

class practiceProblem1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Character : ");
        String str = sc.next();

        if (str.length() == 1 && ((str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') || (str.charAt(0) >= 'a' && str.charAt(0) <= 'z'))) {
            if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u' || str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I' || str.charAt(0) == 'O' || str.charAt(0) == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Error");
        }

       
    }
}
