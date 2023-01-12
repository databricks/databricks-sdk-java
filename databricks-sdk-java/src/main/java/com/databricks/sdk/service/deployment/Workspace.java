// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class Workspace {
    /**
     * Databricks account ID.
     */
    @JsonProperty("account_id")
    private String accountId;
    
    /**
     * The AWS region of the workspace data plane (for example, `us-west-2`).
     */
    @JsonProperty("aws_region")
    private String awsRegion;
    
    /**
     * The cloud name. This field always has the value `gcp`.
     */
    @JsonProperty("cloud")
    private String cloud;
    
    /**
     * The general workspace configurations that are specific to cloud
     * providers.
     */
    @JsonProperty("cloud_resource_bucket")
    private CloudResourceBucket cloudResourceBucket;
    
    /**
     * Time in epoch milliseconds when the workspace was created.
     */
    @JsonProperty("creation_time")
    private Long creationTime;
    
    /**
     * ID of the workspace's credential configuration object.
     */
    @JsonProperty("credentials_id")
    private String credentialsId;
    
    /**
     * The deployment name defines part of the subdomain for the workspace. The
     * workspace URL for web application and REST APIs is
     * `<deployment-name>.cloud.databricks.com`.
     * 
     * This value must be unique across all non-deleted deployments across all
     * AWS regions.
     */
    @JsonProperty("deployment_name")
    private String deploymentName;
    
    /**
     * The Google Cloud region of the workspace data plane in your Google
     * account (for example, `us-east4`).
     */
    @JsonProperty("location")
    private String location;
    
    /**
     * ID of the key configuration for encrypting managed services.
     */
    @JsonProperty("managed_services_customer_managed_key_id")
    private String managedServicesCustomerManagedKeyId;
    
    /**
     
     */
    @JsonProperty("network")
    private GcpNetwork network;
    
    /**
     * The pricing tier of the workspace. For pricing tier information, see [AWS
     * Pricing].
     * 
     * [AWS Pricing]: https://databricks.com/product/aws-pricing
     */
    @JsonProperty("pricing_tier")
    private PricingTier pricingTier;
    
    /**
     * ID of the workspace's private access settings object. Only used for
     * PrivateLink (Public Preview). You must specify this ID if you are using
     * [AWS PrivateLink] for either front-end (user-to-workspace connection),
     * back-end (data plane to control plane connection), or both connection
     * types.
     * 
     * Before configuring PrivateLink, read the [Databricks article about
     * PrivateLink].
     * 
     * [AWS PrivateLink]: https://aws.amazon.com/privatelink/
     * [Databricks article about PrivateLink]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
     */
    @JsonProperty("private_access_settings_id")
    private String privateAccessSettingsId;
    
    /**
     * ID of the workspace's storage configuration object.
     */
    @JsonProperty("storage_configuration_id")
    private String storageConfigurationId;
    
    /**
     * ID of the key configuration for encrypting workspace storage.
     */
    @JsonProperty("storage_customer_managed_key_id")
    private String storageCustomerManagedKeyId;
    
    /**
     * Workspace ID.
     */
    @JsonProperty("workspace_id")
    private Long workspaceId;
    
    /**
     * The human-readable name of the workspace.
     */
    @JsonProperty("workspace_name")
    private String workspaceName;
    
    /**
     * The status of the workspace. For workspace creation, usually it is set to
     * `PROVISIONING` initially. Continue to check the status until the status
     * is `RUNNING`.
     */
    @JsonProperty("workspace_status")
    private WorkspaceStatus workspaceStatus;
    
    /**
     * Message describing the current workspace status.
     */
    @JsonProperty("workspace_status_message")
    private String workspaceStatusMessage;
    
    public Workspace setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }
    
    public Workspace setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
        return this;
    }

    public String getAwsRegion() {
        return awsRegion;
    }
    
    public Workspace setCloud(String cloud) {
        this.cloud = cloud;
        return this;
    }

    public String getCloud() {
        return cloud;
    }
    
    public Workspace setCloudResourceBucket(CloudResourceBucket cloudResourceBucket) {
        this.cloudResourceBucket = cloudResourceBucket;
        return this;
    }

    public CloudResourceBucket getCloudResourceBucket() {
        return cloudResourceBucket;
    }
    
    public Workspace setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public Long getCreationTime() {
        return creationTime;
    }
    
    public Workspace setCredentialsId(String credentialsId) {
        this.credentialsId = credentialsId;
        return this;
    }

    public String getCredentialsId() {
        return credentialsId;
    }
    
    public Workspace setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }

    public String getDeploymentName() {
        return deploymentName;
    }
    
    public Workspace setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getLocation() {
        return location;
    }
    
    public Workspace setManagedServicesCustomerManagedKeyId(String managedServicesCustomerManagedKeyId) {
        this.managedServicesCustomerManagedKeyId = managedServicesCustomerManagedKeyId;
        return this;
    }

    public String getManagedServicesCustomerManagedKeyId() {
        return managedServicesCustomerManagedKeyId;
    }
    
    public Workspace setNetwork(GcpNetwork network) {
        this.network = network;
        return this;
    }

    public GcpNetwork getNetwork() {
        return network;
    }
    
    public Workspace setPricingTier(PricingTier pricingTier) {
        this.pricingTier = pricingTier;
        return this;
    }

    public PricingTier getPricingTier() {
        return pricingTier;
    }
    
    public Workspace setPrivateAccessSettingsId(String privateAccessSettingsId) {
        this.privateAccessSettingsId = privateAccessSettingsId;
        return this;
    }

    public String getPrivateAccessSettingsId() {
        return privateAccessSettingsId;
    }
    
    public Workspace setStorageConfigurationId(String storageConfigurationId) {
        this.storageConfigurationId = storageConfigurationId;
        return this;
    }

    public String getStorageConfigurationId() {
        return storageConfigurationId;
    }
    
    public Workspace setStorageCustomerManagedKeyId(String storageCustomerManagedKeyId) {
        this.storageCustomerManagedKeyId = storageCustomerManagedKeyId;
        return this;
    }

    public String getStorageCustomerManagedKeyId() {
        return storageCustomerManagedKeyId;
    }
    
    public Workspace setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    public Long getWorkspaceId() {
        return workspaceId;
    }
    
    public Workspace setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    public String getWorkspaceName() {
        return workspaceName;
    }
    
    public Workspace setWorkspaceStatus(WorkspaceStatus workspaceStatus) {
        this.workspaceStatus = workspaceStatus;
        return this;
    }

    public WorkspaceStatus getWorkspaceStatus() {
        return workspaceStatus;
    }
    
    public Workspace setWorkspaceStatusMessage(String workspaceStatusMessage) {
        this.workspaceStatusMessage = workspaceStatusMessage;
        return this;
    }

    public String getWorkspaceStatusMessage() {
        return workspaceStatusMessage;
    }
    
}
