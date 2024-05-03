package lesson22.homework.task1;

public class TV {
    private int frequency;
    private int currentChannel;
    private int maxChannel;

    public TV(int frequency, int maxChannel) {
        this.frequency = frequency;
        this.currentChannel = 1;
        this.maxChannel = maxChannel;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void switchChannel(int channel) {
        currentChannel = channel;
    }

    public void switchChannelFWD() {
        if (currentChannel == maxChannel) {
            currentChannel = 1;
        } else currentChannel++;
    }
    public void switchChannelAFT() {
        if (currentChannel == 1) {
            currentChannel = maxChannel;
        } else currentChannel--;
    }
}
