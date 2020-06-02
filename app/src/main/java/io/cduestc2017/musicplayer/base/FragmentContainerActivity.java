package io.cduestc2017.musicplayer.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Author: cdestc-2017
 * Time: 2019/11/26 20:18
 * Description:
 */



public abstract class FragmentContainerActivity extends AppCompatActivity {

    protected abstract Fragment createFragment();

    protected abstract int getLayoutResId();

    protected abstract int getFragmentContainerId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(getFragmentContainerId());

        if (null == fragment) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(getFragmentContainerId(), fragment)
                    .commit();
        }
    }
}
