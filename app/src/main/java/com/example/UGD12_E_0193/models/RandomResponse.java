package com.example.UGD12_E_0193.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RandomResponse {
    private String message;

    @SerializedName("random")
    private List<Random> randomList;

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }

    public List<Random> getRandomList() { return randomList; }

    public void setRandomList(List<Random> profilList) { this.randomList = randomList; }
}
