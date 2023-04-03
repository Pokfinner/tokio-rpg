public class Character {

    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected int defesaAtual;

    public Character(String nome, int vida, int ataque, int defesa)
    {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.defesaAtual = this.defesa;
    }

    public void Atacar(Character adversario){

        int vidaRetirada = this.ataque - adversario.defesa;

        if (vidaRetirada > 0)
        {
            adversario.setVida(adversario.vida - vidaRetirada);
            System.out.println(nome + " ataca " + adversario.nome + ", que fica com " + adversario.vida + " pontos de vida.");
        }

    }

    public void Defender(){
        this.defesaAtual += 5;
    }

    public int getAtaque(){
        return this.ataque;
    }

    public String getNome(){
        return this.nome;
    }

    public void setAtaque(String nome){
        this.nome = nome;
    }

    public void setAtaque(int novoAtaque){
        if (novoAtaque < 0)
        {
            this.ataque = 0;
        }
        else {
            this.ataque = novoAtaque;
        }
    }

    public int getVida(){
        return this.vida;
    }

    public void setVida(int novaVida){
        if (novaVida < 0)
        {
            this.vida = 0;
        }
        else {
            this.vida = novaVida;
        }
    }

    public int getDefesa(){
        return this.defesa;
    }

    public void setDefesa(int novaDefesa){
        if (novaDefesa < 0)
        {
            this.defesa = 0;
        }
        else {
            this.defesa = novaDefesa;
        }
    }

}
