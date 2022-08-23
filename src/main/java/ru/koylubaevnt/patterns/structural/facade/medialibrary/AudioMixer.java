package ru.koylubaevnt.patterns.structural.facade.medialibrary;

import java.io.File;

/**
 * Микширование аудио
 */
public class AudioMixer {

    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
