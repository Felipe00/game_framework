package br.com.interaje.gameframework.framework.implementation;

import android.media.SoundPool;

import br.com.interaje.gameframework.framework.Sound;

/**
 * Created by rayquaza on 27/06/16.
 */
public class AndroidSound implements Sound {

    int soundId;
    SoundPool soundPool;

    public AndroidSound(SoundPool soundPool, int soundId) {
        this.soundId = soundId;
        this.soundPool = soundPool;
    }

    @Override
    public void play(float volume) {
        soundPool.play(soundId, volume, volume, 0, 0, 1);
    }

    @Override
    public void dispose() {
        soundPool.unload(soundId);
    }

}
