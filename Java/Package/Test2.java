import p2.B;

/* 

*/

class C extends B {
    int n = 20;
    void displayC() {
        System.out.println("Class C:");
        System.out.println("Value of m = " + m);
        System.out.println("Value of n = " + n);
    }
}

class Test2 {
    public static void main(String[] args) {
        C objC = new C();
        objC.displayB();
        objC.displayC();
    }
}