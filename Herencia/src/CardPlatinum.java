import java.util.Date;

public class CardPlatinum  extends CardCredit{

    public CardPlatinum(String emisor, long cupo, int cvv, Date expirationDate ){
        super(emisor,cupo,cvv,expirationDate);
    }

    @Override
    public String toString() {
        return "Card platinum : "+super.toString();
    }
}
