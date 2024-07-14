public class User {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();
        System.out.println(smartTV.on);
        System.out.println(smartTV.channel);
        System.out.println(smartTV.volume);

        smartTV.turnOn();
        System.out.println(smartTV.on);
        smartTV.increaseVolume();
        System.out.println(smartTV.volume);
        smartTV.changeChannel(10);
        System.out.println(smartTV.channel);
    }
}
