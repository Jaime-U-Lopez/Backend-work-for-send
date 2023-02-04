import java.util.Date;

public class CardGolden   extends CardCredit{


    public CardGolden(String emisor, long cupo, int cvv, Date expirationDate ){
        super(emisor,cupo,cvv,expirationDate);
    }

    @Override
    public String toString() {
        return "Card Golden : " + super.toString();
    }
}
