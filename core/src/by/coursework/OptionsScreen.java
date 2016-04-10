package by.coursework;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

public class OptionsScreen implements Screen {
    OrthographicCamera camera;
    final MainClass game;
    Texture soundImage;

    public OptionsScreen(MainClass _game) {
        camera = new OrthographicCamera();
        camera.setToOrtho(false,800,480);
        game = _game;


        Gdx.input.setInputProcessor(new InputAdapter() {
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


        game.batch.draw(new Texture("background.png"), 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        //newGame.draw(game.batch, 1);
        //continueGame.draw(game.batch, 2);
        //options.draw(game.batch, 3);
        //exit.draw(game.batch, 4);

        game.batch.end();
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

    }
}
