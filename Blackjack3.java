import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Blackjack3 {
    
    //Adds all the card values for a given suit
    public static void addCards(ArrayList d){
        for(int i = 0; i < 4; i++){
            d.add("Ace");
            d.add("2");
            d.add("3");
            d.add("4");
            d.add("5");
            d.add("6");
            d.add("7");
            d.add("8");
            d.add("9");
            d.add("10");
            d.add("King");
            d.add("Queen");
            d.add("Jack");
        }
    }

    public static void resetDeck(ArrayList d){
        d.clear();
        addCards(d);
        Collections.shuffle(d);
    }

    public static void main(String[] args){
        //initiates deck of cards
        ArrayList<String> deck = new ArrayList<String>();
        addCards(deck);
        Collections.shuffle(deck);

        //wins and losses for data:
        int wins = 0;
        int losses = 0;

        //plays the game:
        Player player = new Player();
        Player dealer = new Player();
        int loops = 10000000;
        for(int i = 0; i < loops; i++){
            //resets the game from previous rounds:
            player.resetCards();
            dealer.resetCards();
            resetDeck(deck);

            //initial starting hand
            player.drawCard(deck);
            dealer.drawCard(deck);
            player.drawCard(deck);
            dealer.drawCard(deck);

            //player turn; for now, player randomly hits or stands:
            while(player.calcTotal() < 21){
                if(player.getTotal() < 14){
                    //hit:
                    player.drawCard(deck);
                }
                else{
                    if(player.getTotal() >= 20){
                        //stand:
                        break;
                    }
                    else{
                        if ((dealer.upCard().equals("Ace") || dealer.upCardValue() == 10) && player.calcTotal() < 19) {
                            //hit:
                            player.drawCard(deck);
                            continue;
                        }

                        if((dealer.upCardValue() + 11) > (player.getTotal())){
                            //hit:
                            player.drawCard(deck);
                        }
                        else{
                            //stand:
                            break;
                        }
                    }
                }
            }

            //checks if the player went over 21, and if it does, it ends the round
            if(player.getTotal() > 21){
                losses += 1;
                continue;
            }

            //dealer turn, rules are simple for the dealer:
            while(true){
                if(dealer.calcTotal() <= 16){
                    //hit:
                    dealer.drawCard(deck);
                }
                else{
                    //stand:
                    break;
                }
            }

            if(dealer.getTotal() > 21){
                wins += 1;
                continue;
            }
            
            //prints totals at the end of the round:
            player.calcTotal();
            dealer.calcTotal();
            if(player.getTotal() ==  dealer.getTotal()){
                continue;
            }
            if(player.getTotal() > dealer.getTotal()){
                wins += 1;
            }
            if (player.getTotal() < dealer.getTotal()) {
                losses += 1;
            }
        }

        System.out.println();
        System.out.println("Rounds played: " + loops);
        System.out.println("Total Wins: " + wins);
        System.out.println("Total Losses: " + losses);
        System.out.println("Total draws: " + (loops - wins - losses));
        System.out.println("Win percentage: " + ((double)wins/loops * 100) + "%");
        double ratio = Math.round((double)wins/losses * 1000) / 1000.0;
        System.out.println("Win to loss ratio: " + (ratio));
        System.out.println();

    }

    
}
