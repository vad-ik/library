package com.school140.library;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.GregorianCalendar;
import java.util.Random;

public class Library extends ApplicationAdapter {
    SpriteBatch batch;
float startLogo=1000;
    static int allBook;
    Screen screen;

    Random random;
    Texture background;
Texture logo;
    Preferences pref;
    Preferences prefBackup;

    @Override
    public void create() {
        pref=Gdx.app.getPreferences("LibrarySave");
        prefBackup=Gdx.app.getPreferences("LibrarySaveBackup");
       if ((pref.get().size()==0 )&&(prefBackup.get().size()!=0)){
           pref=Gdx.app.getPreferences("LibrarySaveBackup");

       }
        if ((pref.get().size()!=0 )){
            prefBackup=Gdx.app.getPreferences("LibrarySave");

        }

        random=new Random();
      background=new Texture("background"+(random.nextInt(3)+1)+".png") ;

        batch = new SpriteBatch();
        allBook = 0;
        screen = new Screen();

        screen.dataOfNewClass=new GregorianCalendar(2021,7,1);
if (  pref.getInteger("dataOfNewClassDay",100)!=100) {
    screen.dataOfNewClass = new GregorianCalendar(
            pref.getInteger("dataOfNewClassDay"),
            pref.getInteger("dataOfNewClassMount"),
            pref.getInteger("dataOfNewClassYear")
    );
}

         for (int i = 0; i < pref.getInteger("readerLength",0); i++) {
            Screen.readersArrayList.add(new Readers(
            pref.getString( "name"+i),
            pref.getString( "surname"+i),
            pref.getString( "patronymic"+i),
            pref.getInteger( "yearsLern"+i),
            pref.getString("charClass"+i)));
        }

        for (int i = 0; i < pref.getInteger("bookLength", 0); i++) {


            Screen.bookArrayList.add(new Book(
                    pref.getString("bookName"+i),
                    pref.getString("bookAuthor"+i),
                    pref.getString("bookGenre"+i),
                    pref.getString("bookDescription"+i)
                    ,pref.getString("bookCover"+i)
                    ));
            if(pref.getBoolean("bookGiven"+i)){

                for (Readers readers : Screen.readersArrayList) {

                    if (
                            ( readers.name.equals(   pref.getString("bookReaderName"+i)) )&&
                    ( readers.surname.equals(  pref.getString("bookReaderSurname"+i)))&&
                    (  readers.patronymic.equals( pref.getString("bookReaderPatronymic"+i)))&&
                    (  readers.yearsLern==( pref.getInteger("bookReaderYearsLern"+i)))&&
                    (  readers.charClass.equals( pref.getString("bookReaderCharClass"+i)))
                    ){
                        Screen.bookArrayList.get(i).reader=readers;


                    }
                }
                Screen.bookArrayList.get(i).dataOfGiven=new GregorianCalendar(
                pref.getInteger("bookReaderDateYear"+i),
                pref.getInteger("bookReaderDateMount"+i),
                pref.getInteger("bookReaderDateDay"+i)
);


            }



        }screen.allBookListUpdate();
        screen.bookOnHendNumberInt=pref.getInteger("bookOnHendNumberInt");
        screen.numberOfBook=pref.getInteger("bookNumber");
        screen.bookNumberOfHend=pref.getInteger("bookNumberOfHend");





       if ((screen.dataOfNewClass.getTime().getMonth()>5)&&(screen.dataOfNewClass.getTime().getMonth()<9)) {
           if (screen.dataOfNewClass.getTimeInMillis() + 3.156e+10 < (new GregorianCalendar()).getTimeInMillis()) {
               for (Readers readers : Screen.readersArrayList) {
                   readers.yearsLern++;
               }
               screen.dataOfNewClass.add(GregorianCalendar.YEAR,1);
           }
       }

    }

    @Override
    public void render() {





        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        batch.draw(background,0,0,1000,600);

        Screen.imgRender(batch);

        Screen.render();


        if (startLogo<1109) {
            logo=new Texture(Gdx.files.internal("logo/foto0000_"+(int)startLogo+".jpg"));
            batch.draw(logo, 0, 0, 1366, 768);
            startLogo+=0.5;
        }


        batch.end();


    }

