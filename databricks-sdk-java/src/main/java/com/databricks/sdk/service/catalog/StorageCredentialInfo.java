// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
import java.util.Objects;

@Generated
@JsonSerialize(using = StorageCredentialInfo.StorageCredentialInfoSerializer.class)
@JsonDeserialize(using = StorageCredentialInfo.StorageCredentialInfoDeserializer.class)
public class StorageCredentialInfo {
  /** The AWS IAM role configuration. */
  private AwsIamRoleResponse awsIamRole;

  /** The Azure managed identity configuration. */
  private AzureManagedIdentityResponse azureManagedIdentity;

  /** The Azure service principal configuration. */
  private AzureServicePrincipal azureServicePrincipal;

  /** The Cloudflare API token configuration. */
  private CloudflareApiToken cloudflareApiToken;

  /** Comment associated with the credential. */
  private String comment;

  /** Time at which this Credential was created, in epoch milliseconds. */
  private Long createdAt;

  /** Username of credential creator. */
  private String createdBy;

  /** The Databricks managed GCP service account configuration. */
  private DatabricksGcpServiceAccountResponse databricksGcpServiceAccount;

  /** The full name of the credential. */
  private String fullName;

  /** The unique identifier of the credential. */
  private String id;

  /** */
  private IsolationMode isolationMode;

  /** Unique identifier of parent metastore. */
  private String metastoreId;

  /** The credential name. The name must be unique within the metastore. */
  private String name;

  /** Username of current owner of credential. */
  private String owner;

  /** Whether the storage credential is only usable for read operations. */
  private Boolean readOnly;

  /** Time at which this credential was last modified, in epoch milliseconds. */
  private Long updatedAt;

  /** Username of user who last modified the credential. */
  private String updatedBy;

  /** Whether this credential is the current metastore's root storage credential. */
  private Boolean usedForManagedStorage;

  public StorageCredentialInfo setAwsIamRole(AwsIamRoleResponse awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRoleResponse getAwsIamRole() {
    return awsIamRole;
  }

  public StorageCredentialInfo setAzureManagedIdentity(
      AzureManagedIdentityResponse azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentityResponse getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public StorageCredentialInfo setAzureServicePrincipal(
      AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public StorageCredentialInfo setCloudflareApiToken(CloudflareApiToken cloudflareApiToken) {
    this.cloudflareApiToken = cloudflareApiToken;
    return this;
  }

  public CloudflareApiToken getCloudflareApiToken() {
    return cloudflareApiToken;
  }

  public StorageCredentialInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public StorageCredentialInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public StorageCredentialInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public StorageCredentialInfo setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccountResponse databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccountResponse getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public StorageCredentialInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public StorageCredentialInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public StorageCredentialInfo setIsolationMode(IsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public IsolationMode getIsolationMode() {
    return isolationMode;
  }

  public StorageCredentialInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public StorageCredentialInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public StorageCredentialInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public StorageCredentialInfo setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public StorageCredentialInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public StorageCredentialInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public StorageCredentialInfo setUsedForManagedStorage(Boolean usedForManagedStorage) {
    this.usedForManagedStorage = usedForManagedStorage;
    return this;
  }

  public Boolean getUsedForManagedStorage() {
    return usedForManagedStorage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorageCredentialInfo that = (StorageCredentialInfo) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
        && Objects.equals(cloudflareApiToken, that.cloudflareApiToken)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(databricksGcpServiceAccount, that.databricksGcpServiceAccount)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(id, that.id)
        && Objects.equals(isolationMode, that.isolationMode)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(usedForManagedStorage, that.usedForManagedStorage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsIamRole,
        azureManagedIdentity,
        azureServicePrincipal,
        cloudflareApiToken,
        comment,
        createdAt,
        createdBy,
        databricksGcpServiceAccount,
        fullName,
        id,
        isolationMode,
        metastoreId,
        name,
        owner,
        readOnly,
        updatedAt,
        updatedBy,
        usedForManagedStorage);
  }

  @Override
  public String toString() {
    return new ToStringer(StorageCredentialInfo.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("azureServicePrincipal", azureServicePrincipal)
        .add("cloudflareApiToken", cloudflareApiToken)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("databricksGcpServiceAccount", databricksGcpServiceAccount)
        .add("fullName", fullName)
        .add("id", id)
        .add("isolationMode", isolationMode)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("readOnly", readOnly)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .add("usedForManagedStorage", usedForManagedStorage)
        .toString();
  }

  StorageCredentialInfoPb toPb() {
    StorageCredentialInfoPb pb = new StorageCredentialInfoPb();
    pb.setAwsIamRole(awsIamRole);
    pb.setAzureManagedIdentity(azureManagedIdentity);
    pb.setAzureServicePrincipal(azureServicePrincipal);
    pb.setCloudflareApiToken(cloudflareApiToken);
    pb.setComment(comment);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setDatabricksGcpServiceAccount(databricksGcpServiceAccount);
    pb.setFullName(fullName);
    pb.setId(id);
    pb.setIsolationMode(isolationMode);
    pb.setMetastoreId(metastoreId);
    pb.setName(name);
    pb.setOwner(owner);
    pb.setReadOnly(readOnly);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);
    pb.setUsedForManagedStorage(usedForManagedStorage);

    return pb;
  }

  static StorageCredentialInfo fromPb(StorageCredentialInfoPb pb) {
    StorageCredentialInfo model = new StorageCredentialInfo();
    model.setAwsIamRole(pb.getAwsIamRole());
    model.setAzureManagedIdentity(pb.getAzureManagedIdentity());
    model.setAzureServicePrincipal(pb.getAzureServicePrincipal());
    model.setCloudflareApiToken(pb.getCloudflareApiToken());
    model.setComment(pb.getComment());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setDatabricksGcpServiceAccount(pb.getDatabricksGcpServiceAccount());
    model.setFullName(pb.getFullName());
    model.setId(pb.getId());
    model.setIsolationMode(pb.getIsolationMode());
    model.setMetastoreId(pb.getMetastoreId());
    model.setName(pb.getName());
    model.setOwner(pb.getOwner());
    model.setReadOnly(pb.getReadOnly());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());
    model.setUsedForManagedStorage(pb.getUsedForManagedStorage());

    return model;
  }

  public static class StorageCredentialInfoSerializer
      extends JsonSerializer<StorageCredentialInfo> {
    @Override
    public void serialize(
        StorageCredentialInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StorageCredentialInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StorageCredentialInfoDeserializer
      extends JsonDeserializer<StorageCredentialInfo> {
    @Override
    public StorageCredentialInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StorageCredentialInfoPb pb = mapper.readValue(p, StorageCredentialInfoPb.class);
      return StorageCredentialInfo.fromPb(pb);
    }
  }
}
