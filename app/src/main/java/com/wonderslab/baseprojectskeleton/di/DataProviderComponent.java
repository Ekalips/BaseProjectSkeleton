package com.wonderslab.baseprojectskeleton.di;

import com.wonderslab.baseprojectskeleton.data.user.di.UserDataSourceProviderModule;

import dagger.Subcomponent;

/**
 * Created by Ekalips on 9/25/17.
 */

@Subcomponent(modules = {UserDataSourceProviderModule.class})
public interface DataProviderComponent {

}