    @Override
    public void resize(int width, int height) {
        // TODO: 01.09.2021 skreen size!!!
//        if ((Gdx.graphics.getHeight()<800)||(Gdx.graphics.getWidth()<1200)){
//            if ((Gdx.graphics.getHeight()==1080)||(Gdx.graphics.getWidth()==1920)){
//
//            }else{
//                if ((Gdx.graphics.getHeight()==900)||(Gdx.graphics.getWidth()==1440)){
//
//                }else{
//                    Gdx.graphics.setWindowedMode(1200,800);
//                }
//
//            }
//
//        }
       if ((Gdx.graphics.getDisplayMode(Gdx.graphics.getMonitor()).height==768)&&(Gdx.graphics.getDisplayMode(Gdx.graphics.getMonitor()).width==1366)){
            Gdx.graphics.setFullscreenMode(Gdx.graphics.getDisplayMode(Gdx.graphics.getMonitor()));
        }else {
       Gdx.graphics.setWindowedMode(1366,768);}

        Screen.stage.getViewport().update(width, height, true);

        screen.mainMenuTable.setPosition(0, Gdx.graphics.getHeight() / 2 - Screen.newBook.getHeight() - 8);
        Screen.infoMenuTable.setPosition(Gdx.graphics.getWidth() / 4 * 3, Gdx.graphics.getHeight() / 3+ Screen.nameBookWindowPreName.getHeight());
        screen.tableListAllBook.clear();
        screen.tableListAllBook.add(screen.allBookScrollPane)
                .size(Gdx.graphics.getWidth() / 3, Gdx.graphics.getHeight() - 7 * screen.bookAdded.getHeight() );
        screen.tableListAllBook.setPosition(Gdx.graphics.getWidth() / 4 -Gdx.graphics.getWidth() / 16, Gdx.graphics.getHeight() / 2- screen.bookAdded.getHeight()/2);

        screen.tableListAllReader.clear();
        screen.tableListAllReader.add(screen.allReaderScrollPane)
                .size(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() - 4 * screen.bookAdded.getHeight() - 3* Screen.newBook.getHeight());
        screen.tableListAllReader.setPosition(Gdx.graphics.getWidth() / 4 + 10, Gdx.graphics.getHeight() / 2 );

       // Screen.infoMenu2Table.setPosition(Gdx.graphics.getWidth() / 4 * 3, Gdx.graphics.getHeight() / 2);
        screen.readersOnGivMenuTable.setPosition(Gdx.graphics.getWidth() / 4 + 10, 0);
        Screen.giveBookButtonTable.setPosition(0, -Gdx.graphics.getHeight() /4);
        screen.bookOnGivMenuTable.setPosition(-Gdx.graphics.getWidth() / 4 + 10, 0);
        screen.erorTextField.setPosition(Gdx.graphics.getWidth() / 2 - screen.erorTextField.getWidth() / 2, 20);
        Screen.descriptionInfoTable.clear();
        Screen.descriptionInfoTable.add(screen.descriptionScrollPane).size(Gdx.graphics.getWidth()/3-20,Gdx.graphics.getHeight()/5);
        Screen.descriptionInfoTable.setPosition(Gdx.graphics.getWidth()/4*3+80,Gdx.graphics.getHeight() / 3+ Screen.nameBookWindowPreName.getHeight()-3* Screen.numberBookOfHendWindow.getHeight()-Gdx.graphics.getHeight()/10);

        screen.addNewBookTable.setPosition(0, -5 * Screen.nameBook.getHeight()+50);

        }

    @Override
    public  void dispose() {
       pref.putInteger("bookLength", Screen.bookArrayList.size());
        for (int i = 0; i < Screen.bookArrayList.size(); i++) {
             pref.putString("bookName"+i, Screen.bookArrayList.get(i).name);
            pref.putString("bookAuthor"+i, Screen.bookArrayList.get(i).author);
            pref.putString("bookDescription"+i, Screen.bookArrayList.get(i).description);
            pref.putString("bookGenre"+i, Screen.bookArrayList.get(i).genre);
            pref.putBoolean("bookGiven"+i, (Screen.bookArrayList.get(i).reader!=null));
            pref.putString("bookCover"+i, (Screen.bookArrayList.get(i).coverBook));
            if(Screen.bookArrayList.get(i).reader!=null){
                pref.putInteger("bookReaderDateYear"+i, Screen.bookArrayList.get(i).dataOfGiven.getWeekYear());
                pref.putInteger("bookReaderDateMount"+i, Screen.bookArrayList.get(i).dataOfGiven.getTime().getMonth());
                pref.putInteger("bookReaderDateDay"+i, Screen.bookArrayList.get(i).dataOfGiven.getTime().getDate());

                pref.putString("bookReaderName"+i, Screen.bookArrayList.get(i).reader.name);
                pref.putString("bookReaderSurname"+i, Screen.bookArrayList.get(i).reader.surname);
                pref.putString("bookReaderPatronymic"+i, Screen.bookArrayList.get(i).reader.patronymic);
                pref.putInteger("bookReaderYearsLern"+i, Screen.bookArrayList.get(i).reader.yearsLern);
                pref.putString("bookReaderCharClass"+i, Screen.bookArrayList.get(i).reader.charClass);

            }


        }
        pref.putInteger("readerLength", Screen.readersArrayList.size());
        for (int i = 0; i < Screen.readersArrayList.size(); i++) {
            pref.putString( "name"+i,Screen.readersArrayList.get(i).name);
            pref.putString( "surname"+i,Screen.readersArrayList.get(i).surname);
            pref.putString( "patronymic"+i,Screen.readersArrayList.get(i).patronymic);
            pref.putInteger( "yearsLern"+i,Screen.readersArrayList.get(i).yearsLern);
            pref.putString("charClass"+i,Screen.readersArrayList.get(i).charClass);
        }



        pref.putInteger("bookOnHendNumberInt",Screen.bookOnHendNumberInt);
       pref.putInteger("bookNumber",Screen.numberOfBook);
        pref.putInteger("bookNumberOfHend",Screen.bookNumberOfHend);

        pref.putInteger("dataOfNewClassDay",screen.dataOfNewClass.getTime().getDate());
        pref.putInteger("dataOfNewClassMount",screen.dataOfNewClass.getTime().getMonth());
        pref.putInteger("dataOfNewClassYear",screen.dataOfNewClass.getWeekYear());




pref.flush();
        batch.dispose();
        Screen.stage.dispose();
        Screen.imageWindow.dispose();
        Screen.skin.dispose();

    }


}
