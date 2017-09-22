package com.wonderslab.baseprojectskeleton.di;

import com.wonderslab.baseprojectskeleton.di.scopes.ActivityScope;
import com.wonderslab.baseprojectskeleton.splash.di.SplashActivityModule;
import com.wonderslab.baseprojectskeleton.splash.mvp.view.SplashScreenActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Ekalips on 9/21/17.
 */

@Module
public abstract class ActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector(modules = {SplashActivityModule.class})
    abstract SplashScreenActivity bindSplashActivity();
}
