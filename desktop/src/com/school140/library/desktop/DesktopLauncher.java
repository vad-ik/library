package com.school140.library.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.school140.library.Library;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

config.width=1000;
config.height=600;
config.addIcon("logoMini32.png", Files.FileType.Internal);
		new LwjglApplication(new Library(), config);
	}
}
