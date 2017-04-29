package jp.tinyport.mylibrary.internal.di;

import android.app.Application;

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
