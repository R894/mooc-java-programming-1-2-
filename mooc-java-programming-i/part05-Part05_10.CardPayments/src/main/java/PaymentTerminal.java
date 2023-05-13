
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment>= 2.50){
            affordableMeals++;
            money+= 2.50;
            return payment-2.50;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment>= 4.30){
            heartyMeals++;
            money+= 4.30;
            return payment-4.30;
        }
        return payment;
    }
    public boolean eatAffordably(PaymentCard payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment.takeMoney(2.50)){
            affordableMeals++;
            //money+= 2.50;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment.takeMoney(4.30)){
            heartyMeals++;
            //money+= 4.30;
            return true;
        }
        return false;
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(money >= sum && sum>0){
            card.addMoney(sum);
            money+=sum;
        }
    }
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
