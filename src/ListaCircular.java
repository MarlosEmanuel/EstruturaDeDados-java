import java.sql.Ref;

public class ListaCircular implements Metodos{
    private Block ref;

    public ListaCircular(){
        this.ref = null;
    }

    @Override
    public void add(Block newBlock) {
        if(ref == null){
            ref = newBlock;
            ref.setPrev(newBlock);
            ref.setProx(newBlock);
        }
        else {
            Block current = ref;
            while(current.getProx() != ref) {
                current = current.getProx();
            }
            current.setProx(newBlock);
            newBlock.setPrev(current);
            newBlock.setProx(ref);
            ref.setPrev(newBlock);
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
        do{
            System.out.println(current.getNumber());
            current = current.getProx();
        }while(current != ref);
    }

    @Override
    public Block findNumber(int number) {
        Block current = ref;
        while(current != null) {
            if(current.getNumber() == number) {
                return current;
            }
            current = current.getProx();
        }
        return null;
    }
}
