// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class IpAccessList {
    /**
     * Allowed IP Addresses in CIDR notation. Limit of 100.
     */
    @JsonProperty("allowed_ip_addresses")
    private java.util.List<String> allowedIpAddresses;
    
    public IpAccessList setAllowedIpAddresses(java.util.List<String> allowedIpAddresses) {
        this.allowedIpAddresses = allowedIpAddresses;
        return this;
    }

    public java.util.List<String> getAllowedIpAddresses() {
        return allowedIpAddresses;
    }
    
}
