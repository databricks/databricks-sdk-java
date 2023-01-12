// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateRecipient {
    /**
     * Description about the recipient.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * IP Access List
     */
    @JsonProperty("ip_access_list")
    private IpAccessList ipAccessList;
    
    /**
     * Name of Recipient.
     */
    @JsonProperty("name")
    private String name;
    
    public UpdateRecipient setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public UpdateRecipient setIpAccessList(IpAccessList ipAccessList) {
        this.ipAccessList = ipAccessList;
        return this;
    }

    public IpAccessList getIpAccessList() {
        return ipAccessList;
    }
    
    public UpdateRecipient setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
