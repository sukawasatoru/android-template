package jp.tinyport.myapplication.core.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    ActivityComponent plus(ActivityModule module);
}
