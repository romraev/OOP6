package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class ConsoleInput implements OrderInput{
    Scanner scanner = new Scanner(System.in);

    @Override
    public String inputName() {
        String clientName = processInput("Имя клиента: ");
        return clientName;
    }

    @Override
    public String inputProduct() {
        String productName = processInput("Продукт: ");
        return productName;
    }

    @Override
    public int inputQnt() {
        int qnt = Integer.parseInt(processInput("Кол-во: "));
        return qnt;
    }

    @Override
    public double inputPrice() {
        double price = Double.parseDouble(processInput("Цена: "));
        return price;
    }

    @Override
    public String processInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
