package E002_Cook_Your_Lasagna;

public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int minInOven){
        return expectedMinutesInOven() - minInOven;
    }
    public int preparationTimeInMinutes(int lLayers){
        return lLayers * 2;
    }
    public int totalTimeInMinutes(int lLayer, int min){
        return preparationTimeInMinutes(lLayer) + min;
    }
}
