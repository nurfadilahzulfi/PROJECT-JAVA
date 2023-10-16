public class NilaiPangkatDOWhileLoop {
    public static void main(String args[]) {
        int basis = 8;
        int exponen = 2;
        int result = 1;
        int i = 0;
        
        do{
            result *= basis;
            i++;
        }while(i<exponen);
         System.out.println(basis + " pangkat " + exponen + " adalah: " + result);
    }
}
