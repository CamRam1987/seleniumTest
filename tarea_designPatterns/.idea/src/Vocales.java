public class Vocales {
    public static String cifradoNumerico(String textoacodificar){
        char letra;
        filePrint fp=new filePrint();
        String frase2="";
        for (int j = 0; j < textoacodificar.length(); j++) {
            letra = textoacodificar.charAt(j);

            if (letra=='a') {
                letra = '1';
            }
            if (letra=='e') {
                letra = '2';
            }
            if (letra=='i') {
                letra = '3';
            }
            if (letra=='o') {
                letra = '4';
            }
            if (letra=='u') {
                letra = '5';
            }
            else {
                frase2 = frase2+letra;
            }
        }
        //fp.fileWriter(frase2);
        return frase2;
    }
}
