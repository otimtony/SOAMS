package com.otimtony.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient {

    private Integer id;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String email;
    private String address;
    private LocalDate date_of_birth;
    private double outstanding_bill;

}
