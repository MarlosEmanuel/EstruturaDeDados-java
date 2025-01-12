public class ListaDuplamenteEncadeada implements Metodos{
    private Block ref;

    public ListaDuplamenteEncadeada() {
        this.ref = null;
    }

    @Override
    public void add(Block newBlock) {
        if(ref == null) {
            ref = newBlock;
        }
        else {
            Block current = ref;
            while(current.getProx() != null) {
                current = current.getProx();
            }
            current.setProx(newBlock);
            newBlock.setPrev(current);
        }
    }

    @Override
    public void removeNumber(int number) {
        Block current = ref;
        while(current != null) {
            if(current.getProx().getNumber() == number) {
                current.setProx(current.getProx().getProx());
                break;
            }
            current = current.getProx();
        }
    }

    @Override
    public void findAll() {
        Block current = ref;
        while(current != null) {
            System.out.println(current.getNumber());
            current = current.getProx();
        }
    }

    @Override
    public Block findNumber(int number) {
        return null;
    }
}
