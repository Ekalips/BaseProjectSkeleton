package com.wonderslab.baseprojectskeleton.base.fragment;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wonderslab.baseprojectskeleton.base.presenter.BaseViewModel;
import com.wonderslab.baseprojectskeleton.base.view.BaseView;

import dagger.android.support.AndroidSupportInjection;

/**
 * Created by wl-11 on 9/21/17.
 */

public abstract class BaseBindingFragment<Binding extends ViewDataBinding, ViewInterface extends BaseView> extends Fragment {

    protected Binding binding;

    @LayoutRes
    abstract int layoutResId();

    public abstract BaseViewModel<ViewInterface> getViewModel();

    public abstract int getViewModelBRId();

    public abstract ViewInterface getViewInterface();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidSupportInjection.inject(this);
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(false);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, layoutResId(), container, false);
        binding.setVariable(getViewModelBRId(), getViewModel());
        return binding.getRoot();
    }

    @Override
    public void onStart() {
        super.onStart();
        getViewModel().onAttach(getViewInterface());
    }

    @Override
    public void onStop() {
        super.onStop();
        getViewModel().onDetach();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getViewModel().onDestroy();
    }
}
