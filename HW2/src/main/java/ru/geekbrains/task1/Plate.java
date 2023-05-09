package ru.geekbrains.task1;

/**
 * Препятствие
 */
public class Plate {

    private int fullness;

    public Plate(int fullness) {
        this.fullness = fullness;
    }


    void changeFullness(int change) {
        this.fullness =fullness-change;

    }
    public int getFullness() {

        return fullness;

    }
    public void info() {
        System.out.printf("В миске: %d еды \n", fullness);
    }
    /**
     * Длина препятствия
     * @return

    int getLength();


     * Высота препятствия
     * @return

    int getHeight();
    */

}
