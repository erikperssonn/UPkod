package com.example;

import java.io.*;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        

        double[] arrD = readTal1();
        String[] arrStr = readOrd1();
        long t0 = System.nanoTime();
        //MergeSort.mergeSortDouble(readTal1());
        //MergeSort.mergeSortString(readOrd1());
        //QuickSort.quickSortDouble(readTal1());
        //QuickSort.quickSortString(readOrd1());
        //BubbleSort.bubbleSortDouble(arrD);
        BubbleSort.bubbleSortString(arrStr);
        long t1 = System.nanoTime();
        long tRes = t1 - t0;
        System.out.println(tRes);

    }

    public static void printTal1(){

        try{
            String filePathTal1 = "C:\\Users\\erikp\\jt\\dataUP\\tal1.txt";
            File fileTal1 = new File(filePathTal1);
            FileWriter fileWriterTal1 = new FileWriter(fileTal1);

            for(int i = 0; i <= 1000; i++){
                Double random = Math.random() * 1000;
                fileWriterTal1.write(random.toString() + "\n");
                System.out.println(i);
            }

            fileWriterTal1.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printOrd1(){

        try{
            String filePathOrd1 = "C:\\Users\\erikp\\jt\\dataUP\\ord1.txt";
            File fileOrd1 = new File(filePathOrd1);
            FileWriter fileWriterOrd1 = new FileWriter(fileOrd1);
            Random random = new Random();

            for(int i = 0; i <= 1000; i++){
                Integer length = random.nextInt(10) + 1;
                String printStr = "";
                for(int j = 0; j <= length; j++){
                    char c = (char)(random.nextInt(26) + 'a');
                    Double randomDouble = Math.random();
                    boolean upper = randomDouble > 0.5;
                    c = upper ? c = Character.toUpperCase(c) : c;
                    printStr += c;
                }
                fileWriterOrd1.write(printStr + "\n");
            }

            fileWriterOrd1.close();

        } catch(IOException e){
            e.printStackTrace();
        }

    }

    public static double[] readTal1(){
        
        double[] result = new double[1000];
        try{
            String filePathTal1 = "C:\\Users\\erikp\\jt\\dataUP\\tal1.txt";
            File fileTal1 = new File(filePathTal1);
            FileReader fileReaderTal1 = new FileReader(fileTal1);
            BufferedReader bufferedReaderTal1 = new BufferedReader(fileReaderTal1);

            

            for(int i = 0; i < 1000; i++){
                result[i] = Double.parseDouble(bufferedReaderTal1.readLine());
                //System.out.println(i);
            }

            //System.out.println("Size:" + result.length);

            bufferedReaderTal1.close();
            
            //for(int i = 0; i <= 1000; i++){
            //    System.out.println(i);
            //}   

            

        } catch(IOException e){
            e.printStackTrace();
        }
        return result;
    }

    public static String[] readOrd1(){

        String[] result = new String[1000];
        
        try{
            File fileOrd1 = new File("C:\\Users\\erikp\\jt\\dataUP\\ord1.txt");
            FileReader fileReaderOrd1 = new FileReader(fileOrd1);
            BufferedReader bufferedReaderOrd1 = new BufferedReader(fileReaderOrd1);

            for(int i = 0; i < 1000; i++){
                result[i] = bufferedReaderOrd1.readLine();
                //System.out.println(i);
            }

           // System.out.println(result[745]);
           // System.out.println("Size:" + result.length);

            bufferedReaderOrd1.close();
        } catch(IOException e){
            e.printStackTrace();
        }

        return result;
    }


    
}