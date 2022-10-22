package ArrayList.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> firstPlayerCards = Arrays.stream(sc.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayerCards = Arrays.stream(sc.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //1. get the first card from the deck
        //2. remove the card from the deck
        //3. check who wins
        // if card 1 > card 2 -> move card 2 to the last index and place card 1 next to last in the winning deck
        // if card 2 > card 1 -> move card 1 to the last index and card 2 next to last in the winning deck.
        // if card 1 = card 2 -> remove both cards from each of the 2 decks.

        // the game is over when someone is left without any cards.

        while (firstPlayerCards.size() != 0 && secondPlayerCards.size() != 0) {
            int firstPlayerCard = firstPlayerCards.get(0);
            int secondPlayerCard = secondPlayerCards.get(0);
            firstPlayerCards.remove(0);
            secondPlayerCards.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);

            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerCards.add(secondPlayerCard);
                secondPlayerCards.add(firstPlayerCard);
            }

            if (firstPlayerCards.size() == 0) {
                System.out.printf("Second player wins! Sum: %d", getCardsSum(secondPlayerCards));
            } else if (secondPlayerCards.size() == 0) {
                System.out.printf("First player wins! Sum: %d", getCardsSum(firstPlayerCards));
            }
        }
    }

    private static int getCardsSum(List<Integer> listOfCards) {
        int sum = 0;
        for (int card : listOfCards) {
            sum += card;
        }
        return sum;
    }
}
