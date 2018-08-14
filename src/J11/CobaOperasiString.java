package J11;
import java.util.Locale;
public class CobaOperasiString {
    public static void main(String[] args){
        
        String identitas = "Laveda Nafis Arshanda / X RPL 3 / 19";
        System.out.println("Identitas : "+ identitas);
        
      String x = "Operasi";
//    System.out.println("Isi variabel x : "+ x);
//    System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
//     
//    System.out.println("x adalah kosong : " + x.isEmpty());
//        
      String y = "";
//    System.out.println("isi variabel y : "+ y);
//    System.out.println("y adalah kososng : " + y.isEmpty());
    

    System.out.println("isi x sama dengan y : "+ x.equals(y));
        
    String z = "Operasi";
    System.out.println("isi variabel z : "+ z);
    System.out.println("isi x sama dengan z (Case Sensitive) : "
                + x.equals(z));
        
    String r = "Operasi";
    System.out.println("isi variabel r : "+ r);
    System.out.println("isi x sama dengan r (Case Sensitive) : "
                + x.equals(r));
    System.out.println("isi x sama dengan r (Not Case Sensitive) : "
                + x.equalsIgnoreCase(r));

    }
}