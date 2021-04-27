package com.josh.smartkettlebell.ui.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class CardViewModel extends AndroidViewModel {
    MutableLiveData<String[]> tvs;


    public CardViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<String[]> getTvs(){
        if(tvs == null){
            tvs = new MutableLiveData<>();
            loadTvs("","");
        }
        return tvs;
    }
    public void loadTvs(String tv1, String tv2){

        tvs.setValue(new String[]{tv1,tv2});
    }
}
