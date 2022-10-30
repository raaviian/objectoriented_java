import java.util.Scanner; //java package

public class question4 { //class file
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //scanner

        System.out.print("Enter float: ");
        float myFloat = input.nextFloat(); //input user's float datatype
        System.out.println("Float entered = " + myFloat);

        System.out.print("Enter double: ");
        double myDouble = input.nextDouble(); //input user's douoble datatype
        System.out.println("Double entered = " + myDouble);

        System.out.print("Enter text: ");
        String myString = input.next(); //input user's string datatype
        System.out.println("Text entered = " + myString);
    }
}
