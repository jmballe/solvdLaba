package com.solvd.tareas.hospital.model;

import java.util.List;
import java.util.Set;

public class Reception  {
    
    private Set<Receptionist> receptionists;

    public Reception() {
    }

    public Reception(Set<Receptionist> receptionists) {
        this.receptionists = receptionists;
    }

    public Set<Receptionist> getReceptionists() {
        return receptionists;
    }

    public void setReceptionists(Set<Receptionist> receptionists) {
        this.receptionists = receptionists;
    }
    
    public void addReceptionist(Receptionist receptionist){
        receptionists.add(receptionist);
    }
}
