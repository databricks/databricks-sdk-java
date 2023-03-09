// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateNetworkRequest {
    /**
     * The Google Cloud specific information for this network (for example, the
     * VPC ID, subnet ID, and secondary IP ranges).
     */
    @JsonProperty("gcp_network_info")
    private GcpNetworkInfo gcpNetworkInfo;
    
    /**
     * The human-readable name of the network configuration.
     */
    @JsonProperty("network_name")
    private String networkName;
    
    /**
     * IDs of one to five security groups associated with this network. Security
     * group IDs **cannot** be used in multiple network configurations.
     */
    @JsonProperty("security_group_ids")
    private java.util.List<String> securityGroupIds;
    
    /**
     * IDs of at least two subnets associated with this network. Subnet IDs
     * **cannot** be used in multiple network configurations.
     */
    @JsonProperty("subnet_ids")
    private java.util.List<String> subnetIds;
    
    /**
     * If specified, contains the VPC endpoints used to allow cluster
     * communication from this VPC over [AWS PrivateLink].
     * 
     * [AWS PrivateLink]: https://aws.amazon.com/privatelink/
     */
    @JsonProperty("vpc_endpoints")
    private NetworkVpcEndpoints vpcEndpoints;
    
    /**
     * The ID of the VPC associated with this network. VPC IDs can be used in
     * multiple network configurations.
     */
    @JsonProperty("vpc_id")
    private String vpcId;
    
    public CreateNetworkRequest setGcpNetworkInfo(GcpNetworkInfo gcpNetworkInfo) {
        this.gcpNetworkInfo = gcpNetworkInfo;
        return this;
    }

    public GcpNetworkInfo getGcpNetworkInfo() {
        return gcpNetworkInfo;
    }
    
    public CreateNetworkRequest setNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }

    public String getNetworkName() {
        return networkName;
    }
    
    public CreateNetworkRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }
    
    public CreateNetworkRequest setSubnetIds(java.util.List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }
    
    public CreateNetworkRequest setVpcEndpoints(NetworkVpcEndpoints vpcEndpoints) {
        this.vpcEndpoints = vpcEndpoints;
        return this;
    }

    public NetworkVpcEndpoints getVpcEndpoints() {
        return vpcEndpoints;
    }
    
    public CreateNetworkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }
    
}
