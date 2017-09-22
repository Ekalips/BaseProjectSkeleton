package com.wonderslab.baseprojectskeleton.splash.mvp;

import com.wonderslab.baseprojectskeleton.base.data.BindingObservable;
import com.wonderslab.baseprojectskeleton.base.presenter.BaseViewModel;
import com.wonderslab.baseprojectskeleton.base.view.BaseView;

/**
 * Created by wl-11 on 9/21/17.
 */

public interface SplashScreen {

    interface SplashView extends BaseView {
    }

    abstract class SplashViewModel extends BaseViewModel<SplashView> {
        public abstract BindingObservable<String> getTestData();
    }
}
