package E002_Cook_Your_Lasagna;

public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int x){
        return expectedMinutesInOven() - x;
    }
    public int preparationTimeInMinutes(int y){
        return y * 2;
    }
    public int totalTimeInMinutes(int x, int y){
        return preparationTimeInMinutes(x) + y;
    }
}
