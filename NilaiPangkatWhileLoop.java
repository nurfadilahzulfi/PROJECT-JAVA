public class NilaiPangkatWhileLoop {
    public static void main(String args[]) {
        int basis = 8;
        int exponen = 0;
        int result = 1;
        int i = 0;
        
        while(i<exponen){
            result *= basis;
            i++;
        }
        System.out.println(basis + " pangkat " + exponen + " adalah: " + result);
    }
}
