public class SmartTV {
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void changeChannel(int newChannel) {
        if (newChannel >= 1 && newChannel <= 100) {
            channel = newChannel;
        }
    }
}
