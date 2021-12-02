package com.example.UGD12_E_0193.UnitTesting0193;

public interface RandomView {
    String getEmail();
    void showEmailError(String message);

    String getPassword();
    void showPasswordError(String message);

    String getKotaAsal();
    void showKotaAsalError(String message);

    void startMainRandom();

    void showRandomError(String message);
    void showErrorResponse(String message);

}
