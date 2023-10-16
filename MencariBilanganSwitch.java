import javax.swing.JOptionPane;

public class MencariBilanganSwitch {
    //program mencari bilangan menggunakan switch
    public static void main(String args[]) {
        int input;
        
        String inputNilai = JOptionPane.showInputDialog("Input Number");
        input = Integer.parseInt(inputNilai);
        
        switch(input){
            case 1:
                String msg = "Satu";
                JOptionPane.showMessageDialog(null, msg);
                break;
            case 2:
                String msg1 = "dua";
                JOptionPane.showMessageDialog(null, msg1);
            case 3:
                String msg2 = "tiga";
                JOptionPane.showMessageDialog(null, msg2);
            case 4:
                String msg3 = "Empat";
                JOptionPane.showMessageDialog(null, msg3);
                break;
            case 5:
                String msg4 = "Lima";
                JOptionPane.showMessageDialog(null, msg4);
            case 6:
                String msg5 = "Enam";
                JOptionPane.showMessageDialog(null, msg5);
             case 7:
                String msg6 = "Tujug";
                JOptionPane.showMessageDialog(null, msg6);
            case 8:
                String msg7 = "Delapan";
                JOptionPane.showMessageDialog(null, msg7);
                break;
            case 9:
                String msg8 = "Sembilan";
                JOptionPane.showMessageDialog(null, msg8);
            case 10:
                String msg9 = "Sepuluh";
                JOptionPane.showMessageDialog(null, msg9);
            default:
                String msg10 = "Invalid Number";
                JOptionPane.showMessageDialog(null,msg10);
        }
    }
}
