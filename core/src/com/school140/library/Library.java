package com.school140.library;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Library extends ApplicationAdapter {
    SpriteBatch batch;
    float startLogo = 0;
    static int allBook;
    static Screen screen;
Boolean save=true;
    Random random;
    Texture background;
    Texture logo ;
    static Preferences pref;
    static Preferences prefBackup;
    private int timerResize = 0;
    static Boolean saveGo=false;
    static Save mThing ;
    static Thread myThready;
    @Override
    public void create() {
        pref = Gdx.app.getPreferences("LibrarySave");

        prefBackup = Gdx.app.getPreferences("LibrarySaveBackup");
        if ((pref.get().size() == 0) && (prefBackup.get().size() != 0)) {

            pref = Gdx.app.getPreferences("LibrarySaveBackup");

        }

        random = new Random();
        background = new Texture("TreeButton/background" + (random.nextInt(3) + 1) + ".png");

        batch = new SpriteBatch();
        allBook = 0;
        screen = new Screen();

        screen.dataOfNewClass = new GregorianCalendar(2021, 7, 1);
        if (pref.getInteger("dataOfNewClassDay", 100) != 100) {
            screen.dataOfNewClass = new GregorianCalendar(
                    pref.getInteger("dataOfNewClassYear"),
                    pref.getInteger("dataOfNewClassMount"),
                    pref.getInteger("dataOfNewClassDay")
            );
        }

        for (int i = 0; i < pref.getInteger("readerLength", 0); i++) {
if (!(screen.chekNoNormalName(pref.getString("name" + i))||screen.chekNoNormalName(pref.getString("surname" + i))
        ||screen.chekNoNormalName(pref.getString("patronymic" + i)))) {
    Screen.readersArrayList.add(new Readers(
            pref.getString("name" + i),
            pref.getString("surname" + i),
            pref.getString("patronymic" + i),
            pref.getInteger("yearsLern" + i),
            pref.getString("charClass" + i)));
}else {
    System.out.println(pref.getString("name" + i)+
            pref.getString("surname" + i));
}
        }

        for (int i = 0; i < pref.getInteger("bookNumber", 0); i++) {

            if (!(screen.chekNoNormalName(pref.getString("bookName" + i)) || screen.chekNoNormalName(pref.getString("bookAuthor" + i))
                    || screen.chekNoNormalName(pref.getString("bookGenre" + i)))) {
                Screen.bookArrayList.add(new Book(
                        pref.getString("bookName" + i),
                        pref.getString("bookAuthor" + i),
                        pref.getString("bookGenre" + i),
                        pref.getString("bookDescription" + i)
                        , pref.getString("bookCover" + i)
                ));


            if (pref.getBoolean("bookGiven" + i)) {

                for (Readers readers : Screen.readersArrayList) {

                    if (
                            (readers.name.equals(pref.getString("bookReaderName" + i))) &&
                                    (readers.surname.equals(pref.getString("bookReaderSurname" + i))) &&
                                    (readers.patronymic.equals(pref.getString("bookReaderPatronymic" + i))) &&
                                    (readers.yearsLern == (pref.getInteger("bookReaderYearsLern" + i))) &&
                                    (readers.charClass.equals(pref.getString("bookReaderCharClass" + i)))
                    ) {
                        Screen.bookArrayList.get(i-(int)startLogo).reader = readers;


                    }
                }
                Screen.bookArrayList.get(i-(int)startLogo).dataOfGiven = new GregorianCalendar(
                        pref.getInteger("bookReaderDateYear" + i),
                        pref.getInteger("bookReaderDateMount" + i),
                        pref.getInteger("bookReaderDateDay" + i)
                );


            }

        }else {
                startLogo++;
            }
        }
        screen.allBookListFullUpdate();
        Screen.genreSearch.setItems(" Неопределенный жанр", " Учебники[" + Screen.genre1 + "]", " Классика[" + Screen.genre2 + "]", " Детская литература[" + Screen.genre3 + "]", " Справочная литература[" + Screen.genre4 + "]", " Зарубежная литература[" + Screen.genre5 + "]");

        Screen.bookOnHendNumberInt = pref.getInteger("bookOnHendNumberInt");

        Screen.bookNumberOfHend = pref.getInteger("bookNumberOfHend");
Screen.bookOnHendNumber.setText(" "+(Screen.bookOnHendNumberInt));

        if (((new GregorianCalendar()).getTime().getMonth() > 5) && ((new GregorianCalendar()).getTime().getMonth() < 9)) {
            if (screen.dataOfNewClass.getTimeInMillis() + 3.156e+10 < (new GregorianCalendar()).getTimeInMillis()) {
                for (Readers readers : Screen.readersArrayList) {
                    readers.yearsLern++;


                }

                pref.putInteger("dataOfNewClassDay", screen.dataOfNewClass.getTime().getDate());
                pref.putInteger("dataOfNewClassMount", screen.dataOfNewClass.getTime().getMonth());
                pref.putInteger("dataOfNewClassYear", screen.dataOfNewClass.getWeekYear());
                int readerSize = Screen.readersArrayList.size();
                for (int i = 0; i < readerSize; i++) {
                    if (Screen.readersArrayList.get(i).yearsLern == 12) {
                        Screen.logNewString((new GregorianCalendar()).getTime() + " читатель выпустился из 11 класса " + Screen.readersArrayList.get(i).surname + " " + Screen.readersArrayList.get(i).name );
                        Screen.readersArrayList.remove(i);
                        readerSize--;
                        i--;
                       }


                }
                screen.dataOfNewClass.add(GregorianCalendar.YEAR, 1);
            }
        }
        if ((pref.get().size() != 0)) {

            for (int i = 0; i < Screen.bookArrayList.size(); i++) {
                prefBackup.putString("bookName" + i, Screen.bookArrayList.get(i).name);
                prefBackup.putString("bookAuthor" + i, Screen.bookArrayList.get(i).author);
                prefBackup.putString("bookDescription" + i, Screen.bookArrayList.get(i).description);
                prefBackup.putString("bookGenre" + i, Screen.bookArrayList.get(i).genre);
                prefBackup.putBoolean("bookGiven" + i, (Screen.bookArrayList.get(i).reader != null));
                prefBackup.putString("bookCover" + i, (Screen.bookArrayList.get(i).coverBook));
                if (Screen.bookArrayList.get(i).reader != null) {
                    prefBackup.putInteger("bookReaderDateYear" + i, Screen.bookArrayList.get(i).dataOfGiven.getWeekYear());
                    prefBackup.putInteger("bookReaderDateMount" + i, Screen.bookArrayList.get(i).dataOfGiven.getTime().getMonth());
                    prefBackup.putInteger("bookReaderDateDay" + i, Screen.bookArrayList.get(i).dataOfGiven.getTime().getDate());

                    prefBackup.putString("bookReaderName" + i, Screen.bookArrayList.get(i).reader.name);
                    prefBackup.putString("bookReaderSurname" + i, Screen.bookArrayList.get(i).reader.surname);
                    prefBackup.putString("bookReaderPatronymic" + i, Screen.bookArrayList.get(i).reader.patronymic);
                    prefBackup.putInteger("bookReaderYearsLern" + i, Screen.bookArrayList.get(i).reader.yearsLern);
                    prefBackup.putString("bookReaderCharClass" + i, Screen.bookArrayList.get(i).reader.charClass);

                }


            }
            prefBackup.putInteger("readerLength", Screen.readersArrayList.size());
            for (int i = 0; i < Screen.readersArrayList.size(); i++) {
                prefBackup.putString("name" + i, Screen.readersArrayList.get(i).name);
                prefBackup.putString("surname" + i, Screen.readersArrayList.get(i).surname);
                prefBackup.putString("patronymic" + i, Screen.readersArrayList.get(i).patronymic);
                prefBackup.putInteger("yearsLern" + i, Screen.readersArrayList.get(i).yearsLern);
                prefBackup.putString("charClass" + i, Screen.readersArrayList.get(i).charClass);
            }


            prefBackup.putInteger("bookOnHendNumberInt", Screen.bookOnHendNumberInt);
            prefBackup.putInteger("bookNumber", Screen.bookArrayList.size());
            prefBackup.putInteger("bookNumberOfHend", Screen.bookNumberOfHend);

            prefBackup.putInteger("dataOfNewClassDay", screen.dataOfNewClass.getTime().getDate());
            prefBackup.putInteger("dataOfNewClassMount", screen.dataOfNewClass.getTime().getMonth());
            prefBackup.putInteger("dataOfNewClassYear", screen.dataOfNewClass.getWeekYear());


            prefBackup.flush();


        }
        Screen.numberAllBook.setText(" " + Screen.bookArrayList.size());
        Screen.readerNumber.setText(" " + Screen.readersArrayList.size());
        Screen.readerNumber.setText(" " + Screen.readersArrayList.size());
        Screen.bookOnLibrary.setText(" " + (Screen.bookArrayList.size() - Screen.bookOnHendNumberInt));
        pref = Gdx.app.getPreferences("LibrarySave");
        screen.getAuthorForSearch();
        screen.authorSearch.setItems(screen.authorForSerch);
        saveAll();


        Gdx.files.external("/.prefs/Library").mkdirs();
        Gdx.files.external("/.prefs/Library/cover").mkdirs();
        try(FileWriter writer = new FileWriter( (Gdx.files.external("/.prefs/Library/report.txt")).file(), true))
        {
            writer.write( "");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } try(FileWriter writer = new FileWriter( (Gdx.files.external("/.prefs/Library/report.txt")).file(), true))
        {
            writer.write( "");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        startLogo = 1000;

    }

    @Override
    public void render() {
     //   try {
// TODO: 17.02.2022 вкл отловливатель



        if (timerResize > 0) {
            timerResize--;
        }

if ((new GregorianCalendar()).getTime().getHours()%2==0){
if (save){
    saveAll();
    save=false;
}

}else if ((new GregorianCalendar()).getTime().getHours()%2==1){
    if (!save){
        save=true;
    }
}



        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        batch.draw(background, 0, 0, 1000, 600);

        Screen.imgRender(batch);


        if (Gdx.input.isKeyPressed(Input.Keys.ESCAPE)) {
            startLogo = 1111;
            logo.dispose();
        }

        if (startLogo < 1109) {
            logo = new Texture(Gdx.files.internal("logo/foto0000_" + (int) startLogo + ".jpg"));
            batch.draw(logo, 0, 0, 1000, 600);
            startLogo += 0.5;
            if (startLogo == 1109) {
                logo.dispose();
            }
        }


        batch.end();
        if (startLogo > 1108) {
            Screen.render();
        }
//        }catch (Exception e){
//            try(FileWriter writer = new FileWriter((Gdx.files.external("/.prefs/Library/crash"+(new GregorianCalendar()).getTime().toString().split(":")+".txt")).file().getAbsolutePath(), false))
//            {
//
//                writer.write(e.toString());
//
//                writer.flush();
//            }
//            catch(IOException ex){
//
//                System.out.println(ex.getMessage());
//            }
//        }
    }

    @Override
    public void resize(int width, int height) {
        if (timerResize < 100) {
            if ((Gdx.graphics.getDisplayMode(Gdx.graphics.getMonitor()).height == 768) && (Gdx.graphics.getDisplayMode(Gdx.graphics.getMonitor()).width == 1366)) {
                System.setProperty("org.lwjgl.opengl.Window.undecorated", "true");
                Gdx.graphics.setWindowedMode(Gdx.graphics.getDisplayMode().width, Gdx.graphics.getDisplayMode().height);

            } else {
                Gdx.graphics.setWindowedMode(1366, 768);
            }


            Screen.stage.getViewport().update(width, height, true);

            screen.mainMenuTable.setPosition(0, Gdx.graphics.getHeight() / 2 - Screen.newBook.getHeight() - 16);
            Screen.infoMenuTable.setPosition(Gdx.graphics.getWidth() / 4 * 3-14, Gdx.graphics.getHeight() / 3 + Screen.nameBookWindow.getHeight());
            screen.tableListAllBook.clear();
            screen.allBookScrollPane.setScrollingDisabled(true, false);
            screen.tableListAllBook.add(screen.allBookScrollPane)
                    .size(Gdx.graphics.getWidth() / 2 - 100, Gdx.graphics.getHeight() - 7 * screen.bookAdded.getHeight());
            screen.tableListAllBook.setPosition(Gdx.graphics.getWidth() / 3 - Gdx.graphics.getWidth() / 10, Gdx.graphics.getHeight() / 2 - screen.bookAdded.getHeight() / 2);

            screen.tableListAllReader.clear();
            screen.allReaderScrollPane.setScrollingDisabled(true, false);
            screen.tableListAllReader.add(screen.allReaderScrollPane)
                    .size(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() - 4 * screen.bookAdded.getHeight() - 3 * Screen.newBook.getHeight());
            screen.tableListAllReader.setPosition(Gdx.graphics.getWidth() / 4 + 10, Gdx.graphics.getHeight() / 2);

            screen.readersOnGivMenuTable.setPosition(Gdx.graphics.getWidth() / 4 + 10, 0);
            Screen.giveBookButtonTable.setPosition(0, -Gdx.graphics.getHeight() / 4);
            screen.bookOnGivMenuTable.setPosition(-Gdx.graphics.getWidth() / 4 + 10, 0);
            screen.erorTextField.setPosition(Gdx.graphics.getWidth() / 2 - screen.erorTextField.getWidth() / 2, 20);
            Screen.descriptionInfoTable.clear();
            Screen.descriptionInfoTable.add(screen.descriptionScrollPane).size(Gdx.graphics.getWidth() / 3 - 20, Gdx.graphics.getHeight() / 5);
            Screen.descriptionInfoTable.setPosition(Gdx.graphics.getWidth() / 4 * 3 + 80, Gdx.graphics.getHeight() / 3 + Screen.nameBookWindow.getHeight() - 3 * Screen.numberBookOfHendWindow.getHeight() - Gdx.graphics.getHeight() / 10);
            Screen.numberAllBookTable.setPosition(2 * Screen.numberAllBook.getWidth() + 36
                    , Screen.numberAllBook.getHeight() + 10);
            screen.addNewBookTable.setPosition(0, -5 * Screen.nameBook.getHeight() + 50);


            timerResize += 100;
        }
    }

    public static void saveNewBook(String nameBook, String author, String descriptionString, String genre, String coverBook) {
        if (!saveGo){
            saveGo=true;

        pref.putString("bookName" + Screen.bookArrayList.size(), nameBook);
        pref.putString("bookAuthor" + Screen.bookArrayList.size(), author);
        pref.putString("bookDescription" + Screen.bookArrayList.size(), descriptionString);
        pref.putString("bookGenre" + Screen.bookArrayList.size(), genre);
        pref.putBoolean("bookGiven" + Screen.bookArrayList.size(), false);
        pref.putString("bookCover" + Screen.bookArrayList.size(), coverBook);
        pref.putInteger("bookNumber", Screen.bookArrayList.size());
        pref.flush();
            saveGo=false;
    }}

    public static void saveNewReader(String name, String surname, String patronymic, int yearsLern, String charClass) {
        if (!saveGo){
            saveGo=true;
        pref.putInteger("readerLength", Screen.readersArrayList.size());

        pref.putString("name" + Screen.readersArrayList.size(), name);
        pref.putString("surname" + Screen.readersArrayList.size(), surname);
        pref.putString("patronymic" + Screen.readersArrayList.size(), patronymic);
        pref.putInteger("yearsLern" + Screen.readersArrayList.size(), yearsLern);
        pref.putString("charClass" + Screen.readersArrayList.size(), charClass);
        pref.flush();
            saveGo=false;
    }}

    public static void saveBookGiver(int i, int WeekYear, int getMonth
            , int Date, String name, String surname, String patronymic, int yearsLern, String charClass) {
        if (!saveGo){
            saveGo=true;
        pref.putBoolean("bookGiven" + i, true);

        pref.putInteger("bookReaderDateYear" + i, WeekYear);
        pref.putInteger("bookReaderDateMount" + i, getMonth);
        pref.putInteger("bookReaderDateDay" + i, Date);

        pref.putString("bookReaderName" + i, name);
        pref.putString("bookReaderSurname" + i, surname);
        pref.putString("bookReaderPatronymic" + i, patronymic);
        pref.putInteger("bookReaderYearsLern" + i, yearsLern);
        pref.putString("bookReaderCharClass" + i, charClass);
        pref.putInteger("bookOnHendNumberInt", Screen.bookOnHendNumberInt);
        pref.putInteger("bookNumberOfHend", Screen.bookNumberOfHend);
        pref.flush();
            saveGo=false;
    }}

    public static void saveBookReturn(int index) {
        if (!saveGo){
            saveGo=true;
        pref.putInteger("bookOnHendNumberInt", Screen.bookOnHendNumberInt);
        pref.putInteger("bookNumberOfHend", Screen.bookNumberOfHend);
        pref.putBoolean("bookGiven" + index, false);
        pref.flush();
            saveGo=false;
    }}

    public static void saveAll()
    {
//        if (!saveGo){

        if (!Library.saveGo){
            Library.saveGo=true;
        mThing = new Save();
         myThready = new Thread(mThing);
        myThready.start();}

    }

    ;


    @Override
    public void dispose() {
        if (!saveGo) {
            saveGo = true;

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


            batch.dispose();
            Screen.stage.dispose();
            Screen.imageWindow.dispose();
            Screen.skinTree.dispose();
            Screen.skinTree.dispose();


            background.dispose();


                saveGo=false;
        }else {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dispose();
            // TODO: 16.02.2022 не уверен, что это коректно
        }

    }
}
