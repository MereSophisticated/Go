package com.mygdx.game.screen01;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.Logger;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.Go;
import com.mygdx.game.debug.DebugCameraController;
import com.mygdx.game.hud.HUD;

public class ScreenGoRenderer implements Disposable {
    public static final Logger log = new Logger(ScreenGoRenderer.class.getName(), Logger.DEBUG);
    public SpriteBatch batch;
    public OrthographicCamera camera;
    public float screenWidth = Gdx.graphics.getWidth();
    public float screenHeight = Gdx.graphics.getHeight();
    TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    public static float MAP_WIDTH;
    public static float MAP_HEIGHT;
    public static final float unitScale = 1 / 32f;


    AssetManager am;
    DebugCameraController dcc;
    ShapeRenderer sr;

    ScreenGoController controller;

    Go gameMain;


    public OrthographicCamera boardCam;
    public Viewport boardV;



    SpriteBatch sb;
    HUD hud;


    private Texture texture = new Texture(Gdx.files.internal("badlogic.jpg"));
    private Sprite sprite = new Sprite(texture);
    //"Equal" to the usual create method if you have everything in a single class
    public ScreenGoRenderer(Go game, ScreenGoController controller) {
        this.gameMain = game;
        batch = new SpriteBatch();
        map = new TmxMapLoader().load("gobanTileMap.tmx");
        renderer = new OrthogonalTiledMapRenderer(map, unitScale);
        MAP_WIDTH = ((TiledMapTileLayer) map.getLayers().get(0)).getWidth();
        MAP_HEIGHT = ((TiledMapTileLayer) map.getLayers().get(0)).getHeight();
        camera = new OrthographicCamera();
        camera.setToOrtho(true, unitScale * screenWidth, unitScale * screenHeight);
        camera.position.x = MAP_HEIGHT / 2;
        camera.position.y = MAP_WIDTH / 2;
        camera.update();


    }

    public void inputHandle() {
        if (Gdx.input.isKeyPressed(Input.Keys.ESCAPE)) gameMain.safeExit();

    }

    public void render(float delta) {
        renderer.setView(camera);
        renderer.render();
        inputHandle();
    }


    private void drawBoard() {

     }

    private void update() {
        hud.update();
    }


    public void dispose() {
        batch.dispose();
        sr.dispose();
        hud.dispose();
        log.debug("Dispose Screen");
    }

    public void resize(int width, int height) {

    }


}

