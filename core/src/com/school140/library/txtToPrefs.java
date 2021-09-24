package com.school140.library;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class txtToPrefs {


    //нужен текст формата (класс фамилия имя отчество)
    static String s;
    static String[] arr;

static int colVo;

static int t=406;

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        s = scanner.nextLine();
        for (int i = 0; i < t; i+=0) {


            arr = scanner.nextLine().split("=");

            for (int j = 0; j <(Integer.parseInt(arr[2])) ; j++) {


            System.out.println(
                    "<entry key=\"bookAuthor"+i+"\">"+arr[0]+"</entry>");
                System.out.println("<entry key=\"bookName"+i+"\">"+arr[1]+"</entry>");
                System.out.println("<entry key=\"bookGenre"+i+"\">"+s+"</entry>");
                System.out.println("<entry key=\"bookCover"+i+"\">noimg.png</entry>");

                System.out.println("<entry key=\"bookGiven"+i+"\">false</entry>");
                System.out.println("<entry key=\"bookDescription"+i+"\"></entry>");


colVo++;
i++;
t++       ;
        }

            System.out.println("<entry key=\"bookLength\">"+colVo+"</entry>");
            System.out.println("<entry key=\"bookNumber\">"+colVo+"</entry>");




        }






    }
}
