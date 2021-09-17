package com.school140.library;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.GregorianCalendar;
import java.util.Random;

public class Library extends ApplicationAdapter {
    SpriteBatch batch;

    static int allBook;
    Screen screen;
    Texture logo;
    int logoSize;
Random random;
    Texture background;



    @Override
    public void create() {
random=new Random();
      background=new Texture("background"+(random.nextInt(3)+1)+".png") ;

        batch = new SpriteBatch();
        allBook = 0;
        screen = new Screen();

        screen.dataOfNewClass=new GregorianCalendar();
        // TODO: 17.09.2021   <------загрузка сэйвов
if (screen.dataOfNewClass.getTimeInMillis()+3.156e+10<(new GregorianCalendar()).getTimeInMillis()){
    for (Readers readers : Screen.readersArrayList) {
        readers.yearsLern++;
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

        batch.end();
        Screen.render();


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

        screen.mainMenuTable.setPosition(0, Gdx.graphics.getHeight() / 2 - screen.newBook.getHeight() - 8);
        Screen.infoMenuTable.setPosition(Gdx.graphics.getWidth() / 4 * 3, Gdx.graphics.getHeight() / 3+ Screen.nameBookWindowPreName.getHeight());
        screen.tableListAllBook.clear();
        screen.tableListAllBook.add(screen.allBookScrollPane)
                .size(Gdx.graphics.getWidth() / 3, Gdx.graphics.getHeight() - 7 * screen.bookAdded.getHeight() );
        screen.tableListAllBook.setPosition(Gdx.graphics.getWidth() / 4 -Gdx.graphics.getWidth() / 16, Gdx.graphics.getHeight() / 2- screen.bookAdded.getHeight()/2);

        screen.tableListAllReader.clear();
        screen.tableListAllReader.add(screen.allReaderScrollPane)
                .size(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() - 4 * screen.bookAdded.getHeight() - 3*screen.newBook.getHeight());
        screen.tableListAllReader.setPosition(Gdx.graphics.getWidth() / 4 + 10, Gdx.graphics.getHeight() / 2 );

       // Screen.infoMenu2Table.setPosition(Gdx.graphics.getWidth() / 4 * 3, Gdx.graphics.getHeight() / 2);
        screen.readersOnGivMenuTable.setPosition(Gdx.graphics.getWidth() / 4 + 10, 0);
        Screen.giveBookButtonTable.setPosition(0, -Gdx.graphics.getHeight() /4);
        screen.bookOnGivMenuTable.setPosition(-Gdx.graphics.getWidth() / 4 + 10, 0);
        screen.erorTextField.setPosition(Gdx.graphics.getWidth() / 2 - screen.erorTextField.getWidth() / 2, 20);
        Screen.descriptionInfoTable.clear();
        Screen.descriptionInfoTable.add(screen.descriptionScrollPane).size(Gdx.graphics.getWidth()/3-20,Gdx.graphics.getHeight()/5);
        Screen.descriptionInfoTable.setPosition(Gdx.graphics.getWidth()/4*3+80,Gdx.graphics.getHeight() / 3+ Screen.nameBookWindowPreName.getHeight()-3* Screen.numberBookOfHendWindow.getHeight()-Gdx.graphics.getHeight()/10);

        screen.addNewBookTable.setPosition(0, -5 * screen.nameBook.getHeight()+50);

        }

    @Override
    public void dispose() {
        batch.dispose();
        Screen.stage.dispose();
        Screen.imageWindow.dispose();
        Screen.skin.dispose();
        Screen.coverBook.dispose();

    }


}
