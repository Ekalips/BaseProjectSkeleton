package com.wonderslab.baseprojectskeleton.data.user;

/**
 * Created by Ekalips on 9/22/17.
 */

public interface UserDataSource {

    User getCurrentUser();

    void saveCurrentUser(User user);

}
