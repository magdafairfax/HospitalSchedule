package com.timeslots.demo.entity;

import java.util.List;

public class Hospital {
    private boolean active;
    private int id;
    private int doctorId;
    private int hospitalId;
    private List<TimeSlot> timeSlot;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public List<TimeSlot> getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(List<TimeSlot> timeSlot) {
        this.timeSlot = timeSlot;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "active=" + active +
                ", id=" + id +
                ", doctorId=" + doctorId +
                ", hospitalId=" + hospitalId +
                ", timeSlot=" + timeSlot +
                '}';
    }
}
