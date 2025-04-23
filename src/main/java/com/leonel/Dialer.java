package com.leonel;

import com.leonel.model.Message;

import java.util.ArrayList;
import java.util.List;

public class Dialer {
    private String phoneNumber;
    private final List<Message> voicemail = new ArrayList<>();

    public Dialer(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public void call(String phoneNumber) {
        System.out.println("Dialing " + phoneNumber + "...");
    }

    public void answerCall() {
        System.out.println("Answering call");

    }

    public void checkVoiceMail() {
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
