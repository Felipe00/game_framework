package br.com.interaje.gameframework.framework;

/**
 * Created by rayquaza on 27/06/16.
 */
public abstract class Screen {

    protected final Game game;

    public Screen(Game game) {
        this.game = game;
    }

    public abstract void update(float deltaTime);

    public abstract void paint(float deltaTime);

    public abstract void pause();

    public abstract void resume();

    public abstract void dispose();

    public abstract void backButton();

}
