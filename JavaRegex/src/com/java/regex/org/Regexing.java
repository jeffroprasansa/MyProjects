package com.java.regex.org;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Regexing {
    static final String urlstr="https://www.ibm.com/support/knowledgecenter/en/SSGMCP_5.4.0/administering/cpsm/eyuadc0079.html";
    static final String file="/home/local/ZOHOCORP/jeffro-pt2151/Documents/text.txt";

    public static void main(String[] args) throws IOException {
        downloadUsingStream(urlstr,file);
        RegularExpression regularExpression=new RegularExpression();
        MailRegex mailRegex=new MailRegex(regularExpression);
        UrlRegex urlRegex=new UrlRegex(regularExpression);
        regularExpression.CallRegexPattern();


    }
    private static   void downloadUsingStream(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] buffer = new byte[1024];
        int count=0;
        while((count = bufferedInputStream.read(buffer,0,1024)) != -1)
        {
            fileOutputStream.write(buffer, 0, count);
        }
        fileOutputStream.close();
        bufferedInputStream.close();
    }
}
