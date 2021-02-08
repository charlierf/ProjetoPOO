package bcb.utils;

import java.util.Random;
import java.util.UUID;

public class Codigo {
    public static String gerarCodigo() {
        return UUID.randomUUID().toString();
    }

    public static String gerarCodigo20Linhas() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digitos = "1234567890";
        String caracteres = letras + digitos;
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            sb.append(caracteres.charAt(rand.nextInt(caracteres.length())));
        }

        return sb.toString();
 
    }
}
