/*
    Assignment: Write a program on extending a thread class
*/

class A extends Thread {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("\tFrom thread A: i" + i);
        }
        System.out.println("Exit from A.");
    }
}
class B extends Thread {
    public void run() {
        for(int j = 0; j < 5; j++) {
            System.out.println("\tFrom thread B: j" + j);
        }
        System.out.println("Exit from B.");
    }
}
class Assignment {
    public static void main(String[] args) {
        new A().start();
        new B().start();
    }
}