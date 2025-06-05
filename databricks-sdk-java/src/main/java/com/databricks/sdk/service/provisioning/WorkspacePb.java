// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class WorkspacePb {
  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("aws_region")
  private String awsRegion;

  @JsonProperty("azure_workspace_info")
  private AzureWorkspaceInfo azureWorkspaceInfo;

  @JsonProperty("cloud")
  private String cloud;

  @JsonProperty("cloud_resource_container")
  private CloudResourceContainer cloudResourceContainer;

  @JsonProperty("creation_time")
  private Long creationTime;

  @JsonProperty("credentials_id")
  private String credentialsId;

  @JsonProperty("custom_tags")
  private Map<String, String> customTags;

  @JsonProperty("deployment_name")
  private String deploymentName;

  @JsonProperty("external_customer_info")
  private ExternalCustomerInfo externalCustomerInfo;

  @JsonProperty("gcp_managed_network_config")
  private GcpManagedNetworkConfig gcpManagedNetworkConfig;

  @JsonProperty("gke_config")
  private GkeConfig gkeConfig;

  @JsonProperty("is_no_public_ip_enabled")
  private Boolean isNoPublicIpEnabled;

  @JsonProperty("location")
  private String location;

  @JsonProperty("managed_services_customer_managed_key_id")
  private String managedServicesCustomerManagedKeyId;

  @JsonProperty("network_id")
  private String networkId;

  @JsonProperty("pricing_tier")
  private PricingTier pricingTier;

  @JsonProperty("private_access_settings_id")
  private String privateAccessSettingsId;

  @JsonProperty("storage_configuration_id")
  private String storageConfigurationId;

  @JsonProperty("storage_customer_managed_key_id")
  private String storageCustomerManagedKeyId;

  @JsonProperty("workspace_id")
  private Long workspaceId;

  @JsonProperty("workspace_name")
  private String workspaceName;

  @JsonProperty("workspace_status")
  private WorkspaceStatus workspaceStatus;

  @JsonProperty("workspace_status_message")
  private String workspaceStatusMessage;

  public WorkspacePb setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public WorkspacePb setAwsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
    return this;
  }

  public String getAwsRegion() {
    return awsRegion;
  }

  public WorkspacePb setAzureWorkspaceInfo(AzureWorkspaceInfo azureWorkspaceInfo) {
    this.azureWorkspaceInfo = azureWorkspaceInfo;
    return this;
  }

  public AzureWorkspaceInfo getAzureWorkspaceInfo() {
    return azureWorkspaceInfo;
  }

  public WorkspacePb setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  public String getCloud() {
    return cloud;
  }

  public WorkspacePb setCloudResourceContainer(CloudResourceContainer cloudResourceContainer) {
    this.cloudResourceContainer = cloudResourceContainer;
    return this;
  }

  public CloudResourceContainer getCloudResourceContainer() {
    return cloudResourceContainer;
  }

  public WorkspacePb setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public WorkspacePb setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  public WorkspacePb setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public WorkspacePb setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
    return this;
  }

  public String getDeploymentName() {
    return deploymentName;
  }

  public WorkspacePb setExternalCustomerInfo(ExternalCustomerInfo externalCustomerInfo) {
    this.externalCustomerInfo = externalCustomerInfo;
    return this;
  }

  public ExternalCustomerInfo getExternalCustomerInfo() {
    return externalCustomerInfo;
  }

  public WorkspacePb setGcpManagedNetworkConfig(GcpManagedNetworkConfig gcpManagedNetworkConfig) {
    this.gcpManagedNetworkConfig = gcpManagedNetworkConfig;
    return this;
  }

  public GcpManagedNetworkConfig getGcpManagedNetworkConfig() {
    return gcpManagedNetworkConfig;
  }

  public WorkspacePb setGkeConfig(GkeConfig gkeConfig) {
    this.gkeConfig = gkeConfig;
    return this;
  }

  public GkeConfig getGkeConfig() {
    return gkeConfig;
  }

  public WorkspacePb setIsNoPublicIpEnabled(Boolean isNoPublicIpEnabled) {
    this.isNoPublicIpEnabled = isNoPublicIpEnabled;
    return this;
  }

  public Boolean getIsNoPublicIpEnabled() {
    return isNoPublicIpEnabled;
  }

  public WorkspacePb setLocation(String location) {
    this.location = location;
    return this;
  }

  public String getLocation() {
    return location;
  }

  public WorkspacePb setManagedServicesCustomerManagedKeyId(
      String managedServicesCustomerManagedKeyId) {
    this.managedServicesCustomerManagedKeyId = managedServicesCustomerManagedKeyId;
    return this;
  }

  public String getManagedServicesCustomerManagedKeyId() {
    return managedServicesCustomerManagedKeyId;
  }

  public WorkspacePb setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  public String getNetworkId() {
    return networkId;
  }

  public WorkspacePb setPricingTier(PricingTier pricingTier) {
    this.pricingTier = pricingTier;
    return this;
  }

  public PricingTier getPricingTier() {
    return pricingTier;
  }

  public WorkspacePb setPrivateAccessSettingsId(String privateAccessSettingsId) {
    this.privateAccessSettingsId = privateAccessSettingsId;
    return this;
  }

  public String getPrivateAccessSettingsId() {
    return privateAccessSettingsId;
  }

  public WorkspacePb setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  public WorkspacePb setStorageCustomerManagedKeyId(String storageCustomerManagedKeyId) {
    this.storageCustomerManagedKeyId = storageCustomerManagedKeyId;
    return this;
  }

  public String getStorageCustomerManagedKeyId() {
    return storageCustomerManagedKeyId;
  }

  public WorkspacePb setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  public WorkspacePb setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
    return this;
  }

  public String getWorkspaceName() {
    return workspaceName;
  }

  public WorkspacePb setWorkspaceStatus(WorkspaceStatus workspaceStatus) {
    this.workspaceStatus = workspaceStatus;
    return this;
  }

  public WorkspaceStatus getWorkspaceStatus() {
    return workspaceStatus;
  }

  public WorkspacePb setWorkspaceStatusMessage(String workspaceStatusMessage) {
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
    WorkspacePb that = (WorkspacePb) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(awsRegion, that.awsRegion)
        && Objects.equals(azureWorkspaceInfo, that.azureWorkspaceInfo)
        && Objects.equals(cloud, that.cloud)
        && Objects.equals(cloudResourceContainer, that.cloudResourceContainer)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(deploymentName, that.deploymentName)
        && Objects.equals(externalCustomerInfo, that.externalCustomerInfo)
        && Objects.equals(gcpManagedNetworkConfig, that.gcpManagedNetworkConfig)
        && Objects.equals(gkeConfig, that.gkeConfig)
        && Objects.equals(isNoPublicIpEnabled, that.isNoPublicIpEnabled)
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

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        awsRegion,
        azureWorkspaceInfo,
        cloud,
        cloudResourceContainer,
        creationTime,
        credentialsId,
        customTags,
        deploymentName,
        externalCustomerInfo,
        gcpManagedNetworkConfig,
        gkeConfig,
        isNoPublicIpEnabled,
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

  @Override
  public String toString() {
    return new ToStringer(WorkspacePb.class)
        .add("accountId", accountId)
        .add("awsRegion", awsRegion)
        .add("azureWorkspaceInfo", azureWorkspaceInfo)
        .add("cloud", cloud)
        .add("cloudResourceContainer", cloudResourceContainer)
        .add("creationTime", creationTime)
        .add("credentialsId", credentialsId)
        .add("customTags", customTags)
        .add("deploymentName", deploymentName)
        .add("externalCustomerInfo", externalCustomerInfo)
        .add("gcpManagedNetworkConfig", gcpManagedNetworkConfig)
        .add("gkeConfig", gkeConfig)
        .add("isNoPublicIpEnabled", isNoPublicIpEnabled)
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
