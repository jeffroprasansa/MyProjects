package com.java.regex.org;

import java.io.IOException;

public interface Regexable {
    public boolean addPattern(Patterns pattern);
    public void CallRegexPattern() throws IOException;
    public void writetoFile(String fromFile,String toFile,String expression) throws IOException;
}
