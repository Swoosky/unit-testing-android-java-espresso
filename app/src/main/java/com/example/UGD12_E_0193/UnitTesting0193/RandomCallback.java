package com.example.UGD12_E_0193.UnitTesting0193;

import com.example.UGD12_E_0193.models.Random;

public interface RandomCallback {
    void onSuccess(boolean value, Random random);
    void onError();
}
