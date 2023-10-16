public class NilaiTerbesar {
    public static void main(String[] args) {
        int number1 = 10, number2 = 23, number3 = 5;
        // Mencari angka dengan nilai terbesar menggunakan operator kondisi ?: 
        int max = (number1 > number2) ? ((number1 > number3) ? number1 : number3) : ((number2 > number3) ? number2 : number3);
        
        // Menampilkan hasil
        System.out.println("number 1 = " + number1);
        System.out.println("number 2 = " + number2);
        System.out.println("number 3 = " + number3);
        System.out.println("Angka dengan nilai terbesar adalah: " + max);
    }
}

