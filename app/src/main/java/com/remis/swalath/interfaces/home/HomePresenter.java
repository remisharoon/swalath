package com.remis.swalath.interfaces.home;

import com.squareup.otto.Subscribe;

import com.remis.swalath.events.LoadColorsTabsDisk;
import com.remis.swalath.events.LoadTitleTabsDisk;

/**
 * Created by Halyson on 20/01/15.
 */
public interface HomePresenter {
    void loadSectionsTabs();

    @Subscribe
    void onLoadTitleTabsDiskSuccess(LoadTitleTabsDisk loadTitleTabsDisk);

    @Subscribe
    void onLoadColorTabsDiskSuccess(LoadColorsTabsDisk loadColorsTabsDisk);

    void onDestroy();
}
