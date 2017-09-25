package com.wonderslab.baseprojectskeleton.data.user;

import com.wonderslab.baseprojectskeleton.data.user.source.entity.User;

/**
 * Created by Ekalips on 9/22/17.
 */

public interface UserDataSource {

    User getCurrentUser();

    void saveCurrentUser(User user);

}
