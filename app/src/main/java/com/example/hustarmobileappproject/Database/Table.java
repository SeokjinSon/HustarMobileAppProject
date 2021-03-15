package com.example.hustarmobileappproject.Database;

public class Table {
    private int tableSeq;
    private int tableNumber;

    public Table(int tableSeq, int tableNumber) {
        this.tableSeq = tableSeq;
        this.tableNumber = tableNumber;
    }

    public int getTableSeq() {
        return tableSeq;
    }

    public void setTableSeq(int tableSeq) {
        this.tableSeq = tableSeq;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }
}
