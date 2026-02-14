package televisionSystem;

public class TelevisionSystem {

    private boolean isOn;
    private int volume;
    private int channel;
    private final int MINIMUM_VOLUME = 0;
    private final int MAXIMUM_VOLUME = 30;

    public TelevisionSystem() {
        this.isOn = false;
        this.volume = 15;
        this.channel = 1;
    }

    public void powerOn() {
        isOn = true;
    }

    public void powerOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void volumeUp() {
        checkIfOn();
        if (volume < MAXIMUM_VOLUME) {
            volume++;
        }
    }
    
    public void volumeDown() {
        checkIfOn();
        if (volume > MINIMUM_VOLUME) {
            volume--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        checkIfOn();
        if (channel <= 0) {
            throw new IllegalArgumentException("Invalid channel number");
        }
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    private void checkIfOn() {
        if (!isOn) {
            throw new IllegalArgumentException("Tv is off");
        }
    }
}