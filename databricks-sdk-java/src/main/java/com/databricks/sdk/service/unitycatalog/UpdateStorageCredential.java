// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateStorageCredential {
  /** The AWS IAM role configuration. */
  @JsonProperty("aws_iam_role")
  private AwsIamRole awsIamRole;

  /** The Azure service principal configuration. */
  @JsonProperty("azure_service_principal")
  private AzureServicePrincipal azureServicePrincipal;

  /** Comment associated with the credential. */
  @JsonProperty("comment")
  private String comment;

  /** Force update even if there are dependent external locations or external tables. */
  @JsonProperty("force")
  private Boolean force;

  /** The GCP service account key configuration. */
  @JsonProperty("gcp_service_account_key")
  private GcpServiceAccountKey gcpServiceAccountKey;

  /** The credential name. The name must be unique within the metastore. */
  @JsonProperty("name")
  private String name;

  /** Username of current owner of credential. */
  @JsonProperty("owner")
  private String owner;

  /** Whether the storage credential is only usable for read operations. */
  @JsonProperty("read_only")
  private Boolean readOnly;

  /** Supplying true to this argument skips validation of the updated credential. */
  @JsonProperty("skip_validation")
  private Boolean skipValidation;

  public UpdateStorageCredential setAwsIamRole(AwsIamRole awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRole getAwsIamRole() {
    return awsIamRole;
  }

  public UpdateStorageCredential setAzureServicePrincipal(
      AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public UpdateStorageCredential setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateStorageCredential setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public UpdateStorageCredential setGcpServiceAccountKey(
      GcpServiceAccountKey gcpServiceAccountKey) {
    this.gcpServiceAccountKey = gcpServiceAccountKey;
    return this;
  }

  public GcpServiceAccountKey getGcpServiceAccountKey() {
    return gcpServiceAccountKey;
  }

  public UpdateStorageCredential setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateStorageCredential setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateStorageCredential setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public UpdateStorageCredential setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
    return this;
  }

  public Boolean getSkipValidation() {
    return skipValidation;
  }
}
