package ru.geekbrains.lesson6.srp2;

public class OrderMaker {
    private OrderInput input;
    private OrderSaver saver;
    public OrderMaker(OrderInput input, OrderSaver saver) {
        this.input = input;
        this.saver = saver;
    }
    public void makeOrder(){
        Order order = new Order(input.inputName(), input.inputProduct(), input.inputQnt(), input.inputPrice());
        saver.saveOrder(order);
    }
}
