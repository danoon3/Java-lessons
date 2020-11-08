package ru.geekbrains.java_one.lesson_a.online;

public class Lesson_2 {
    //Задание №1
        private static void array(int[] a){
          for(int i = 0; i < a.length; i++){
                  if(a[i] == 0){
                      a[i] = 1;
                  } else {
                      a[i] = 0;
                  }
                  System.out.print(a[i]);
          }
                 }
    //Задание №2
       private static void array1(int[] a){
            System.out.println();
            for(int i = 0; i < a.length; i++){
               switch (i) {
                   case 0:
                       a[i] = 1;
                       break;
                   case 1:
                       a[i] = 4;
                       break;
                   case 2:
                       a[i] = 7;
                       break;
                   case 3:
                       a[i] = 10;
                       break;
                   case 4:
                       a[i] = 13;
                       break;
                   case 5:
                       a[i] = 16;
                       break;
                   case 6:
                       a[i] = 19;
                       break;
                   case 7:
                       a[i] = 22;
                       break;
               }
               System.out.print(a[i] + " ");
            }

        }
    //Задание №3
        private static void array2(int[] a){
            System.out.println();
            for(int i = 0; i < a.length; i++){
                if(a[i] < 6)  a[i] *= 6;
                System.out.print(a[i] + " ");
            }
        }
    //Задание №4
        private static void max(int[] a){
            System.out.println();
            int max = 0;
            for(int i = 0; i < a.length; i++){
                if(max < a[i]) {
                    max = a[i];
                }
            }
            System.out.println(max );
        }
        private static void min(int[] a){
            int minimum = a[0];
            for(int i = 0; i < a.length; i++){
                if(minimum > a[i]) {
                    minimum = a[i];
                }
            }
            System.out.println(minimum);
        }

    public static void main(String[] args){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        array(arr);

        int[] arr1 = new int[8];
        array1(arr1);

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        array2(arr2);

        int[] arr3 = {30, 45, 40, 98, 35};

        max(arr3);
        min(arr3);
    }
}
