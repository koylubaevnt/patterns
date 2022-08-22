package ru.koylubaevnt.patterns.structural.bridge.remotes;

import ru.koylubaevnt.patterns.structural.bridge.devices.Device;

/**
 * Улучшенный пульт
 */
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
