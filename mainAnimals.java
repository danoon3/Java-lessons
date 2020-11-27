package ru.geekbrains.java_one.lesson_five;

public class mainAnimals {
    public static void main(String[] args){

        Cat c = new Cat("Old", 2, 200, 0 );
        Dog d = new Dog("Sharik",0.5f, 500, 10 );

        System.out.println("Cat " + c.name + " can run: " + c.getAnimalMaximumRun() +
                " m and Dog " + d.name + " can run: " + d.getAnimalMaximumRun() + " m ");
        double distance = Math.random() * 100;
        System.out.println ("Cat trying to run " + distance + " meters. Result: " + c.run(distance));
        System.out.println ("Cat trying to jump " + distance + " meters. Result: " + c.jump(distance));
        System.out.println ("Cat trying to swim " + distance + " meters. Result: " + c.swim(distance));
        System.out.println ("Dog trying to run " + distance + " meters. Result: " + d.run(distance));
        System.out.println ("Dog trying to jump " + distance + " meters. Result: " + d.jump(distance));
        System.out.println ("Dog trying to swim " + distance + " meters. Result: " + d.swim(distance));

    }

}
