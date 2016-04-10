package by.coursework;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;


public class ExitButton extends  Button {

    public ExitButton(int x, int y, int width, int height, Texture texture) {
        super(x, y, width, height, texture);
    }

    @Override
    public void buttonPressed(MainClass game) {
        game.dispose();
        Gdx.app.exit();
    }
}
