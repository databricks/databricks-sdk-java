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
@JsonSerialize(using = UpdateWorkspaceRequest.UpdateWorkspaceRequestSerializer.class)
@JsonDeserialize(using = UpdateWorkspaceRequest.UpdateWorkspaceRequestDeserializer.class)
public class UpdateWorkspaceRequest {
  /**
   * The AWS region of the workspace's data plane (for example, `us-west-2`). This parameter is
   * available only for updating failed workspaces.
   */
  private String awsRegion;

  /**
   * ID of the workspace's credential configuration object. This parameter is available for updating
   * both failed and running workspaces.
   */
  private String credentialsId;

  /**
   * The custom tags key-value pairing that is attached to this workspace. The key-value pair is a
   * string of utf-8 characters. The value can be an empty string, with maximum length of 255
   * characters. The key can be of maximum length of 127 characters, and cannot be empty.
   */
  private Map<String, String> customTags;

  /**
   * The ID of the workspace's managed services encryption key configuration object. This parameter
   * is available only for updating failed workspaces.
   */
  private String managedServicesCustomerManagedKeyId;

  /** */
  private String networkConnectivityConfigId;

  /**
   * The ID of the workspace's network configuration object. Used only if you already use a
   * customer-managed VPC. For failed workspaces only, you can switch from a Databricks-managed VPC
   * to a customer-managed VPC by updating the workspace to add a network configuration ID.
   */
  private String networkId;

  /**
   * The ID of the workspace's private access settings configuration object. This parameter is
   * available only for updating failed workspaces.
   */
  private String privateAccessSettingsId;

  /**
   * The ID of the workspace's storage configuration object. This parameter is available only for
   * updating failed workspaces.
   */
  private String storageConfigurationId;

  /**
   * The ID of the key configuration object for workspace storage. This parameter is available for
   * updating both failed and running workspaces.
   */
  private String storageCustomerManagedKeyId;

  /** Workspace ID. */
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

  public UpdateWorkspaceRequest setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public UpdateWorkspaceRequest setManagedServicesCustomerManagedKeyId(
      String managedServicesCustomerManagedKeyId) {
    this.managedServicesCustomerManagedKeyId = managedServicesCustomerManagedKeyId;
    return this;
  }

  public String getManagedServicesCustomerManagedKeyId() {
    return managedServicesCustomerManagedKeyId;
  }

  public UpdateWorkspaceRequest setNetworkConnectivityConfigId(String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public UpdateWorkspaceRequest setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  public String getNetworkId() {
    return networkId;
  }

  public UpdateWorkspaceRequest setPrivateAccessSettingsId(String privateAccessSettingsId) {
    this.privateAccessSettingsId = privateAccessSettingsId;
    return this;
  }

  public String getPrivateAccessSettingsId() {
    return privateAccessSettingsId;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceRequest that = (UpdateWorkspaceRequest) o;
    return Objects.equals(awsRegion, that.awsRegion)
        && Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(
            managedServicesCustomerManagedKeyId, that.managedServicesCustomerManagedKeyId)
        && Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(networkId, that.networkId)
        && Objects.equals(privateAccessSettingsId, that.privateAccessSettingsId)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId)
        && Objects.equals(storageCustomerManagedKeyId, that.storageCustomerManagedKeyId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsRegion,
        credentialsId,
        customTags,
        managedServicesCustomerManagedKeyId,
        networkConnectivityConfigId,
        networkId,
        privateAccessSettingsId,
        storageConfigurationId,
        storageCustomerManagedKeyId,
        workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceRequest.class)
        .add("awsRegion", awsRegion)
        .add("credentialsId", credentialsId)
        .add("customTags", customTags)
        .add("managedServicesCustomerManagedKeyId", managedServicesCustomerManagedKeyId)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("networkId", networkId)
        .add("privateAccessSettingsId", privateAccessSettingsId)
        .add("storageConfigurationId", storageConfigurationId)
        .add("storageCustomerManagedKeyId", storageCustomerManagedKeyId)
        .add("workspaceId", workspaceId)
        .toString();
  }

  UpdateWorkspaceRequestPb toPb() {
    UpdateWorkspaceRequestPb pb = new UpdateWorkspaceRequestPb();
    pb.setAwsRegion(awsRegion);
    pb.setCredentialsId(credentialsId);
    pb.setCustomTags(customTags);
    pb.setManagedServicesCustomerManagedKeyId(managedServicesCustomerManagedKeyId);
    pb.setNetworkConnectivityConfigId(networkConnectivityConfigId);
    pb.setNetworkId(networkId);
    pb.setPrivateAccessSettingsId(privateAccessSettingsId);
    pb.setStorageConfigurationId(storageConfigurationId);
    pb.setStorageCustomerManagedKeyId(storageCustomerManagedKeyId);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static UpdateWorkspaceRequest fromPb(UpdateWorkspaceRequestPb pb) {
    UpdateWorkspaceRequest model = new UpdateWorkspaceRequest();
    model.setAwsRegion(pb.getAwsRegion());
    model.setCredentialsId(pb.getCredentialsId());
    model.setCustomTags(pb.getCustomTags());
    model.setManagedServicesCustomerManagedKeyId(pb.getManagedServicesCustomerManagedKeyId());
    model.setNetworkConnectivityConfigId(pb.getNetworkConnectivityConfigId());
    model.setNetworkId(pb.getNetworkId());
    model.setPrivateAccessSettingsId(pb.getPrivateAccessSettingsId());
    model.setStorageConfigurationId(pb.getStorageConfigurationId());
    model.setStorageCustomerManagedKeyId(pb.getStorageCustomerManagedKeyId());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class UpdateWorkspaceRequestSerializer
      extends JsonSerializer<UpdateWorkspaceRequest> {
    @Override
    public void serialize(
        UpdateWorkspaceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateWorkspaceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateWorkspaceRequestDeserializer
      extends JsonDeserializer<UpdateWorkspaceRequest> {
    @Override
    public UpdateWorkspaceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateWorkspaceRequestPb pb = mapper.readValue(p, UpdateWorkspaceRequestPb.class);
      return UpdateWorkspaceRequest.fromPb(pb);
    }
  }
}
