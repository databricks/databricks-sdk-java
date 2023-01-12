// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ipaccesslists;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class FetchIpAccessListResponse {
    /**
     
     */
    @JsonProperty("ip_access_list")
    private IpAccessListInfo ipAccessList;
    
    public FetchIpAccessListResponse setIpAccessList(IpAccessListInfo ipAccessList) {
        this.ipAccessList = ipAccessList;
        return this;
    }

    public IpAccessListInfo getIpAccessList() {
        return ipAccessList;
    }
    
}
