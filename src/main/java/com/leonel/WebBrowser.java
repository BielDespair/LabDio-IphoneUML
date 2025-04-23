package com.leonel;

import java.util.ArrayList;
import java.util.List;

public class WebBrowser {
    private String currentPage;
    private final List<String> pages = new ArrayList<>();

    public void showPage(String url) {
        System.out.println("Showing " + url + "...");
        currentPage = url;
        pages.add(currentPage);
    }

    public void refreshPage() {
        System.out.println("Refreshing " + currentPage + "...");
        showPage(currentPage);
    }

    public void closePage() {
        System.out.println("Closing " + currentPage + "...");
        pages.remove(currentPage);
    }
}
