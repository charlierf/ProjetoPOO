package bcb.utils;

import java.util.UUID;

public class Codigo {
    public static String gerarCodigo() {
        return UUID.randomUUID().toString();
    }
}
