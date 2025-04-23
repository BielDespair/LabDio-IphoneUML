package com.leonel;

public class Iphone {
    private final String phoneNumber = "(12)3456-7890";
    private final Dialer dialer = new Dialer(phoneNumber);
    private final MusicPlayer musicPlayer = new MusicPlayer();
    private final WebBrowser webBrowser = new WebBrowser();


    public void boot() {
        System.out.println("Booting iphone");
    }

    public void shutdown() {
        System.out.println("Shutting down iphone");
    }
}