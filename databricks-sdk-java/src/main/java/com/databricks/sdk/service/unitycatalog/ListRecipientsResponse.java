// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListRecipientsResponse {
    /**
     * An array of recipient information objects.
     */
    @JsonProperty("recipients")
    private java.util.List<RecipientInfo> recipients;
    
    public ListRecipientsResponse setRecipients(java.util.List<RecipientInfo> recipients) {
        this.recipients = recipients;
        return this;
    }

    public java.util.List<RecipientInfo> getRecipients() {
        return recipients;
    }
    
}
