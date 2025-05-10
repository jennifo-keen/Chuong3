package com.example.chuong3.ui.customlayout;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class clViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public clViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
