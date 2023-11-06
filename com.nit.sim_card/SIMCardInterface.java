public interface SIMCardInterface {

    abstract String getPhoneNumber();
    abstract String getNetworkProvider();
    abstract boolean getActiviton();
    abstract void Activate();
    abstract void Deactivate();

}