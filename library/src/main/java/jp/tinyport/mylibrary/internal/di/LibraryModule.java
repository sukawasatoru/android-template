package jp.tinyport.mylibrary.internal.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import jp.tinyport.mylibrary.internal.repository.LibraryOrma;

@Module
public class LibraryModule {
    private final Context mContext;

    public LibraryModule(Application app) {
        mContext = app;
    }

    @Provides
    public Context provideContext() {
        return mContext;
    }

    @Singleton
    @Provides
    public LibraryOrma provideLibraryOrma(Context context) {
        return LibraryOrma.builder(context)
                .name("library.db")
                .build();
    }
}
