package ru.geekbrains.task1;

public class Lunch {

    public static void main(String[] args) {

        // Бегуны
        Cat[] runners = {
                new Cat("Барсик", 3),
                new Cat("Персик", 2),

        };


        // Препятствия
        Plate bowl = new Plate(4);


        for (Cat runner : runners) {

            if (Cat.Eat(bowl.getFullness(), runner)) {
                System.out.printf("%s поел \n", runner.getName());
                runner.changeSatiety();
                bowl.changeFullness(runner.getAppetite());


            } else {
                System.out.printf("%s видет еды мало и не будет есть с этой тарелки \n", runner.getName());

            }
            bowl.info();

        }
        for (Cat runner : runners) {

            if (runner.getSatiety()) {
                System.out.printf("%s сытый. \n", runner.getName());
            } else {
                System.out.printf("%s остался гололдным \n", runner.getName());
            }
        }
    }
}
