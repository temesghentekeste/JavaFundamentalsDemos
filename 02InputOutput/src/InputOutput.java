import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        System.out.println("Welcome to Simple Input and Output Demo Program");

        //Declaring the Scanner Class for getting input from standard input device, keyboard
        Scanner sc = new Scanner(System.in);

        //String variable to hold the name of a person
        String name="";
        //Prompting a person to enter his/her name
        System.out.print("Enter your name please: ");

        //Accepting name from the keyboard and storing it in the 'name' variable
        name= sc.next();
        //Greeting the person
        System.out.println("Welcome " + name + " to Java Programming!");

    }
}
