public class Player extends Character{

    public static String Ação(){
        String opção = "";
        System.out.println("O que deseja fazer?");
        System.out.println("a) Atacar");
        System.out.println("b) Defender");
        System.out.println("c) Feitiço");

        return Main.in.nextLine();
    }

    int feitiçoCooldown = 0;

    public Player(String nome, int vida, int ataque, int defesa){
        super(nome, vida, ataque, defesa);
    }

    public void Atacar(Character adversario){

        // Comportamento apenas do Player
        if (adversario instanceof Boss)
        {
            if (((Boss) adversario).getIsProtected())
            {
                ((Boss) adversario).setIsProtected(false);
            }
            else
            {
                super.Atacar(adversario);
            }
        }
        else
        {
           super.Atacar(adversario);
        }

    }

    public boolean Feitiço(Character adversario)
    {
        if (feitiçoCooldown > 0)
        {
            System.out.println("Feitiço ainda em cooldown.");
            return false;
        }
        else
        {
            System.out.println(nome + " ataca " + adversario.nome + " com Feitiço, ficando com " + adversario.vida + " pontos de vida.");
            adversario.setVida(adversario.vida - this.ataque * 3);
            feitiçoCooldown = 2;
            return true;
        }
    }

    public void Refresh(){
        this.defesaAtual = this.defesa;
        if (feitiçoCooldown > 0) feitiçoCooldown--;
    }

}
