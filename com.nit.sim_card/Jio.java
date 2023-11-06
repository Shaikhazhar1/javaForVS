public class Jio implements SIMCardInterface
{
    String phoneNumber;
    String provider;
    boolean activate;

    Jio(String number)
    {
        this.phoneNumber = number;
        provider = "JIO";
        activate = false;
    }

    @Override
    public String getPhoneNumber() {
        
       return phoneNumber;
    }

    @Override
    public String getNetworkProvider() {
    
        return provider;
        
    }

    @Override
    public boolean getActiviton() 
    {
        
        return activate;
        
    }

    @Override
    public void Activate() {
        if (activate) {
            System.out.println(provider+"sim card is already activated");
            
        }else
        {
            activate = true;
            System.out.println(provider+" has been activated");
        }
        
    }

    @Override
    public void Deactivate() {
        if (activate) {
            activate = false;
            System.out.println(provider+" has been deactivated");
        }
        else
        {
            System.out.println("already deactivated");
        }
    }
    
}
