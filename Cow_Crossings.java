import java.util.*;

public class CowTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int observations = scanner.nextInt();
        Map<Integer, Integer> lastSpot = new HashMap<>();
        int confirmedMoves = 0;

        for (int i = 0; i < observations; i++) {
            int cowID = scanner.nextInt();
            int currentSpot = scanner.nextInt();

            if (lastSpot.containsKey(cowID)) {
                int lastSeen = lastSpot.get(cowID);
                if (lastSeen != currentSpot) {
                    confirmedMoves++;
                }
            }

            lastSpot.put(cowID, currentSpot);
        }

        System.out.println(confirmedMoves);
    }
}
