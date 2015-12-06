package com.tinker.DAIScraper;
import com.tinker.DAIScraper.Representations.Vehicle;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import java.io.IOException;
import java.util.List;

import com.tinker.DAIScraper.Utilities.DAIUtilities;
import com.tinker.DAIScraper.Utilities.DAIUtilities.*;

/**
 * Created by root on 05/12/15.
 */
public class VehicleScraper {
    public static void main(String[] args) throws IOException {

// ***********************************************************************************************
// ***********************************************************************************************
        Vehicle SkeletonVehicle = null;
        SkeletonVehicle.SetVRM("WF10EDK");


        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(java.util.logging.Level.OFF);
        String url = "https://www.vehicleenquiry.service.gov.uk";
        final WebClient webClient = new WebClient(BrowserVersion.CHROME);
        final HtmlPage InputPage = webClient.getPage(url);
        System.out.println(InputPage.getTitleText());
// ***********************************************************************************************
// ***********************************************************************************************
// ***********************************************************************************************

        HtmlInput VRMInput = InputPage.getElementByName("ctl00$MainContent$txtSearchVrm");
        VRMInput.setValueAttribute("WF10EDK");

        HtmlInput MakeInput = InputPage.getElementByName("ctl00$MainContent$MakeTextBox");
        MakeInput.setValueAttribute("VOLKSWAGEN");

// ***********************************************************************************************
// ***********************************************************************************************

        HtmlSubmitInput submitBtn = InputPage.getElementByName("ctl00$MainContent$butSearch");
        final HtmlPage ResultsPage = submitBtn.click();
// ***********************************************************************************************
// ***********************************************************************************************

        System.out.println(ResultsPage.getTitleText());
        List<DomNode> DivAll = (List<DomNode>) ResultsPage.getByXPath("/html/body/form/div[7]/div/div/ul");
        int Iterator = 0;
        while (Iterator < DivAll.size()) {
            System.out.println(DivAll.get(Iterator).asText());
            Iterator++;
        }

        List<DomNode> DivVEDMOT = (List<DomNode>) ResultsPage.getByXPath("/html/body/form/div[7]/div/div/div[2]");
        Iterator = 0;
        while (Iterator < DivVEDMOT.size()) {
            System.out.println(DivVEDMOT.get(Iterator).asText());
            Iterator++;
        }
        System.out.println(DAIUtilities.GetTags(ResultsPage));
    }

}
