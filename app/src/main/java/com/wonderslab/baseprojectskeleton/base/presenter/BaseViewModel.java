package com.wonderslab.baseprojectskeleton.base.presenter;

import com.wonderslab.baseprojectskeleton.base.data.BindingObservable;
import com.wonderslab.baseprojectskeleton.base.view.BaseView;

import javax.annotation.Nullable;

import io.reactivex.disposables.CompositeDisposable;


/**
 * Created by wl-11 on 9/21/17.
 */

public abstract class BaseViewModel<ViewInterface extends BaseView> {

    @Nullable
    protected
    ViewInterface view;

    private final CompositeDisposable compositeDisposable = new CompositeDisposable();

    public void onAttach(ViewInterface view) {
        this.view = view;
    }

    public void onDetach() {
        this.view = null;
    }

    public void onDestroy() {
        this.view = null;
        compositeDisposable.clear();
    }

    public BindingObservable addObservable(BindingObservable observable) {
        compositeDisposable.add(observable);
        return observable;
    }

    public boolean dispose(BindingObservable observable) {
        return compositeDisposable.remove(observable);
    }
}
