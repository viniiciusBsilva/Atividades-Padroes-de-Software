import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BingoSystem implements Subject {
    private static BingoSystem uniqueInstance = null;
    private List<Observer> bingoCards;
    private int numberDrawn;
    private boolean gameEnded;

    private BingoSystem() {
        bingoCards = new ArrayList<Observer>();
        gameEnded = false;
    }

    public static BingoSystem getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new BingoSystem();
        }
        return uniqueInstance;
    }

    public void subscribe(Observer observer) {
        bingoCards.add(observer);
    }

    public void unsubscribe(Observer observer) {
        bingoCards.remove(observer);
    }

    public void notifyObservers(int numberDrawn) {
        for (Observer observer : bingoCards) {
            observer.update(numberDrawn);
        }
    }

    public void startBingo(int maxNumber) {
        Random random = new Random();
        gameEnded = false;
        while (!gameEnded) {
            numberDrawn = random.nextInt(maxNumber) + 1;
            notifyObservers(numberDrawn);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void bingo(String message) {
        String[] split = message.split(" ");
        int cardId = Integer.parseInt(split[0]);
        System.out.println("Bingo called by card " + cardId + "!");
        gameEnded = true;
    }
}