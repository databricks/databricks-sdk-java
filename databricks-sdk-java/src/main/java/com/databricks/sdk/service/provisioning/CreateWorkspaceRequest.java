// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class CreateWorkspaceRequest {
  /** */
  @JsonProperty("aws_region")
  private String awsRegion;

  /** The cloud name. This field always has the value `gcp`. */
  @JsonProperty("cloud")
  private String cloud;

  /** */
  @JsonProperty("cloud_resource_container")
  private CloudResourceContainer cloudResourceContainer;

  /**
   * If the compute mode is `SERVERLESS`, a serverless workspace is created that comes
   * pre-configured with serverless compute and default storage, providing a fully-managed,
   * enterprise-ready SaaS experience. This means you don't need to provide any resources managed by
   * you, such as credentials, storage, or network. If the compute mode is `HYBRID` (which is the
   * default option), a classic workspace is created that uses customer-managed resources.
   */
  @JsonProperty("compute_mode")
  private CustomerFacingComputeMode computeMode;

  /** ID of the workspace's credential configuration object. */
  @JsonProperty("credentials_id")
  private String credentialsId;

  /**
   * The custom tags key-value pairing that is attached to this workspace. The key-value pair is a
   * string of utf-8 characters. The value can be an empty string, with maximum length of 255
   * characters. The key can be of maximum length of 127 characters, and cannot be empty.
   */
  @JsonProperty("custom_tags")
  private Map<String, String> customTags;

  /**
   * The deployment name defines part of the subdomain for the workspace. The workspace URL for the
   * web application and REST APIs is <workspace-deployment-name>.cloud.databricks.com. For example,
   * if the deployment name is abcsales, your workspace URL will be
   * https://abcsales.cloud.databricks.com. Hyphens are allowed. This property supports only the set
   * of characters that are allowed in a subdomain. To set this value, you must have a deployment
   * name prefix. Contact your Databricks account team to add an account deployment name prefix to
   * your account. Workspace deployment names follow the account prefix and a hyphen. For example,
   * if your account's deployment prefix is acme and the workspace deployment name is workspace-1,
   * the JSON response for the deployment_name field becomes acme-workspace-1. The workspace URL
   * would be acme-workspace-1.cloud.databricks.com. You can also set the deployment_name to the
   * reserved keyword EMPTY if you want the deployment name to only include the deployment prefix.
   * For example, if your account's deployment prefix is acme and the workspace deployment name is
   * EMPTY, the deployment_name becomes acme only and the workspace URL is
   * acme.cloud.databricks.com. This value must be unique across all non-deleted deployments across
   * all AWS regions. If a new workspace omits this property, the server generates a unique
   * deployment name for you with the pattern dbc-xxxxxxxx-xxxx.
   */
  @JsonProperty("deployment_name")
  private String deploymentName;

  /** */
  @JsonProperty("gcp_managed_network_config")
  private GcpManagedNetworkConfig gcpManagedNetworkConfig;

  /** */
  @JsonProperty("gke_config")
  private GkeConfig gkeConfig;

  /**
   * The Google Cloud region of the workspace data plane in your Google account (for example,
   * `us-east4`).
   */
  @JsonProperty("location")
  private String location;

  /**
   * The ID of the workspace's managed services encryption key configuration object. This is used to
   * help protect and control access to the workspace's notebooks, secrets, Databricks SQL queries,
   * and query history. The provided key configuration object property use_cases must contain
   * MANAGED_SERVICES.
   */
  @JsonProperty("managed_services_customer_managed_key_id")
  private String managedServicesCustomerManagedKeyId;

  /**
   * The object ID of network connectivity config. Once assigned, the workspace serverless compute
   * resources use the same set of stable IP CIDR blocks and optional private link to access your
   * resources.
   */
  @JsonProperty("network_connectivity_config_id")
  private String networkConnectivityConfigId;

  /**
   * The ID of the workspace's network configuration object. To use AWS PrivateLink, this field is
   * required.
   */
  @JsonProperty("network_id")
  private String networkId;

  /** */
  @JsonProperty("pricing_tier")
  private PricingTier pricingTier;

  /**
   * ID of the workspace's private access settings object. Only used for PrivateLink. You must
   * specify this ID if you are using [AWS PrivateLink] for either front-end (user-to-workspace
   * connection), back-end (data plane to control plane connection), or both connection types.
   * Before configuring PrivateLink, read the [Databricks article about PrivateLink].",
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink/ [Databricks article about
   * PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   */
  @JsonProperty("private_access_settings_id")
  private String privateAccessSettingsId;

  /** ID of the workspace's storage configuration object. */
  @JsonProperty("storage_configuration_id")
  private String storageConfigurationId;

  /**
   * The ID of the workspace's storage encryption key configuration object. This is used to encrypt
   * the workspace's root S3 bucket (root DBFS and system data) and, optionally, cluster EBS
   * volumes. The provided key configuration object property use_cases must contain STORAGE.
   */
  @JsonProperty("storage_customer_managed_key_id")
  private String storageCustomerManagedKeyId;

  /** The human-readable name of the workspace. */
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

  public CreateWorkspaceRequest setCloudResourceContainer(
      CloudResourceContainer cloudResourceContainer) {
    this.cloudResourceContainer = cloudResourceContainer;
    return this;
  }

  public CloudResourceContainer getCloudResourceContainer() {
    return cloudResourceContainer;
  }

  public CreateWorkspaceRequest setComputeMode(CustomerFacingComputeMode computeMode) {
    this.computeMode = computeMode;
    return this;
  }

  public CustomerFacingComputeMode getComputeMode() {
    return computeMode;
  }

  public CreateWorkspaceRequest setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  public CreateWorkspaceRequest setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public CreateWorkspaceRequest setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
    return this;
  }

  public String getDeploymentName() {
    return deploymentName;
  }

  public CreateWorkspaceRequest setGcpManagedNetworkConfig(
      GcpManagedNetworkConfig gcpManagedNetworkConfig) {
    this.gcpManagedNetworkConfig = gcpManagedNetworkConfig;
    return this;
  }

  public GcpManagedNetworkConfig getGcpManagedNetworkConfig() {
    return gcpManagedNetworkConfig;
  }

  public CreateWorkspaceRequest setGkeConfig(GkeConfig gkeConfig) {
    this.gkeConfig = gkeConfig;
    return this;
  }

  public GkeConfig getGkeConfig() {
    return gkeConfig;
  }

  public CreateWorkspaceRequest setLocation(String location) {
    this.location = location;
    return this;
  }

  public String getLocation() {
    return location;
  }

  public CreateWorkspaceRequest setManagedServicesCustomerManagedKeyId(
      String managedServicesCustomerManagedKeyId) {
    this.managedServicesCustomerManagedKeyId = managedServicesCustomerManagedKeyId;
    return this;
  }

  public String getManagedServicesCustomerManagedKeyId() {
    return managedServicesCustomerManagedKeyId;
  }

  public CreateWorkspaceRequest setNetworkConnectivityConfigId(String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateWorkspaceRequest that = (CreateWorkspaceRequest) o;
    return Objects.equals(awsRegion, that.awsRegion)
        && Objects.equals(cloud, that.cloud)
        && Objects.equals(cloudResourceContainer, that.cloudResourceContainer)
        && Objects.equals(computeMode, that.computeMode)
        && Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(deploymentName, that.deploymentName)
        && Objects.equals(gcpManagedNetworkConfig, that.gcpManagedNetworkConfig)
        && Objects.equals(gkeConfig, that.gkeConfig)
        && Objects.equals(location, that.location)
        && Objects.equals(
            managedServicesCustomerManagedKeyId, that.managedServicesCustomerManagedKeyId)
        && Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(networkId, that.networkId)
        && Objects.equals(pricingTier, that.pricingTier)
        && Objects.equals(privateAccessSettingsId, that.privateAccessSettingsId)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId)
        && Objects.equals(storageCustomerManagedKeyId, that.storageCustomerManagedKeyId)
        && Objects.equals(workspaceName, that.workspaceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsRegion,
        cloud,
        cloudResourceContainer,
        computeMode,
        credentialsId,
        customTags,
        deploymentName,
        gcpManagedNetworkConfig,
        gkeConfig,
        location,
        managedServicesCustomerManagedKeyId,
        networkConnectivityConfigId,
        networkId,
        pricingTier,
        privateAccessSettingsId,
        storageConfigurationId,
        storageCustomerManagedKeyId,
        workspaceName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWorkspaceRequest.class)
        .add("awsRegion", awsRegion)
        .add("cloud", cloud)
        .add("cloudResourceContainer", cloudResourceContainer)
        .add("computeMode", computeMode)
        .add("credentialsId", credentialsId)
        .add("customTags", customTags)
        .add("deploymentName", deploymentName)
        .add("gcpManagedNetworkConfig", gcpManagedNetworkConfig)
        .add("gkeConfig", gkeConfig)
        .add("location", location)
        .add("managedServicesCustomerManagedKeyId", managedServicesCustomerManagedKeyId)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("networkId", networkId)
        .add("pricingTier", pricingTier)
        .add("privateAccessSettingsId", privateAccessSettingsId)
        .add("storageConfigurationId", storageConfigurationId)
        .add("storageCustomerManagedKeyId", storageCustomerManagedKeyId)
        .add("workspaceName", workspaceName)
        .toString();
  }
}
