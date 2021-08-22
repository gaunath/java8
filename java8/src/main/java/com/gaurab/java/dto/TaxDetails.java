package com.gaurab.java.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaxDetails {
private int empid;
private String empname;
private long salary;
private String incomeSlab;
private double taxPercent;
}
