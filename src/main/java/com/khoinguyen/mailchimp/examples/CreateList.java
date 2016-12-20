package com.khoinguyen.mailchimp.examples;

import com.ecwid.maleorang.MailchimpClient;
import com.ecwid.maleorang.MailchimpException;
import com.ecwid.maleorang.method.v3_0.lists.CampaignDefaultsInfo;
import com.ecwid.maleorang.method.v3_0.lists.ContactInfo;
import com.khoinguyen.mailchimp.methods.lists.CreateListMethod;

import java.io.IOException;

/**
 * Created by khoi.nguyen on 12/20/2016.
 */
public class CreateList {
    public static void main(String[] args) throws IOException, MailchimpException {
        MailchimpClient client = new MailchimpClient(App.APIKEY);
        CreateListMethod method = new CreateListMethod();
        method.name = "Example List";
        method.contact = new ContactInfo();
        method.contact.address1 = "Hanoi";
        method.contact.company = "Niteco";
        method.contact.city = "HanoiVN";
        method.contact.zip = "100000";
        method.contact.state = "HN";
        method.contact.country = "VN";

        method.permission_reminder = "KJDKFJDKJFDKFJ";
        method.campaign_defaults = new CampaignDefaultsInfo();
        method.campaign_defaults.from_email = "ndkhoi168@gmail.com";
        method.campaign_defaults.from_name = "Khoi";
        method.campaign_defaults.subject = "XXX";
        method.campaign_defaults.language = "VI";

        method.email_type_option = true;
        try {
            client.execute(method);
        } finally {
            client.close();
        }
    }
}
