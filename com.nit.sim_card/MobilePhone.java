public class MobilePhone implements MobilePhoneInterface
{
    boolean insert = false;
    SIMCardInterface card;
    

    @Override
    public void insertingSim(SIMCardInterface CARD) {
        card = CARD;
        if(insert){
            System.out.println(CARD.getNetworkProvider()+" simcard already inserted");
        }else{
        insert = true;
        System.out.println(CARD.getNetworkProvider()+" sim card is inserted");
        }
        
    }

    @Override
    public void removingSim() {
       
        if (insert) {
            insert = false;
            System.out.println("simcard has been removed");
        }
        else
        {
            System.out.println("sim is not inserted");
        }
    }

    @Override
    public void makingCalls() {
        
         if (insert==true && card.getActiviton()) {
            System.out.println("Making phone call");
         }else{

             System.out.println("check for sim or activation");

         }

    }

    @Override
    public void sendingText() 
    {
        
        if (insert==true && card.getActiviton()) {
            System.out.println("Sending text message");
        }else{
            System.out.println("check for sim or activation");
        }

    }
    




}
