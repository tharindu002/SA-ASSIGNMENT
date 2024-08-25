import java.util.Scanner;

public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("you want extras with your tea(Yes/No)?");
        boolean teaExtras = scanner.nextLine().trim().equalsIgnoreCase("Yes");

        System.out.print("you want extras with your coffee (Yes/No)?");
        boolean coffeeExtras = scanner.nextLine().trim().equalsIgnoreCase("Yes");     
        
        Beverages Tea = new Tea();
        teaExtras = teaExtras || coffeeExtras;
        Beverages coffee = new Coffee();
        coffee.setNeedsExtraExtra(coffeeExtras);
        
        System.out.println("Making Tea");
        Tea.finalTemplateMethod();
        
        System.out.println("\nMaking Coffee");
        coffee.finalTemplateMethod();
        scanner.close();
        
    }
    
        
        
}