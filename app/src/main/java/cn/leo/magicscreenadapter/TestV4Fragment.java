package cn.leo.magicscreenadapter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.leo.magic.screen.MagicScreenAdapter;
import cn.leo.magic.screen.ScreenAdapterDesignWidthInDp;

/**
 * @author : Jarry Leo
 * @date : 2018/10/11 9:30
 */
@ScreenAdapterDesignWidthInDp(400)
public class TestV4Fragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MagicScreenAdapter.adapt(this, 360);
        MagicScreenAdapter.cancelAdapt(this);
        return inflater.inflate(R.layout.fragment_test, null);
    }
}
