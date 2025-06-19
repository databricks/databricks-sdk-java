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

/** Delete a storage credential */
@Generated
@JsonSerialize(
    using =
        DeleteAccountStorageCredentialRequest.DeleteAccountStorageCredentialRequestSerializer.class)
@JsonDeserialize(
    using =
        DeleteAccountStorageCredentialRequest.DeleteAccountStorageCredentialRequestDeserializer
            .class)
public class DeleteAccountStorageCredentialRequest {
  /** Force deletion even if the Storage Credential is not empty. Default is false. */
  private Boolean force;

  /** Unity Catalog metastore ID */
  private String metastoreId;

  /** Name of the storage credential. */
  private String storageCredentialName;

  public DeleteAccountStorageCredentialRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteAccountStorageCredentialRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public DeleteAccountStorageCredentialRequest setStorageCredentialName(
      String storageCredentialName) {
    this.storageCredentialName = storageCredentialName;
    return this;
  }

  public String getStorageCredentialName() {
    return storageCredentialName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteAccountStorageCredentialRequest that = (DeleteAccountStorageCredentialRequest) o;
    return Objects.equals(force, that.force)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(storageCredentialName, that.storageCredentialName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, metastoreId, storageCredentialName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAccountStorageCredentialRequest.class)
        .add("force", force)
        .add("metastoreId", metastoreId)
        .add("storageCredentialName", storageCredentialName)
        .toString();
  }

  DeleteAccountStorageCredentialRequestPb toPb() {
    DeleteAccountStorageCredentialRequestPb pb = new DeleteAccountStorageCredentialRequestPb();
    pb.setForce(force);
    pb.setMetastoreId(metastoreId);
    pb.setStorageCredentialName(storageCredentialName);

    return pb;
  }

  static DeleteAccountStorageCredentialRequest fromPb(DeleteAccountStorageCredentialRequestPb pb) {
    DeleteAccountStorageCredentialRequest model = new DeleteAccountStorageCredentialRequest();
    model.setForce(pb.getForce());
    model.setMetastoreId(pb.getMetastoreId());
    model.setStorageCredentialName(pb.getStorageCredentialName());

    return model;
  }

  public static class DeleteAccountStorageCredentialRequestSerializer
      extends JsonSerializer<DeleteAccountStorageCredentialRequest> {
    @Override
    public void serialize(
        DeleteAccountStorageCredentialRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteAccountStorageCredentialRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAccountStorageCredentialRequestDeserializer
      extends JsonDeserializer<DeleteAccountStorageCredentialRequest> {
    @Override
    public DeleteAccountStorageCredentialRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAccountStorageCredentialRequestPb pb =
          mapper.readValue(p, DeleteAccountStorageCredentialRequestPb.class);
      return DeleteAccountStorageCredentialRequest.fromPb(pb);
    }
  }
}
