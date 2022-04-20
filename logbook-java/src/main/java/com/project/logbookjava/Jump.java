package com.project.logbookjava;

import javax.persistence.Entity;

@Entity
public class Jump {
    private int jumpNumber;
    private String date;
    private String dropzone;
    private String typeOfJump;
    private int altitude;
    private int freefallTime;

    public Jump(int jumpNumber, String date, String dropzone, String typeOfJump, int altitude, int freefallTime) {
        this.jumpNumber = jumpNumber;
        this.date = date;
        this.dropzone = dropzone;
        this.typeOfJump = typeOfJump;
        this.altitude = altitude;
        this.freefallTime = freefallTime;
    }

    public int getJumpNumber() {
        return jumpNumber;
    }

    @Override
    public String toString() {
        return "Jump{" +
                "jumpNumber='" + jumpNumber + '\'' +
                ", date='" + date + '\'' +
                ", dropzone='" + dropzone + '\'' +
                ", typeOfJump='" + typeOfJump + '\'' +
                ", altitude='" + altitude + '\'' +
                ", freefallTime=" + freefallTime +
                '}';
    }
}
