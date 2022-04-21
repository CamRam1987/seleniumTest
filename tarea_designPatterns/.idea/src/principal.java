import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class principal {

    public static void main(String[] args) throws IOException {

        cesar cesarobject=new cesar();
        Vocales vcobject=new Vocales();
        filePrint fp=new filePrint();
        File file=new File("C:\\Users\\camil\\OneDrive\\Documentos\\School of Automation/textinput.txt");
        Scanner scan= new Scanner(file);
        String textoInicial;
        String[] array;
        String textoacodificar;
        String codificador;
        while(scan.hasNextLine()){
            textoInicial=scan.nextLine();
            array=textoInicial.split("-");
            codificador=array[0];
            textoacodificar=array[1];
            if(codificador.charAt(0)=='c'){
                System.out.println("Texto cifrado Cesar: " + cesarobject.cifradoCesar(textoacodificar));
                //fp.fileWriter(cesarobject.cifradoCesar(textoacodificar));
                System.out.println("Texto Original: "+textoInicial);
            }
            if(codificador.charAt(0)=='v'){
                System.out.println("Texto cifrado númerico: " + vcobject.cifradoNumerico(textoacodificar));
               // fp.fileWriter(cesarobject.cifradoCesar(textoacodificar));
                System.out.println("Texto Original: "+textoInicial);
           }
        }

    }


}