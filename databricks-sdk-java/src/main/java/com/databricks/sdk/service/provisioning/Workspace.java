// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Workspace class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Workspace {
  /** Databricks account ID. */
  @JsonProperty("account_id")
  private String accountId;

  /** The AWS region of the workspace data plane (for example, `us-west-2`). */
  @JsonProperty("aws_region")
  private String awsRegion;

  /** The cloud name. This field always has the value `gcp`. */
  @JsonProperty("cloud")
  private String cloud;

  /** The general workspace configurations that are specific to cloud providers. */
  @JsonProperty("cloud_resource_container")
  private CloudResourceContainer cloudResourceContainer;

  /** Time in epoch milliseconds when the workspace was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /** ID of the workspace's credential configuration object. */
  @JsonProperty("credentials_id")
  private String credentialsId;

  /**
   * The deployment name defines part of the subdomain for the workspace. The workspace URL for web
   * application and REST APIs is `<deployment-name>.cloud.databricks.com`.
   *
   * <p>This value must be unique across all non-deleted deployments across all AWS regions.
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
   * The Google Cloud region of the workspace data plane in your Google account (for example,
   * `us-east4`).
   */
  @JsonProperty("location")
  private String location;

  /** ID of the key configuration for encrypting managed services. */
  @JsonProperty("managed_services_customer_managed_key_id")
  private String managedServicesCustomerManagedKeyId;

  /**
   * The network configuration ID that is attached to the workspace. This field is available only if
   * the network is a customer-managed network.
   */
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
   * ID of the workspace's private access settings object. Only used for PrivateLink. You must
   * specify this ID if you are using [AWS PrivateLink] for either front-end (user-to-workspace
   * connection), back-end (data plane to control plane connection), or both connection types.
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].
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

  /** ID of the key configuration for encrypting workspace storage. */
  @JsonProperty("storage_customer_managed_key_id")
  private String storageCustomerManagedKeyId;

  /** A unique integer ID for the workspace */
  @JsonProperty("workspace_id")
  private Long workspaceId;

  /** The human-readable name of the workspace. */
  @JsonProperty("workspace_name")
  private String workspaceName;

  /**
   * The status of the workspace. For workspace creation, usually it is set to `PROVISIONING`
   * initially. Continue to check the status until the status is `RUNNING`.
   */
  @JsonProperty("workspace_status")
  private WorkspaceStatus workspaceStatus;

  /** Message describing the current workspace status. */
  @JsonProperty("workspace_status_message")
  private String workspaceStatusMessage;

  /**
   * <p>Setter for the field <code>accountId</code>.</p>
   *
   * @param accountId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>Getter for the field <code>accountId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * <p>Setter for the field <code>awsRegion</code>.</p>
   *
   * @param awsRegion a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setAwsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
    return this;
  }

  /**
   * <p>Getter for the field <code>awsRegion</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAwsRegion() {
    return awsRegion;
  }

  /**
   * <p>Setter for the field <code>cloud</code>.</p>
   *
   * @param cloud a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  /**
   * <p>Getter for the field <code>cloud</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCloud() {
    return cloud;
  }

  /**
   * <p>Setter for the field <code>cloudResourceContainer</code>.</p>
   *
   * @param cloudResourceContainer a {@link com.databricks.sdk.service.provisioning.CloudResourceContainer} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setCloudResourceContainer(CloudResourceContainer cloudResourceContainer) {
    this.cloudResourceContainer = cloudResourceContainer;
    return this;
  }

  /**
   * <p>Getter for the field <code>cloudResourceContainer</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.CloudResourceContainer} object
   */
  public CloudResourceContainer getCloudResourceContainer() {
    return cloudResourceContainer;
  }

  /**
   * <p>Setter for the field <code>creationTime</code>.</p>
   *
   * @param creationTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>creationTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreationTime() {
    return creationTime;
  }

  /**
   * <p>Setter for the field <code>credentialsId</code>.</p>
   *
   * @param credentialsId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  /**
   * <p>Getter for the field <code>credentialsId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCredentialsId() {
    return credentialsId;
  }

  /**
   * <p>Setter for the field <code>deploymentName</code>.</p>
   *
   * @param deploymentName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
    return this;
  }

  /**
   * <p>Getter for the field <code>deploymentName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDeploymentName() {
    return deploymentName;
  }

  /**
   * <p>Setter for the field <code>gcpManagedNetworkConfig</code>.</p>
   *
   * @param gcpManagedNetworkConfig a {@link com.databricks.sdk.service.provisioning.GcpManagedNetworkConfig} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setGcpManagedNetworkConfig(GcpManagedNetworkConfig gcpManagedNetworkConfig) {
    this.gcpManagedNetworkConfig = gcpManagedNetworkConfig;
    return this;
  }

  /**
   * <p>Getter for the field <code>gcpManagedNetworkConfig</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.GcpManagedNetworkConfig} object
   */
  public GcpManagedNetworkConfig getGcpManagedNetworkConfig() {
    return gcpManagedNetworkConfig;
  }

  /**
   * <p>Setter for the field <code>gkeConfig</code>.</p>
   *
   * @param gkeConfig a {@link com.databricks.sdk.service.provisioning.GkeConfig} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setGkeConfig(GkeConfig gkeConfig) {
    this.gkeConfig = gkeConfig;
    return this;
  }

  /**
   * <p>Getter for the field <code>gkeConfig</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.GkeConfig} object
   */
  public GkeConfig getGkeConfig() {
    return gkeConfig;
  }

  /**
   * <p>Setter for the field <code>location</code>.</p>
   *
   * @param location a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setLocation(String location) {
    this.location = location;
    return this;
  }

  /**
   * <p>Getter for the field <code>location</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLocation() {
    return location;
  }

  /**
   * <p>Setter for the field <code>managedServicesCustomerManagedKeyId</code>.</p>
   *
   * @param managedServicesCustomerManagedKeyId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setManagedServicesCustomerManagedKeyId(
      String managedServicesCustomerManagedKeyId) {
    this.managedServicesCustomerManagedKeyId = managedServicesCustomerManagedKeyId;
    return this;
  }

  /**
   * <p>Getter for the field <code>managedServicesCustomerManagedKeyId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getManagedServicesCustomerManagedKeyId() {
    return managedServicesCustomerManagedKeyId;
  }

  /**
   * <p>Setter for the field <code>networkId</code>.</p>
   *
   * @param networkId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  /**
   * <p>Getter for the field <code>networkId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNetworkId() {
    return networkId;
  }

  /**
   * <p>Setter for the field <code>pricingTier</code>.</p>
   *
   * @param pricingTier a {@link com.databricks.sdk.service.provisioning.PricingTier} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setPricingTier(PricingTier pricingTier) {
    this.pricingTier = pricingTier;
    return this;
  }

  /**
   * <p>Getter for the field <code>pricingTier</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.PricingTier} object
   */
  public PricingTier getPricingTier() {
    return pricingTier;
  }

  /**
   * <p>Setter for the field <code>privateAccessSettingsId</code>.</p>
   *
   * @param privateAccessSettingsId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setPrivateAccessSettingsId(String privateAccessSettingsId) {
    this.privateAccessSettingsId = privateAccessSettingsId;
    return this;
  }

  /**
   * <p>Getter for the field <code>privateAccessSettingsId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPrivateAccessSettingsId() {
    return privateAccessSettingsId;
  }

  /**
   * <p>Setter for the field <code>storageConfigurationId</code>.</p>
   *
   * @param storageConfigurationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageConfigurationId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  /**
   * <p>Setter for the field <code>storageCustomerManagedKeyId</code>.</p>
   *
   * @param storageCustomerManagedKeyId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setStorageCustomerManagedKeyId(String storageCustomerManagedKeyId) {
    this.storageCustomerManagedKeyId = storageCustomerManagedKeyId;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageCustomerManagedKeyId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorageCustomerManagedKeyId() {
    return storageCustomerManagedKeyId;
  }

  /**
   * <p>Setter for the field <code>workspaceId</code>.</p>
   *
   * @param workspaceId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * <p>Getter for the field <code>workspaceId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getWorkspaceId() {
    return workspaceId;
  }

  /**
   * <p>Setter for the field <code>workspaceName</code>.</p>
   *
   * @param workspaceName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
    return this;
  }

  /**
   * <p>Getter for the field <code>workspaceName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWorkspaceName() {
    return workspaceName;
  }

  /**
   * <p>Setter for the field <code>workspaceStatus</code>.</p>
   *
   * @param workspaceStatus a {@link com.databricks.sdk.service.provisioning.WorkspaceStatus} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setWorkspaceStatus(WorkspaceStatus workspaceStatus) {
    this.workspaceStatus = workspaceStatus;
    return this;
  }

  /**
   * <p>Getter for the field <code>workspaceStatus</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.WorkspaceStatus} object
   */
  public WorkspaceStatus getWorkspaceStatus() {
    return workspaceStatus;
  }

  /**
   * <p>Setter for the field <code>workspaceStatusMessage</code>.</p>
   *
   * @param workspaceStatusMessage a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Workspace} object
   */
  public Workspace setWorkspaceStatusMessage(String workspaceStatusMessage) {
    this.workspaceStatusMessage = workspaceStatusMessage;
    return this;
  }

  /**
   * <p>Getter for the field <code>workspaceStatusMessage</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWorkspaceStatusMessage() {
    return workspaceStatusMessage;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Workspace that = (Workspace) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(awsRegion, that.awsRegion)
        && Objects.equals(cloud, that.cloud)
        && Objects.equals(cloudResourceContainer, that.cloudResourceContainer)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(credentialsId, that.credentialsId)
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
        && Objects.equals(workspaceId, that.workspaceId)
        && Objects.equals(workspaceName, that.workspaceName)
        && Objects.equals(workspaceStatus, that.workspaceStatus)
        && Objects.equals(workspaceStatusMessage, that.workspaceStatusMessage);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        awsRegion,
        cloud,
        cloudResourceContainer,
        creationTime,
        credentialsId,
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
        workspaceId,
        workspaceName,
        workspaceStatus,
        workspaceStatusMessage);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Workspace.class)
        .add("accountId", accountId)
        .add("awsRegion", awsRegion)
        .add("cloud", cloud)
        .add("cloudResourceContainer", cloudResourceContainer)
        .add("creationTime", creationTime)
        .add("credentialsId", credentialsId)
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
        .add("workspaceId", workspaceId)
        .add("workspaceName", workspaceName)
        .add("workspaceStatus", workspaceStatus)
        .add("workspaceStatusMessage", workspaceStatusMessage)
        .toString();
  }
}
