/*
    Assignment: Write a program in java to implement thread method 
    yield(), stop() and sleep()
*/

class A extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            if (i == 1)
            yield();
            System.out.println("\tFrom thread A: i" + i);
        }
        System.out.println("Exit from A.");
    }
}
class B extends Thread {
    public void run() {
        for(int j = 0; j <= 5; j++) {
            if(j == 3)
            stop();
            System.out.println("\tFrom thread B: j" + j);
        }
        System.out.println("Exit from B.");
    }
}
class C extends Thread {
    public void run() {
        for(int k = 1; k <= 5; k++) {
            System.out.println("\tFrom thread C: k" + k);
            if(k == 1)
            try {
                sleep(1000);
            }
            catch(Exception e) {
            }
        }
        System.out.println("Exit from C.");
    }
}
class Assignment {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        System.out.println("Start thread A");
        threadA.start();
        System.out.println("Start thread B");
        threadB.start();
        System.out.println("Start thread C");
        threadC.start();
        System.out.println("End of main thread.");
    }
}