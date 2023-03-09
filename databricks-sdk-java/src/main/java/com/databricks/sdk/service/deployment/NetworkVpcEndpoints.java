// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * If specified, contains the VPC endpoints used to allow cluster communication
 * from this VPC over [AWS PrivateLink].
 * 
 * [AWS PrivateLink]: https://aws.amazon.com/privatelink/
 */
public class NetworkVpcEndpoints {
    /**
     * The VPC endpoint ID used by this network to access the Databricks secure
     * cluster connectivity relay. See [Secure Cluster Connectivity].
     * 
     * This is a list type for future compatibility, but currently only one VPC
     * endpoint ID should be supplied.
     * 
     * **Note**: This is the Databricks-specific ID of the VPC endpoint object
     * in the Account API, not the AWS VPC endpoint ID that you see for your
     * endpoint in the AWS Console.
     * 
     * [Secure Cluster Connectivity]: https://docs.databricks.com/security/secure-cluster-connectivity.html
     */
    @JsonProperty("dataplane_relay")
    private java.util.List<String> dataplaneRelay;
    
    /**
     * The VPC endpoint ID used by this network to access the Databricks REST
     * API. Databricks clusters make calls to our REST API as part of cluster
     * creation, mlflow tracking, and many other features. Thus, this is
     * required even if your workspace allows public access to the REST API.
     * 
     * This is a list type for future compatibility, but currently only one VPC
     * endpoint ID should be supplied.
     * 
     * **Note**: This is the Databricks-specific ID of the VPC endpoint object
     * in the Account API, not the AWS VPC endpoint ID that you see for your
     * endpoint in the AWS Console.
     */
    @JsonProperty("rest_api")
    private java.util.List<String> restApi;
    
    public NetworkVpcEndpoints setDataplaneRelay(java.util.List<String> dataplaneRelay) {
        this.dataplaneRelay = dataplaneRelay;
        return this;
    }

    public java.util.List<String> getDataplaneRelay() {
        return dataplaneRelay;
    }
    
    public NetworkVpcEndpoints setRestApi(java.util.List<String> restApi) {
        this.restApi = restApi;
        return this;
    }

    public java.util.List<String> getRestApi() {
        return restApi;
    }
    
}
