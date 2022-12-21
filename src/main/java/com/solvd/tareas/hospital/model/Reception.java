package com.solvd.tareas.hospital.model;

import java.util.List;

public class Reception  {
    
    private List<Receptionist> receptionists;

    public Reception() {
    }

    public Reception(List<Receptionist> receptionists) {
        this.receptionists = receptionists;
    }

    public List<Receptionist> getReceptionists() {
        return receptionists;
    }

    public void setReceptionists(List<Receptionist> receptionists) {
        this.receptionists = receptionists;
    }
    
    public void addReceptionist(Receptionist receptionist){
        receptionists.add(receptionist);
    }
}
