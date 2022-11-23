package hospital;

import java.util.List;

public class Reception {
    
    private List<Recepcionist> receptionists;

    public Reception() {
    }

    public Reception(List<Recepcionist> recepcionists) {
        this.receptionists = recepcionists;
    }

    public List<Recepcionist> getReceptionists() {
        return receptionists;
    }

    public void setReceptionists(List<Recepcionist> receptionists) {
        this.receptionists = receptionists;
    }
    
    public void addReceptionist(Recepcionist recepcionist){
        receptionists.add(recepcionist);
    }
    
    
}
