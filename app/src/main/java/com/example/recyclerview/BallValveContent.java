package com.example.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class BallValveContent {
    public static final List<BallValve> ball_valves = new ArrayList<>();

    //Создать список с товарами
    static {
        String[] names = {"Royal Thermo Optimal", "Кран шаровой Giacomini", "Кран шаровой газовый Giacomini"};
        String[] manufacturers = {"Royal Thermo", "Giacomini", "Giacomini"};
        String[] materials = {"Латунь", "Латунь", "Латунь"};
        String[] levers = {"Бабочка", "Бабочка", "Рычаг"};

        for (int i = 0; i < 3; i++) {
            ball_valves.add(new BallValve(names[i], manufacturers[i], materials[i], levers[i]));
        }
    }
}
