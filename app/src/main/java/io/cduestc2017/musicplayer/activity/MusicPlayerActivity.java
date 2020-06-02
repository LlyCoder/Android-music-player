package io.cduestc2017.musicplayer.activity;

import android.support.v4.app.Fragment;

import io.cduestc2017.musicplayer.R;
import io.cduestc2017.musicplayer.base.FragmentContainerActivity;
import io.cduestc2017.musicplayer.fragment.PlayLocalMusicFragment;

/**
 * Author: cdestc-2017
 * Time: 2019/11/26 20:18
 * Description:
 */


public class MusicPlayerActivity extends FragmentContainerActivity {
    @Override
    protected Fragment createFragment() {
        return PlayLocalMusicFragment.newInstance();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_fragment;
    }

    @Override
    protected int getFragmentContainerId() {
        return R.id.fragment_container;
    }
}
