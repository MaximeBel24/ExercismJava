package E004_Bird_Watcher;

import java.util.Arrays;

public class MainBirdWatcher {
    public static void main(String[] args) {

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        int numberOfDay = 10000;

        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);


        System.out.println("Jour sans oiseau  vrai ou faux: " + birdWatcher.hasDayWithoutBirds());
        System.out.println("Oiseau des " + numberOfDay + " premiers jours : " + birdWatcher.getCountForFirstDays(numberOfDay));
        System.out.println("Nombre de jour avec beaucoup d'oiseau : " + birdWatcher.getBusyDays());

    }
}
