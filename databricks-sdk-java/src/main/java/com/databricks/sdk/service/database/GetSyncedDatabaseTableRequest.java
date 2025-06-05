// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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

/** Get a Synced Database Table */
@Generated
@JsonSerialize(using = GetSyncedDatabaseTableRequest.GetSyncedDatabaseTableRequestSerializer.class)
@JsonDeserialize(
    using = GetSyncedDatabaseTableRequest.GetSyncedDatabaseTableRequestDeserializer.class)
public class GetSyncedDatabaseTableRequest {
  /** */
  private String name;

  public GetSyncedDatabaseTableRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSyncedDatabaseTableRequest that = (GetSyncedDatabaseTableRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSyncedDatabaseTableRequest.class).add("name", name).toString();
  }

  GetSyncedDatabaseTableRequestPb toPb() {
    GetSyncedDatabaseTableRequestPb pb = new GetSyncedDatabaseTableRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetSyncedDatabaseTableRequest fromPb(GetSyncedDatabaseTableRequestPb pb) {
    GetSyncedDatabaseTableRequest model = new GetSyncedDatabaseTableRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetSyncedDatabaseTableRequestSerializer
      extends JsonSerializer<GetSyncedDatabaseTableRequest> {
    @Override
    public void serialize(
        GetSyncedDatabaseTableRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetSyncedDatabaseTableRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetSyncedDatabaseTableRequestDeserializer
      extends JsonDeserializer<GetSyncedDatabaseTableRequest> {
    @Override
    public GetSyncedDatabaseTableRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetSyncedDatabaseTableRequestPb pb =
          mapper.readValue(p, GetSyncedDatabaseTableRequestPb.class);
      return GetSyncedDatabaseTableRequest.fromPb(pb);
    }
  }
}
