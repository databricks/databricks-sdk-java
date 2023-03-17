// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class GcpNetwork {
    /**
     * The network configuration ID that is attached to the workspace. This
     * field is available only if the network is a customer-managed network.
     */
    @JsonProperty("network_id")
    private String networkId;
    
    public GcpNetwork setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    public String getNetworkId() {
        return networkId;
    }
    
}
