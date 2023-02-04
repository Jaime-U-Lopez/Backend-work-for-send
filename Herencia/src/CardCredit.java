import java.util.Date;

public class CardCredit {

    private int IdCard;
    private static int ContadorIdCArd = 100;

    private String emisor;
     private long cupo;
     private String numberCard;
     private int cvv;

     private Date expirationDate;

     public CardCredit(){

     }

     public CardCredit(String emisor, long cupo,int cvv, Date expirationDate ){

         this.emisor= emisor;
         this.cupo= cupo;

         this.numberCard= String.valueOf(Math.random()*320);
         this.cvv= cvv;
         this.expirationDate= expirationDate;
         this.IdCard= ++CardCredit.ContadorIdCArd;


     }

     public void print(){

         System.out.println(  "\n Id : "+this.IdCard + " Emisor : " +this.emisor+ " cupo : "+ this.cupo +"\n numberCard : "
                 +this.numberCard+ " cvv : "+ this.cvv+ " expirationDate :" + this.expirationDate   );
     }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public long getCupo() {
        return cupo;
    }

    public void setCupo(long cupo) {
        this.cupo = cupo;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }


    @Override
    public String toString() {
        return "CardCredit{" +
                "IdCard=" + IdCard +
                ", emisor='" + emisor + '\'' +
                ", cupo=" + cupo +
                ", numberCard='" + numberCard + '\'' +
                ", cvv=" + cvv +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
