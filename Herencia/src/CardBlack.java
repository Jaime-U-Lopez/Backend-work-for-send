import java.util.Date;

public class CardBlack extends CardCredit {


    public CardBlack(String emisor, long cupo,int cvv, Date expirationDate ){
        super(emisor,cupo,cvv,expirationDate);
    }


    @Override
    public String toString() {
        return "Card Black : " +super.toString();
    }
}
