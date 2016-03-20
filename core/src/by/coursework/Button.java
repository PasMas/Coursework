package by.coursework;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;


public class Button extends Actor {
    public Button() {
        setTouchable(Touchable.enabled);
        setBounds(getX(), getY(), 128, 128);

       Gdx.input.setInputProcessor(new InputProcessor() {
           @Override
           public boolean keyDown(int keycode) {
               return false;
           }

           @Override
           public boolean keyUp(int keycode) {
               return false;
           }

           @Override
           public boolean keyTyped(char character) {
               return false;
           }

           @Override
           public boolean touchDown(int screenX, int screenY, int pointer, int button) {
               System.out.println("masha soset");
               return false;
           }

           @Override
           public boolean touchUp(int screenX, int screenY, int pointer, int button) {
               System.out.println("masha soset pri otpyske");
               return false;
           }

           @Override
           public boolean touchDragged(int screenX, int screenY, int pointer) {
               return false;
           }

           @Override
           public boolean mouseMoved(int screenX, int screenY) {
               return false;
           }

           @Override
           public boolean scrolled(int amount) {
               return false;
           }
       });

    }


    @Override
    public void draw(Batch batch, float parentAlfa) {
        Texture texture = new Texture("newGame.png");
        batch.draw(texture, getX(), getY());
    }
}

