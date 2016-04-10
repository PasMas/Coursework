package by.coursework;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

/**
 * Created by User on 13.03.2016.
 */
public class MenuClass implements Screen {
    final MainClass game;
    OrthographicCamera camera;
    NewGameButton newGame;
    ContinueButton continueGame;
    OptionsButton options;
    ExitButton exit;
    public MenuClass(MainClass mClass) {
        this.game = mClass;
        camera = new OrthographicCamera();
        newGame = new NewGameButton(800/2 - 212, 350, 424, 84, new Texture("NewGame.png"));
        continueGame = new ContinueButton(800/2 - 201, 250, 403, 84, new Texture("Continue.png"));
        options = new OptionsButton(800/2 - 176, 150, 353, 84, new Texture("Options.png"));
        exit = new ExitButton(800/2 - 99, 50, 199, 80, new Texture("Exit.png"));
        camera.setToOrtho(false, 800, 480);
        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean touchDown(int x, int y, int pointer, int button) {
                touchScreen();
                return true; // return true to indicate the event was handled
            }

            @Override
            public boolean touchUp(int x, int y, int pointer, int button) {
                // your touch up code here
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
        game.batch.draw(new Texture("background.png"), 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        newGame.draw(game.batch, 1);
        continueGame.draw(game.batch, 2);
        options.draw(game.batch, 3);
        exit.draw(game.batch, 4);
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

    public void touchScreen(){
        Vector3 tmp = new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0);
        camera.unproject(tmp);
        if (newGame.bounds.contains(tmp.x, tmp.y)){
            newGame.buttonPressed();
        }
        if (continueGame.bounds.contains(tmp.x, tmp.y)){
            continueGame.buttonPressed();
        }
        if (options.bounds.contains(tmp.x, tmp.y)){
            options.buttonPressed();
        }
        if (exit.bounds.contains(tmp.x, tmp.y)){
            exit.buttonPressed();
        }
    }

}
