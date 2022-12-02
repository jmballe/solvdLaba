package hospital.model;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Employee extends Person{
    private int id;
    private int hoursWorked;
    private LocalTime entryHour;
    private LocalTime leaveHour;
    private int daysWorked;
    private double hourlyPayRate;
    private LocalDate holidayStart;
    private LocalDate holidayEnd;

    public Employee(){}

    public Employee(String name, int age, String sex, int id,LocalTime entryHour, LocalTime leaveHour, double hourlyPayRate) {
        super(name, age, sex);
        this.id = id;

        this.entryHour = entryHour;
        this.leaveHour = leaveHour;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
