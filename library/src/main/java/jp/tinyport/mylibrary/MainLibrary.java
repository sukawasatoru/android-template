package jp.tinyport.mylibrary;

import android.app.Application;

import jp.tinyport.mylibrary.internal.di.DaggerLibraryWrapper;

public class MainLibrary {
    public static void install(Application app) {
        DaggerLibraryWrapper.install(app);
    }

    public static void hello() {
        DaggerLibraryWrapper.getComponent().getHelloImpl().hello();
    }

    private MainLibrary() {
    }
}
