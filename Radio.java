package change_state_meanwhile;

public class Radio { //context

    Station station;

    public void setStation(Station station) {
        this.station = station;
    }

    void nextStation() {
        if (station instanceof Radio2) {
            setStation(new RadioFM());
        } else if (station instanceof RadioFM) {
            setStation(new RadioStation());
        } else if (station instanceof RadioStation) {
            setStation(new Radio2());
        }
    }

    void play() {
        station.paly();
    }
}
