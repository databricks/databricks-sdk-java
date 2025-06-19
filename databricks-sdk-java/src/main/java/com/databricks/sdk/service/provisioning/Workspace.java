// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = Workspace.WorkspaceSerializer.class)
@JsonDeserialize(using = Workspace.WorkspaceDeserializer.class)
public class Workspace {
  /** Databricks account ID. */
  private String accountId;

  /** The AWS region of the workspace data plane (for example, `us-west-2`). */
  private String awsRegion;

  /** */
  private AzureWorkspaceInfo azureWorkspaceInfo;

  /** The cloud name. This field always has the value `gcp`. */
  private String cloud;

  /** The general workspace configurations that are specific to cloud providers. */
  private CloudResourceContainer cloudResourceContainer;

  /** Time in epoch milliseconds when the workspace was created. */
  private Long creationTime;

  /** ID of the workspace's credential configuration object. */
  private String credentialsId;

  /**
   * The custom tags key-value pairing that is attached to this workspace. The key-value pair is a
   * string of utf-8 characters. The value can be an empty string, with maximum length of 255
   * characters. The key can be of maximum length of 127 characters, and cannot be empty.
   */
  private Map<String, String> customTags;

  /**
   * The deployment name defines part of the subdomain for the workspace. The workspace URL for web
   * application and REST APIs is `<deployment-name>.cloud.databricks.com`.
   *
   * <p>This value must be unique across all non-deleted deployments across all AWS regions.
   */
  private String deploymentName;

  /**
   * If this workspace is for a external customer, then external_customer_info is populated. If this
   * workspace is not for a external customer, then external_customer_info is empty.
   */
  private ExternalCustomerInfo externalCustomerInfo;

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
  private GcpManagedNetworkConfig gcpManagedNetworkConfig;

  /** The configurations for the GKE cluster of a Databricks workspace. */
  private GkeConfig gkeConfig;

  /** Whether no public IP is enabled for the workspace. */
  private Boolean isNoPublicIpEnabled;

  /**
   * The Google Cloud region of the workspace data plane in your Google account (for example,
   * `us-east4`).
   */
  private String location;

  /** ID of the key configuration for encrypting managed services. */
  private String managedServicesCustomerManagedKeyId;

  /**
   * The network configuration ID that is attached to the workspace. This field is available only if
   * the network is a customer-managed network.
   */
  private String networkId;

  /**
   * The pricing tier of the workspace. For pricing tier information, see [AWS Pricing].
   *
   * <p>[AWS Pricing]: https://databricks.com/product/aws-pricing
   */
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
  private String privateAccessSettingsId;

  /** ID of the workspace's storage configuration object. */
  private String storageConfigurationId;

  /** ID of the key configuration for encrypting workspace storage. */
  private String storageCustomerManagedKeyId;

  /** A unique integer ID for the workspace */
  private Long workspaceId;

  /** The human-readable name of the workspace. */
  private String workspaceName;

  /**
   * The status of the workspace. For workspace creation, usually it is set to `PROVISIONING`
   * initially. Continue to check the status until the status is `RUNNING`.
   */
  private WorkspaceStatus workspaceStatus;

  /** Message describing the current workspace status. */
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

  public Workspace setExternalCustomerInfo(ExternalCustomerInfo externalCustomerInfo) {
    this.externalCustomerInfo = externalCustomerInfo;
    return this;
  }

  public ExternalCustomerInfo getExternalCustomerInfo() {
    return externalCustomerInfo;
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

  public Workspace setIsNoPublicIpEnabled(Boolean isNoPublicIpEnabled) {
    this.isNoPublicIpEnabled = isNoPublicIpEnabled;
    return this;
  }

  public Boolean getIsNoPublicIpEnabled() {
    return isNoPublicIpEnabled;
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
    return new ToStringer(Workspace.class)
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

  WorkspacePb toPb() {
    WorkspacePb pb = new WorkspacePb();
    pb.setAccountId(accountId);
    pb.setAwsRegion(awsRegion);
    pb.setAzureWorkspaceInfo(azureWorkspaceInfo);
    pb.setCloud(cloud);
    pb.setCloudResourceContainer(cloudResourceContainer);
    pb.setCreationTime(creationTime);
    pb.setCredentialsId(credentialsId);
    pb.setCustomTags(customTags);
    pb.setDeploymentName(deploymentName);
    pb.setExternalCustomerInfo(externalCustomerInfo);
    pb.setGcpManagedNetworkConfig(gcpManagedNetworkConfig);
    pb.setGkeConfig(gkeConfig);
    pb.setIsNoPublicIpEnabled(isNoPublicIpEnabled);
    pb.setLocation(location);
    pb.setManagedServicesCustomerManagedKeyId(managedServicesCustomerManagedKeyId);
    pb.setNetworkId(networkId);
    pb.setPricingTier(pricingTier);
    pb.setPrivateAccessSettingsId(privateAccessSettingsId);
    pb.setStorageConfigurationId(storageConfigurationId);
    pb.setStorageCustomerManagedKeyId(storageCustomerManagedKeyId);
    pb.setWorkspaceId(workspaceId);
    pb.setWorkspaceName(workspaceName);
    pb.setWorkspaceStatus(workspaceStatus);
    pb.setWorkspaceStatusMessage(workspaceStatusMessage);

    return pb;
  }

  static Workspace fromPb(WorkspacePb pb) {
    Workspace model = new Workspace();
    model.setAccountId(pb.getAccountId());
    model.setAwsRegion(pb.getAwsRegion());
    model.setAzureWorkspaceInfo(pb.getAzureWorkspaceInfo());
    model.setCloud(pb.getCloud());
    model.setCloudResourceContainer(pb.getCloudResourceContainer());
    model.setCreationTime(pb.getCreationTime());
    model.setCredentialsId(pb.getCredentialsId());
    model.setCustomTags(pb.getCustomTags());
    model.setDeploymentName(pb.getDeploymentName());
    model.setExternalCustomerInfo(pb.getExternalCustomerInfo());
    model.setGcpManagedNetworkConfig(pb.getGcpManagedNetworkConfig());
    model.setGkeConfig(pb.getGkeConfig());
    model.setIsNoPublicIpEnabled(pb.getIsNoPublicIpEnabled());
    model.setLocation(pb.getLocation());
    model.setManagedServicesCustomerManagedKeyId(pb.getManagedServicesCustomerManagedKeyId());
    model.setNetworkId(pb.getNetworkId());
    model.setPricingTier(pb.getPricingTier());
    model.setPrivateAccessSettingsId(pb.getPrivateAccessSettingsId());
    model.setStorageConfigurationId(pb.getStorageConfigurationId());
    model.setStorageCustomerManagedKeyId(pb.getStorageCustomerManagedKeyId());
    model.setWorkspaceId(pb.getWorkspaceId());
    model.setWorkspaceName(pb.getWorkspaceName());
    model.setWorkspaceStatus(pb.getWorkspaceStatus());
    model.setWorkspaceStatusMessage(pb.getWorkspaceStatusMessage());

    return model;
  }

  public static class WorkspaceSerializer extends JsonSerializer<Workspace> {
    @Override
    public void serialize(Workspace value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WorkspacePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WorkspaceDeserializer extends JsonDeserializer<Workspace> {
    @Override
    public Workspace deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WorkspacePb pb = mapper.readValue(p, WorkspacePb.class);
      return Workspace.fromPb(pb);
    }
  }
}
