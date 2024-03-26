package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerFilmsPosterTest {


    @Test

    public void findAllNull() {

        ManagerFilmsPoster manager = new ManagerFilmsPoster();


        String[] expected = {};
        String[] actual = manager.findAll();


        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void addFilm1() {
        ManagerFilmsPoster manager = new ManagerFilmsPoster();

        manager.add("film1");


        String[] expected = {"film1"};
        String[] actual = manager.findAll();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilm10() {
        ManagerFilmsPoster manager = new ManagerFilmsPoster();

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");


        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};
        String[] actual = manager.findAll();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addTest() {
        ManagerFilmsPoster manager = new ManagerFilmsPoster();

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");

        String[] expected = {"film1", "film2", "film3"};
        String[] actual = manager.findAll();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilm4() {
        ManagerFilmsPoster manager = new ManagerFilmsPoster();


        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");

        String[] expected = {"film5", "film4", "film3", "film2"};
        String[] actual = manager.findLast();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilm5() {
        ManagerFilmsPoster manager = new ManagerFilmsPoster();

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");

        String[] expected = {"film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimit7() {
        ManagerFilmsPoster manager = new ManagerFilmsPoster(7);

        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");

        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimit10() {
        ManagerFilmsPoster manager = new ManagerFilmsPoster(10);

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");

        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
