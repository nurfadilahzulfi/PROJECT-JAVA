public class OperasiRelasi {
    public static void main(String args[]) {
        //a few numbers
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println("variable values...");
        System.out.println("i = "+i);
        System.out.println("j = "+j);
        System.out.println("k = "+k);
        System.out.println("");
        
        //lebih besar dari
        System.out.println("Greater than...");
        System.out.println("i > j = "+ (i>j)); //false
        System.out.println("j > j = "+ (j>j)); //true
        System.out.println("k > j = "+ (k > j)); //false
        System.out.println("");
        
        //lebih besar atau sama dengan
        System.out.println("Greater than or equal to...");
        System.out.println("i >= j = "+ (i>=j));
        System.out.println("j >= i = "+ (j>=i));
        System.out.println("k >= j = "+ (k>=j));
        System.out.println("");
        
        //lebih kecil dari
        System.out.println("Less than...");
        System.out.println("i <= j = "+ (i<=j));
        System.out.println("j <= i "+ (j<=i));
        System.out.println("k <= j = "+ (k<=j));
        System.out.println("");
        
        //sama dengan
        System.out.println("Equal to...");
        System.out.println("i == j = "+ (i == j));
        System.out.println("k == j = "+ (k==j));
        System.out.println("");
        
        //tidak sama dengan
        System.out.println("Not equal to..");
        System.out.println("i != j = "+ (i!=j));
        System.out.println("k != j = "+ (k!=j));
    }
}
