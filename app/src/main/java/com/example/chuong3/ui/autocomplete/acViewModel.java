package com.example.chuong3.ui.autocomplete;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class acViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public acViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
