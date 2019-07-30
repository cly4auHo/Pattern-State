package change_state_meanwhile;

public class StateApp {

    public static void main(String[] args) {
        Station rfm = new RadioFM();
        Radio radio = new Radio();
        radio.setStation(rfm);

//        for (int i = 0; i < 10; i++) {
//            radio.play();
//            radio.nextStation();
//        }
        Human h = new Human();
        h.setState(new Weekend());
        for (int i = 0; i < 10; i++) {
            h.doSomething();
        }
    }
}
