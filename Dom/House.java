package Shared.Dom;

import java.util.Arrays;

public class House {

    String address;
    Kitchen kitchen;
    Bathroom bathroom;
    Room[] rooms;

    double getArea(){
        double result=0;
        for (int i = 0; i <= rooms.length-1; i++){
            result+=rooms[i].getArea();
        }
        return kitchen.getArea()+bathroom.getArea()+result;
    }

    public House(String address, Kitchen kitchen, Bathroom bathroom, Room[] rooms) {
        this.address = address;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "House{" + '\n' +
                "address='" + address + '\'' + '\n' +
                ", kitchen=" + kitchen + '\n' +
                ", bathroom=" + bathroom + '\n' +
                ", rooms=" + Arrays.toString(rooms) + '\n' +
                '}';
    }
}
