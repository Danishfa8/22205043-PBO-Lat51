package pkg22205043.pbo.lat51;

import java.util.Scanner;

/* Nama : Danish Fadlan Azam Nim : 22205043 
 * Prodi : Teknik Informatika
 * Semseter : 3/pagi
 */
class Karyawan {

    protected String nik;
    protected String nama;
    protected String jabatan;
    protected int golongan;

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
}

class Manager extends Karyawan {

    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = kehadiran * 10000;
        return tunjanganKehadiran;
    }

    public float tunjanganJabatan(String jabatan) {
        if (jabatan.equals("Manager")) {
            tunjanganJabatan = 2000000;
        } else if (jabatan.equals("Kabag")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
    }

    public float tunjanganGolongan(int golongan) {
        if (golongan == 1) {
            tunjanganGolongan = 500000;
        } else if (golongan == 2) {
            tunjanganGolongan = 1000000;
        } else if (golongan == 3) {
            tunjanganGolongan = 1500000;
        }
        return tunjanganGolongan;
    }

    public float totalGaji() {
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }

}

public class PBOLat51 {

    public static void main(String[] args) {

        Scanner inputan = new Scanner(System.in);
        Manager mngr = new Manager();
        System.out.println("=== Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan Nik : ");
        mngr.setNik(inputan.nextLine());
        System.out.print("Masukkan Nama : ");
        mngr.setNama(inputan.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        mngr.setGolongan(inputan.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        mngr.setJabatan(inputan.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        mngr.setKehadiran(inputan.nextInt());
        System.out.println("");

        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK : " + mngr.getNik());
        System.out.println("Nama : " + mngr.getNama());
        System.out.println("Golongan : " + mngr.getGolongan());
        System.out.println("Jabatan : " + mngr.getJabatan());
        System.out.println("");

        System.out.println("TUNJANGAN GOLONGAN : " + mngr.tunjanganGolongan(mngr.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : " + mngr.tunjanganJabatan(mngr.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : " + mngr.tunjanganKehadiran(mngr.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL " + mngr.totalGaji());
    }
}
