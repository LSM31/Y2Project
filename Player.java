import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {
    private int cardTotal;
    private ArrayList<String> cards = new ArrayList<String>();
    private boolean hasAce = false;
    
    public Player(){
        cardTotal = 0;
    }

    public int getTotal(){
        return cardTotal;
    }

    public void showCards(){
        System.out.println(cards);
    }

    //calculates the total value of the player's hand
    public int calcTotal(){
        cardTotal = 0;
        //gets raw point value
        for(String item : cards){
            if(item.equals("Ace")){
                cardTotal += 11;
            }
            if(item.equals("King") || item.equals("Queen") || item.equals("Jack")){
                cardTotal += 10;
            }
            else{
                if(!(item.equals("Ace"))){
                    cardTotal += Integer.parseInt(item);
                }
            }
        }

        //reduces the card count if an ace is in the deck
        if ((cardTotal > 21) && hasAce){
            cardTotal -= 10;
        }

        return cardTotal;
    }

    public void drawCard(ArrayList<String> deck){
        cards.add(deck.get(0));
        if(deck.get(0).equals("Ace")){
            hasAce = true;
        }
        deck.remove(0);

    }

    public void resetCards(){
        cards.clear();
        cardTotal = 0;
        hasAce = false;
    }

    public String upCard(){
        return cards.get(0);
    }

    public int upCardValue(){
        int value = 0;
        String upCard = cards.get(0);
        if(upCard.equals("Ace")){
            value = 11;
        }
        if(upCard.equals("King") || upCard.equals("Queen") || upCard.equals("Jack")){
            value = 10;
        }
        else{
            if(!(upCard.equals("Ace"))){
                value = Integer.parseInt(upCard);
            }
        }
        return value;
    }



}
