package by.coursework;

import com.badlogic.gdx.graphics.Texture;


public class OptionsButton extends Button {


    public OptionsButton(int x, int y, int width, int height, Texture texture) {
        super(x, y, width, height, texture);
    }

    @Override
    public void buttonPressed(MainClass game) {
        game.setScreen(new OptionsScreen(game));
    }
}
