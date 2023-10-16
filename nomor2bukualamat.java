import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nomor2bukualamat {

    public static class BukuAlamat {

        private String nama;
        private String alamat;
        private String telepon;
        private String email;

        public BukuAlamat(String nama, String alamat, String telepon, String email) {
            this.nama = nama;
            this.alamat = alamat;
            this.telepon = telepon;
            this.email = email;
        }

        public String getNama() { // ini adalah accessor Method untuk membaca nama
            return nama;
        }

        public String getAlamat() { // ini adalah accessor Method untuk membaca alamat
            return alamat;
        }

        public String getTelepon() { // ini adalah accessor Method untuk membaca telepon
            return telepon;
        }

        public String getEmail() { // ini adalah accessor Method untuk membaca email
            return email;
        }

        public void setNama(String nama) { // ini adalah Mutator method untuk mengubah nama
            this.nama = nama;
        }

        public void setAlamat(String alamat) { // ini adalah Mutator method untuk mengubah nama
            this.alamat = alamat;
        }

        public void setTelepon(String telepon) { // ini adalah Mutator method untuk mengubah nomor telepon
            this.telepon = telepon;
        }

        public void setEmail(String email) { // ini adalah Mutator method untuk mengubah email
            this.email = email; 
        }

        @Override
        public String toString() {
            return "Nama: " + nama + "\nAlamat: " + alamat + "\nTelepon: " + telepon + "\nEmail: " + email;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        BukuAlamat[] daftarBukuAlamat = new BukuAlamat[100];
        int jumlahBukuAlamat = 0;
        int menu;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Tampilkan Seluruh Data");
            System.out.println("4. Update Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            menu = Integer.parseInt(dataIn.readLine());

            switch (menu) {
                case 1:
                    if (jumlahBukuAlamat < 100) {
                        System.out.print("Masukkan nama: ");
                        String nama = dataIn.readLine();
                        System.out.print("Masukkan alamat: ");
                        String alamat = dataIn.readLine();
                        System.out.print("Masukkan nomor telepon: ");
                        String telepon = dataIn.readLine();
                        System.out.print("Masukkan email: ");
                        String email = dataIn.readLine();

                        BukuAlamat bukuAlamat = new BukuAlamat(nama, alamat, telepon, email);
                        daftarBukuAlamat[jumlahBukuAlamat] = bukuAlamat;
                        jumlahBukuAlamat++;
                        System.out.println("Data telah ditambahkan.");
                    } else {
                        System.out.println("Daftar Buku Alamat penuh (maksimum 100).");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan nama yang akan dihapus: ");
                    String namaHapus = dataIn.readLine();

                    boolean ditemukanHapus = false;

                    for (int i = 0; i < jumlahBukuAlamat; i++) {
                        if (daftarBukuAlamat[i] != null && daftarBukuAlamat[i].getNama().equalsIgnoreCase(namaHapus)) {
                            daftarBukuAlamat[i] = null;
                            ditemukanHapus = true;
                            System.out.println("Data telah dihapus.");
                            break;
                        }
                    }

                    if (!ditemukanHapus) {
                        System.out.println("Data dengan nama " + namaHapus + " tidak ditemukan.");
                    }
                    break;
                case 3:
                    if (jumlahBukuAlamat == 0) {
                        System.out.println("Daftar Buku Alamat kosong.");
                    } else {
                        for (int i = 0; i < jumlahBukuAlamat; i++) {
                            if (daftarBukuAlamat[i] != null) {
                                System.out.println(daftarBukuAlamat[i]);
                                System.out.println("==============================");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama yang akan diupdate: ");
                    String namaUpdate = dataIn.readLine();

                    boolean ditemukanUpdate = false;

                    for (int i = 0; i < jumlahBukuAlamat; i++) {
                        if (daftarBukuAlamat[i] != null && daftarBukuAlamat[i].getNama().equalsIgnoreCase(namaUpdate)) {
                            System.out.print("Masukkan alamat baru: ");
                            String alamatBaru = dataIn.readLine();
                            System.out.print("Masukkan nomor telepon baru: ");
                            String teleponBaru = dataIn.readLine();
                            System.out.print("Masukkan email baru: ");
                            String emailBaru = dataIn.readLine();

                            daftarBukuAlamat[i].setAlamat(alamatBaru);
                            daftarBukuAlamat[i].setTelepon(teleponBaru);
                            daftarBukuAlamat[i].setEmail(emailBaru);

                            System.out.println("Data telah diupdate.");
                            ditemukanUpdate = true;
                            break;
                        }
                    }

                    if (!ditemukanUpdate) {
                        System.out.println("Data dengan nama " + namaUpdate + " tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
        } while (menu != 5);
    }
}