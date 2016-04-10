package by.coursework;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainClass extends Game {

	SpriteBatch batch;
	BitmapFont font;
	Music music;
	public boolean sound = true;

	@Override
	public void create () {
		batch = new SpriteBatch();
		font = new BitmapFont();
		music = Gdx.audio.newMusic(Gdx.files.internal("mk.mp3"));
		music.setLooping(true);
		this.setScreen(new MenuClass(this));
	}

	@Override
	public void render () {
		super.render();
		if(sound && !music.isPlaying())
			music.play();
		else
			if(!sound && music.isPlaying())
				music.pause();
	}

	@Override
	public void dispose() {
		super.dispose();
	}
}
