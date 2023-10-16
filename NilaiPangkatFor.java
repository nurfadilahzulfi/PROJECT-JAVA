public class NilaiPangkatFor {
    public static void main(String args[]) {
        int basis = 8;
        int exponen = 2;
        int result = 1;
        int i = 0;
        
        for(i=0; i<exponen; i++){
            result *= basis;
        }
        System.out.println(basis + " pangkat " + exponen + " adalah: " + result);
    }
}
