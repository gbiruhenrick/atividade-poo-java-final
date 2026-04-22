public class Main {
    public static void main(String[] args) {
        // Criando o cliente (usando o molde que a gente fez)
        Cliente cli = new Cliente("123.456.789-00", "Gabriel Silva", "gabriel@email.com", "Mauá");

        // Criando o produto
        Produto prod = new Produto(1, "Placa de Vídeo", 2000.0);

        // Mostrando o que a gente criou
        System.out.println(cli.imprimir());
        
        // Calculando 15% de desconto
        double precoFinal = prod.desconto(15);
        System.out.println("Produto: " + prod.getDescricao() + " | Com desconto: R$ " + precoFinal);
    }
}