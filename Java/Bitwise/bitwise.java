/*
    use of Bitwise operators
    Friday 19th July 2018
*/
class bitwise
{
    public static void main(String args[])
    {
        int a = 4;
        int b = 12;

        // Bitwise AND
        int op1 = a & b;
        System.out.println("Bitwise AND = " +op1);

        // Bitwise OR
        int op2 = a | b;
        System.out.println("Bitwise OR = "+op2);

        // Bitwise ExOR
        int op3 = a ^ b;
        System.out.println("Bitwise ExOR = "+op3);

        // One's Complement
        int op4 = ~ a;
        System.out.println("One's Complement = "+op4);

        // Shift Left
        int op5 = a << 2;
        System.out.println("Shift Left of 4 by 2 = "+op5);

        // Shift Right
        int op6 = b >> 2;
        System.out.println("Shift Right of 12 by 2 = "+op6);
    }
}