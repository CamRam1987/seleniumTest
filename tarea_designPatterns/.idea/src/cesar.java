import java.util.Scanner;

public class cesar {
    public static String cifradoCesar(String textoacodificar) {
        StringBuilder cifrado = new StringBuilder();
        Scanner sc2 = new Scanner(System.in);
        int codigo;
        //Introducir el valor del desplazamiento
        do {
            System.out.print("Introduce el código para cifrado Cesar: ");
            codigo = sc2.nextInt();
        } while (codigo < 1);
        codigo = codigo % 26;
        for (int i = 0; i < textoacodificar.length(); i++) {
            if (textoacodificar.charAt(i) >= 'a' && textoacodificar.charAt(i) <= 'z') {
                if ((textoacodificar.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (textoacodificar.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (textoacodificar.charAt(i) + codigo));
                }
            } else if (textoacodificar.charAt(i) >= 'A' && textoacodificar.charAt(i) <= 'Z') {
                if ((textoacodificar.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (textoacodificar.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (textoacodificar.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }
}
