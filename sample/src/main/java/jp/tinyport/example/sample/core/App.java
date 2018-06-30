package jp.tinyport.example.sample.core;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import jp.tinyport.example.sample.core.di.AppComponent;
import jp.tinyport.example.sample.core.di.AppModule;
import jp.tinyport.example.sample.core.di.DaggerAppComponent;
import jp.tinyport.mylibrary.MainLibrary;

public class App extends Application {
    private AppComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        MainLibrary.install(this);

        if (LeakCanary.isInAnalyzerProcess(this)) return;

        LeakCanary.install(this);
    }

    public AppComponent getComponent() {
        return mComponent;
    }
}
