package com.wonderslab.baseprojectskeleton.base.data;

import android.databinding.ObservableField;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Ekalips on 9/21/17.
 */

public class BindingObservable<Data> extends ObservableField<Data> implements Disposable {

    private Observable<Data> observable;
    private Disposable disposable;

    public BindingObservable() {
    }

    public BindingObservable(Observable<Data> observable) {
        setNewSource(observable);
    }

    @SuppressWarnings("all")
    public BindingObservable setNewSource(Observable<Data> observable) {
        dispose();
        this.observable = observable;
        disposable = observable.subscribeOn(Schedulers.computation()).subscribe(this::set, this::onThrow);
        return this;
    }

    @SuppressWarnings("all")
    public void onThrow(Throwable throwable) {
        if (throwable != null) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void dispose() {
        if (disposable != null) {
            disposable.dispose();
            disposable = null;
        }
        if (observable != null) {
            observable = null;
        }
    }

    @Override
    public boolean isDisposed() {
        return disposable == null || disposable.isDisposed();
    }

    public boolean isRequested() {
        return observable != null;
    }
}
