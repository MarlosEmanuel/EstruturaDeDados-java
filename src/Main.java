public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Adiciona nós
        arvore.add(new Block(10));
        arvore.add(new Block(5));
        arvore.add(new Block(15));
        arvore.add(new Block(3));
        arvore.add(new Block(7));
        arvore.add(new Block(13));
        arvore.add(new Block(18));

        // Listar Em Ordem (valores em ordem crescente)
        System.out.println("Em Ordem:");
        arvore.listarEmOrdem();

        // Listar Pré-Ordem
        System.out.println("\nPré-Ordem:");
        arvore.listarPreOrdem();

        // Listar Pós-Ordem
        System.out.println("\nPós-Ordem:");
        arvore.listarPosOrdem();
    }


}
