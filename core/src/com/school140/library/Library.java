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
	public void create () {

		batch = new SpriteBatch();
		allBook=0;
 screen = new Screen();

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		Screen.errorRender(batch);
		Screen.imgRender(batch);

		batch.end();
		Screen.render();
	}

	@Override
	public void resize (int width, int height) {
		// See below for what true means.
		Screen.stage.getViewport().update(width, height, true);
		Screen.errorCord.clear();
		screen.mainMenuTable.setPosition(0, Gdx.graphics.getHeight()/2-screen.newBook.getHeight()-8);
		screen.infoMenuTable.setPosition(Gdx.graphics.getWidth()/4*3,Gdx.graphics.getHeight()/3);
		screen.tableListAllBook.clear();
		screen.tableListAllBook.add(screen.allBookScrollPane)
				.size(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()-2*screen.bookAdded.getHeight()-70);
		screen.tableListAllBook.setPosition(Gdx.graphics.getWidth()/4+10,Gdx.graphics.getHeight()/2-30);

	}

	@Override
	public void dispose () {
		batch.dispose();
		Screen.stage.dispose();
	}




}
