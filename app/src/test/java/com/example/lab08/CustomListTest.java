package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    public CustomList MockCityList() {
        list = new CustomList();
        return list;
    }

    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(listSize + 1, list.getCount());
    }
    // hasCity test
    @Test
    public void hasCityTest() {
        list = MockCityList();
        list.addCity(new City("Edmonton", "Alberta"));
        City someCity1 = new City("Edmonton", "Alberta");
        assertTrue(list.hasCity(someCity1));
    }

    // deleteCity Test
    @Test
    public void deleteCityTest() {
        list = MockCityList();
        list.addCity(new City("Edmonton", "Alberta"));
        int listSize = list.getCount();
        City someCity1 = new City("Calgary", "Alberta");
        list.deleteCity(someCity1);
        assertEquals(listSize, list.getCount());
    }

    // countCities Test
    @Test
    public void countCitiesTest() {
        list = MockCityList();
        list.addCity(new City("Edmonton", "Alberta"));
        list.addCity(new City("Calgary", "Alberta"));
        int listSize = list.getCount();
        assertEquals(3, list.getCount());
    }
}
