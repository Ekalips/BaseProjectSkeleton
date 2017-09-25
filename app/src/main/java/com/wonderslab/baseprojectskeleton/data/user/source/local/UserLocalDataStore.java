package com.wonderslab.baseprojectskeleton.data.user.source.local;

import com.wonderslab.baseprojectskeleton.data.user.UserDataSource;
import com.wonderslab.baseprojectskeleton.data.user.source.entity.LocalUserEntity;
import com.wonderslab.baseprojectskeleton.data.user.source.entity.User;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.objectbox.Box;

/**
 * Created by Ekalips on 9/22/17.
 */

@Singleton
public class UserLocalDataStore implements UserDataSource {

    @Inject
    public UserLocalDataStore(Box<LocalUserEntity> localUserEntityBox) {

    }


    @Override
    public User getCurrentUser() {
        return null;
    }

    @Override
    public void saveCurrentUser(User user) {

    }
}
