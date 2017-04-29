package jp.tinyport.mylibrary.internal.di;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;
import jp.tinyport.mylibrary.MainLibrary;
import jp.tinyport.mylibrary.internal.HelloImpl;

@Singleton
@Component(modules = LibraryModule.class)
public interface LibraryComponent {
    HelloImpl getHelloImpl();
}
