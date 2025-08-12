package Arrays.TwoPointer.OppositeEnds.Questions;

public class MaxDistanceClosest {
    public static void main(String[] args) {
        int[] seats = {1, 0, 0, 0, 1, 0, 1};
        int maxDist = 0, lastOccupied = -1;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                if (lastOccupied == -1) {
                    maxDist = i;
                } else {
                    maxDist = Math.max(maxDist, (i - lastOccupied) / 2);
                }
                lastOccupied = i;
            }
        }

        maxDist = Math.max(maxDist, seats.length - 1 - lastOccupied);
        System.out.println("Max Distance: " + maxDist);
    }
}
