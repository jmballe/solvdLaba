package com.solvd.tareas.hospital.model;

import com.solvd.tareas.hospital.exceptions.InvalidAgeException;
import com.solvd.tareas.hospital.exceptions.InvalidGenderException;
import com.solvd.tareas.hospital.exceptions.InvalidPayRateException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Employee extends Person {
    private int hoursWorked;
    private LocalTime entryHour;
    private LocalTime leaveHour;
    private int daysWorked;
    private double hourlyPayRate;
    private LocalDate holidayStart;
    private LocalDate holidayEnd;

    public Employee(){}

    public Employee(String name, int age, String gender, String id,LocalTime entryHour, LocalTime leaveHour, double hourlyPayRate)
            throws InvalidAgeException, InvalidGenderException, InvalidPayRateException {
        super(name, age, gender, id);
        this.entryHour = entryHour;
        this.leaveHour = leaveHour;
        if(hourlyPayRate <= 0){
            throw new InvalidPayRateException("Hourly pay rate must be grater than 0.");
        }
        this.hourlyPayRate = hourlyPayRate;
        this.daysWorked = 0;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public LocalTime getEntry() {
        return entryHour;
    }

    public void setEntry(LocalTime entryHour) {
        this.entryHour = entryHour;
    }

    public LocalTime getLeaveHour() {
        return leaveHour;
    }

    public void setLeaveHour(LocalTime leaveHour) {
        this.leaveHour = leaveHour;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public LocalDate getHolidayStart() {
        return holidayStart;
    }

    public void setHolidayStart(LocalDate holidayStart) {
        this.holidayStart = holidayStart;
    }

    public LocalDate getHolidayEnd() {
        return holidayEnd;
    }

    public void setHolidayEnd(LocalDate holidayEnd) {
        this.holidayEnd = holidayEnd;
    }

    public Boolean checkIfDateInHolidays(LocalDate dateToCheck){
        return ( ! dateToCheck.isBefore( holidayStart ) ) && ( dateToCheck.isBefore( holidayEnd ) ) ;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hoursWorked=" + hoursWorked +
                ", entryHour=" + entryHour +
                ", leaveHour=" + leaveHour +
                ", daysWorked=" + daysWorked +
                ", hourlyPayRate=" + hourlyPayRate +
                ", holidayStart=" + holidayStart +
                ", holidayEnd=" + holidayEnd +
                "} " + super.toString();
    }
}
