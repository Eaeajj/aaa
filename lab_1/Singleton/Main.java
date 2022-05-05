package Singleton;

public class Main {
    public static void main(String[] args) {
        Config confFirst = Config.getInstance("213");
        confFirst.getParams();
        Config confSecond = Config.getInstance("123");
        confSecond.getParams();
    }
}
