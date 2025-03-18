package klasy;

import java.util.Scanner;

public class Camp extends Event{


    public Camp() {
        super.name = "obóz";
    }

    @Override
    public void handle(Player player) throws InterruptedException {
        super.handle(player);
        System.out.println();
        System.out.println("Znalazłes obóz możesz uleczyc 40 zdrowia za 20 złota [y/n]");
        Scanner scanner = new Scanner(System.in);
        String odp = scanner.nextLine().toLowerCase();

        if(odp.equals("y")&&player.getHealth()<=60&&player.getGold()>=20){
            player.setHealth(player.getHealth()+40);
            player.setGold(player.getGold()-20);
            System.out.println("Zostałes wyleczony");

        }else{
            System.out.println("Nie zostałes wyleczony");
        }
    }
}
