package lesson22.homework;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV(402,100);
        RemoteControl RC = new RemoteControl(402);
        RC.switchChannelAFT(tv);
        System.out.println("Curent channel: " + tv.getCurrentChannel());
        RC.switchChannelFWD(tv);
        RC.switchChannelFWD(tv);

        RC.switchChannel(tv, 152);
        System.out.println("Curent channel: " + tv.getCurrentChannel());

        RC.switchChannel(tv, 52);
        System.out.println("Curent channel: " + tv.getCurrentChannel());
    }
}
