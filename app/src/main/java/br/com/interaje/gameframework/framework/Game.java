package br.com.interaje.gameframework.framework;

/**
 * Created by rayquaza on 27/06/16.
 */
public interface Game {

    public Audio getAudio();

    public Input getInput();

    public FileIO getFileIO();

    public Graphics getGraphics();

    public void setScreen(Screen screen);

    public Screen getCurrentScreen();

    public Screen getInitScreen();

}
