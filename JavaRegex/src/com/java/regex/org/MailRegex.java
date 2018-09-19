package com.java.regex.org;

public class MailRegex implements Patterns {
    private Regexable regexable;

    public MailRegex(Regexable regexable) {
        this.regexable = regexable;
        regexable.addPattern(this);
    }

    @Override
    public String regex() {
        return "(?<UserName>[a-z0-9]+\\.?[a-z]+)@(?<Domain>zohocorp|gmail|outlook|hotmail|yahoo)." +
                "(?<Extension>com)";
    }

    @Override
    public String fileName() {
        return "/home/local/ZOHOCORP/jeffro-pt2151/Documents/Mail.txt";
    }
}
