package com.school140.library;

import com.badlogic.gdx.graphics.Color;

import java.util.Collections;
import java.util.Comparator;

class Save implements Runnable {


    public Save() {

    }
    public void run() {



            for (int i = 0; i < Screen.bookArrayList.size(); i++) {
                Library.pref.putString("bookName" + i, Screen.bookArrayList.get(i).name);
                Library.pref.putString("bookAuthor" + i, Screen.bookArrayList.get(i).author);
                Library.pref.putString("bookDescription" + i, Screen.bookArrayList.get(i).description);
                Library.pref.putString("bookGenre" + i, Screen.bookArrayList.get(i).genre);
                Library.pref.putBoolean("bookGiven" + i, (Screen.bookArrayList.get(i).reader != null));
                Library.pref.putString("bookCover" + i, (Screen.bookArrayList.get(i).coverBook));
                if (Screen.bookArrayList.get(i).reader != null) {
                    Library.pref.putInteger("bookReaderDateYear" + i, Screen.bookArrayList.get(i).dataOfGiven.getWeekYear());
                    Library.pref.putInteger("bookReaderDateMount" + i, Screen.bookArrayList.get(i).dataOfGiven.getTime().getMonth());
                    Library.pref.putInteger("bookReaderDateDay" + i, Screen.bookArrayList.get(i).dataOfGiven.getTime().getDate());

                    Library.pref.putString("bookReaderName" + i, Screen.bookArrayList.get(i).reader.name);
                    Library.pref.putString("bookReaderSurname" + i, Screen.bookArrayList.get(i).reader.surname);
                    Library.pref.putString("bookReaderPatronymic" + i, Screen.bookArrayList.get(i).reader.patronymic);
                    Library.pref.putInteger("bookReaderYearsLern" + i, Screen.bookArrayList.get(i).reader.yearsLern);
                    Library.pref.putString("bookReaderCharClass" + i, Screen.bookArrayList.get(i).reader.charClass);

                }


            }
            Library.pref.putInteger("readerLength", Screen.readersArrayList.size());
            for (int i = 0; i < Screen.readersArrayList.size(); i++) {
                Library.pref.putString("name" + i, Screen.readersArrayList.get(i).name);
                Library.pref.putString("surname" + i, Screen.readersArrayList.get(i).surname);
                Library.pref.putString("patronymic" + i, Screen.readersArrayList.get(i).patronymic);
                Library.pref.putInteger("yearsLern" + i, Screen.readersArrayList.get(i).yearsLern);
                Library.pref.putString("charClass" + i, Screen.readersArrayList.get(i).charClass);
            }


            Library.pref.putInteger("bookOnHendNumberInt", Screen.bookOnHendNumberInt);
            Library.pref.putInteger("bookNumber", Screen.bookArrayList.size());
            Library.pref.putInteger("bookNumberOfHend", Screen.bookNumberOfHend);


            Library.pref.putInteger("dataOfNewClassDay", Screen.dataOfNewClass.getTime().getDate());
            Library.pref.putInteger("dataOfNewClassMount", Screen.dataOfNewClass.getTime().getMonth());
            Library.pref.putInteger("dataOfNewClassYear", Screen.dataOfNewClass.getWeekYear());


            Library.pref.flush();

            Library.saveGo=false;



    }


}


