package jp.tinyport.example.sample.core.di;

import dagger.Subcomponent;
import jp.tinyport.example.sample.MainActivity;
import jp.tinyport.example.sample.core.di.scope.ActivityScope;

@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}
