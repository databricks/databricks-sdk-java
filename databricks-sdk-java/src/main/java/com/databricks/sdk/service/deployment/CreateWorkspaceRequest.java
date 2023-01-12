// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateWorkspaceRequest {
    /**
     * The AWS region of the workspace's data plane.
     */
    @JsonProperty("aws_region")
    private String awsRegion;
    
    /**
     * The cloud provider which the workspace uses. For Google Cloud workspaces,
     * always set this field to `gcp`.
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
     * ID of the workspace's credential configuration object.
     */
    @JsonProperty("credentials_id")
    private String credentialsId;
    
    /**
     * The deployment name defines part of the subdomain for the workspace. The
     * workspace URL for web application and REST APIs is
     * `<workspace-deployment-name>.cloud.databricks.com`. For example, if the
     * deployment name is `abcsales`, your workspace URL will be
     * `https://abcsales.cloud.databricks.com`. Hyphens are allowed. This
     * property supports only the set of characters that are allowed in a
     * subdomain.
     * 
     * If your account has a non-empty deployment name prefix at workspace
     * creation time, the workspace deployment name changes so that the
     * beginning has the account prefix and a hyphen. For example, if your
     * account's deployment prefix is `acme` and the workspace deployment name
     * is `workspace-1`, the `deployment_name` field becomes `acme-workspace-1`
     * and that is the value that is returned in JSON responses for the
     * `deployment_name` field. The workspace URL is
     * `acme-workspace-1.cloud.databricks.com`.
     * 
     * If your account has a non-empty deployment name prefix and you set
     * `deployment_name` to the reserved keyword `EMPTY`, `deployment_name` is
     * just the account prefix only. For example, if your account's deployment
     * prefix is `acme` and the workspace deployment name is `EMPTY`,
     * `deployment_name` becomes `acme` only and the workspace URL is
     * `acme.cloud.databricks.com`.
     * 
     * Contact your Databricks representatives to add an account deployment name
     * prefix to your account. If you do not have a deployment name prefix, the
     * special deployment name value `EMPTY` is invalid.
     * 
     * This value must be unique across all non-deleted deployments across all
     * AWS regions.
     * 
     * If a new workspace omits this property, the server generates a unique
     * deployment name for you with the pattern `dbc-xxxxxxxx-xxxx`.
     */
    @JsonProperty("deployment_name")
    private String deploymentName;
    
    /**
     * The Google Cloud region of the workspace data plane in your Google
     * account. For example, `us-east4`.
     */
    @JsonProperty("location")
    private String location;
    
    /**
     * The ID of the workspace's managed services encryption key configuration
     * object. This is used to encrypt the workspace's notebook and secret data
     * in the control plane, in addition to Databricks SQL queries and query
     * history. The provided key configuration object property `use_cases` must
     * contain `MANAGED_SERVICES`.
     */
    @JsonProperty("managed_services_customer_managed_key_id")
    private String managedServicesCustomerManagedKeyId;
    
    /**
     * The network configurations for the workspace. If you provide a network
     * configuration ID for a new workspace, Databricks deploys the new
     * workspace into that associated customer-managed VPC. If omitted, by
     * default Databricks creates a new Databricks-managed VPC for the workspace
     * in your Google account and manages its lifecycle.
     * 
     * All the IP range configurations must be mutually exclusive. An attempt to
     * create a workspace fails if Databricks detects an IP range overlap.
     * 
     * Specify custom IP ranges in CIDR format. The IP ranges for these fields
     * must not overlap, and all IP addresses must be entirely within the
     * following ranges: `10.0.0.0/8`, `100.64.0.0/10`, `172.16.0.0/12`,
     * `192.168.0.0/16`, and `240.0.0.0/4`.
     * 
     * The sizes of these IP ranges affect the maximum number of nodes for the
     * workspace.
     * 
     * **Important**: Confirm the IP ranges used by your Databricks workspace
     * before creating the workspace. You cannot change them after your
     * workspace is deployed. If the IP address ranges for your Databricks are
     * too small, IP exhaustion can occur, causing your Databricks jobs to fail.
     * To determine the address range sizes that you need, Databricks provides a
     * calculator as a Microsoft Excel spreadsheet. See [calculate subnet sizes
     * for a new workspace].
     * 
     * [calculate subnet sizes for a new workspace]: https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/network-sizing.html
     */
    @JsonProperty("network")
    private CreateGcpNetwork network;
    
    /**
     * The ID of the workspace's network configuration object. To use [AWS
     * PrivateLink] (Public Preview), this field is required.
     * 
     * [AWS PrivateLink]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
     */
    @JsonProperty("network_id")
    private String networkId;
    
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
     * PrivateLink (Public Preview). This ID must be specified for customers
     * using [AWS PrivateLink] for either front-end (user-to-workspace
     * connection), back-end (data plane to control plane connection), or both
     * connection types.
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
     * The ID of the workspace's storage configuration object.
     */
    @JsonProperty("storage_configuration_id")
    private String storageConfigurationId;
    
    /**
     * The ID of the workspace's storage encryption key configuration object.
     * This is used to encrypt the workspace's root S3 bucket (root DBFS and
     * system data) and, optionally, cluster EBS volumes. The provided key
     * configuration object property `use_cases` must contain `STORAGE`.
     */
    @JsonProperty("storage_customer_managed_key_id")
    private String storageCustomerManagedKeyId;
    
    /**
     * The workspace's human-readable name.
     */
    @JsonProperty("workspace_name")
    private String workspaceName;
    
    public CreateWorkspaceRequest setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
        return this;
    }

    public String getAwsRegion() {
        return awsRegion;
    }
    
    public CreateWorkspaceRequest setCloud(String cloud) {
        this.cloud = cloud;
        return this;
    }

    public String getCloud() {
        return cloud;
    }
    
    public CreateWorkspaceRequest setCloudResourceBucket(CloudResourceBucket cloudResourceBucket) {
        this.cloudResourceBucket = cloudResourceBucket;
        return this;
    }

    public CloudResourceBucket getCloudResourceBucket() {
        return cloudResourceBucket;
    }
    
    public CreateWorkspaceRequest setCredentialsId(String credentialsId) {
        this.credentialsId = credentialsId;
        return this;
    }

    public String getCredentialsId() {
        return credentialsId;
    }
    
    public CreateWorkspaceRequest setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }

    public String getDeploymentName() {
        return deploymentName;
    }
    
    public CreateWorkspaceRequest setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getLocation() {
        return location;
    }
    
    public CreateWorkspaceRequest setManagedServicesCustomerManagedKeyId(String managedServicesCustomerManagedKeyId) {
        this.managedServicesCustomerManagedKeyId = managedServicesCustomerManagedKeyId;
        return this;
    }

    public String getManagedServicesCustomerManagedKeyId() {
        return managedServicesCustomerManagedKeyId;
    }
    
    public CreateWorkspaceRequest setNetwork(CreateGcpNetwork network) {
        this.network = network;
        return this;
    }

    public CreateGcpNetwork getNetwork() {
        return network;
    }
    
    public CreateWorkspaceRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    public String getNetworkId() {
        return networkId;
    }
    
    public CreateWorkspaceRequest setPricingTier(PricingTier pricingTier) {
        this.pricingTier = pricingTier;
        return this;
    }

    public PricingTier getPricingTier() {
        return pricingTier;
    }
    
    public CreateWorkspaceRequest setPrivateAccessSettingsId(String privateAccessSettingsId) {
        this.privateAccessSettingsId = privateAccessSettingsId;
        return this;
    }

    public String getPrivateAccessSettingsId() {
        return privateAccessSettingsId;
    }
    
    public CreateWorkspaceRequest setStorageConfigurationId(String storageConfigurationId) {
        this.storageConfigurationId = storageConfigurationId;
        return this;
    }

    public String getStorageConfigurationId() {
        return storageConfigurationId;
    }
    
    public CreateWorkspaceRequest setStorageCustomerManagedKeyId(String storageCustomerManagedKeyId) {
        this.storageCustomerManagedKeyId = storageCustomerManagedKeyId;
        return this;
    }

    public String getStorageCustomerManagedKeyId() {
        return storageCustomerManagedKeyId;
    }
    
    public CreateWorkspaceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    public String getWorkspaceName() {
        return workspaceName;
    }
    
}
