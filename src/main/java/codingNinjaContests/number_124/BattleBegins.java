package codingNinjaContests.number_124;

public class BattleBegins {
    public static void main(String[] args) {
        System.out.println(battleBegins(2, 8, 2, 1));
    }

    public static int battleBegins(int x, int y, int a, int b) {
        // Write your code here.
        for (int i = 0; i <= y - x; i++) {
            if ((x + a) == (y - b)) {
                return 1;
            }
            x = x + a;
            y = y - b;
        }
        return 0;
    }
}
