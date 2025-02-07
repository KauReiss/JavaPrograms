import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo {   
    public static String Read(String Caminho) {
        String conteudo = "";
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try {
                linha = lerArq.readLine();
                while (linha!=null) {
                    conteudo += linha;
                    linha = lerArq.readLine();
                }
                arq.close();
            } catch (IOException ex) {
                conteudo = "Erro: Não foi possível ler o arquivo!";
            } 
        } catch (FileNotFoundException ex) {
            conteudo = "Erro: Arquivo não encontrado!";
        }
        if (conteudo.contains("Erro")) {
            System.out.println(conteudo);
            return "";
        }
        else {
            return conteudo;
        }
    }
}