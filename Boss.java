public class Boss extends Monster {

    public Boss(String nome, int vida, int ataque, int defesa){
        super(nome, vida, ataque, defesa);
    }

    private boolean isProtected = false;

    boolean getIsProtected() {
        return isProtected;
    }

    void setIsProtected(boolean isProtected){
        this.isProtected = isProtected;
    }

}
