package com.example.chuong3.ui.picturegallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class pgViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public pgViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
