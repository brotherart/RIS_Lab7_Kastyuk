import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    private static final String CONFIGURATION_PATH = "applicationContext.xml";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        ApplicationContext context = new ClassPathXmlApplicationContext(CONFIGURATION_PATH);
        FibonacciService service = (FibonacciService) context.getBean("service");

        while (true) {
            while (true) {
                try {
                    do {
                        System.out.println("\nВыберите действие: " +
                                "\n 1. Вывод чисел Фибоначчи" +
                                "\n 0. Выход");
                        choice = Integer.parseInt(scanner.next());
                    }while (choice < 0 || choice > 3);
                    break;
                }catch (NumberFormatException e){
                    System.out.println("Неверный ввод!");
                }
            }
            switch (choice){
                case 1: {
                    service.fibonacci();
                    break;
                }
                case 0:
                    return;
            }

        }
    }
}

