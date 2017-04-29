package jp.tinyport.myapplication.core;

import android.app.Activity;

import jp.tinyport.myapplication.core.di.ActivityComponent;
import jp.tinyport.myapplication.core.di.ActivityModule;

public class BaseActivity extends Activity {
    private ActivityComponent sComponent;

    protected ActivityComponent getComponent() {
        if (sComponent == null) {
            sComponent = ((App) getApplication()).getComponent()
                    .plus(new ActivityModule());
        }

        return sComponent;
    }
}
