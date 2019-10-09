/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan20.targetsaldotabungan;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Target
 * Saldo Tabungan
 */
public class IF110118038Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldoAwal = 3500000;
        double bunga = 0.08;
        int saldoTarget = 6000000;
        int i = 1;
        do {
            saldoAwal = saldoAwal + saldoAwal * bunga;
            System.out.println("Saldo di bulan ke-" + i++ + " Rp." + saldoAwal);
        } while(saldoAwal < saldoTarget);
    }
    
}
