// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateWorkspaceRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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
   * The deployment name defines part of the subdomain for the workspace. The workspace URL for web
   * application and REST APIs is `<workspace-deployment-name>.cloud.databricks.com`. For example,
   * if the deployment name is `abcsales`, your workspace URL will be
   * `https://abcsales.cloud.databricks.com`. Hyphens are allowed. This property supports only the
   * set of characters that are allowed in a subdomain.
   *
   * <p>If your account has a non-empty deployment name prefix at workspace creation time, the
   * workspace deployment name changes so that the beginning has the account prefix and a hyphen.
   * For example, if your account's deployment prefix is `acme` and the workspace deployment name is
   * `workspace-1`, the `deployment_name` field becomes `acme-workspace-1` and that is the value
   * that is returned in JSON responses for the `deployment_name` field. The workspace URL is
   * `acme-workspace-1.cloud.databricks.com`.
   *
   * <p>If your account has a non-empty deployment name prefix and you set `deployment_name` to the
   * reserved keyword `EMPTY`, `deployment_name` is just the account prefix only. For example, if
   * your account's deployment prefix is `acme` and the workspace deployment name is `EMPTY`,
   * `deployment_name` becomes `acme` only and the workspace URL is `acme.cloud.databricks.com`.
   *
   * <p>Contact your Databricks representatives to add an account deployment name prefix to your
   * account. If you do not have a deployment name prefix, the special deployment name value `EMPTY`
   * is invalid.
   *
   * <p>This value must be unique across all non-deleted deployments across all AWS regions.
   *
   * <p>If a new workspace omits this property, the server generates a unique deployment name for
   * you with the pattern `dbc-xxxxxxxx-xxxx`.
   */
  @JsonProperty("deployment_name")
  private String deploymentName;

  /**
   * The Google Cloud region of the workspace data plane in your Google account. For example,
   * `us-east4`.
   */
  @JsonProperty("location")
  private String location;

  /**
   * The ID of the workspace's managed services encryption key configuration object. This is used to
   * encrypt the workspace's notebook and secret data in the control plane, in addition to
   * Databricks SQL queries and query history. The provided key configuration object property
   * `use_cases` must contain `MANAGED_SERVICES`.
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
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].
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

  /**
   * <p>Setter for the field <code>awsRegion</code>.</p>
   *
   * @param awsRegion a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateWorkspaceRequest} object
   */
  public CreateWorkspaceRequest setAwsRegion(String awsRegion) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.CreateWorkspaceRequest} object
   */
  public CreateWorkspaceRequest setCloud(String cloud) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.CreateWorkspaceRequest} object
   */
  public CreateWorkspaceRequest setCloudResourceContainer(
      CloudResourceContainer cloudResourceContainer) {
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
   * <p>Setter for the field <code>credentialsId</code>.</p>
   *
   * @param credentialsId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateWorkspaceRequest} object
   */
  public CreateWorkspaceRequest setCredentialsId(String credentialsId) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.CreateWorkspaceRequest} object
   */
  public CreateWorkspaceRequest setDeploymentName(String deploymentName) {
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
   * <p>Setter for the field <code>location</code>.</p>
   *
   * @param location a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateWorkspaceRequest} object
   */
  public CreateWorkspaceRequest setLocation(String location) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.CreateWorkspaceRequest} object
   */
  public CreateWorkspaceRequest setManagedServicesCustomerManagedKeyId(
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
   * @return a {@link com.databricks.sdk.service.provisioning.CreateWorkspaceRequest} object
   */
  public CreateWorkspaceRequest setNetworkId(String networkId) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.CreateWorkspaceRequest} object
   */
  public CreateWorkspaceRequest setPricingTier(PricingTier pricingTier) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.CreateWorkspaceRequest} object
   */
  public CreateWorkspaceRequest setPrivateAccessSettingsId(String privateAccessSettingsId) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.CreateWorkspaceRequest} object
   */
  public CreateWorkspaceRequest setStorageConfigurationId(String storageConfigurationId) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.CreateWorkspaceRequest} object
   */
  public CreateWorkspaceRequest setStorageCustomerManagedKeyId(String storageCustomerManagedKeyId) {
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
   * <p>Setter for the field <code>workspaceName</code>.</p>
   *
   * @param workspaceName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateWorkspaceRequest} object
   */
  public CreateWorkspaceRequest setWorkspaceName(String workspaceName) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateWorkspaceRequest that = (CreateWorkspaceRequest) o;
    return Objects.equals(awsRegion, that.awsRegion)
        && Objects.equals(cloud, that.cloud)
        && Objects.equals(cloudResourceContainer, that.cloudResourceContainer)
        && Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(deploymentName, that.deploymentName)
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        awsRegion,
        cloud,
        cloudResourceContainer,
        credentialsId,
        deploymentName,
        location,
        managedServicesCustomerManagedKeyId,
        networkId,
        pricingTier,
        privateAccessSettingsId,
        storageConfigurationId,
        storageCustomerManagedKeyId,
        workspaceName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateWorkspaceRequest.class)
        .add("awsRegion", awsRegion)
        .add("cloud", cloud)
        .add("cloudResourceContainer", cloudResourceContainer)
        .add("credentialsId", credentialsId)
        .add("deploymentName", deploymentName)
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
