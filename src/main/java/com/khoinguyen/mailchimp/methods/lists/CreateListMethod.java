package com.khoinguyen.mailchimp.methods.lists;

import com.ecwid.maleorang.MailchimpMethod;
import com.ecwid.maleorang.annotation.APIVersion;
import com.ecwid.maleorang.annotation.Field;
import com.ecwid.maleorang.annotation.HttpMethod;
import com.ecwid.maleorang.annotation.Method;
import com.ecwid.maleorang.method.v3_0.lists.CampaignDefaultsInfo;
import com.ecwid.maleorang.method.v3_0.lists.ContactInfo;
import com.ecwid.maleorang.method.v3_0.lists.ListInfo;

/**
 * Created by khoi.nguyen on 12/20/2016.
 */
@Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/lists")
public class CreateListMethod extends MailchimpMethod<ListInfo> {
    @Field
    public String name;

    @Field
    public ContactInfo contact;

    @Field
    public CampaignDefaultsInfo campaign_defaults;

    @Field
    public boolean email_type_option;

    @Field
    public String permission_reminder;

}
