package com.example.chuong3.ui.times;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class timesViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public timesViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
