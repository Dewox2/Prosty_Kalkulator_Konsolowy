import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Poadaj a: ");
        double a = scanner.nextFloat();
        System.out.print("1: + \n2: - \n3: * \n4: / \n5: % \nWybierz operator: ");
        int operator = scanner.nextInt();
        System.out.print("Poadaj b: ");
        double b = scanner.nextFloat();

        if(operator == 1)
            System.out.print(String.format("%s + %s = ",a,b) + (a+b));
        else if(operator == 2)
            System.out.print(String.format("%s - %s = ",a,b) + (a-b));
        else if(operator == 3)
            System.out.print(String.format("%s * %s = ",a,b) + (a*b));
        else if(operator == 4)
            System.out.print(String.format("%s / %s = ",a,b) + (a/b));
        else if(operator == 5)
            System.out.print(String.format("%s %% %s = ",a,b) + (a%b));


    }
}