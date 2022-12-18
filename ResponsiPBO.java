import java.util.*;

public class ResponsiPBO {
    public static Scanner input = new Scanner(System.in);
    public static String pin, back, norek;
    public static int pilihan, penarikan, transfer, a, b;
    public static double saldo = 3000000;

    public static void main(String[] args) {
        System.out.println("\tBANK SYAHPUTRA");
        a = 1;
        do{
            System.out.println("Masukkan PIN Anda : ");
            pin = input.nextLine();
        
            if(pin.equals("18258")){
                transaksi();
                back = "";
                do{
                transaksi();
                back = input.nextLine();
            }while(back.equalsIgnoreCase(""));
            }else{
                System.out.println("\nMaaf, PIN Anda Tidak Terdaftar");
                a = a+1;
            }
        }while(a <= 3);
        System.out.println("\nATM Terblokir!");
    }
    
    public static void transaksi(){
        System.out.println("\n\tATM");
        System.out.println("Pilih Menu Transaksi:");
        System.out.println("1. Penarikan");
        System.out.println("2. Transfer");
        System.out.println("3. Informasi Saldo");
        System.out.println("Masukkan Pilihan Anda: ");
        pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                System.out.println("\n\tPenarikan");
                penarikan();
                break;
            case 2:
                System.out.println("\n\tTransfer");
                daftarTransfer();
                break;
            case 3:
                System.out.println("\n\tInformasi Saldo");
                infoRek();
                break;
            default:
                System.out.println("Pilihan Anda Salah!");
                infoRek();
                break;
        }
    }
    
    public static void penarikan(){
        int [] nominal = {500000, 100000, 200000, 300000, 500000, 750000, 1000000};
        System.out.println("1. 50000 \t5. 500000");
        System.out.println("2. 100000 \t6. 750000");
        System.out.println("3. 200000 \t7. 1000000");
        System.out.println("4. 400000");
        System.out.println("Masukkan Pilihan Jumlah Penarikan Tunai: ");
        penarikan = input.nextInt();
        saldo = saldo - nominal[penarikan-1];
        System.out.println("Penarikan Tunai Telah Berhasil!");
        System.out.println("Sisa Saldo Anda = " +saldo);
        back = input.nextLine();
        do{
            b = 1;
            b++;
        }while(b <= 3);
            saldo = (saldo - nominal[penarikan-1]) + (nominal[penarikan-1] * 0.03);
            System.out.println("Penarikan Tunai Telah Berhasil");
            System.out.println("Sisa Saldo Anda = " +saldo);
            back = input.nextLine();
    }
    
    public static void daftarTransfer(){
        System.out.println("Masukkan Nomor Rekening Tujuan Anda: ");
        input.nextLine();
        norek = input.nextLine();
        if(norek.equals("2000018258")){
            transfer();
        }else if(norek.equals("2000018262")){
            transfer();
        }else if(norek.equals("2000018263")){
            transfer();
        }else if(norek.equals("2000018270")){
            transfer();
        }else if(norek.equals("2000018272")){
            transfer();
        }else{
            System.out.println("Nomor Rekening Tidak Terdaftar!");
            back = input.nextLine();
        }
    }
    
    public static void transfer(){
        System.out.println("Masukkan Jumlah Tunai Yang Ditransfer: ");
        transfer = input.nextInt();
        saldo = saldo - transfer;
        System.out.println("\nTransaksi Anda Berhasil. Rincian: ");
        System.out.println("No. Rek : " +norek + "\nJumlah Tunai : " +transfer);
        back = input.nextLine();
    }
    
    public static void infoRek(){
        System.out.println("Saldo Anda: " +saldo);
        back = input.nextLine();
    }

}