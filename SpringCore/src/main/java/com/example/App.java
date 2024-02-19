package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Cart cart = applicationContext.getBean("cart",Cart.class);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Меню:");
            System.out.println("1. Додати товар до кошика");
            System.out.println("2. Видалити товар з кошика");
            System.out.println("3. Переглянути кошик");
            System.out.println("4. Вийти");
            System.out.print("Виберіть опцію: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    cart.addProductToCart();
                    break;
                case 2:
                    System.out.println("введіть id для видалення: ");
                    cart.removeProductFromCart(scanner.nextInt());
                    break;
                case 3:
                System.out.println(cart.getProductsFromCart());
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Неправильний вибір. Спробуйте знову.");
            }
        }
    }
}
