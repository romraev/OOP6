package ru.geekbrains.lesson6.srp2;

public interface OrderInput {

    String inputName();
    String inputProduct();
    int inputQnt();
    double inputPrice();
    String processInput(String message);

}
