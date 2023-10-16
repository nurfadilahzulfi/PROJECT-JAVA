public class entrybukualamat {
    private String nama;
    private String namaLengkap;
    private String alamat;
    private String alamatLengkap;
    private String nomorTelepon;
    private String email;

    // Constructor
    public entrybukualamat(String nama, String namaLengkap, String alamat, String alamatLengkap, String nomorTelepon, String email) {
        this.nama = nama;
        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.alamatLengkap = alamatLengkap;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    // Accessor methods
    public String getNama() {
        return nama;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getAlamatLengkap() {
        return alamatLengkap;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    // Mutator methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setAlamatLengkap(String alamatLengkap) {
        this.alamatLengkap = alamatLengkap;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        entrybukualamat personalInfo = new entrybukualamat("John", "John Doe", "Blang Kulam", "Lhokseumawe", "1234567890", "john.doe@gmail.com");

        // Menampilkan informasi
        System.out.println("Nama: " + personalInfo.getNama());
        System.out.println("Nama Lengkap: " + personalInfo.getNamaLengkap());
        System.out.println("Alamat: " + personalInfo.getAlamat());
        System.out.println("Alamat Lengkap: " + personalInfo.getAlamatLengkap());
        System.out.println("Nomor Telepon: " + personalInfo.getNomorTelepon());
        System.out.println("Email: " + personalInfo.getEmail());
    }
}
