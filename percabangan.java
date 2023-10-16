import javax.swing.JOptionPane;

public class percabangan {
    //SAYA AKAN MEMBUAT PROGRAM MENENTUKAN NILAI KELULUSAN
    public static void main(String args[]) {
        int nilai;
        
        String inputNilai = JOptionPane.showInputDialog("Masukkan hasil nilai ujian anda");
        nilai = Integer.parseInt(inputNilai);
        
        if(nilai>=85){
            String msg = "Grade Anda A";
            JOptionPane.showMessageDialog(null,msg);
        }
        else if(nilai>=80){
            String msg = "Grade Anda AB";
            JOptionPane.showMessageDialog(null,msg);
    }
        else if(nilai>=70){
           String msg = "Grade Anda B";
            JOptionPane.showMessageDialog(null,msg);
    }
        else if(nilai>=65){
           String msg = "Grade Anda BC";
            JOptionPane.showMessageDialog(null,msg);
    }
         else if(nilai>=50){
           String msg = "Grade Anda C";
            JOptionPane.showMessageDialog(null,msg);
    }
        else if(nilai>=45){
           String msg = "Grade Anda D";
            JOptionPane.showMessageDialog(null,msg);
    }
        else{
            String msg = "ANDA DI DO AWOKAWOAWO";
            JOptionPane.showMessageDialog(null,msg);
                }
        
        
    }
}
