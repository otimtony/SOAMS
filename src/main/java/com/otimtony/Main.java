package com.otimtony;

import com.otimtony.Model.Patient;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var welcomeMessage = "Welcome to SmartOnline Appointment Management System (SOAMS)";
        System.out.printf("%s", welcomeMessage);

        var patients = List.of(
                new Patient(1, "Tony", "Otim", "6412330895", "otimtonyjeff@gmail.com", "Fairfield", LocalDate.of(1993, 7, 17), 0.0),
                new Patient(1, "Robin", "Kilama", "6412330999", "kilamaRobin@gmail.com", "Kamplala", LocalDate.of(1990, 11, 17), 0.0),
                new Patient(1, "Brian", "Akera", "6419870895", "brianakera@gmail.com", "", LocalDate.of(1987, 1, 18), 15.0)
        );

        patients.forEach(System.out::println);
    }
}

