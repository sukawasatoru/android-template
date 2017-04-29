package jp.tinyport.mylibrary.internal.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = LibraryModule.class)
public interface LibraryComponent {
}
