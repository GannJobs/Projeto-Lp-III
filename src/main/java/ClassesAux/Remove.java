package ClassesAux;

import java.io.*;

public class Remove {
    public static boolean removerEmpregado(int str, String arquivo) {
        String chave = String.valueOf(str);
        try {
            File inputFile = new File(arquivo);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String linha;
            boolean encontrado = false;
           //  ========  busca ==========================
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(",");
                String primeiraColuna = campos[0].trim();

                if (primeiraColuna.equals(chave)) {
                    encontrado = true;
                    continue; // Ignora a linha atual
                }

                writer.write(linha);
                writer.newLine();
            }

            writer.close();
            reader.close();

            if (encontrado) {
                inputFile.delete();
                tempFile.renameTo(inputFile);
                return true;
            } else {
                tempFile.delete();
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
