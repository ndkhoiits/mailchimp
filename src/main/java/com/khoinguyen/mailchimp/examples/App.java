package com.khoinguyen.mailchimp.examples;


import com.ecwid.maleorang.MailchimpClient;
import com.ecwid.maleorang.MailchimpException;
import com.ecwid.maleorang.MailchimpObject;
import com.ecwid.maleorang.annotation.Field;
import com.ecwid.maleorang.method.v3_0.lists.members.EditMemberMethod;
import com.ecwid.maleorang.method.v3_0.lists.members.MemberInfo;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by khoi.nguyen on 12/20/2016.
 */
public class App {

    public static String APIKEY = "01e87d649ac6e00895a584970be1e063-us12";
    public static String LISTID = "65daf49646";


    public static void main(String[] args) throws IOException, MailchimpException {
        String email = "khoi.nguyen4@niteco.se";
        MailchimpClient client = new MailchimpClient(APIKEY);
        try {

            EditMemberMethod.CreateOrUpdate method = new EditMemberMethod.CreateOrUpdate(LISTID, email);
            method.status = "subscribed";
            method.merge_fields = new MailchimpObject();
            method.merge_fields.mapping.put("FNAME", "Khoi");
            method.merge_fields.mapping.put("LNAME", "Nguyen");
            MemberInfo member = client.execute(method);
            System.out.println(member.status);

        } finally {
            client.close();
        }
    }
}
