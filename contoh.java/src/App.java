import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class App {
    /**
     * Ambil tiga nilai ujian dari user dan hitung nilai
     * rata-rata dari nilai tersebut. Berikan Output rata-rata dari tiga ujian.
     * Berikan juga smiley face pada output jika nilai rata rata
     * lebih besar atau sama dengan 60, selain itu beri output :-(.
     * 1. Gunakan BufferedReader untuk mendapat input dari user, dan System.out.println
     *  untuk output hasilnya.
     * 2. Gunakan JOptionPane untuk mendapat input dari user dan output hasilnya.
     */
    public static void main(String args[]) {
        
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        
        
        int nilai1,nilai2,nilai3;
        int average;
        
        
        try{
            System.out.print("Masukkan nilai pertama anda : ");
            nilai1 = Integer.parseInt(dataIn.readLine());
            
            System.out.print("Masukkan nilai kedua anda : ");
            nilai2 = Integer.parseInt(dataIn.readLine());
            
            System.out.print("Masukkan nilai ketiga anda : ");
            nilai3 = Integer.parseInt(dataIn.readLine());
            
            average = (nilai1+nilai2+nilai3)/3;
            
            System.out.println("Rata-Rata nilai ujian anda adalah : "+average);
            
             if(average>=60){
            System.out.println(":-)");
        }
        else{
            System.out.println(":-(");
        }
        }catch( IOException e){
            System.out.println("error!");
        }
       
    }
}
