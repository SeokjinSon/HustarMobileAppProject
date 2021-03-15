package com.example.hustarmobileappproject.Database;

public class Reservation {
    private int reservationSeq;
    private String reservationDate;

    public Reservation(int reservationSeq, String reservationDate) {
        this.reservationSeq = reservationSeq;
        this.reservationDate = reservationDate;
    }

    public int getReservationSeq() {
        return reservationSeq;
    }

    public void setReservationSeq(int reservationSeq) {
        this.reservationSeq = reservationSeq;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }
}
