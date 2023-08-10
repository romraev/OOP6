package ru.geekbrains.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        OrderInput input = new ConsoleInput();
        OrderSaver saver = new JsonSaver();
        OrderMaker maker = new OrderMaker(input, saver);
        maker.makeOrder();



    }
}
