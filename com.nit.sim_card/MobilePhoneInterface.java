public interface MobilePhoneInterface 
{

    abstract void insertingSim(SIMCardInterface CARD);
    abstract void removingSim();
    abstract void makingCalls();
    abstract void sendingText();

}
