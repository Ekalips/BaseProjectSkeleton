package com.wonderslab.baseprojectskeleton.di;

import com.wonderslab.baseprojectskeleton.data.user.di.UserDataSourceProviderModule;

import dagger.Module;

/**
 * Created by Ekalips on 9/25/17.
 */

@Module(includes = UserDataSourceProviderModule.class)
public class DataProvidersModule {
}
