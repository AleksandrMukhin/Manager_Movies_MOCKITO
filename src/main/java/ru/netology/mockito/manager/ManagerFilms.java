package ru.netology.mockito.manager;

import domain.ru.netology.mockito.DescriptionFilms;

public class ManagerFilms {
    private DescriptionFilms[] films = new DescriptionFilms[0];
    private int limit;

    public ManagerFilms(int limit) {
        this.limit = limit;
    }

    public ManagerFilms() {
        limit = 10;
    }

    public void add(DescriptionFilms film) {
        DescriptionFilms[] tmp = new DescriptionFilms[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public DescriptionFilms[] findAll() {
        return films;
    }

    public DescriptionFilms[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        DescriptionFilms[] tmp = new DescriptionFilms[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
