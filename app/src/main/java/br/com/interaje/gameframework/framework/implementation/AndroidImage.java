package br.com.interaje.gameframework.framework.implementation;

import android.graphics.Bitmap;

import br.com.interaje.gameframework.framework.Graphics;
import br.com.interaje.gameframework.framework.Image;

/**
 * Created by rayquaza on 27/06/16.
 */
public class AndroidImage implements Image {
    Bitmap bitmap;
    Graphics.ImageFormat format;

    public AndroidImage(Bitmap bitmap, Graphics.ImageFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public Graphics.ImageFormat getFormat() {
        return format;
    }

    @Override
    public void dispose() {
        bitmap.recycle();
    }
}
