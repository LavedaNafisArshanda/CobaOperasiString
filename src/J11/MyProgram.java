package J11;
import java.util.Scanner;
public class MyProgram {
    public static void main(String[] args){
        String identitas = "Laveda Nafis Arshanda / X RPL 3 / 19";
        System.out.println("Identitas : "+ identitas);
        
        String y = " Makanan khas Magetan ";
        String[] makanan = {"Lempeng","Jerangking","Rica-rica kelinci"
                            ,"Tepo tahu","Roti bolu","Gethuk lindri"};
        String a,b = "";
        
        System.out.print("Masukkan nama makanan : ");
        Scanner baca = new Scanner(System.in);
        a = baca.nextLine();
        for (int i = 0; i < makanan.length; i++) {
            if(a.equals(makanan[i])) {
               b = makanan[i];
             }}
            
        if(a.equals(b))
        {System.out.println(a + " Benar"+ b.concat(y));}
        else
        {System.out.println(a + " Bukan"+ b.concat(y));}
        
        System.out.println();
        String z = "magetan punya makanan khas";
        System.out.println("Cintai lah makanan lokal " + z.toUpperCase());
    }
}
