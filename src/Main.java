import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");

        System.out.print("Name: ");
        String clientName = sc.nextLine();

        System.out.print("Email: ");
        String clientEmail = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = Date.from(LocalDate.parse(
                        sc.nextLine(),
                        DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                .atStartOfDay(ZoneId.systemDefault())
                .toInstant());

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println();
        System.out.println("Enter order data: ");

        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());

        System.out.print("How many items to this order?: ");
        int itemsQuantity = sc.nextInt();
        sc.nextLine();

        Order order = new Order(orderStatus, client);

        for (int i = 0; i < itemsQuantity; i++) {
            System.out.printf("Enter #%d item data", i + 1);
            System.out.println();

            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(product, productPrice, quantity);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}