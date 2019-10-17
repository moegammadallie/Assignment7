package me.moegammadallie.domain.patientInfo;

import java.util.Date;

public class PatientAppointment {
    private Date appointmentDate;
    private int appointmentTime;

    private PatientAppointment(){}
    private PatientAppointment(Builder builder){
        this.appointmentDate = builder.appointmentDate;
        this.appointmentTime = builder.appointmentTime;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public int getAppointmentTime() {
        return appointmentTime;
    }

    public static class Builder{
        private Date appointmentDate;
        private int appointmentTime;

        public Builder appointmentDate(Date appointmentDate){
            this.appointmentDate = appointmentDate;
            return this;
        }

        public Builder appointmentTime(int appointmentTime){
            this.appointmentTime = appointmentTime;
            return this;
        }
        public PatientAppointment build() {
            return new PatientAppointment(this);
        }
    }

    @Override
    public String toString() {
        return "PatientAppointmentController{" +
                "appointmentDate=" + appointmentDate +
                ", appointmentTime=" + appointmentTime +
                '}';
    }
}
