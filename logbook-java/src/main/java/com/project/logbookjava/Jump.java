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

    public Jump(){

    }

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

    public void setJumpNumber(int jumpNumber) {
        this.jumpNumber = jumpNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDropzone() {
        return dropzone;
    }

    public void setDropzone(String dropzone) {
        this.dropzone = dropzone;
    }

    public String getTypeOfJump() {
        return typeOfJump;
    }

    public void setTypeOfJump(String typeOfJump) {
        this.typeOfJump = typeOfJump;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getFreefallTime() {
        return freefallTime;
    }

    public void setFreefallTime(int freefallTime) {
        this.freefallTime = freefallTime;
    }

//    @Override
//    public String toString() {
//        return "Jump{" +
//                "jumpNumber='" + jumpNumber + '\'' +
//                ", date='" + date + '\'' +
//                ", dropzone='" + dropzone + '\'' +
//                ", typeOfJump='" + typeOfJump + '\'' +
//                ", altitude='" + altitude + '\'' +
//                ", freefallTime=" + freefallTime +
//                '}';
//    }
}
