public class BonusMilesService {
    public int calculate(int cost) {
        int priceOneMile = 500; //стоимость одной мили в рублях
        int miles = cost / priceOneMile;
        return miles;

    }
}
