package jp.tinyport.mylibrary.internal;

import android.app.Application;

import jp.tinyport.mylibrary.internal.di.DaggerLibraryComponent;
import jp.tinyport.mylibrary.internal.di.LibraryComponent;
import jp.tinyport.mylibrary.internal.di.LibraryModule;

public class DaggerLibraryWrapper {
    private static LibraryComponent sComponent;

    public static void install(Application app) {
        sComponent = DaggerLibraryComponent.builder()
                .libraryModule(new LibraryModule(app))
                .build();
    }

    public static LibraryComponent getComponent() {
        return sComponent;
    }

    private DaggerLibraryWrapper() {
    }
}
