package lesson22.homework;

public class RemoteControl {
    private int frequency;

    public RemoteControl(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void switchChannel(TV tv, int chanel) {
        if (this.frequency == tv.getFrequency() && chanel > 0 && chanel <= tv.getMaxChannel()) {
            tv.switchChannel(chanel);
        }
    }

    public void switchChannelFWD(TV tv) {
        if (this.frequency == tv.getFrequency()) {
            tv.switchChannelFWD();
        }
    }

    public void switchChannelAFT(TV tv) {
        if (this.frequency == tv.getFrequency()) {
            tv.switchChannelAFT();
        }
    }


}
