import klasy.EventHandler;
import klasy.Player;

import java.util.concurrent.TimeUnit;


public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws InterruptedException {

        Player player = new Player();
        EventHandler eventHandler = new EventHandler();
        clearScreen();
        while(!player.isEscapeValue()){
            System.out.println(player.statViewer());
            eventHandler.AStringOptions();
            eventHandler.AHandle(player);
            //player.setEscapeValue(true);
            TimeUnit.SECONDS.sleep(1);
            clearScreen();

        }



    }
}