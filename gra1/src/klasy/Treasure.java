package klasy;

public class Treasure extends Event{



    public Treasure() {
        super.name = "Skarb";
    }

    @Override
    public void handle(Player player) throws InterruptedException {
        System.out.println();
        super.handle(player);
        int gold = (int)(Math.random()*11)+5;
        player.setGold(player.getGold()+gold);
        System.out.println("Znalazles skarb, masz teraz "+player.getGold()+" złota");
        System.out.println();

    }
}
