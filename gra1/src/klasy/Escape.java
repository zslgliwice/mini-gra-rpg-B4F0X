package klasy;

public class Escape extends Event{


    public Escape() {
        super.name = "Ucieczka";
    }

    @Override
    public void handle(Player player) throws InterruptedException {
        super.handle(player);
        System.out.println("Znalazłeś wyjscie z lasu teraz możesz zakończyć gre!");
        player.setCanEscape(true);
    }
}
