/*
    Assignment: Write a program to implement priority of threads
*/

class A extends Thread {
    public void run() {
        System.out.println("Thread A started");
        for(int i = 0; i <= 5; i++) {
            System.out.println("\tFrom thread A: i" + i);
        }
        System.out.println("Exit from A.");
    }
}
class B extends Thread {
    public void run() {
        System.out.println("Thread B started");
        for(int j = 0; j <= 5; j++) {
            System.out.println("\tFrom thread B: j" + j);
        }
        System.out.println("Exit from B.");
    }
}
class C extends Thread {
    public void run() {
        System.out.println("Thread C started");
        for(int k = 0; k <=5; k++) {
            System.out.println("\tFrom thread C: k" + k);
        }
        System.out.println("Exit from C.");
    }
}
class Assignment {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(Thread.NORM_PRIORITY);
        threadA.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start thread A...");
        threadA.start();
        System.out.println("Start thread B...");
        threadB.start();
        System.out.println("Start thread C...");
        threadC.start();
        System.out.println("End of main thread.");
    }
}