public class HariDalamSemingguArray {
    //Buatlah sebuah string array yang akan menginisialisasi 7 hari dalam seminggu.
    //contoh,
    /**
     * String days[] = {"Monday", "Tuesday"...};
     *  Gunakan while loop, kemudian print semua nilai dari array (Gunakan juga untuk do while
     *  dan for-loop) using a while loop
     */
    public static void main(String args[]) {
        String[] hari = {"Sunday","Monday","Tuesday","Wednesday",
            "Thursday","Friday","Saturday"};
        int i =0;
        
        while(i<hari.length){
            System.out.println("Hari ke-"+(i+1)+" "+hari[i]);
            i++;
        }
        
 }
}
