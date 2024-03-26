package ru.netology;

public class ManagerFilmsPoster {
    private String[] films = new String[0];
    private int limit;

    public ManagerFilmsPoster() {
        this.limit = 5;
    }

    public ManagerFilmsPoster(int limit) {
        this.limit = limit;
    }


    public void add(String filmName) {
        String[] tmp = new String[films.length + 1];

        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = filmName;
        films = tmp;


    }


    public String[] findAll() {

        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {

            resultLength = limit;

        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[films.length - 1 - i];

        }


        return tmp;
    }
}



