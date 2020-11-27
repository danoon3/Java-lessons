package ru.geekbrains.java_one.lesson_five;

public class Animals implements Bool {
    protected String name;
    protected double maximumJump;
    protected double maximumSwim;
    protected double maximumRun;


    public Animals(String name, double maximumJump, double maximumRun, double maximumSwim){
        this.name = name;
        this.maximumJump = maximumJump;
        this.maximumRun = maximumRun;
        this.maximumSwim = maximumSwim;
    }


    @Override
    public boolean jump(double length){
      return maximumJump > length;
    }

    @Override
    public boolean swim(double length) {
        return maximumSwim > length;
    }

    @Override
    public boolean run(double length) {
        return maximumRun > length;
    }


    double getAnimalMaximumRun() {
        return maximumRun;
    }

    double getAnimalMaximumJump() {
        return maximumJump;
    }

    double getAnimalMaximumSwim() {
        return maximumSwim;
    }

}
