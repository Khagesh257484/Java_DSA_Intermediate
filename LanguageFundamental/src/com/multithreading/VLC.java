package com.multithreading;

public class VLC {
    public void playAudio(char ch) {
        if (ch == 'a' || ch == 'A')
            System.out.println("Audio is playing..");
        else
            System.out.println("Please use your audio..");
    }

    public void playVideo(char ch) {
        if (ch == 'v' || ch == 'V')
            System.out.println("Video is playing");
        else
            System.out.println("Please play video to watch");
    }
}
