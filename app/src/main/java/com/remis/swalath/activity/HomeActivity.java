package com.remis.swalath.activity;

import android.os.Bundle;

import com.remis.swalath.R;
import com.remis.swalath.activity.api.BaseActivity;
import com.remis.swalath.constants.FragmentNames;
import com.remis.swalath.fragment.HomeFragment;


public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.screen_default_container, new HomeFragment(), FragmentNames.FRAGMENT_HOME_).commit();
        }
    }

    @Override
    protected int setLayoutResourceIdentifier() {
        return R.layout.screen_default;
    }

    @Override
    protected int getTitleToolBar() {
        return R.string.app_name;
    }

}
