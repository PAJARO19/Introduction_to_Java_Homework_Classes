package Shared.Zamek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lock lock = new Lock();
        lock.printCode3(lock);

        Lock lock1 = new Lock(1, 2, 3);

        System.out.println("Ile liczb ma zawierac kod: 1, 2 czy 3");
        Scanner skaner = new Scanner(System.in);
        int choice = skaner.nextInt();
        howMany(lock,choice);
        printCode(lock,choice);

        if (choice == 1)
            lockOne(lock);
        if (choice == 2)
            lockTwo(lock);
        if (choice == 3)
            lockThree(lock);
    }

    static Lock howMany(Lock lock, int choice) {
        if (choice == 1)
            lock = new Lock(0);
        if (choice == 2)
            lock = new Lock(0, 0);
        if (choice == 3)
            lock = new Lock(0, 0, 0);
        if (choice >= 4 || choice <= 0)
            lock = lock;
        return lock;
    }

    static void printCode(Lock lock, int choice) {
        if (choice == 1)
            lock.printCode1(lock);
        if (choice == 2)
            lock.printCode2(lock);
        if (choice == 3)
            lock.printCode3(lock);
        if (choice >= 4 || choice <= 0)
            System.out.println("Nie można ustawić kodu o tej długości!");
    }

    static void lockThree(Lock lock) {
        while (true) {
            Scanner skaner = new Scanner(System.in);
            System.out.println("Podaj pierwszą liczbę:");
            int one = skaner.nextInt();
            System.out.println("Podaj drugą liczbę:");
            int two = skaner.nextInt();
            System.out.println("Podaj trzecią liczbę:");
            int three = skaner.nextInt();

            lock.isOpenPrint(lock.isOpen3(lock, one, two, three));

            if (lock.isOpen3(lock, one, two, three)) {
                System.out.println("Wybierz numer operacji, którą chcesz wykonać:");
                System.out.println("1. Sprawdź aktualną kombinację zamka");
                System.out.println("2. Ustaw nowy kod");
                System.out.println("3. Sprawdź, czy zamek jest otwarty");
                int choice1 = skaner.nextInt();
                switch (choice1) {
                    case 1:
                        lock.printCode3(lock);
                        break;
                    case 2:
                        System.out.println("Którą przekładnię chcesz przesunąć?");
                        int number = skaner.nextInt();
                        lock.moveRight3(lock, number);
                        break;
                    case 3:
                        lock.isOpenPrint(lock.isOpen3(lock, one, two, three));
                        break;
                    default:
                        System.out.println("Błędny numer operacji!");
                        break;
                }
            }
        }
    }

    static void lockTwo(Lock lock) {
        while (true) {
            Scanner skaner = new Scanner(System.in);
            System.out.println("Podaj pierwszą liczbę:");
            int one = skaner.nextInt();
            System.out.println("Podaj drugą liczbę:");
            int two = skaner.nextInt();

            lock.isOpenPrint(lock.isOpen2(lock, one, two));

            if (lock.isOpen2(lock, one, two)) {
                System.out.println("Wybierz numer operacji, którą chcesz wykonać:");
                System.out.println("1. Sprawdź aktualną kombinację zamka");
                System.out.println("2. Ustaw nowy kod");
                System.out.println("3. Sprawdź, czy zamek jest otwarty");
                int choice1 = skaner.nextInt();
                switch (choice1) {
                    case 1:
                        lock.printCode2(lock);
                        break;
                    case 2:
                        System.out.println("Którą przekładnię chcesz przesunąć?");
                        int number = skaner.nextInt();
                        lock.moveRight2(lock, number);
                        break;
                    case 3:
                        lock.isOpenPrint(lock.isOpen2(lock, one, two));
                        break;
                    default:
                        System.out.println("Błędny numer operacji!");
                        break;
                }
            }
        }
    }

    static void lockOne(Lock lock) {
        while (true) {
            Scanner skaner = new Scanner(System.in);
            System.out.println("Podaj kod:");
            int one = skaner.nextInt();

            lock.isOpenPrint(lock.isOpen1(lock, one));

            if (lock.isOpen1(lock, one)) {
                System.out.println("Wybierz numer operacji, którą chcesz wykonać:");
                System.out.println("1. Sprawdź aktualną kombinację zamka");
                System.out.println("2. Ustaw nowy kod");
                System.out.println("3. Sprawdź, czy zamek jest otwarty");
                int choice1 = skaner.nextInt();
                switch (choice1) {
                    case 1:
                        lock.printCode1(lock);
                        break;
                    case 2:
                        lock.moveRight1(lock);
                        break;
                    case 3:
                        lock.isOpenPrint(lock.isOpen1(lock, one));
                        break;
                    default:
                        System.out.println("Błędny numer operacji!");
                        break;
                }
            }
        }
    }
}
