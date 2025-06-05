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

/** Gets the named storage credential */
@Generated
@JsonSerialize(
    using = GetAccountStorageCredentialRequest.GetAccountStorageCredentialRequestSerializer.class)
@JsonDeserialize(
    using = GetAccountStorageCredentialRequest.GetAccountStorageCredentialRequestDeserializer.class)
public class GetAccountStorageCredentialRequest {
  /** Unity Catalog metastore ID */
  private String metastoreId;

  /** Name of the storage credential. */
  private String storageCredentialName;

  public GetAccountStorageCredentialRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public GetAccountStorageCredentialRequest setStorageCredentialName(String storageCredentialName) {
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
    GetAccountStorageCredentialRequest that = (GetAccountStorageCredentialRequest) o;
    return Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(storageCredentialName, that.storageCredentialName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId, storageCredentialName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAccountStorageCredentialRequest.class)
        .add("metastoreId", metastoreId)
        .add("storageCredentialName", storageCredentialName)
        .toString();
  }

  GetAccountStorageCredentialRequestPb toPb() {
    GetAccountStorageCredentialRequestPb pb = new GetAccountStorageCredentialRequestPb();
    pb.setMetastoreId(metastoreId);
    pb.setStorageCredentialName(storageCredentialName);

    return pb;
  }

  static GetAccountStorageCredentialRequest fromPb(GetAccountStorageCredentialRequestPb pb) {
    GetAccountStorageCredentialRequest model = new GetAccountStorageCredentialRequest();
    model.setMetastoreId(pb.getMetastoreId());
    model.setStorageCredentialName(pb.getStorageCredentialName());

    return model;
  }

  public static class GetAccountStorageCredentialRequestSerializer
      extends JsonSerializer<GetAccountStorageCredentialRequest> {
    @Override
    public void serialize(
        GetAccountStorageCredentialRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAccountStorageCredentialRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAccountStorageCredentialRequestDeserializer
      extends JsonDeserializer<GetAccountStorageCredentialRequest> {
    @Override
    public GetAccountStorageCredentialRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAccountStorageCredentialRequestPb pb =
          mapper.readValue(p, GetAccountStorageCredentialRequestPb.class);
      return GetAccountStorageCredentialRequest.fromPb(pb);
    }
  }
}
