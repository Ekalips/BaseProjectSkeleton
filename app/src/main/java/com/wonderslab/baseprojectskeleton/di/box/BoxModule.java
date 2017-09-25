package com.wonderslab.baseprojectskeleton.di.box;

import android.content.Context;

import com.wonderslab.baseprojectskeleton.data.user.source.entity.LocalUserEntity;
import com.wonderslab.baseprojectskeleton.data.user.source.entity.MyObjectBox;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.objectbox.Box;
import io.objectbox.BoxStore;

/**
 * Created by Ekalips on 9/25/17.
 */
@Module
@Singleton
public class BoxModule {

    @Provides
    @Singleton
    BoxStore provideMainBox(Context context) {
        return MyObjectBox.builder().androidContext(context).build();
    }

    @Provides
    @Singleton
    Box<LocalUserEntity> userBox(BoxStore boxStore){
        return boxStore.boxFor(LocalUserEntity.class);
    }

}
