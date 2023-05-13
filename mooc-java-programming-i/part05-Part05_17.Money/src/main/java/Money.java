
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money addition){
        Money newMoney = new Money((this.euros+addition.euros),(this.cents+addition.cents));
        return newMoney;
    }
    public boolean lessThan(Money compared){
        int cents = this.euros*100 + this.cents;
        int centsCompared = compared.euros*100 + compared.cents;
        if(cents < centsCompared){
            return true;
        }
        return false;
    }
    public Money minus(Money decreaser){
        int eur = this.euros - decreaser.euros;
        int cent = this.cents - decreaser.cents;
        if(cent <0){
            eur -=1;
            cent+= 100;
        }
        if(eur<0){
            return new Money(0,0);
        }
        return new Money(eur, cent);
    }
}
