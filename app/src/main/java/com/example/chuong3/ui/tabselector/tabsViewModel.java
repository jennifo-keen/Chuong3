package com.example.chuong3.ui.tabselector;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class tabsViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public tabsViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
