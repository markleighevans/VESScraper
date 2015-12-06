package com.tinker.DAIScraper.Utilities;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;

/**
 * Created by root on 06/12/15.
 */
public  class DAIUtilities {
    public   static String  GetTags( HtmlPage InputPage ) throws IOException
    {

        String TagList ="";
        Iterable<DomElement> descendents2 = InputPage.getElementsByTagName("div");
        for(DomElement element2 : descendents2)
        {

            String Xpath = (element2.getCanonicalXPath());
            String ID = element2.getId();
            String tag = element2.getTagName();
            String text = element2.asText();
            System.out.println("Element: \""+tag+"\"; \""+ID+"\"; \""+text+"\"" + Xpath);
            TagList = "Element: \""+tag+"\"; \""+ID+"\"; \""+text+"\"" + Xpath ;
        }
        return TagList;
    }
}
