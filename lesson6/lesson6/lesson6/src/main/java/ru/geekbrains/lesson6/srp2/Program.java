package ru.geekbrains.lesson6.srp2;

public class Program {


    /**
     * TODO: Домашняя работа (программа 1),
     *  оптимизировать приложение в соответствии с принципом SOLID - SRP
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Укажите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        SaveToJson saveToJson = new SaveToJson(order);
        saveToJson.SaveFileToJson();


    }

}
