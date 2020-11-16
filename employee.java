package ru.geekbrains.java_one.lesson_d.online;

public class employee {
    String name;
    String position;
    int phone;
    int salary;
    int age;


    employee(String name, String position, int phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
   public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public int getPhone(){
        return phone;
    }
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
}
