package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Logger;
import com.mygdx.game.screen01.ScreenGo;

public class Go extends Game {
	AssetManager assetManager;

	public AssetManager getAssetManager() {
		return assetManager;
	}

	
	@Override
	public void create () {
		assetManager = new AssetManager();
		Gdx.app.setLogLevel(Logger.DEBUG);
		selectFirstScreen();
	}

	public void selectFirstScreen() {
		setScreen(new ScreenGo(this));
	}

	public void safeExit() {
		Gdx.app.exit();
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {

	}
}
