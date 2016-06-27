package br.com.interaje.gameframework.framework.implementation;

import android.content.Context;
import android.os.Build;
import android.view.View;

import java.util.List;

import br.com.interaje.gameframework.framework.Input;

/**
 * Created by rayquaza on 27/06/16.
 */
public class AndroidInput implements Input {
    TouchHandler touchHandler;

    public AndroidInput(Context context, View view, float scaleX, float scaleY) {
        if(Integer.parseInt(Build.VERSION.SDK) < 5)
            touchHandler = new SingleTouchHandler(view, scaleX, scaleY);
        else
            touchHandler = new MultiTouchHandler(view, scaleX, scaleY);
    }


    @Override
    public boolean isTouchDown(int pointer) {
        return touchHandler.isTouchDown(pointer);
    }

    @Override
    public int getTouchX(int pointer) {
        return touchHandler.getTouchX(pointer);
    }

    @Override
    public int getTouchY(int pointer) {
        return touchHandler.getTouchY(pointer);
    }



    @Override
    public List<TouchEvent> getTouchEvents() {
        return touchHandler.getTouchEvents();
    }
}
