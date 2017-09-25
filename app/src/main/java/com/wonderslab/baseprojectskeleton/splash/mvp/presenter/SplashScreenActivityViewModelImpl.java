package com.wonderslab.baseprojectskeleton.splash.mvp.presenter;

import com.wonderslab.baseprojectskeleton.base.data.BindingObservable;
import com.wonderslab.baseprojectskeleton.data.user.UserDataProvider;
import com.wonderslab.baseprojectskeleton.di.scopes.ActivityScope;
import com.wonderslab.baseprojectskeleton.splash.mvp.SplashScreen;

import javax.inject.Inject;

/**
 * Created by wl-11 on 9/21/17.
 */

@ActivityScope
public class SplashScreenActivityViewModelImpl extends SplashScreen.SplashViewModel {

    private static final String TAG = SplashScreenActivityViewModelImpl.class.getSimpleName();

    private BindingObservable<String> bindingObservable = new BindingObservable<>();

    private UserDataProvider userDataProvider;

    @Inject
    SplashScreenActivityViewModelImpl(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }


    @Override
    public BindingObservable<String> getTestData() {
        return bindingObservable;
    }
}
