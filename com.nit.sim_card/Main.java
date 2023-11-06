public class Main {
    public static void main(String[] args) {
        
        SIMCardInterface jio = new Jio("9168054067");
        SIMCardInterface bsnl = new BSNL("9922667024");
        SIMCardInterface airtel = new Airtel("9422090974");

        MobilePhone m1 = new MobilePhone();

        m1.insertingSim(jio);
        jio.Activate();
        m1.makingCalls();
        m1.sendingText();

        MobilePhone m2 = new MobilePhone();

        m2.makingCalls();

    }
}
