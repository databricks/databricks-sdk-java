// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateWorkspaceRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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
   * The ID of the workspace's managed services encryption key configuration object. This parameter
   * is available only for updating failed workspaces.
   */
  @JsonProperty("managed_services_customer_managed_key_id")
  private String managedServicesCustomerManagedKeyId;

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

  /**
   * <p>Setter for the field <code>awsRegion</code>.</p>
   *
   * @param awsRegion a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest} object
   */
  public UpdateWorkspaceRequest setAwsRegion(String awsRegion) {
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
   * <p>Setter for the field <code>credentialsId</code>.</p>
   *
   * @param credentialsId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest} object
   */
  public UpdateWorkspaceRequest setCredentialsId(String credentialsId) {
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
   * <p>Setter for the field <code>managedServicesCustomerManagedKeyId</code>.</p>
   *
   * @param managedServicesCustomerManagedKeyId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest} object
   */
  public UpdateWorkspaceRequest setManagedServicesCustomerManagedKeyId(
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
   * @return a {@link com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest} object
   */
  public UpdateWorkspaceRequest setNetworkId(String networkId) {
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
   * <p>Setter for the field <code>storageConfigurationId</code>.</p>
   *
   * @param storageConfigurationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest} object
   */
  public UpdateWorkspaceRequest setStorageConfigurationId(String storageConfigurationId) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest} object
   */
  public UpdateWorkspaceRequest setStorageCustomerManagedKeyId(String storageCustomerManagedKeyId) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest} object
   */
  public UpdateWorkspaceRequest setWorkspaceId(Long workspaceId) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceRequest that = (UpdateWorkspaceRequest) o;
    return Objects.equals(awsRegion, that.awsRegion)
        && Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(
            managedServicesCustomerManagedKeyId, that.managedServicesCustomerManagedKeyId)
        && Objects.equals(networkId, that.networkId)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId)
        && Objects.equals(storageCustomerManagedKeyId, that.storageCustomerManagedKeyId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        awsRegion,
        credentialsId,
        managedServicesCustomerManagedKeyId,
        networkId,
        storageConfigurationId,
        storageCustomerManagedKeyId,
        workspaceId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceRequest.class)
        .add("awsRegion", awsRegion)
        .add("credentialsId", credentialsId)
        .add("managedServicesCustomerManagedKeyId", managedServicesCustomerManagedKeyId)
        .add("networkId", networkId)
        .add("storageConfigurationId", storageConfigurationId)
        .add("storageCustomerManagedKeyId", storageCustomerManagedKeyId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
