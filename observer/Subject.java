interface Subject {
    public void subscribe(Observer observer);

    public void unsubscribe(Observer observer);

    public void newVideoUpload(String title);
}