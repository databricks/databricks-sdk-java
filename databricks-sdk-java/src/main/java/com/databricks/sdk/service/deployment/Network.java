// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class Network {
    /**
     * The Databricks account ID associated with this network configuration.
     */
    @JsonProperty("account_id")
    private String accountId;
    
    /**
     * Time in epoch milliseconds when the network was created.
     */
    @JsonProperty("creation_time")
    private Long creationTime;
    
    /**
     * Array of error messages about the network configuration.
     */
    @JsonProperty("error_messages")
    private java.util.List<NetworkHealth> errorMessages;
    
    /**
     * The Google Cloud specific information for this network (for example, the
     * VPC ID, subnet ID, and secondary IP ranges).
     */
    @JsonProperty("gcp_network_info")
    private GcpNetworkInfo gcpNetworkInfo;
    
    /**
     * The Databricks network configuration ID.
     */
    @JsonProperty("network_id")
    private String networkId;
    
    /**
     * The human-readable name of the network configuration.
     */
    @JsonProperty("network_name")
    private String networkName;
    
    /**
     
     */
    @JsonProperty("security_group_ids")
    private java.util.List<String> securityGroupIds;
    
    /**
     
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
     * The ID of the VPC associated with this network configuration. VPC IDs can
     * be used in multiple networks.
     */
    @JsonProperty("vpc_id")
    private String vpcId;
    
    /**
     * This describes an enum
     */
    @JsonProperty("vpc_status")
    private VpcStatus vpcStatus;
    
    /**
     * Array of warning messages about the network configuration.
     */
    @JsonProperty("warning_messages")
    private java.util.List<NetworkWarning> warningMessages;
    
    /**
     * Workspace ID associated with this network configuration.
     */
    @JsonProperty("workspace_id")
    private Long workspaceId;
    
    public Network setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }
    
    public Network setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public Long getCreationTime() {
        return creationTime;
    }
    
    public Network setErrorMessages(java.util.List<NetworkHealth> errorMessages) {
        this.errorMessages = errorMessages;
        return this;
    }

    public java.util.List<NetworkHealth> getErrorMessages() {
        return errorMessages;
    }
    
    public Network setGcpNetworkInfo(GcpNetworkInfo gcpNetworkInfo) {
        this.gcpNetworkInfo = gcpNetworkInfo;
        return this;
    }

    public GcpNetworkInfo getGcpNetworkInfo() {
        return gcpNetworkInfo;
    }
    
    public Network setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    public String getNetworkId() {
        return networkId;
    }
    
    public Network setNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }

    public String getNetworkName() {
        return networkName;
    }
    
    public Network setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }
    
    public Network setSubnetIds(java.util.List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }
    
    public Network setVpcEndpoints(NetworkVpcEndpoints vpcEndpoints) {
        this.vpcEndpoints = vpcEndpoints;
        return this;
    }

    public NetworkVpcEndpoints getVpcEndpoints() {
        return vpcEndpoints;
    }
    
    public Network setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }
    
    public Network setVpcStatus(VpcStatus vpcStatus) {
        this.vpcStatus = vpcStatus;
        return this;
    }

    public VpcStatus getVpcStatus() {
        return vpcStatus;
    }
    
    public Network setWarningMessages(java.util.List<NetworkWarning> warningMessages) {
        this.warningMessages = warningMessages;
        return this;
    }

    public java.util.List<NetworkWarning> getWarningMessages() {
        return warningMessages;
    }
    
    public Network setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    public Long getWorkspaceId() {
        return workspaceId;
    }
    
}
