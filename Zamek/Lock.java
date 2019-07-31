package Shared.Introduction_to_Java_Homework_Classes.Zamek;

import java.util.Random;

public class Lock {

    Random random = new Random();

    int one = random.nextInt(10);
    int two = random.nextInt(10);
    int three = random.nextInt(10);

    public Lock() {
    }

    public Lock(int one, int two, int three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public Lock(int one, int two) {
        this.one = one;
        this.two = two;
    }

    public Lock(int one) {
        this.one = one;
    }

    void moveRight3(int number) {
        if (number == 1)
            if (this.one != 9)
                this.one++;
            else this.one = 0;
        if (number == 2)
            if (this.two != 9)
                this.two++;
            else this.two = 0;
        if (number == 3)
            if (this.three != 9)
                this.three++;
            else this.three = 0;
        if (number >= 4 || number <= 0)
            System.out.println("Błędny numer!");
        printCode3();
    }

    void moveRight2(int number) {
        if (number == 1)
            if (this.one != 9)
                this.one++;
            else this.one = 0;
        if (number == 2)
            if (this.two != 9)
                this.two++;
            else this.two = 0;
        if (number >= 3 || number <= 0)
            System.out.println("Błędny numer!");
        printCode2();
    }

    void moveRight1() {
        this.one++;
        printCode1();
    }

    boolean isOpen3(int one, int two, int three) {
        if (one == this.one && two == this.two && three == this.three)
            return true;
        else return false;
    }

    boolean isOpen2(int one, int two) {
        if (one == this.one && two == this.two)
            return true;
        else return false;
    }

    boolean isOpen1(int one) {
        if (one == this.one)
            return true;
        else return false;
    }

    void isOpenPrint(boolean isOpen) {
        if (isOpen)
            System.out.println("Zamek otwarty");
        else System.out.println("Zamek zamknięty");
    }

    void printCode3() {
        System.out.println("Kod:");
        System.out.print(this.one);
        System.out.print(this.two);
        System.out.print(this.three);
        System.out.println();
    }

    void printCode2() {
        System.out.println("Kod:");
        System.out.print(this.one);
        System.out.print(this.two);
        System.out.println();
    }

    void printCode1() {
        System.out.println("Kod:");
        System.out.print(this.one);
        System.out.println();
    }
}