package by.coursework;

import com.badlogic.gdx.graphics.Texture;

public class ContinueButton extends Button {

    public ContinueButton(int x, int y, int width, int height, Texture texture) {
        super(x, y, width, height, texture);
    }

    @Override
    public void buttonPressed(MainClass game) {
        System.out.println("Continue");
    }
}
