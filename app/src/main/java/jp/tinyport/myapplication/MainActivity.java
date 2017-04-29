package jp.tinyport.myapplication;

import android.os.Bundle;

import javax.inject.Inject;

import jp.tinyport.myapplication.core.BaseActivity;
import jp.tinyport.myapplication.core.repository.AppOrma;

public class MainActivity extends BaseActivity {
    @Inject
    AppOrma mOrma;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getComponent().inject(this);

        setContentView(R.layout.activity_main);
    }
}
