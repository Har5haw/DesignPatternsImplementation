package Observer;

interface Stream {
    void register(Listener listener);
    void unregister(Listener listener);
    void notifyListeners();
    String getUpdate(Listener listener);

}
