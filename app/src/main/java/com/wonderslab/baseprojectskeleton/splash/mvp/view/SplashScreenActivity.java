package com.wonderslab.baseprojectskeleton.splash.mvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wonderslab.baseprojectskeleton.BR;
import com.wonderslab.baseprojectskeleton.R;
import com.wonderslab.baseprojectskeleton.base.activity.BaseBindingActivity;
import com.wonderslab.baseprojectskeleton.base.presenter.BaseViewModel;
import com.wonderslab.baseprojectskeleton.databinding.ActivitySplashScreenBinding;
import com.wonderslab.baseprojectskeleton.splash.mvp.SplashScreen;
import com.wonderslab.baseprojectskeleton.splash.mvp.presenter.SplashScreenActivityViewModelImpl;

import javax.inject.Inject;

public class SplashScreenActivity extends BaseBindingActivity<ActivitySplashScreenBinding, SplashScreen.SplashView> implements SplashScreen.SplashView {

    public static final String TAG = SplashScreenActivity.class.getSimpleName();

    @Inject
    SplashScreenActivityViewModelImpl presenter;

    @Override
    public int layoutResId() {
        return R.layout.activity_splash_screen;
    }

    @Override
    public BaseViewModel<SplashScreen.SplashView> getViewModel() {
        return presenter;
    }

    @Override
    public int getViewModelBRId() {
        return BR.viewModel;
    }

    @Override
    public SplashScreen.SplashView getViewInterface() {
        return this;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
