package com.wonderslab.baseprojectskeleton.data.user.di;

import com.wonderslab.baseprojectskeleton.data.user.UserDataSource;
import com.wonderslab.baseprojectskeleton.data.user.source.local.UserLocalDataStore;
import com.wonderslab.baseprojectskeleton.data.user.source.remote.UserRemoteDataStore;
import com.wonderslab.baseprojectskeleton.di.source_qualifier.Local;
import com.wonderslab.baseprojectskeleton.di.source_qualifier.Remote;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Ekalips on 9/22/17.
 */

@Module
public abstract class UserDataSourceProviderModule {
    @Singleton
    @Binds
    @Local
    abstract UserDataSource provideLocalUserDataStore(UserLocalDataStore store);

    @Singleton
    @Binds
    @Remote
    abstract UserDataSource provideRemoteUserDataSource(UserRemoteDataStore store);
}
