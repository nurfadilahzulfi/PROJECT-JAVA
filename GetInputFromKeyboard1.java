import javax.swing.JOptionPane;
public class GetInputFromKeyboard1
{
public static void main( String args [] ){
    String word1 = "";
    String word2 = "";
    String word3 = "";
        word1 = JOptionPane.showInputDialog("Please enter your word1");
        word2 = JOptionPane.showInputDialog("Please enter your word2");
        word3 = JOptionPane.showInputDialog("Please enter your word3");
    
        String msg = "Hello " + word1 + " " + word2 + " " + word3 + " ";
        JOptionPane.showMessageDialog(null, msg);
}
}