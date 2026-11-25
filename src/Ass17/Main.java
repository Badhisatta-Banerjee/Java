package Ass17;

interface Camera {
    void captureImage();
    void recordVideo();
}

interface WiFiEnabled {
    void connectToWiFi();
    void disconnectFromWiFi();
}

class SmartCamera implements Camera, WiFiEnabled {
    @Override
    public void captureImage() {
        System.out.println("SmartCamera is capturing an image.");
    }

    @Override
    public void recordVideo() {
        System.out.println("SmartCamera is recording video.");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("SmartCamera is connected to Wi-Fi.");
    }

    @Override
    public void disconnectFromWiFi() {
        System.out.println("SmartCamera is disconnected from Wi-Fi.");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartCamera sc = new SmartCamera();

        System.out.println("----- Camera Functions -----");
        sc.captureImage();
        sc.recordVideo();
        
        System.out.println("----- Wi-Fi Functions -----");
        sc.connectToWiFi();
        sc.disconnectFromWiFi();
    }
}