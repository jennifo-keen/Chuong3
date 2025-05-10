package com.example.chuong3.ui.explicit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class eiViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public eiViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
