public class Block {
    private int number;
    private Block prox;
    private Block prev;

    public Block(int number) {
        this.number = number;
        this.prox = null;
        this.prev = null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Block getProx() {
        return prox;
    }

    public void setProx(Block prox) {
        this.prox = prox;
    }

    public Block getPrev() {
        return prev;
    }

    public void setPrev(Block prev) {
        this.prev = prev;
    }
}
