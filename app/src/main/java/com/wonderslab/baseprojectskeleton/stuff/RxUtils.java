package com.wonderslab.baseprojectskeleton.stuff;

import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import io.reactivex.Observable;

import static android.databinding.Observable.OnPropertyChangedCallback;

/**
 * Created by wl-11 on 9/21/17.
 */

public class RxUtils {

    public RxUtils() {
    }

    public static <T> Observable<T> toObservable(@NonNull final ObservableField<T> observableField) {
        return Observable.create(asyncEmitter -> {

            final OnPropertyChangedCallback callback = new OnPropertyChangedCallback() {
                @Override
                public void onPropertyChanged(android.databinding.Observable dataBindingObservable, int propertyId) {
                    if (dataBindingObservable == observableField) {
                        asyncEmitter.onNext(observableField.get());
                    }
                }
            };

            observableField.addOnPropertyChangedCallback(callback);

            asyncEmitter.setCancellable(() -> observableField.removeOnPropertyChangedCallback(callback));

        });
    }
}
