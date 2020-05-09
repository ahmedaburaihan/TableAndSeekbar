package com.example.tableappwithseekbar;

public class MyModel {
    int tableNumber, number, resultNumber;

    public MyModel(int tableNumber, int number, int resultNumber) {
        this.tableNumber = tableNumber;
        this.number = number;
        this.resultNumber = resultNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getResultNumber() {
        return resultNumber;
    }

    public void setResultNumber(int resultNumber) {
        this.resultNumber = resultNumber;
    }
}
