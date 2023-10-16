import javax.swing.JOptionPane;

public class NilaiTerbesarJOptionPane {
    public static void main(String args[]) {
        int elemen = 10;
        int i = 0;
        int terbesar;
        int[] input = new int[elemen];

        while (i < elemen) {
            String inputNilai = JOptionPane.showInputDialog("Masukkan nilai ke-" + i + ": ");
            input[i] = Integer.parseInt(inputNilai);
            i++;
        }

        String msg = "Isi Array : ";
        for (i = 0; i < elemen; i++) {
            msg += input[i] + " ";
        }
        JOptionPane.showMessageDialog(null, msg);

        terbesar = input[0];
        for (i = 0; i < elemen; i++) {
            if (input[i] < terbesar) {
                terbesar = input[i];
            }
        }
        String msgTerbesar = "\nNilai Terbesar : " + terbesar;
        JOptionPane.showMessageDialog(null, msgTerbesar);
    }
}
