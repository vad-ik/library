package com.school140.library;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;

import java.io.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Book  {
    String name;
    String author;
String coverBook;

String genre;
    String description;
GregorianCalendar dataOfGiven;
Readers reader;
    public Book() {

    }


    public Book(String name, String author , String genre, String description,String coverBook) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.description = description;
        Library.allBook+=1;
        this.coverBook=coverBook;
    }






    public void giveBook(Readers readers){
        dataOfGiven=new GregorianCalendar();
        reader=readers;
    }
    public boolean giveThisReader(Readers readers){
        if (readers.equals(reader)){
            return true;
        }else {
            return false;
        }
    }
    public void returnBook(){
        dataOfGiven.clear();
        dataOfGiven=null;
        reader=null;
    }






}
