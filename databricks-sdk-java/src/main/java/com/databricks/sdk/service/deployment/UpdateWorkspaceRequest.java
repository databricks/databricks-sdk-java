// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class UpdateWorkspaceRequest {
    /**
     * The AWS region of the workspace's data plane (for example, `us-west-2`).
     * This parameter is available only for updating failed workspaces.
     */
    @JsonProperty("aws_region")
    private String awsRegion;
    
    /**
     * ID of the workspace's credential configuration object. This parameter is
     * available for updating both failed and running workspaces.
     */
    @JsonProperty("credentials_id")
    private String credentialsId;
    
    /**
     * The ID of the workspace's managed services encryption key configuration
     * object. This parameter is available only for updating failed workspaces.
     */
    @JsonProperty("managed_services_customer_managed_key_id")
    private String managedServicesCustomerManagedKeyId;
    
    /**
     * The ID of the workspace's network configuration object. Used only if you
     * already use a customer-managed VPC. For failed workspaces only, you can
     * switch from a Databricks-managed VPC to a customer-managed VPC by
     * updating the workspace to add a network configuration ID.
     */
    @JsonProperty("network_id")
    private String networkId;
    
    /**
     * The ID of the workspace's storage configuration object. This parameter is
     * available only for updating failed workspaces.
     */
    @JsonProperty("storage_configuration_id")
    private String storageConfigurationId;
    
    /**
     * The ID of the key configuration object for workspace storage. This
     * parameter is available for updating both failed and running workspaces.
     */
    @JsonProperty("storage_customer_managed_key_id")
    private String storageCustomerManagedKeyId;
    
    /**
     * Workspace ID.
     */
    
    private Long workspaceId;
    
    public UpdateWorkspaceRequest setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
        return this;
    }

    public String getAwsRegion() {
        return awsRegion;
    }
    
    public UpdateWorkspaceRequest setCredentialsId(String credentialsId) {
        this.credentialsId = credentialsId;
        return this;
    }

    public String getCredentialsId() {
        return credentialsId;
    }
    
    public UpdateWorkspaceRequest setManagedServicesCustomerManagedKeyId(String managedServicesCustomerManagedKeyId) {
        this.managedServicesCustomerManagedKeyId = managedServicesCustomerManagedKeyId;
        return this;
    }

    public String getManagedServicesCustomerManagedKeyId() {
        return managedServicesCustomerManagedKeyId;
    }
    
    public UpdateWorkspaceRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    public String getNetworkId() {
        return networkId;
    }
    
    public UpdateWorkspaceRequest setStorageConfigurationId(String storageConfigurationId) {
        this.storageConfigurationId = storageConfigurationId;
        return this;
    }

    public String getStorageConfigurationId() {
        return storageConfigurationId;
    }
    
    public UpdateWorkspaceRequest setStorageCustomerManagedKeyId(String storageCustomerManagedKeyId) {
        this.storageCustomerManagedKeyId = storageCustomerManagedKeyId;
        return this;
    }

    public String getStorageCustomerManagedKeyId() {
        return storageCustomerManagedKeyId;
    }
    
    public UpdateWorkspaceRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    public Long getWorkspaceId() {
        return workspaceId;
    }
    
}
