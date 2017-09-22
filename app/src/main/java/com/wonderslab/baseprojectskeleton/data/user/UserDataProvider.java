package com.wonderslab.baseprojectskeleton.data.user;

import com.wonderslab.baseprojectskeleton.di.source_qualifier.Local;
import com.wonderslab.baseprojectskeleton.di.source_qualifier.Remote;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Ekalips on 9/22/17.
 */

@Singleton
public class UserDataProvider implements UserDataSource {


    private final UserDataSource localDataSource;
    private final UserDataSource remoteDataSource;

    @Inject
    public UserDataProvider(@Local UserDataSource localDataSource, @Remote UserDataSource remoteDataSource) {
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
    }


    @Override
    public User getCurrentUser() {
        return null;
    }

    @Override
    public void saveCurrentUser(User user) {

    }
}
