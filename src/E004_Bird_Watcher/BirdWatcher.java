package E004_Bird_Watcher;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        // int today = (birdsPerDay.length) - 1;
        return birdsPerDay[(birdsPerDay.length) - 1];
    }

    public void incrementTodaysCount() {
        int today = getToday();
        System.out.println("Today : " + today);
        int incrToday = today + 1 ;
        System.out.println("Today + 1 : " + incrToday);
        birdsPerDay[(birdsPerDay.length) - 1] = incrToday;
    }

    public boolean hasDayWithoutBirds() {
        boolean withoutBirds = false;
        for(int bird: birdsPerDay){
            if(bird == 0){
                withoutBirds = true;
            }
        }
        return withoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if(numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        for(int i = 0; i < numberOfDays; i++ ){
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int bird: birdsPerDay){
            if(bird >= 5){
                busyDays ++;
            }
        }
        return busyDays;
    }
}
