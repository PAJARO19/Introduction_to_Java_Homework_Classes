package Shared.Zamek;

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

    public int getOne() {
        return one;
    }

    public int getTwo() {
        return two;
    }

    public int getThree() {
        return three;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public void setThree(int three) {
        this.three = three;
    }

    void moveRight3(Lock lock, int number){
        if (number == 1)
            if (lock.getOne() != 9)
            lock.setOne(lock.getOne()+1);
            else lock.setOne(0);
        if (number == 2)
            if (lock.getTwo() != 9)
                lock.setTwo(lock.getTwo()+1);
            else lock.setTwo(0);
        if (number == 3)
            if (lock.getThree() != 9)
                lock.setThree(lock.getThree()+1);
            else lock.setThree(0);
            if (number >= 4 || number <= 0)
                System.out.println("Błędny numer!");
        printCode3(lock);
    }

    void moveRight2(Lock lock, int number){
        if (number == 1)
            if (lock.getOne() != 9)
                lock.setOne(lock.getOne()+1);
            else lock.setOne(0);
        if (number == 2)
            if (lock.getTwo() != 9)
                lock.setTwo(lock.getTwo()+1);
            else lock.setTwo(0);
        if (number >= 3 || number <= 0)
            System.out.println("Błędny numer!");
        printCode2(lock);
    }

    void moveRight1(Lock lock){
        lock.setOne(lock.getOne()+1);
        printCode1(lock);
    }

    boolean isOpen3(Lock lock, int one, int two, int three){
        if (one == lock.getOne() && two == lock.getTwo() && three == lock.getThree())
            return true;
        else return false;
    }

    boolean isOpen2(Lock lock, int one, int two){
        if (one == lock.getOne() && two == lock.getTwo())
            return true;
        else return false;
    }

    boolean isOpen1(Lock lock, int one){
        if (one == lock.getOne())
            return true;
        else return false;
    }

    void isOpenPrint (boolean isOpen) {
        if (isOpen)
            System.out.println("Zamek otwarty");
        else System.out.println("Zamek zamknięty");
    }

    void printCode3(Lock lock){
        System.out.println("Kod:");
        System.out.print(lock.getOne());
        System.out.print(lock.getTwo());
        System.out.print(lock.getThree());
        System.out.println();
    }

    void printCode2(Lock lock) {
        System.out.println("Kod:");
        System.out.print(lock.getOne());
        System.out.print(lock.getTwo());
        System.out.println();
    }

    void printCode1(Lock lock) {
        System.out.println("Kod:");
        System.out.print(lock.getOne());
        System.out.println();
    }
}
