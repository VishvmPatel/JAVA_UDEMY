class Phone {
    void call() {
        System.out.println("Making a call...");
    }
    void sms() {
        System.out.println("Sending an SMS...");
    }
}
interface Camera {
    void click();
    void record();
}
interface MusicPlayer {
    void play();
    void pause();
    void stop();
}
class SmartPhone extends Phone implements Camera, MusicPlayer {
    public void videoCall() {
        System.out.println("Making a video call...");
    }
    // Implementing Camera interface methods
    public void click() {
        System.out.println("Clicking a photo...");
    }
    public void record() {
        System.out.println("Recording a video...");
    }
    // Implementing MusicPlayer interface methods
    public void play() {
        System.out.println("Playing music...");
    }
    public void pause() {
        System.out.println("Pausing music...");
    }
    public void stop() {
        System.out.println("Stopping music...");
    }
}
public class PhoneInterfaceExample {
    public static void main(String[] args) {
        // Creating a SmartPhone object
        SmartPhone myPhone = new SmartPhone();
        // Using Phone class features
        myPhone.call();
        myPhone.sms();
        // Using Camera interface features
        myPhone.click();
        myPhone.record();
        // Using MusicPlayer interface features
        myPhone.play();
        myPhone.pause();
        myPhone.stop();
        // Using SmartPhone-specific feature
        myPhone.videoCall();
    }
}
