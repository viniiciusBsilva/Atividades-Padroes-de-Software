import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BingoCard implements Observer{
    private int cardId;
    private int[] numbers;
    private BingoSystem subject;

    public BingoCard(BingoSystem subject, int cardId, int numberOfSlots, int maxNumber) {
        this.subject = subject;
        this.cardId = cardId;
        numbers = new int[numberOfSlots];
        Set<Integer> set = new HashSet<Integer>();
        Random random = new Random();
        for (int i = 0; i < numberOfSlots; i++) {
            int num = random.nextInt(maxNumber) + 1;
            while (set.contains(num)) {
                num = random.nextInt(maxNumber) + 1;
            }
            set.add(num);
            numbers[i] = num;
        }
        subject.subscribe(this);
    }

    public void update(int numberDrawn) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberDrawn) {
                numbers[i] = -1;
            }
        }
    }

    public boolean didIWin() {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == -1) {
                count++;
            }
        }
        return count == numbers.length;
    }

    public int getCardId() {
        return cardId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Card " + cardId + ": ");
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i] + " ");
        }
        return sb.toString();
    }
}
