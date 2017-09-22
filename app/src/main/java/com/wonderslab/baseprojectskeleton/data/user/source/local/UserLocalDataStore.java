package com.wonderslab.baseprojectskeleton.data.user.source.local;

import com.wonderslab.baseprojectskeleton.data.user.User;
import com.wonderslab.baseprojectskeleton.data.user.UserDataSource;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Ekalips on 9/22/17.
 */

@Singleton
public class UserLocalDataStore implements UserDataSource {

    @Inject
    public UserLocalDataStore() {
    }


    @Override
    public User getCurrentUser() {
        return null;
    }

    @Override
    public void saveCurrentUser(User user) {

    }
}
