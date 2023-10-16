import javax.swing.JOptionPane;
public class SwitchCase {
    public static void main(String args[]) {
        int nilai;
        
        String inputNilai = JOptionPane.showInputDialog("Masukkan hasil nilai ujian anda");
        nilai = Integer.parseInt(inputNilai);
        
        String msg = ""; 
        switch(nilai){
            case 100:
                msg = "Jago Kali Ngab";
               
                break;
            case 90:
                msg = "Lumayan Jago";
                break;
            case 80:
                msg = "Jago";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
