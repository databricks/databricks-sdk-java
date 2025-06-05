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
@JsonSerialize(using = UpdateMetastore.UpdateMetastoreSerializer.class)
@JsonDeserialize(using = UpdateMetastore.UpdateMetastoreDeserializer.class)
public class UpdateMetastore {
  /**
   * The organization name of a Delta Sharing entity, to be used in Databricks-to-Databricks Delta
   * Sharing as the official name.
   */
  private String deltaSharingOrganizationName;

  /** The lifetime of delta sharing recipient token in seconds. */
  private Long deltaSharingRecipientTokenLifetimeInSeconds;

  /** The scope of Delta Sharing enabled for the metastore. */
  private DeltaSharingScopeEnum deltaSharingScope;

  /** Unique ID of the metastore. */
  private String id;

  /** New name for the metastore. */
  private String newName;

  /** The owner of the metastore. */
  private String owner;

  /** Privilege model version of the metastore, of the form `major.minor` (e.g., `1.0`). */
  private String privilegeModelVersion;

  /** UUID of storage credential to access the metastore storage_root. */
  private String storageRootCredentialId;

  public UpdateMetastore setDeltaSharingOrganizationName(String deltaSharingOrganizationName) {
    this.deltaSharingOrganizationName = deltaSharingOrganizationName;
    return this;
  }

  public String getDeltaSharingOrganizationName() {
    return deltaSharingOrganizationName;
  }

  public UpdateMetastore setDeltaSharingRecipientTokenLifetimeInSeconds(
      Long deltaSharingRecipientTokenLifetimeInSeconds) {
    this.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
    return this;
  }

  public Long getDeltaSharingRecipientTokenLifetimeInSeconds() {
    return deltaSharingRecipientTokenLifetimeInSeconds;
  }

  public UpdateMetastore setDeltaSharingScope(DeltaSharingScopeEnum deltaSharingScope) {
    this.deltaSharingScope = deltaSharingScope;
    return this;
  }

  public DeltaSharingScopeEnum getDeltaSharingScope() {
    return deltaSharingScope;
  }

  public UpdateMetastore setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateMetastore setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateMetastore setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateMetastore setPrivilegeModelVersion(String privilegeModelVersion) {
    this.privilegeModelVersion = privilegeModelVersion;
    return this;
  }

  public String getPrivilegeModelVersion() {
    return privilegeModelVersion;
  }

  public UpdateMetastore setStorageRootCredentialId(String storageRootCredentialId) {
    this.storageRootCredentialId = storageRootCredentialId;
    return this;
  }

  public String getStorageRootCredentialId() {
    return storageRootCredentialId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateMetastore that = (UpdateMetastore) o;
    return Objects.equals(deltaSharingOrganizationName, that.deltaSharingOrganizationName)
        && Objects.equals(
            deltaSharingRecipientTokenLifetimeInSeconds,
            that.deltaSharingRecipientTokenLifetimeInSeconds)
        && Objects.equals(deltaSharingScope, that.deltaSharingScope)
        && Objects.equals(id, that.id)
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner)
        && Objects.equals(privilegeModelVersion, that.privilegeModelVersion)
        && Objects.equals(storageRootCredentialId, that.storageRootCredentialId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        deltaSharingOrganizationName,
        deltaSharingRecipientTokenLifetimeInSeconds,
        deltaSharingScope,
        id,
        newName,
        owner,
        privilegeModelVersion,
        storageRootCredentialId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateMetastore.class)
        .add("deltaSharingOrganizationName", deltaSharingOrganizationName)
        .add(
            "deltaSharingRecipientTokenLifetimeInSeconds",
            deltaSharingRecipientTokenLifetimeInSeconds)
        .add("deltaSharingScope", deltaSharingScope)
        .add("id", id)
        .add("newName", newName)
        .add("owner", owner)
        .add("privilegeModelVersion", privilegeModelVersion)
        .add("storageRootCredentialId", storageRootCredentialId)
        .toString();
  }

  UpdateMetastorePb toPb() {
    UpdateMetastorePb pb = new UpdateMetastorePb();
    pb.setDeltaSharingOrganizationName(deltaSharingOrganizationName);
    pb.setDeltaSharingRecipientTokenLifetimeInSeconds(deltaSharingRecipientTokenLifetimeInSeconds);
    pb.setDeltaSharingScope(deltaSharingScope);
    pb.setId(id);
    pb.setNewName(newName);
    pb.setOwner(owner);
    pb.setPrivilegeModelVersion(privilegeModelVersion);
    pb.setStorageRootCredentialId(storageRootCredentialId);

    return pb;
  }

  static UpdateMetastore fromPb(UpdateMetastorePb pb) {
    UpdateMetastore model = new UpdateMetastore();
    model.setDeltaSharingOrganizationName(pb.getDeltaSharingOrganizationName());
    model.setDeltaSharingRecipientTokenLifetimeInSeconds(
        pb.getDeltaSharingRecipientTokenLifetimeInSeconds());
    model.setDeltaSharingScope(pb.getDeltaSharingScope());
    model.setId(pb.getId());
    model.setNewName(pb.getNewName());
    model.setOwner(pb.getOwner());
    model.setPrivilegeModelVersion(pb.getPrivilegeModelVersion());
    model.setStorageRootCredentialId(pb.getStorageRootCredentialId());

    return model;
  }

  public static class UpdateMetastoreSerializer extends JsonSerializer<UpdateMetastore> {
    @Override
    public void serialize(UpdateMetastore value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateMetastorePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateMetastoreDeserializer extends JsonDeserializer<UpdateMetastore> {
    @Override
    public UpdateMetastore deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateMetastorePb pb = mapper.readValue(p, UpdateMetastorePb.class);
      return UpdateMetastore.fromPb(pb);
    }
  }
}
