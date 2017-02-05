package com.remis.swalath.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.remis.swalath.R;

/**
 * Created by halyson on 18/12/14.
 */
public class DefaultFragment extends Fragment {
    public static DefaultFragment newInstance() {
        return new DefaultFragment();
    }
    private View mViewFragmentDefault;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mViewFragmentDefault = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        return mViewFragmentDefault;
    }

}
