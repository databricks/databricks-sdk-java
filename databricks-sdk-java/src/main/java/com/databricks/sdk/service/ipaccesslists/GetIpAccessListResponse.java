// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ipaccesslists;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GetIpAccessListResponse {
    /**
     
     */
    @JsonProperty("ip_access_lists")
    private java.util.List<IpAccessListInfo> ipAccessLists;
    
    public GetIpAccessListResponse setIpAccessLists(java.util.List<IpAccessListInfo> ipAccessLists) {
        this.ipAccessLists = ipAccessLists;
        return this;
    }

    public java.util.List<IpAccessListInfo> getIpAccessLists() {
        return ipAccessLists;
    }
    
}
