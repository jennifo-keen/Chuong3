package com.example.chuong3.ui.webkit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class wkViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public wkViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
