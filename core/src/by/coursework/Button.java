package by.coursework;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;


public abstract class Button extends Actor {
    int x = 0;
    int y = 0;
    int width = 0;
    int heights = 0;
    Texture texture;
    Rectangle bounds;
    public Button(int x, int y, int width, int height, Texture texture) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heights = height;
        this.texture = texture;
        bounds = new Rectangle(x, y, width, height);
        setTouchable(Touchable.enabled);
        setBounds(x, y, width, height);
    }




    @Override
    public void draw(Batch batch, float parentAlfa) {
        batch.draw(texture, x, y);
    }

    public abstract void buttonPressed();
}

