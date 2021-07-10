package com.school140.library;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.Viewport;

import java.util.ArrayList;
import java.util.GregorianCalendar;

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

		batch.end();
		Screen.render();
	}

	@Override
	public void resize (int width, int height) {
		// See below for what true means.
		Screen.stage.getViewport().update(width, height, true);
		Screen.errorCord.clear();
		screen.table.setPosition(0, Gdx.graphics.getHeight()/2-screen.newBook.getHeight()-8);
		screen.allBookListUpdate();
	}

	@Override
	public void dispose () {
		batch.dispose();
		Screen.stage.dispose();
	}




}
