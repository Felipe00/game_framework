package br.com.interaje.gameframework.framework;

import android.content.SharedPreferences;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by rayquaza on 27/06/16.
 */
public interface FileIO {

    public InputStream readFile(String file) throws IOException;

    public OutputStream writeFile(String file) throws IOException;

    public InputStream readAsset(String file) throws IOException;

    public SharedPreferences getSharedPref();

}
