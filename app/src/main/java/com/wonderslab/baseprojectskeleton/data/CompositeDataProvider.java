package com.wonderslab.baseprojectskeleton.data;


import com.wonderslab.baseprojectskeleton.di.source_qualifier.Local;
import com.wonderslab.baseprojectskeleton.di.source_qualifier.Remote;

import javax.annotation.Nullable;

/**
 * Created by Ekalips on 9/21/17.
 */

public abstract class CompositeDataProvider<DataProviderInterface extends IDataProvider> {

    @Nullable
    private DataProviderInterface localInterface;
    @Nullable
    private DataProviderInterface networkInterface;

    @Nullable
    protected DataProviderInterface local() {
        return localInterface;
    }

    @Nullable
    protected DataProviderInterface network() {
        return networkInterface;
    }

    @Local
    void setLocalInterface(@Local @Nullable DataProviderInterface localInterface) {
        this.localInterface = localInterface;
    }

    @Remote
    void setNetworkInterface(@Local @Nullable DataProviderInterface networkInterface) {
        this.networkInterface = networkInterface;
    }
}
