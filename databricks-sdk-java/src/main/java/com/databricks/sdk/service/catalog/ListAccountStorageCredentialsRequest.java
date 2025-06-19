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

/** Get all storage credentials assigned to a metastore */
@Generated
@JsonSerialize(
    using =
        ListAccountStorageCredentialsRequest.ListAccountStorageCredentialsRequestSerializer.class)
@JsonDeserialize(
    using =
        ListAccountStorageCredentialsRequest.ListAccountStorageCredentialsRequestDeserializer.class)
public class ListAccountStorageCredentialsRequest {
  /** Unity Catalog metastore ID */
  private String metastoreId;

  public ListAccountStorageCredentialsRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAccountStorageCredentialsRequest that = (ListAccountStorageCredentialsRequest) o;
    return Objects.equals(metastoreId, that.metastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAccountStorageCredentialsRequest.class)
        .add("metastoreId", metastoreId)
        .toString();
  }

  ListAccountStorageCredentialsRequestPb toPb() {
    ListAccountStorageCredentialsRequestPb pb = new ListAccountStorageCredentialsRequestPb();
    pb.setMetastoreId(metastoreId);

    return pb;
  }

  static ListAccountStorageCredentialsRequest fromPb(ListAccountStorageCredentialsRequestPb pb) {
    ListAccountStorageCredentialsRequest model = new ListAccountStorageCredentialsRequest();
    model.setMetastoreId(pb.getMetastoreId());

    return model;
  }

  public static class ListAccountStorageCredentialsRequestSerializer
      extends JsonSerializer<ListAccountStorageCredentialsRequest> {
    @Override
    public void serialize(
        ListAccountStorageCredentialsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAccountStorageCredentialsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAccountStorageCredentialsRequestDeserializer
      extends JsonDeserializer<ListAccountStorageCredentialsRequest> {
    @Override
    public ListAccountStorageCredentialsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAccountStorageCredentialsRequestPb pb =
          mapper.readValue(p, ListAccountStorageCredentialsRequestPb.class);
      return ListAccountStorageCredentialsRequest.fromPb(pb);
    }
  }
}
