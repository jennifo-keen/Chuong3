package com.example.chuong3.ui.slidingdrawer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class sdViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public sdViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
