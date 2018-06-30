package jp.tinyport.example.sample;

import android.os.Bundle;

import javax.inject.Inject;

import jp.tinyport.example.sample.core.BaseActivity;
import jp.tinyport.example.sample.core.repository.AppOrma;
import jp.tinyport.mylibrary.MainLibrary;

public class MainActivity extends BaseActivity {
    @Inject
    AppOrma mOrma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getComponent().inject(this);

        setContentView(R.layout.activity_main);
        MainLibrary.hello();
    }
}
