package com.mygdx.game.hud;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.screen01.ScreenGoController;

public class HUD implements Disposable, MyClickListener {



    public HUD() {

    }

    public void start() {

    }



    public void renderUpdate(Camera cameraFont, SpriteBatch batch, float dt) {

    }

    @Override
    public void dispose() {

    }

    @Override
    public boolean onClickEvent(float x, float y) {
        return true;
    }

    public void setState(){
    }

    public void update() {

    }
    /*
      Font based objects must be recalculated on resize event.
      Also position of text must be changed.
   */
    private void createFontBasedObjects(Camera boardCam, Viewport boardV) {

    }

    public void resize(int width, int height, Camera boardCam, Viewport boardV) {

    }
}

