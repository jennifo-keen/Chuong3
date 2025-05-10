package com.example.chuong3.ui.gridview;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class gvViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public gvViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
