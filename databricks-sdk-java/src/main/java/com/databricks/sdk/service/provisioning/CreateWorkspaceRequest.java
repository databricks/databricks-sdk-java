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
@JsonSerialize(using = CreateWorkspaceRequest.CreateWorkspaceRequestSerializer.class)
@JsonDeserialize(using = CreateWorkspaceRequest.CreateWorkspaceRequestDeserializer.class)
public class CreateWorkspaceRequest {
  /** The AWS region of the workspace's data plane. */
  private String awsRegion;

  /**
   * The cloud provider which the workspace uses. For Google Cloud workspaces, always set this field
   * to `gcp`.
   */
  private String cloud;

  /** The general workspace configurations that are specific to cloud providers. */
  private CloudResourceContainer cloudResourceContainer;

  /** ID of the workspace's credential configuration object. */
  private String credentialsId;

  /**
   * The custom tags key-value pairing that is attached to this workspace. The key-value pair is a
   * string of utf-8 characters. The value can be an empty string, with maximum length of 255
   * characters. The key can be of maximum length of 127 characters, and cannot be empty.
   */
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
  private GcpManagedNetworkConfig gcpManagedNetworkConfig;

  /** The configurations for the GKE cluster of a Databricks workspace. */
  private GkeConfig gkeConfig;

  /** Whether no public IP is enabled for the workspace. */
  private Boolean isNoPublicIpEnabled;

  /**
   * The Google Cloud region of the workspace data plane in your Google account. For example,
   * `us-east4`.
   */
  private String location;

  /**
   * The ID of the workspace's managed services encryption key configuration object. This is used to
   * help protect and control access to the workspace's notebooks, secrets, Databricks SQL queries,
   * and query history. The provided key configuration object property `use_cases` must contain
   * `MANAGED_SERVICES`.
   */
  private String managedServicesCustomerManagedKeyId;

  /** */
  private String networkId;

  /**
   * The pricing tier of the workspace. For pricing tier information, see [AWS Pricing].
   *
   * <p>[AWS Pricing]: https://databricks.com/product/aws-pricing
   */
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
  private String privateAccessSettingsId;

  /** The ID of the workspace's storage configuration object. */
  private String storageConfigurationId;

  /**
   * The ID of the workspace's storage encryption key configuration object. This is used to encrypt
   * the workspace's root S3 bucket (root DBFS and system data) and, optionally, cluster EBS
   * volumes. The provided key configuration object property `use_cases` must contain `STORAGE`.
   */
  private String storageCustomerManagedKeyId;

  /** The workspace's human-readable name. */
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

  public CreateWorkspaceRequest setIsNoPublicIpEnabled(Boolean isNoPublicIpEnabled) {
    this.isNoPublicIpEnabled = isNoPublicIpEnabled;
    return this;
  }

  public Boolean getIsNoPublicIpEnabled() {
    return isNoPublicIpEnabled;
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
        && Objects.equals(isNoPublicIpEnabled, that.isNoPublicIpEnabled)
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
        isNoPublicIpEnabled,
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
        .add("isNoPublicIpEnabled", isNoPublicIpEnabled)
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

  CreateWorkspaceRequestPb toPb() {
    CreateWorkspaceRequestPb pb = new CreateWorkspaceRequestPb();
    pb.setAwsRegion(awsRegion);
    pb.setCloud(cloud);
    pb.setCloudResourceContainer(cloudResourceContainer);
    pb.setCredentialsId(credentialsId);
    pb.setCustomTags(customTags);
    pb.setDeploymentName(deploymentName);
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
    pb.setWorkspaceName(workspaceName);

    return pb;
  }

  static CreateWorkspaceRequest fromPb(CreateWorkspaceRequestPb pb) {
    CreateWorkspaceRequest model = new CreateWorkspaceRequest();
    model.setAwsRegion(pb.getAwsRegion());
    model.setCloud(pb.getCloud());
    model.setCloudResourceContainer(pb.getCloudResourceContainer());
    model.setCredentialsId(pb.getCredentialsId());
    model.setCustomTags(pb.getCustomTags());
    model.setDeploymentName(pb.getDeploymentName());
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
    model.setWorkspaceName(pb.getWorkspaceName());

    return model;
  }

  public static class CreateWorkspaceRequestSerializer
      extends JsonSerializer<CreateWorkspaceRequest> {
    @Override
    public void serialize(
        CreateWorkspaceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateWorkspaceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateWorkspaceRequestDeserializer
      extends JsonDeserializer<CreateWorkspaceRequest> {
    @Override
    public CreateWorkspaceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateWorkspaceRequestPb pb = mapper.readValue(p, CreateWorkspaceRequestPb.class);
      return CreateWorkspaceRequest.fromPb(pb);
    }
  }
}
