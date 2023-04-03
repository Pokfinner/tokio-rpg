public class Level {

    Player player;
    Character adversario;

    public Level(Player player, Character adversario)
    {
        this.player = player;
        this.adversario = adversario;
    }

    public boolean Fight(){

        System.out.println("Novo nível! Contra " + adversario.nome);

        while (player.vida > 0)
        {
            String ação = Player.Ação();
            if (ação.equals("a")) this.player.Atacar(adversario);
            else if (ação.equals("b")) this.player.Defender();
            else if (ação.equals("c")) {

                if (this.player.Feitiço(adversario))
                {

                }
                else
                {
                    continue;
                }
            }

            if (adversario.getVida() <= 0)
            {
                System.out.println("Ganhou.");
                return true;
            }

            // Vez do Adversário
            adversario.Atacar(player);
            if (player.getVida() <= 0)
            {
                System.out.println("Game Over.");
                return false;
            }

            player.Refresh();
        }

        return false;
    }
}
