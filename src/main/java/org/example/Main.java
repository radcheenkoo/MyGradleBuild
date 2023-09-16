package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        NameInfo nameInfo = new NameInfo("Dima","Radchenko");
        Gson gson = new Gson();

        String json = gson.toJson(nameInfo);
        System.out.println(json);
    }
}