import java.util.List;
import java.util.ArrayList;
class YoutubeChannel implements Subject {

    List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer) {
        this.subscribers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        this.subscribers.remove(observer);
    }

    public void newVideoUpload(String title) {
        for (Observer ob : this.subscribers) {
            ob.notified(title);
        }
    }
}