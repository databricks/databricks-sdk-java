// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class Workspace {
  /** Databricks account ID. */
  @JsonProperty("account_id")
  private String accountId;

  /** */
  @JsonProperty("aws_region")
  private String awsRegion;

  /** */
  @JsonProperty("azure_workspace_info")
  private AzureWorkspaceInfo azureWorkspaceInfo;

  /** The cloud name. This field always has the value `gcp`. */
  @JsonProperty("cloud")
  private String cloud;

  /** */
  @JsonProperty("cloud_resource_container")
  private CloudResourceContainer cloudResourceContainer;

  /** The compute mode of the workspace. */
  @JsonProperty("compute_mode")
  private CustomerFacingComputeMode computeMode;

  /** Time in epoch milliseconds when the workspace was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

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

  /** */
  @JsonProperty("deployment_name")
  private String deploymentName;

  /**
   * A client owned field used to indicate the workspace status that the client expects to be in.
   * For now this is only used to unblock Temporal workflow for GCP least privileged workspace.
   */
  @JsonProperty("expected_workspace_status")
  private WorkspaceStatus expectedWorkspaceStatus;

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

  /** ID of the key configuration for encrypting managed services. */
  @JsonProperty("managed_services_customer_managed_key_id")
  private String managedServicesCustomerManagedKeyId;

  /**
   * The network configuration for the workspace.
   *
   * <p>DEPRECATED. Use `network_id` instead.
   */
  @JsonProperty("network")
  private WorkspaceNetwork network;

  /** The object ID of network connectivity config. */
  @JsonProperty("network_connectivity_config_id")
  private String networkConnectivityConfigId;

  /**
   * If this workspace is BYO VPC, then the network_id will be populated. If this workspace is not
   * BYO VPC, then the network_id will be empty.
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
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].",
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

  /** The storage mode of the workspace. */
  @JsonProperty("storage_mode")
  private CustomerFacingStorageMode storageMode;

  /** A unique integer ID for the workspace */
  @JsonProperty("workspace_id")
  private Long workspaceId;

  /** The human-readable name of the workspace. */
  @JsonProperty("workspace_name")
  private String workspaceName;

  /** The status of a workspace */
  @JsonProperty("workspace_status")
  private WorkspaceStatus workspaceStatus;

  /** Message describing the current workspace status. */
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

  public Workspace setAzureWorkspaceInfo(AzureWorkspaceInfo azureWorkspaceInfo) {
    this.azureWorkspaceInfo = azureWorkspaceInfo;
    return this;
  }

  public AzureWorkspaceInfo getAzureWorkspaceInfo() {
    return azureWorkspaceInfo;
  }

  public Workspace setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  public String getCloud() {
    return cloud;
  }

  public Workspace setCloudResourceContainer(CloudResourceContainer cloudResourceContainer) {
    this.cloudResourceContainer = cloudResourceContainer;
    return this;
  }

  public CloudResourceContainer getCloudResourceContainer() {
    return cloudResourceContainer;
  }

  public Workspace setComputeMode(CustomerFacingComputeMode computeMode) {
    this.computeMode = computeMode;
    return this;
  }

  public CustomerFacingComputeMode getComputeMode() {
    return computeMode;
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

  public Workspace setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public Workspace setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
    return this;
  }

  public String getDeploymentName() {
    return deploymentName;
  }

  public Workspace setExpectedWorkspaceStatus(WorkspaceStatus expectedWorkspaceStatus) {
    this.expectedWorkspaceStatus = expectedWorkspaceStatus;
    return this;
  }

  public WorkspaceStatus getExpectedWorkspaceStatus() {
    return expectedWorkspaceStatus;
  }

  public Workspace setGcpManagedNetworkConfig(GcpManagedNetworkConfig gcpManagedNetworkConfig) {
    this.gcpManagedNetworkConfig = gcpManagedNetworkConfig;
    return this;
  }

  public GcpManagedNetworkConfig getGcpManagedNetworkConfig() {
    return gcpManagedNetworkConfig;
  }

  public Workspace setGkeConfig(GkeConfig gkeConfig) {
    this.gkeConfig = gkeConfig;
    return this;
  }

  public GkeConfig getGkeConfig() {
    return gkeConfig;
  }

  public Workspace setLocation(String location) {
    this.location = location;
    return this;
  }

  public String getLocation() {
    return location;
  }

  public Workspace setManagedServicesCustomerManagedKeyId(
      String managedServicesCustomerManagedKeyId) {
    this.managedServicesCustomerManagedKeyId = managedServicesCustomerManagedKeyId;
    return this;
  }

  public String getManagedServicesCustomerManagedKeyId() {
    return managedServicesCustomerManagedKeyId;
  }

  public Workspace setNetwork(WorkspaceNetwork network) {
    this.network = network;
    return this;
  }

  public WorkspaceNetwork getNetwork() {
    return network;
  }

  public Workspace setNetworkConnectivityConfigId(String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public Workspace setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  public String getNetworkId() {
    return networkId;
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

  public Workspace setStorageMode(CustomerFacingStorageMode storageMode) {
    this.storageMode = storageMode;
    return this;
  }

  public CustomerFacingStorageMode getStorageMode() {
    return storageMode;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Workspace that = (Workspace) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(awsRegion, that.awsRegion)
        && Objects.equals(azureWorkspaceInfo, that.azureWorkspaceInfo)
        && Objects.equals(cloud, that.cloud)
        && Objects.equals(cloudResourceContainer, that.cloudResourceContainer)
        && Objects.equals(computeMode, that.computeMode)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(deploymentName, that.deploymentName)
        && Objects.equals(expectedWorkspaceStatus, that.expectedWorkspaceStatus)
        && Objects.equals(gcpManagedNetworkConfig, that.gcpManagedNetworkConfig)
        && Objects.equals(gkeConfig, that.gkeConfig)
        && Objects.equals(location, that.location)
        && Objects.equals(
            managedServicesCustomerManagedKeyId, that.managedServicesCustomerManagedKeyId)
        && Objects.equals(network, that.network)
        && Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(networkId, that.networkId)
        && Objects.equals(pricingTier, that.pricingTier)
        && Objects.equals(privateAccessSettingsId, that.privateAccessSettingsId)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId)
        && Objects.equals(storageCustomerManagedKeyId, that.storageCustomerManagedKeyId)
        && Objects.equals(storageMode, that.storageMode)
        && Objects.equals(workspaceId, that.workspaceId)
        && Objects.equals(workspaceName, that.workspaceName)
        && Objects.equals(workspaceStatus, that.workspaceStatus)
        && Objects.equals(workspaceStatusMessage, that.workspaceStatusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        awsRegion,
        azureWorkspaceInfo,
        cloud,
        cloudResourceContainer,
        computeMode,
        creationTime,
        credentialsId,
        customTags,
        deploymentName,
        expectedWorkspaceStatus,
        gcpManagedNetworkConfig,
        gkeConfig,
        location,
        managedServicesCustomerManagedKeyId,
        network,
        networkConnectivityConfigId,
        networkId,
        pricingTier,
        privateAccessSettingsId,
        storageConfigurationId,
        storageCustomerManagedKeyId,
        storageMode,
        workspaceId,
        workspaceName,
        workspaceStatus,
        workspaceStatusMessage);
  }

  @Override
  public String toString() {
    return new ToStringer(Workspace.class)
        .add("accountId", accountId)
        .add("awsRegion", awsRegion)
        .add("azureWorkspaceInfo", azureWorkspaceInfo)
        .add("cloud", cloud)
        .add("cloudResourceContainer", cloudResourceContainer)
        .add("computeMode", computeMode)
        .add("creationTime", creationTime)
        .add("credentialsId", credentialsId)
        .add("customTags", customTags)
        .add("deploymentName", deploymentName)
        .add("expectedWorkspaceStatus", expectedWorkspaceStatus)
        .add("gcpManagedNetworkConfig", gcpManagedNetworkConfig)
        .add("gkeConfig", gkeConfig)
        .add("location", location)
        .add("managedServicesCustomerManagedKeyId", managedServicesCustomerManagedKeyId)
        .add("network", network)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("networkId", networkId)
        .add("pricingTier", pricingTier)
        .add("privateAccessSettingsId", privateAccessSettingsId)
        .add("storageConfigurationId", storageConfigurationId)
        .add("storageCustomerManagedKeyId", storageCustomerManagedKeyId)
        .add("storageMode", storageMode)
        .add("workspaceId", workspaceId)
        .add("workspaceName", workspaceName)
        .add("workspaceStatus", workspaceStatus)
        .add("workspaceStatusMessage", workspaceStatusMessage)
        .toString();
  }
}
