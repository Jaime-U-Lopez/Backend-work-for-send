import java.util.Date;

public class CardClasic extends CardCredit {
    public CardClasic(String emisor, long cupo,int cvv, Date expirationDate ){
        super(emisor,cupo,cvv,expirationDate);
    }

    @Override
    public String toString() {
        return "Card Clasic : " + super.toString();
    }
}
