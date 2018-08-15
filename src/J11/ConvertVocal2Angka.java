package J11;
import java.util.Scanner;
public class ConvertVocal2Angka {
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (vokal ke Angka)\n");}
    
   private static String tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;}
   
    public static void main(String[] args){
    String identitas = "Laveda Nafis Arshanda / X RPL 3 / 19";
    tampilJudul(identitas);
    String kalimat = tampilInput();
 }
}
