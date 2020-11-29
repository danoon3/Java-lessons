package ru.geekbrains.java_one.lesson_six;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

            public static void glueFiles(String[] names, String dName){
                try{
                    FileOutputStream output = new FileOutputStream(dName);
                    for (String name: names){
                        FileInputStream input = new FileInputStream(name);
                        int i;
                        do {
                            i = input.read();
                            if(i != -1){
                                output.write(i);
                            }
                        }while (i != -1);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
            }


        static String letters = "qwertyuiopasdfghjklzxcvbnm123456789";
        static Random randomize = new Random();

        public static void main(String[] args) {
            createFile("one.txt",createString(100));
            createFile("two.txt",createString(100));
            glueFiles (new String[]{"one.txt","two.txt"},"three.txt");
        }
        public static String createString(int length){
            StringBuilder builder = new StringBuilder(length);
            for (int i = 0; i < length; i++){
                builder.append(letters.charAt(randomize.nextInt(letters.length())));
            }
            return builder.toString();
        }

        public static void createFile(String fileName, String text){
            try{
                PrintWriter writer = new PrintWriter(fileName);
                writer.write(text);
                writer.close();

            } catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }
    }
