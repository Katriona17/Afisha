package ru.netology.afisha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    @Test
    void shouldAddFilm() {
        AfishaManager manager = new AfishaManager();

        String first = "Бладшот";
        String second = "Вперед";
        String third = "Отель «Белград»";
        String fourth = "Джентельмены";
        String fifth = "Человек-невидимка";
        String sixth = "Тролли. Мировой тур";
        String seventh = "Номер один";
        String eighth = "Смерть на Ниле";
        String ninth = "Анчартед";
        String tenth = "Мстители";
        String eleventh = "Остров фантазий";

        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleventh);

        String[] expected = {"Бладшот", "Вперед", "Отель «Белград»", "Джентельмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один", "Смерть на Ниле", "Анчартед", "Мстители", "Остров фантазий"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldFindAll() {
        AfishaManager manager = new AfishaManager();

        String first = "Бладшот";
        String second = "Вперед";
        String third = "Отель «Белград»";
        String fourth = "Джентельмены";
        String fifth = "Человек-невидимка";
        String sixth = "Тролли. Мировой тур";
        String seventh = "Номер один";
        String eighth = "Смерть на Ниле";
        String ninth = "Анчартед";
        String tenth = "Мстители";


        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);


        String[] expected = {"Бладшот", "Вперед", "Отель «Белград»", "Джентельмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один", "Смерть на Ниле", "Анчартед", "Мстители"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldFindLast() {
        AfishaManager manager = new AfishaManager();

        String first = "Бладшот";
        String second = "Вперед";
        String third = "Отель «Белград»";
        String fourth = "Джентельмены";
        String fifth = "Человек-невидимка";
        String sixth = "Тролли. Мировой тур";
        String seventh = "Номер один";
        String eighth = "Смерть на Ниле";
        String ninth = "Анчартед";
        String tenth = "Мстители";
        String eleventh = "Остров фантазий";

        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleventh);

        String[] expected = {"Остров фантазий", "Мстители", "Анчартед", "Смерть на Ниле", "Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель «Белград»", "Вперед"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}