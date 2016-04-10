package by.coursework;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by User on 21.03.2016.
 */
public class OptionsButton extends Button {

    public OptionsButton(int x, int y, int width, int height, Texture texture) {
        super(x, y, width, height, texture);
    }

    @Override
    public void buttonPressed() {
        System.out.println("Options");
    }
}
