package com.wonderslab.baseprojectskeleton.di;

import android.app.Application;

import com.wonderslab.baseprojectskeleton.BaseApplication;
import com.wonderslab.baseprojectskeleton.data.user.UserDataProvider;
import com.wonderslab.baseprojectskeleton.data.user.di.UserDataSourceProviderModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by wl-11 on 9/21/17.
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class, UserDataSourceProviderModule.class})
public interface AppComponent extends AndroidInjector<DaggerApplication> {

    @Override
    void inject(DaggerApplication instance);

    void inject(BaseApplication application);

    UserDataProvider userDataProvider();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }


}
