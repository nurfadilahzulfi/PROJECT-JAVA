public class HaridalamSemingguForLoop {
    public static void main(String args[]) {
        String[] hari = {"Sunday","Monday","Tuesday","Wednesday",
            "Thursday","Friday","Saturday"};
        int i =0;
        
        for(i=0; i<hari.length; i++){
            System.out.println("Hari ke-"+(i+1)+" "+hari[i]);
        }
    }
}
