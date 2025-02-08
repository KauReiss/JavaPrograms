public class Main {
    public static void main(String[] args) throws Exception {
        String arq = "test.txt";

        String texto = "Lorem ipsum dolor sit amet. Id eveniet alias qui omnis amet eum internos labore in voluptates perferendis. Et esse debitis At itaque omnis vel ipsa itaque et quas laudantium.\r\n" +
                        "\r\n" +
                        "Est obcaecati assumenda nam incidunt aperiam qui modi cumque id asperiores nobis. Id nulla quia aut temporibus omnis est veniam minus. Et animi commodi est repellat dolorum quo iste quae ea reprehenderit harum et natus impedit eum excepturi suscipit.\r\n";

        if (Arquivo.Write(arq, texto)) {
            System.out.println("Arquivo gravado com sucesso!");
        } else {
            System.out.println("Erro ao salvar o arquivo");
        }
    }
}
