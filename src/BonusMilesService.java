public class BonusMilesService {
    public static int calculate(int price){
        int bonusCoefficient = 20;
        int bonusMiles = price / bonusCoefficient;
        return bonusMiles;
    }
}
