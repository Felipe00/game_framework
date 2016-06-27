package br.com.interaje.gameframework.framework;

/**
 * Created by rayquaza on 27/06/16.
 */
public interface Image {

    public int getWidth();

    public int getHeight();

    public Graphics.ImageFormat getFormat();

    public void dispose();

}
