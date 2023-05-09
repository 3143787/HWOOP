package ru.geekbrains.task1;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    void changeSatiety(){
        this.satiety = true;
    }
    static boolean Eat(int height , Cat cat0) {
        if (height >= cat0.getAppetite()){

            return true;
        }
        else{

            return false;
        }
    }

}
