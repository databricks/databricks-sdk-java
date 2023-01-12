// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class WorkloadType {
    /**
     * defined what type of clients can use the cluster. E.g. Notebooks, Jobs
     */
    @JsonProperty("clients")
    private ClientsTypes clients;
    
    public WorkloadType setClients(ClientsTypes clients) {
        this.clients = clients;
        return this;
    }

    public ClientsTypes getClients() {
        return clients;
    }
    
}
