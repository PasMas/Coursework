package by.coursework;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;


public class OptionsScreen implements Screen {
    OrthographicCamera camera;
    final MainClass game;
    Texture soundImage, backGround, options ,back ;
    Rectangle rectSoundImage, rectBack;


    public OptionsScreen(MainClass _game) {
        game = _game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
        rectSoundImage = new Rectangle(500, 280, 100, 100);
        rectBack = new Rectangle(10,10,50,50);

        if(game.sound)
            soundImage = new Texture("SoundIcon.png");
        else
            soundImage = new Texture("SoundIconOff.png");

        backGround = new Texture("background.png");
        options = new Texture("Options.png");
        back = new Texture("back.png");

        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean touchDown(int x, int y, int pointer, int button) {
                touchScreenOptions();
                return true; // return true to indicate the event was handled
            }

        });
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(255, 255, 255, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);
        game.batch.begin();

        game.batch.draw(backGround, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        game.batch.draw(soundImage, 500, 280, 100, 100);
        game.batch.draw(options, 800 / 2 - 176, 390);
        game.batch.draw(back,10,10,50,50);

        game.batch.end();
    }

    public void touchScreenOptions() {
        Vector3 tmp = new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0);
        camera.unproject(tmp);

        if (rectSoundImage.contains(tmp.x, tmp.y)) {
            if (game.sound) {
                soundImage = new Texture("soundIconOff.png");
                game.sound = false;
            }
            else{
                soundImage = new Texture("soundIcon.png");
                game.sound = true;
            }
        }

        if(rectBack.contains(tmp.x,tmp.y)){
            game.setScreen(new MenuClass(game));
            dispose();
        }

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        camera = null;
        soundImage = null;
        back = null;
        backGround = null;
        options = null;
        rectSoundImage = null;
        rectBack = null;
    }
}
