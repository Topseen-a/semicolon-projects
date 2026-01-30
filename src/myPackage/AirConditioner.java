package myPackage;

public class AirConditioner{
    private boolean isOn;
    private String productName;
    private int temperature;

    public AirConditioner(String productName){
        this.productName = productName;
        this.isOn = false;
        this.temperature = 0;
    }

    public void decreaseTemperature() {
        temperature--;
    }
        
    public String getProductName() {
        return productName;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        temperature++;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
