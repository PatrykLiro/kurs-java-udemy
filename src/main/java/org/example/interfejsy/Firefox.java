package org.example.interfejsy;

public class Firefox implements Browser {
    protected String url;

    @Override
    public String getEngine() {
        return Browser.super.getEngine();
    }

    @Override
    public void gotoPage(String url) {
        this.url = url;
        System.out.println("Firefox url: " + url);
    }

    @Override
    public void refreshPage() {
    }

    @Override
    public void bookmarkPage() {

    }
}
