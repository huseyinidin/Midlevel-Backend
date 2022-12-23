package intro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Amount: ");
        double price = input.nextDouble();

        System.out.print("Card Number: ");
        String cardNumber = input.next();

        System.out.print("Expiration date: ");
        String date = input.next();

        System.out.print("Cvc: ");
        String cvc = input.next();

        System.out.println("1. A Bank");
        System.out.println("2. B Bank");
        System.out.println("3. C Bank");
        System.out.print("Chose a bank: ");
        int selectBank = input.nextInt();

        switch (selectBank) {
            case 1 -> {
                ABank aPos = new ABank("A bank", "111111", "111112");
                aPos.connect("127.1.1.1");
                aPos.payment(price, cardNumber, date, cvc);
            }
            case 2 -> {
                BBank bPos = new BBank("A bank", "111111", "111112");
                bPos.connect("127.1.1.1");
                bPos.payment(price, cardNumber, date, cvc);
            }
            default -> System.out.println("You selected an invalid bank!");
        }

    }
}
