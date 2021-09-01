package com.school140.library;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Library extends ApplicationAdapter {
    SpriteBatch batch;

    static int allBook;
    Screen screen;
    Texture logo;
    int logoSize;

    @Override
    public void create() {

        batch = new SpriteBatch();
        allBook = 0;
        screen = new Screen();

    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        Screen.imgRender(batch);

        batch.end();
        Screen.render();
    }

    @Override
    public void resize(int width, int height) {
        if ((Gdx.graphics.getHeight()<600)||(Gdx.graphics.getWidth()<1000)){
            Gdx.graphics.setWindowedMode(1000,600);
        }

        // See below for what true means.
        Screen.stage.getViewport().update(width, height, true);

        screen.mainMenuTable.setPosition(0, Gdx.graphics.getHeight() / 2 - screen.newBook.getHeight() - 8);
        Screen.infoMenuTable.setPosition(Gdx.graphics.getWidth() / 4 * 3, Gdx.graphics.getHeight() / 3+ Screen.nameBookWindowPreName.getHeight());
        screen.tableListAllBook.clear();
        screen.tableListAllBook.add(screen.allBookScrollPane)
                .size(Gdx.graphics.getWidth() / 3, Gdx.graphics.getHeight() - 3 * screen.bookAdded.getHeight() - 3*screen.newBook.getHeight());
        screen.tableListAllBook.setPosition(Gdx.graphics.getWidth() / 4 -Gdx.graphics.getWidth() / 16, Gdx.graphics.getHeight() / 2 );

        screen.tableListAllReader.clear();
        screen.tableListAllReader.add(screen.allReaderScrollPane)
                .size(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() - 2 * screen.bookAdded.getHeight() - 3*screen.newBook.getHeight());
        screen.tableListAllReader.setPosition(Gdx.graphics.getWidth() / 4 + 10, Gdx.graphics.getHeight() / 2 - 30);

        Screen.infoMenu2Table.setPosition(Gdx.graphics.getWidth() / 4 * 3, Gdx.graphics.getHeight() / 2);
        screen.readersOnGivMenuTable.setPosition(Gdx.graphics.getWidth() / 4 + 10, 0);
        Screen.giveBookButtonTable.setPosition(0, -Gdx.graphics.getHeight() / 4);
        screen.bookOnGivMenuTable.setPosition(-Gdx.graphics.getWidth() / 4 + 10, 0);
        screen.erorTextField.setPosition(Gdx.graphics.getWidth() / 2 - screen.erorTextField.getWidth() / 2, 20);
        Screen.descriptionInfoTable.clear();
        Screen.descriptionInfoTable.add(screen.descriptionScrollPane).size(Gdx.graphics.getWidth()/3-20,Gdx.graphics.getHeight()/5);
        Screen.descriptionInfoTable.setPosition(Gdx.graphics.getWidth()/4*3+80,Gdx.graphics.getHeight() / 3+ Screen.nameBookWindowPreName.getHeight()-3* Screen.numberBookOfHendWindow.getHeight()-Gdx.graphics.getHeight()/10);



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
