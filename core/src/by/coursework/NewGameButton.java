package by.coursework;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by User on 21.03.2016.
 */
public class NewGameButton extends Button{

    public NewGameButton(int x, int y, int width, int height, Texture texture) {
        super(x, y, width, height, texture);
    }

    @Override
    public void buttonPressed(MainClass game) {
        System.out.println("New Game");
    }
}
