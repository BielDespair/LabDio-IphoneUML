package com.leonel;

import com.leonel.model.Message;

import java.util.ArrayList;
import java.util.List;

public class Dialer {
    private String phoneNumber;

    public Dialer(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private final List<Message> voicemail = new ArrayList<>();


    public void call(String phoneNumber) {
        System.out.println("Dialing " + phoneNumber + "...");
    }

    public void answerCall(String phoneNumber) {
        System.out.println("Answering " + phoneNumber + "...");

    }

    public void voiceMail() {
        for (Message message : voicemail) {
            System.out.println(message);
            voicemail.remove(message);
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
