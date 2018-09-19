package com.java.regex.org;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression implements Regexable {
    static final String file="/home/local/ZOHOCORP/jeffro-pt2151/Documents/text.txt";
    private List<Patterns> patterns=new ArrayList<>();

    @Override
    public boolean addPattern(Patterns pattern) {
        patterns.add(pattern);
        return false;
    }

    @Override
    public void CallRegexPattern() throws IOException {
        for (Patterns p:patterns){
            System.out.println("hai");
            writetoFile(file,p.fileName(),p.regex());
        }
    }

    @Override
    public void writetoFile(String fromFile, String toFile,String expression) throws IOException {
        String s=extractString(fromFile);
        Pattern pattern=Pattern.compile(expression);
        Matcher matcher=pattern.matcher(s);
        FileWriter fileWriter=new FileWriter(toFile);
        while (matcher.find()){
//            System.out.println(matcher.group());
            fileWriter.append(matcher.group());
        }
        fileWriter.close();
    }
    private String extractString(String file) throws IOException {
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String str=bufferedReader.readLine();
        String temp=str;
        while (str!=null){
            str=bufferedReader.readLine();
            temp+=str;
        }
        return temp;
    }

}
