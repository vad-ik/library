package com.school140.library;

import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Book {
    String name;
    String author;
    int number;
    int numberMein;
Texture coverBook;
String genre;
    ArrayList<Readers> readers=new ArrayList<>();
    ArrayList<GregorianCalendar> data=new ArrayList<>();
String description;

    public Book() {

    }

    public Book(String name, String author, int number , String genre, String description,Texture coverBook) {
        this.name = name;
        this.author = author;
        this.number = number;
        this.numberMein = number;
        this.genre = genre;
        this.description = description;
        Library.allBook+=number;
        this.coverBook=coverBook;
    }
//book isbn







    public void giveBook(Readers readers){
        this.numberMein--;
        this.readers.add(readers);
this.data.add(new GregorianCalendar());
    }
    public void returnBook(Readers readers){
        this.numberMein++;
        for (int i = 0; i < this.readers.size(); i++) {
            if(this.readers.get(i).equals(readers)){
                this.readers.remove(i);
                this.data.remove(i);
            }
        }

    }
    public void  addBook(int colVo){
        this.number+=colVo;
        this.numberMein+=colVo;
        Library.allBook+=colVo;
    }





}
