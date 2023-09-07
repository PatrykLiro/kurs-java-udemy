package org.example.interfejsy;

public class Interfejs {
    public static void main(String[] args) {
        Browser chrome = new Chrome();
        Browser firefox = new Firefox();

        chrome.gotoPage("elc3.eu");
        firefox.gotoPage("elc3.eu");
    }
}
