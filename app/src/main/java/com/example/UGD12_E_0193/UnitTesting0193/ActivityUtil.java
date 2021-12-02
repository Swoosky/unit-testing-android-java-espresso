package com.example.UGD12_E_0193.UnitTesting0193;

import android.content.Context;
import android.content.Intent;

import com.example.UGD12_E_0193.RandomActivity;

public class ActivityUtil {
    private Context context;
    public ActivityUtil(Context context) {
        this.context = context;
    }
    public void startMainProfil() {
        context.startActivity(new Intent(context, RandomActivity.class));
    }
}
