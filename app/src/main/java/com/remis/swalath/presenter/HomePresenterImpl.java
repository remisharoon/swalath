package com.remis.swalath.presenter;

import com.squareup.otto.Subscribe;

import com.remis.swalath.events.LoadColorsTabsDisk;
import com.remis.swalath.events.LoadTitleTabsDisk;
import com.remis.swalath.interfaces.home.HomePresenter;
import com.remis.swalath.interfaces.home.HomeView;
import com.remis.swalath.service.HomeServiceImpl;
import com.remis.swalath.utility.BusProvider;

/**
 * Created by Halyson on 20/01/15.
 */
public class HomePresenterImpl implements HomePresenter {
    private static final String TAG = HomePresenterImpl.class.getSimpleName();
    private HomeView mHomeView;
    private HomeServiceImpl mHomeService;

    public HomePresenterImpl(HomeView homeView) {
        BusProvider.getInstance().register(this);
        mHomeView = homeView;
        mHomeService = new HomeServiceImpl();
    }

    @Override
    public void loadSectionsTabs() {
        mHomeService.recoverTitleTabs();
    }

    @Subscribe
    public void onLoadTitleTabsDiskSuccess(LoadTitleTabsDisk loadTitleTabsDisk) {
        mHomeView.loadViewPager(loadTitleTabsDisk.getListTitleTabs());
        mHomeService.recoverColorTabs();
    }

    @Subscribe
    public void onLoadColorTabsDiskSuccess(LoadColorsTabsDisk loadColorsTabsDisk) {
        mHomeView.setColorTabs(loadColorsTabsDisk.getColorTab());
        mHomeView.setDividerColorTabs(loadColorsTabsDisk.getDividerColorTab());
        mHomeView.setIndicatorColorTabs(loadColorsTabsDisk.getIndicatorColorTab());
        mHomeView.loadTabs();
    }

    @Override
    public void onDestroy() {
        BusProvider.getInstance().unregister(this);
        mHomeService.onDestroy();
        mHomeService = null;
    }
}
