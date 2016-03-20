package by.coursework;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

/**
 * Created by User on 13.03.2016.
 */
public class MenuClass implements Screen {

    final MainClass game;
    OrthographicCamera camera;
    ImageButton newGame;
    ImageButton continueGame;
    ImageButton options;
    ImageButton exit;

    public MenuClass(MainClass mClass) {
        this.game = mClass;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        Skin skin = new Skin(new TextureAtlas());
        ImageButton.ImageButtonStyle imageButtonStyle = new ImageButton.ImageButtonStyle();
        //skin.setPosition(800/2 - 15, 350);
        //skin.setSize(300, 100);
        imageButtonStyle.imageUp = skin.getDrawable("NewGame.png");
        newGame = new ImageButton(imageButtonStyle);
        newGame.setPosition(800/2 - 150, 250);
        newGame.setSize(300, 100);

      /*  continueGame = new Rectangle();
        continueGame.x = 800/2 - 150;
        continueGame.y = 250;
        continueGame.setSize(300, 100);

        options = new Rectangle();
        options.x = 800/2 - 150;
        options.y = 150;
        options.setSize(300, 100);

        exit = new Rectangle();
        exit.x = 800/2 - 150;
        exit. y = 50;
        exit.setSize(300, 100);*/
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
       // game.batch.draw(new Texture("NewGame.png"), newGame.x, newGame.y);
        //game.batch.draw(new Texture("Continue.png"), continueGame.x, continueGame.y);
        //game.batch.draw(new Texture("Options.png"), options.x, options.y);
        //game.batch.draw(new Texture("Exit.png"), exit.x, exit.y);

        game.batch.end();

      // if(Gdx.input.isTouched()){
      //      game.setScreen(new GameScreen(game));
      //      dispose();
     //   }
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
