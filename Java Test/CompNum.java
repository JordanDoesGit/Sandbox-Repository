import java.util.Scanner;

public class CompNum {
    public static void main(String[] args) {
        // creates a new scanner
        Scanner scan = new Scanner(System.in);    

        // accepting two intergers
        System.out.print("Imput the first intiger: ");
        int num1 = scan.nextInt();
        System.out.print("imput the second integer: ");
        int num2 = scan.nextInt();

        //check if the two numbers are equal
        if(num1 == num2 ){
            System.out.println("Result: they are the same numbers");
        } else{
            // check if mod 6 is the same
            if(num1%6 ==num2%6){
                // print out smaller number
                if(num1 < num2){
                    System.out.println("Result: " + num1);
                } else{
                    System.out.println("Result: " + num2);
                }
            }else{
                // print out larger number 
                if(num1 > num2){
                    System.out.println(" Result: " + num1);
                }else{
                    System.out.println("Result: " + num2);
                }
            }
        }
    }
}
