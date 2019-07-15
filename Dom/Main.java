package Shared.Dom;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(25.0,2.2);
        System.out.println("Area of room1 " + room1.getArea());
        System.out.println("Height of room1 " + room1.getHeight());

        Kitchen kitchen = new Kitchen(10.0,2.2);
        System.out.println("Area of kitchen " + kitchen.getArea());
        System.out.println("Height of kitchen " + kitchen.getHeight());

        Bathroom bathroom = new Bathroom(8.0,2.2);

        Room room2 = new Room(30.0,2.2);
        Room room3 = new Room(15.0,2.2);

        Room[] rooms = new Room[] {room1,room2,room3};

        House house = new House("Lodz",kitchen,bathroom,rooms);
        System.out.println(house);
        System.out.println(house.getArea());
        System.out.println(house.bathroom.getArea());
        System.out.println(house.rooms[0].getArea());

        Host host = new Host(25);
        Attendee[] attendees = new Attendee[] {new Attendee(19),new Attendee(28),new Attendee(20)};
        Party party = new Party(host,attendees);
        System.out.println(party.getAverageAge());
    }
}
