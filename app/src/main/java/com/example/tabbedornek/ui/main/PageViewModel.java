package com.example.tabbedornek.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private final MutableLiveData<String> mIndex = new MutableLiveData<>();
    //private LiveData<String> mText = map(mIndex, input -> "Hello world from section: " + input);

    public void setIndex(String index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mIndex;
    }
}