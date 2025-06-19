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
@JsonSerialize(using = CredentialInfo.CredentialInfoSerializer.class)
@JsonDeserialize(using = CredentialInfo.CredentialInfoDeserializer.class)
public class CredentialInfo {
  /** The AWS IAM role configuration */
  private AwsIamRole awsIamRole;

  /** The Azure managed identity configuration. */
  private AzureManagedIdentity azureManagedIdentity;

  /** The Azure service principal configuration. Only applicable when purpose is **STORAGE**. */
  private AzureServicePrincipal azureServicePrincipal;

  /** Comment associated with the credential. */
  private String comment;

  /** Time at which this credential was created, in epoch milliseconds. */
  private Long createdAt;

  /** Username of credential creator. */
  private String createdBy;

  /** GCP long-lived credential. Databricks-created Google Cloud Storage service account. */
  private DatabricksGcpServiceAccount databricksGcpServiceAccount;

  /** The full name of the credential. */
  private String fullName;

  /** The unique identifier of the credential. */
  private String id;

  /**
   * Whether the current securable is accessible from all workspaces or a specific set of
   * workspaces.
   */
  private IsolationMode isolationMode;

  /** Unique identifier of the parent metastore. */
  private String metastoreId;

  /**
   * The credential name. The name must be unique among storage and service credentials within the
   * metastore.
   */
  private String name;

  /** Username of current owner of credential. */
  private String owner;

  /** Indicates the purpose of the credential. */
  private CredentialPurpose purpose;

  /**
   * Whether the credential is usable only for read operations. Only applicable when purpose is
   * **STORAGE**.
   */
  private Boolean readOnly;

  /** Time at which this credential was last modified, in epoch milliseconds. */
  private Long updatedAt;

  /** Username of user who last modified the credential. */
  private String updatedBy;

  /**
   * Whether this credential is the current metastore's root storage credential. Only applicable
   * when purpose is **STORAGE**.
   */
  private Boolean usedForManagedStorage;

  public CredentialInfo setAwsIamRole(AwsIamRole awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRole getAwsIamRole() {
    return awsIamRole;
  }

  public CredentialInfo setAzureManagedIdentity(AzureManagedIdentity azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentity getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public CredentialInfo setAzureServicePrincipal(AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public CredentialInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CredentialInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public CredentialInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public CredentialInfo setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccount databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccount getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public CredentialInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public CredentialInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CredentialInfo setIsolationMode(IsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public IsolationMode getIsolationMode() {
    return isolationMode;
  }

  public CredentialInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public CredentialInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CredentialInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public CredentialInfo setPurpose(CredentialPurpose purpose) {
    this.purpose = purpose;
    return this;
  }

  public CredentialPurpose getPurpose() {
    return purpose;
  }

  public CredentialInfo setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public CredentialInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public CredentialInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public CredentialInfo setUsedForManagedStorage(Boolean usedForManagedStorage) {
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
    CredentialInfo that = (CredentialInfo) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
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
        && Objects.equals(purpose, that.purpose)
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
        purpose,
        readOnly,
        updatedAt,
        updatedBy,
        usedForManagedStorage);
  }

  @Override
  public String toString() {
    return new ToStringer(CredentialInfo.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("azureServicePrincipal", azureServicePrincipal)
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
        .add("purpose", purpose)
        .add("readOnly", readOnly)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .add("usedForManagedStorage", usedForManagedStorage)
        .toString();
  }

  CredentialInfoPb toPb() {
    CredentialInfoPb pb = new CredentialInfoPb();
    pb.setAwsIamRole(awsIamRole);
    pb.setAzureManagedIdentity(azureManagedIdentity);
    pb.setAzureServicePrincipal(azureServicePrincipal);
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
    pb.setPurpose(purpose);
    pb.setReadOnly(readOnly);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);
    pb.setUsedForManagedStorage(usedForManagedStorage);

    return pb;
  }

  static CredentialInfo fromPb(CredentialInfoPb pb) {
    CredentialInfo model = new CredentialInfo();
    model.setAwsIamRole(pb.getAwsIamRole());
    model.setAzureManagedIdentity(pb.getAzureManagedIdentity());
    model.setAzureServicePrincipal(pb.getAzureServicePrincipal());
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
    model.setPurpose(pb.getPurpose());
    model.setReadOnly(pb.getReadOnly());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());
    model.setUsedForManagedStorage(pb.getUsedForManagedStorage());

    return model;
  }

  public static class CredentialInfoSerializer extends JsonSerializer<CredentialInfo> {
    @Override
    public void serialize(CredentialInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CredentialInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CredentialInfoDeserializer extends JsonDeserializer<CredentialInfo> {
    @Override
    public CredentialInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CredentialInfoPb pb = mapper.readValue(p, CredentialInfoPb.class);
      return CredentialInfo.fromPb(pb);
    }
  }
}
