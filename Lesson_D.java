package ru.geekbrains.java_one.lesson_d.online;

public class Lesson_D {
       public static void main(String[] args){

        employee e1 = new employee("Ivanov Oleg", "Manager", 553, 30000, 30);
        employee e2 = new employee("Chernikov Denis", "Programmer", 770, 100000,45);
        employee e3 = new employee("Polyakova Irina", "Director", 953, 80000, 40);
        employee e4 = new employee("Mellin Berevan", "Vice President",548, 60000, 49);
        employee e5 = new employee("Alua Litorali", "Manager", 843, 31000, 42);
       System.out.println("Employee's name " + e1.getName() + " position " + e1.getPosition() + " phone " + e1.getPhone() + " salary " + e1.getSalary() + " age " + e1.getAge());

        System.out.println(e1.getName());
        System.out.println(e1.getPosition());


        employee[] arr = new employee[5];
        arr[0] = new employee("Ivanov Oleg", "Manager", 553, 30000, 30);
        arr[1] = new employee("Chernikov Denis", "Programmer", 770, 100000,40);
        arr[2] = new employee("Polyakova Irina", "Director", 953, 80000, 35);
        arr[3] = new employee("Mellin Berevan", "Vice President",548, 60000, 49);
        arr[4] = new employee("Alua Litorali", "Manager", 843, 31000, 42);



              for(int i = 0; i < arr.length; i++){
                if(arr[i].getAge() >= 40) System.out.println(arr[i]);
                  }
              }
         }


