package Class_Assignment;

import java.util.ArrayList;

interface HealthDevice {
    void startMonitoring();
    void stopMonitoring();
    void getReading();
    void deviceType();
}

// HeartRateMonitor Implementation
class HeartRateMonitor implements HealthDevice {
    private final int heartRate;

    public HeartRateMonitor(int heartRate) {
        this.heartRate = heartRate;
    }

    @Override
    public void startMonitoring() {
        System.out.println("Heart rate monitoring started.");
    }

    @Override
    public void stopMonitoring() {
        System.out.println("Heart rate monitoring stopped.");
    }

    @Override
    public void getReading() {
        System.out.println("Heart Rate: " + heartRate + " bpm");
    }

    @Override
    public void deviceType() {
        System.out.println("Device Type: Heart Rate Monitor");
    }
}

// StepCounter Implementation
class StepCounter implements HealthDevice {
    private final int steps;

    public StepCounter(int steps) {
        this.steps = steps;
    }

    @Override
    public void startMonitoring() {
        System.out.println("Step tracking started.");
    }

    @Override
    public void stopMonitoring() {
        System.out.println("Step tracking stopped.");
    }

    @Override
    public void getReading() {
        System.out.println("Steps Taken: " + steps);
    }

    @Override
    public void deviceType() {
        System.out.println("Device Type: Step Counter");
    }
}

// SleepTracker Implementation
class SleepTracker implements HealthDevice {
    private final int sleepDuration; // in hours
    private final String quality;

    public SleepTracker(int sleepDuration, String quality) {
        this.sleepDuration = sleepDuration;
        this.quality = quality;
    }

    @Override
    public void startMonitoring() {
        System.out.println("Sleep tracking started.");
    }

    @Override
    public void stopMonitoring() {
        System.out.println("Sleep tracking stopped.");
    }

    @Override
    public void getReading() {
        System.out.println("Sleep Duration: " + sleepDuration + " hours");
        System.out.println("Sleep Quality: " + quality);
    }

    @Override
    public void deviceType() {
        System.out.println("Device Type: Sleep Tracker");
    }
}

// Main Class
public class Question1 {
    public static void main(String[] args) {
        ArrayList<HealthDevice> devices = new ArrayList<>();
        devices.add(new HeartRateMonitor(76));
        devices.add(new StepCounter(5000));
        devices.add(new SleepTracker(7, "Good"));

        for (HealthDevice device : devices) {
            device.deviceType();
            device.startMonitoring();
            device.getReading();
            device.stopMonitoring();
            System.out.println("--------------------------------");
        }
    }
}
