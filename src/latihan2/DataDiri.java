
package latihan2;

public class DataDiri {
    String nama,kelas;
    int npm;
    
    public DataDiri(String nama, String Kelas, int npm){
        this.nama = nama;
        this.kelas = kelas;
        this.npm = npm;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("NPM : " + npm);
        System.out.println("Kelas : " +  kelas);
    }
}
