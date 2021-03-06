package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.molegro;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Molegro";
		config.height = 960; // resolution
		config.width = 1280;
		config.fullscreen = false; // no fullscreen yet

		new LwjglApplication(new molegro(), config);
	}
}
