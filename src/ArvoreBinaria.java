public class ArvoreBinaria {
    private Block ref; // Raiz da árvore

    public ArvoreBinaria() {
        this.ref = null;
    }

    // Adiciona nós à árvore (como já implementado anteriormente)
    public void add(Block newBlock) {
        if (this.ref == null) {
            this.ref = newBlock;
        } else {
            Block current = this.ref;
            while (true) {
                if (newBlock.getNumber() < current.getNumber()) {
                    if (current.getPrev() == null) {
                        current.setPrev(newBlock);
                        break;
                    }
                    current = current.getPrev();
                } else {
                    if (current.getProx() == null) {
                        current.setProx(newBlock);
                        break;
                    }
                    current = current.getProx();
                }
            }
        }
    }

    // Pré-Ordem
    public void listarPreOrdem() {
        listarPreOrdem(this.ref);
    }

    private void listarPreOrdem(Block node) {
        if (node != null) {
            System.out.println(node.getNumber()); // Visita o nó atual
            listarPreOrdem(node.getPrev());       // Visita o filho esquerdo
            listarPreOrdem(node.getProx());       // Visita o filho direito
        }
    }

    // Em Ordem
    public void listarEmOrdem() {
        listarEmOrdem(this.ref);
    }

    private void listarEmOrdem(Block node) {
        if (node != null) {
            listarEmOrdem(node.getPrev());        // Visita o filho esquerdo
            System.out.println(node.getNumber()); // Visita o nó atual
            listarEmOrdem(node.getProx());        // Visita o filho direito
        }
    }

    // Pós-Ordem
    public void listarPosOrdem() {
        listarPosOrdem(this.ref);
    }

    private void listarPosOrdem(Block node) {
        if (node != null) {
            listarPosOrdem(node.getPrev());       // Visita o filho esquerdo
            listarPosOrdem(node.getProx());       // Visita o filho direito
            System.out.println(node.getNumber()); // Visita o nó atual
        }
    }

    //Adicionando uma linha para conectar no Github
}
