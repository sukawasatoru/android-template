package jp.tinyport.myapplication.core.di;

import dagger.Subcomponent;
import jp.tinyport.myapplication.MainActivity;
import jp.tinyport.myapplication.core.di.scope.ActivityScope;

@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}
