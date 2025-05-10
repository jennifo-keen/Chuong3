package com.example.chuong3.ui.implicit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class iiViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public iiViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
