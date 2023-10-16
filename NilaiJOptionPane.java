import javax.swing.JOptionPane;

public class NilaiJOptionPane {
    public static void main(String args[]) {
        /**
     * Ambil tiga nilai ujian dari user dan hitung nilai
     * rata-rata dari nilai tersebut. Berikan Output rata-rata dari tiga ujian.
     * Berikan juga smiley face pada output jika nilai rata rata
     * lebih besar atau sama dengan 60, selain itu beri output :-(.
     * 1. Gunakan BufferedReader untuk mendapat input dari user, dan System.out.println
     *  untuk output hasilnya.
     * 2. Gunakan JOptionPane untuk mendapat input dari user dan output hasilnya.
     */
        
      int nilai1,nilai2,nilai3;
      int average;
      
      String inputNilai = JOptionPane.showInputDialog("Masukkan hasil nilai pertama anda");
      nilai1 = Integer.parseInt(inputNilai);
      
      String inputNilai2 = JOptionPane.showInputDialog("Masukkan hasil nilai kedua anda");
      nilai2 = Integer.parseInt(inputNilai2);
      
      String inputNilai3 = JOptionPane.showInputDialog("Masukkan hasil nilai ketiga anda");
      nilai3 = Integer.parseInt(inputNilai3);
      
      average = (nilai1+nilai2+nilai3)/3;
      
      String rata = "Nilai rata-rata anda adalah "+average+"";
      JOptionPane.showMessageDialog(null,rata);
      
      if(average>=60){
          String msg = ":-)";
          JOptionPane.showMessageDialog(null, msg);
      }
      else{
          String msg = ":-(";
          JOptionPane.showMessageDialog(null, msg);
      }
    }
}
