package jp.tinyport.example.sample.core;

import android.app.Activity;

import jp.tinyport.example.sample.core.di.ActivityComponent;
import jp.tinyport.example.sample.core.di.ActivityModule;

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
