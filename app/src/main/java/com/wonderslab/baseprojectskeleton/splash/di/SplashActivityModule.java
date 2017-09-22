package com.wonderslab.baseprojectskeleton.splash.di;

import com.wonderslab.baseprojectskeleton.di.scopes.ActivityScope;
import com.wonderslab.baseprojectskeleton.splash.mvp.SplashScreen;
import com.wonderslab.baseprojectskeleton.splash.mvp.presenter.SplashScreenActivityViewModelImpl;

import dagger.Binds;
import dagger.Module;

/**
 * Created by wl-11 on 9/21/17.
 */

@Module
public abstract class SplashActivityModule {

    @Binds
    @ActivityScope
    abstract SplashScreen.SplashViewModel bindPresenter(SplashScreenActivityViewModelImpl presenter);
}
