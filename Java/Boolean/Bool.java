/*
    use of Boolean operators
    Thursday 18th July 2018
*/
class Bool
{
    public static void main(String args[])
    {
        int a = 9;
        int b = 6;
        int c = 8;
        int d = 5;
     
        // AND = True
        boolean bool_AT = a>b && c>d;
        // AND = False
        boolean bool_AF = a<b && c>d;
        // OR = True
        boolean bool_OT = a<b || c>d;
        // OR = False
        boolean bool_OF = a<b || c<d;
        // NOT = True
        boolean bool_NT = !(a*b==c-d);
        // NOT = False
        boolean bool_NF = !(a-b == c-d); 
            {
                System.out.println("A = 9\nB = 6\nC = 8\nD = 5\n");
                System.out.println("AND (A>B && C>D) = "+bool_AT+"\n");
                System.out.println("AND (A<B && C>D) = "+bool_AF+"\n");
                System.out.println("OR (A<B && C>D) = "+bool_OT+"\n");
                System.out.println("OR (A<B && C<D) = "+bool_OF+"\n");
                System.out.println("NOT (A*B == C-D) = "+bool_NT+"\n");
                System.out.println("NOT (A-B == C-D) = "+bool_NF+"\n");
            }
    }       
    
}