package com.wonderslab.baseprojectskeleton.base.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.wonderslab.baseprojectskeleton.base.presenter.BaseViewModel;
import com.wonderslab.baseprojectskeleton.base.view.BaseView;

import dagger.android.AndroidInjection;

/**
 * Created by wl-11 on 9/21/17.
 */

public abstract class BaseBindingActivity<Binding extends ViewDataBinding, ViewInterface extends BaseView> extends AppCompatActivity implements BaseView {

    protected Binding binding;

    @LayoutRes
    public abstract int layoutResId();

    public abstract BaseViewModel<ViewInterface> getViewModel();

    public abstract int getViewModelBRId();

    public abstract ViewInterface getViewInterface();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, layoutResId());

        binding.setVariable(getViewModelBRId(), getViewModel());
    }

    @Override
    protected void onStart() {
        super.onStart();
        getViewModel().onAttach(getViewInterface());
    }

    @Override
    protected void onStop() {
        super.onStop();
        getViewModel().onDetach();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getViewModel().onDestroy();
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT);
    }
}
