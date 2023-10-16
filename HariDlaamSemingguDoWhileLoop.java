public class HariDlaamSemingguDoWhileLoop {
    public static void main(String args[]) {
        String[] hari = {"Monday","Tuesday","Wednesday",
            "Thursday","Friday","Saturday"};
        int i =0;
        
        do{
            System.out.println("Hari ke-"+(i+1)+" "+hari[i]);
            i++;
        }while(i<hari.length);
    }
}
