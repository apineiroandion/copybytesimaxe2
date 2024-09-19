import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedInputStream bis;
        BufferedOutputStream bos;
        String rutaInicio = "/home/dam/Desktop/copybytesimaxe2/foto.jpeg";
        String rutaDestino = "/home/dam/Desktop/copybytesimaxe2/foto2.jpeg";
        try {
            FileInputStream fis = new FileInputStream(rutaInicio);
            FileOutputStream fos = new FileOutputStream(rutaDestino);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            int c;
            while ((c = bis.read()) != -1) {
                bos.write(c);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
