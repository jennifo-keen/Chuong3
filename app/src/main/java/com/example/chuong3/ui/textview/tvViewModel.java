package com.example.chuong3.ui.textview;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class tvViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public tvViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
