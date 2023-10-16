import java.util.Arrays;

class PersonalInformation {
    private String name;
    private String fullName;
    private String address;
    private String fullAddress;
    private String phoneNumber;
    private String email;

    public PersonalInformation(String name, String fullName, String address, String fullAddress, String phoneNumber, String email) {
        this.name = name;
        this.fullName = fullName;
        this.address = address;
        this.fullAddress = fullAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Full Name: " + fullName + "\n" +
               "Address: " + address + "\n" +
               "Full Address: " + fullAddress + "\n" +
               "Phone Number: " + phoneNumber + "\n" +
               "Email: " + email + "\n";
    }
}

public class BukuAlamat {
    private PersonalInformation[] data;
    private int dataSize;

    public BukuAlamat() {
        this.data = new PersonalInformation[100];
        this.dataSize = 0;
    }

    public void tambahData(PersonalInformation info) {
        if (dataSize < 100) {
            data[dataSize] = info;
            dataSize++;
            System.out.println("Data berhasil dimasukkan.");
        } else {
            System.out.println("Buku alamat penuh, tidak dapat menambahkan data.");
        }
    }

    public void hapusData(int index) {
        if (index >= 0 && index < dataSize) {
            for (int i = index; i < dataSize - 1; i++) {
                data[i] = data[i + 1];
            }
            data[dataSize - 1] = null;
            dataSize--;
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public void tampilkanData() {
        for (int i = 0; i < dataSize; i++) {
            System.out.println("Data ke-" + (i + 1) + ":\n" + data[i]);
        }
    }

    public void updateData(int index, PersonalInformation updatedInfo) {
        if (index >= 0 && index < dataSize) {
            data[index] = updatedInfo;
            System.out.println("Data berhasil diperbarui.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public static void main(String[] args) {
        BukuAlamat bukuAlamat = new BukuAlamat();

        // Menambahkan data
        bukuAlamat.tambahData(new PersonalInformation("John", "John Doe", "123 Street", "City, Country", "1234567890", "john.doe@example.com"));
        bukuAlamat.tambahData(new PersonalInformation("Alice", "Alice Smith", "456 Avenue", "Town, Country", "9876543210", "alice.smith@example.com"));

        // Menampilkan data
        System.out.println("Data Buku Alamat:");
        bukuAlamat.tampilkanData();

        // Menghapus data
        bukuAlamat.hapusData(0);

        // Menampilkan data setelah penghapusan
        System.out.println("\nData Buku Alamat setelah penghapusan:");
        bukuAlamat.tampilkanData();

        // Memperbarui data
        bukuAlamat.updateData(0, new PersonalInformation("John", "John Doe", "789 Road", "City, Country", "1112223333", "john.doe.updated@example.com"));

        // Menampilkan data setelah pembaruan
        System.out.println("\nData Buku Alamat setelah pembaruan:");
        bukuAlamat.tampilkanData();
    }
}
