package com.java.regex.org;

public class UrlRegex implements Patterns {
    private Regexable regexable;

    public UrlRegex(Regexable regexable) {
        this.regexable = regexable;
        regexable.addPattern(this);
    }



    @Override
    public String regex() {
        return "(?<Protocol>https?)+://(?<Body>[a-zA-Z0-9]+\\.?)+(https?){0,0}" +
                "(?<Tail>/[a-zA-Z0-9@#?=$%^&*!_()\\[\\].,\\-+]+)*(https?){0,0}";
    }

    @Override
    public String fileName() {
        return "/home/local/ZOHOCORP/jeffro-pt2151/Documents/Url.txt";
    }
}
