package com.remis.swalath.service;

import com.remis.swalath.interfaces.home.HomeService;
import com.remis.swalath.repository.HomeRepositoryDiskImpl;

/**
 * Created by Halyson on 20/01/15.
 */
public class HomeServiceImpl implements HomeService {
    private static final String TAG = HomeServiceImpl.class.getSimpleName();
    private HomeRepositoryDiskImpl mHomeRepositoryDisk;

    public HomeServiceImpl() {
        mHomeRepositoryDisk = new HomeRepositoryDiskImpl();
    }

    @Override
    public void recoverTitleTabs() {
        mHomeRepositoryDisk.recoverTitleTabs();
    }

    @Override
    public void recoverColorTabs() {
        mHomeRepositoryDisk.recoverColorsTabs();
    }

    @Override
    public void onDestroy() {
        mHomeRepositoryDisk.onDestroy();
        mHomeRepositoryDisk = null;
    }
}
