// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class UpdateWorkspaceRequest {
  /**
   * The AWS region of the workspace's data plane (for example, `us-west-2`). This parameter is
   * available only for updating failed workspaces.
   */
  @JsonProperty("aws_region")
  private String awsRegion;

  /**
   * ID of the workspace's credential configuration object. This parameter is available for updating
   * both failed and running workspaces.
   */
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
   * The ID of the workspace's managed services encryption key configuration object. This parameter
   * is available only for updating failed workspaces.
   */
  @JsonProperty("managed_services_customer_managed_key_id")
  private String managedServicesCustomerManagedKeyId;

  /**
   * The ID of the network connectivity configuration object, which is the parent resource of this
   * private endpoint rule object.
   */
  @JsonProperty("network_connectivity_config_id")
  private String networkConnectivityConfigId;

  /**
   * The ID of the workspace's network configuration object. Used only if you already use a
   * customer-managed VPC. For failed workspaces only, you can switch from a Databricks-managed VPC
   * to a customer-managed VPC by updating the workspace to add a network configuration ID.
   */
  @JsonProperty("network_id")
  private String networkId;

  /**
   * The ID of the workspace's storage configuration object. This parameter is available only for
   * updating failed workspaces.
   */
  @JsonProperty("storage_configuration_id")
  private String storageConfigurationId;

  /**
   * The ID of the key configuration object for workspace storage. This parameter is available for
   * updating both failed and running workspaces.
   */
  @JsonProperty("storage_customer_managed_key_id")
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
        .add("storageConfigurationId", storageConfigurationId)
        .add("storageCustomerManagedKeyId", storageCustomerManagedKeyId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
