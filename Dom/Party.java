package Shared.Dom;

public class Party {

    Host host;
    Attendee[] attendees;

    public Party(Host host, Attendee[] attendees) {
        this.host = host;
        this.attendees = attendees;
    }

    int getAverageAge(){
        int result = 0;
        for (int i = 0; i <= attendees.length-1; i++){
            result+=attendees[i].getAge();
        }
        return Math.round((host.getAge()+result)/(1+attendees.length));
    }
}
