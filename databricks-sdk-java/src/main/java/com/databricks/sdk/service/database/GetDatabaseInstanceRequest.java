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

/** Get a Database Instance */
@Generated
@JsonSerialize(using = GetDatabaseInstanceRequest.GetDatabaseInstanceRequestSerializer.class)
@JsonDeserialize(using = GetDatabaseInstanceRequest.GetDatabaseInstanceRequestDeserializer.class)
public class GetDatabaseInstanceRequest {
  /** Name of the cluster to get. */
  private String name;

  public GetDatabaseInstanceRequest setName(String name) {
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
    GetDatabaseInstanceRequest that = (GetDatabaseInstanceRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDatabaseInstanceRequest.class).add("name", name).toString();
  }

  GetDatabaseInstanceRequestPb toPb() {
    GetDatabaseInstanceRequestPb pb = new GetDatabaseInstanceRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetDatabaseInstanceRequest fromPb(GetDatabaseInstanceRequestPb pb) {
    GetDatabaseInstanceRequest model = new GetDatabaseInstanceRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetDatabaseInstanceRequestSerializer
      extends JsonSerializer<GetDatabaseInstanceRequest> {
    @Override
    public void serialize(
        GetDatabaseInstanceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetDatabaseInstanceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetDatabaseInstanceRequestDeserializer
      extends JsonDeserializer<GetDatabaseInstanceRequest> {
    @Override
    public GetDatabaseInstanceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetDatabaseInstanceRequestPb pb = mapper.readValue(p, GetDatabaseInstanceRequestPb.class);
      return GetDatabaseInstanceRequest.fromPb(pb);
    }
  }
}
