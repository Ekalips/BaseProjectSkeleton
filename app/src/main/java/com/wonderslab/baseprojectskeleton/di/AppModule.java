package com.wonderslab.baseprojectskeleton.di;

import android.app.Application;
import android.content.Context;

import com.wonderslab.baseprojectskeleton.di.box.BoxModule;

import dagger.Binds;
import dagger.Module;
import io.objectbox.BoxStore;

/**
 * Created by wl-11 on 9/21/17.
 */

@Module(includes = {BoxModule.class})
public abstract class AppModule {

    @Binds
    public abstract Context bindContext(Application application);

    public abstract BoxStore boxStore(Context context);
}
