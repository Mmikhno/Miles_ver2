public class BonusMilesService {

    public int calculate(int cost) {

        int oneMile = 20; // руб для одной бонусной мили
        int result;

        result = cost / oneMile;
        return result;
    }
}
