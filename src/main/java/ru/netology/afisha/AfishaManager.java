package ru.netology.afisha;

public class AfishaManager {


    private String[] items = new String[0];
    private int limitOfFilms = 10;

    public AfishaManager() {

    }

    public AfishaManager(int limitOfFilms) {
        this.limitOfFilms = limitOfFilms;
    }


    public void addFilm(String item) {
        int length = items.length + 1;
        String[] arr = new String[length];
        for (int i = 0; i < items.length; i++) {
            arr[i] = items[i];
        }
        int lastIndex = arr.length - 1;
        arr[lastIndex] = item;
        items = arr;
    }

    public String[] findAll() {

        return items;
    }

    public String[] findLast() {

        int resultLength;
        if (items.length > limitOfFilms) {
            resultLength = limitOfFilms;
        } else {
            resultLength = items.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }


}


