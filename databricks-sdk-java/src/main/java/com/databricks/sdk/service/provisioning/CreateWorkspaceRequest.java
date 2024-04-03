// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class CreateWorkspaceRequest {
  /** The AWS region of the workspace's data plane. */
  @JsonProperty("aws_region")
  private String awsRegion;

  /**
   * The cloud provider which the workspace uses. For Google Cloud workspaces, always set this field
   * to `gcp`.
   */
  @JsonProperty("cloud")
  private String cloud;

  /** The general workspace configurations that are specific to cloud providers. */
  @JsonProperty("cloud_resource_container")
  private CloudResourceContainer cloudResourceContainer;

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
   * web application and REST APIs is `<workspace-deployment-name>.cloud.databricks.com`. For
   * example, if the deployment name is `abcsales`, your workspace URL will be
   * `https://abcsales.cloud.databricks.com`. Hyphens are allowed. This property supports only the
   * set of characters that are allowed in a subdomain.
   *
   * <p>To set this value, you must have a deployment name prefix. Contact your Databricks account
   * team to add an account deployment name prefix to your account.
   *
   * <p>Workspace deployment names follow the account prefix and a hyphen. For example, if your
   * account's deployment prefix is `acme` and the workspace deployment name is `workspace-1`, the
   * JSON response for the `deployment_name` field becomes `acme-workspace-1`. The workspace URL
   * would be `acme-workspace-1.cloud.databricks.com`.
   *
   * <p>You can also set the `deployment_name` to the reserved keyword `EMPTY` if you want the
   * deployment name to only include the deployment prefix. For example, if your account's
   * deployment prefix is `acme` and the workspace deployment name is `EMPTY`, the `deployment_name`
   * becomes `acme` only and the workspace URL is `acme.cloud.databricks.com`.
   *
   * <p>This value must be unique across all non-deleted deployments across all AWS regions.
   *
   * <p>If a new workspace omits this property, the server generates a unique deployment name for
   * you with the pattern `dbc-xxxxxxxx-xxxx`.
   */
  @JsonProperty("deployment_name")
  private String deploymentName;

  /**
   * The network settings for the workspace. The configurations are only for Databricks-managed
   * VPCs. It is ignored if you specify a customer-managed VPC in the `network_id` field.", All the
   * IP range configurations must be mutually exclusive. An attempt to create a workspace fails if
   * Databricks detects an IP range overlap.
   *
   * <p>Specify custom IP ranges in CIDR format. The IP ranges for these fields must not overlap,
   * and all IP addresses must be entirely within the following ranges: `10.0.0.0/8`,
   * `100.64.0.0/10`, `172.16.0.0/12`, `192.168.0.0/16`, and `240.0.0.0/4`.
   *
   * <p>The sizes of these IP ranges affect the maximum number of nodes for the workspace.
   *
   * <p>**Important**: Confirm the IP ranges used by your Databricks workspace before creating the
   * workspace. You cannot change them after your workspace is deployed. If the IP address ranges
   * for your Databricks are too small, IP exhaustion can occur, causing your Databricks jobs to
   * fail. To determine the address range sizes that you need, Databricks provides a calculator as a
   * Microsoft Excel spreadsheet. See [calculate subnet sizes for a new workspace].
   *
   * <p>[calculate subnet sizes for a new workspace]:
   * https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/network-sizing.html
   */
  @JsonProperty("gcp_managed_network_config")
  private GcpManagedNetworkConfig gcpManagedNetworkConfig;

  /** The configurations for the GKE cluster of a Databricks workspace. */
  @JsonProperty("gke_config")
  private GkeConfig gkeConfig;

  /**
   * The Google Cloud region of the workspace data plane in your Google account. For example,
   * `us-east4`.
   */
  @JsonProperty("location")
  private String location;

  /**
   * The ID of the workspace's managed services encryption key configuration object. This is used to
   * help protect and control access to the workspace's notebooks, secrets, Databricks SQL queries,
   * and query history. The provided key configuration object property `use_cases` must contain
   * `MANAGED_SERVICES`.
   */
  @JsonProperty("managed_services_customer_managed_key_id")
  private String managedServicesCustomerManagedKeyId;

  /** */
  @JsonProperty("network_id")
  private String networkId;

  /**
   * The pricing tier of the workspace. For pricing tier information, see [AWS Pricing].
   *
   * <p>[AWS Pricing]: https://databricks.com/product/aws-pricing
   */
  @JsonProperty("pricing_tier")
  private PricingTier pricingTier;

  /**
   * ID of the workspace's private access settings object. Only used for PrivateLink. This ID must
   * be specified for customers using [AWS PrivateLink] for either front-end (user-to-workspace
   * connection), back-end (data plane to control plane connection), or both connection types.
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].",
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink/ [Databricks article about
   * PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   */
  @JsonProperty("private_access_settings_id")
  private String privateAccessSettingsId;

  /** The ID of the workspace's storage configuration object. */
  @JsonProperty("storage_configuration_id")
  private String storageConfigurationId;

  /**
   * The ID of the workspace's storage encryption key configuration object. This is used to encrypt
   * the workspace's root S3 bucket (root DBFS and system data) and, optionally, cluster EBS
   * volumes. The provided key configuration object property `use_cases` must contain `STORAGE`.
   */
  @JsonProperty("storage_customer_managed_key_id")
  private String storageCustomerManagedKeyId;

  /** The workspace's human-readable name. */
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
        && Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(deploymentName, that.deploymentName)
        && Objects.equals(gcpManagedNetworkConfig, that.gcpManagedNetworkConfig)
        && Objects.equals(gkeConfig, that.gkeConfig)
        && Objects.equals(location, that.location)
        && Objects.equals(
            managedServicesCustomerManagedKeyId, that.managedServicesCustomerManagedKeyId)
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
        credentialsId,
        customTags,
        deploymentName,
        gcpManagedNetworkConfig,
        gkeConfig,
        location,
        managedServicesCustomerManagedKeyId,
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
        .add("credentialsId", credentialsId)
        .add("customTags", customTags)
        .add("deploymentName", deploymentName)
        .add("gcpManagedNetworkConfig", gcpManagedNetworkConfig)
        .add("gkeConfig", gkeConfig)
        .add("location", location)
        .add("managedServicesCustomerManagedKeyId", managedServicesCustomerManagedKeyId)
        .add("networkId", networkId)
        .add("pricingTier", pricingTier)
        .add("privateAccessSettingsId", privateAccessSettingsId)
        .add("storageConfigurationId", storageConfigurationId)
        .add("storageCustomerManagedKeyId", storageCustomerManagedKeyId)
        .add("workspaceName", workspaceName)
        .toString();
  }
}
