
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;


public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;
    public Hand(){
        hand = new ArrayList<>();
    }
    
    public void add(Card card){
        hand.add(card);
    }
    
    public void print(){
        for(Card card : hand){
            System.out.println(card);
        }
    }
    public void sort(){
        hand = hand.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
    }
    public int sum(){
        int sum =0;
        for(Card card :hand){
            sum += card.getValue();
        }
        return sum;
    }
    public void sortBySuit(){
        BySuitInValueOrder sortby= new BySuitInValueOrder();
        
        Collections.sort(hand, sortby);
    }
    @Override
    public int compareTo(Hand otherHand) {
        return this.sum() - otherHand.sum();
    }
}
