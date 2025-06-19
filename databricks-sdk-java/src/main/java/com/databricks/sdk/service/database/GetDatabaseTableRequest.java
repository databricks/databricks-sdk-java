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

/** Get a Database Table */
@Generated
@JsonSerialize(using = GetDatabaseTableRequest.GetDatabaseTableRequestSerializer.class)
@JsonDeserialize(using = GetDatabaseTableRequest.GetDatabaseTableRequestDeserializer.class)
public class GetDatabaseTableRequest {
  /** */
  private String name;

  public GetDatabaseTableRequest setName(String name) {
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
    GetDatabaseTableRequest that = (GetDatabaseTableRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDatabaseTableRequest.class).add("name", name).toString();
  }

  GetDatabaseTableRequestPb toPb() {
    GetDatabaseTableRequestPb pb = new GetDatabaseTableRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetDatabaseTableRequest fromPb(GetDatabaseTableRequestPb pb) {
    GetDatabaseTableRequest model = new GetDatabaseTableRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetDatabaseTableRequestSerializer
      extends JsonSerializer<GetDatabaseTableRequest> {
    @Override
    public void serialize(
        GetDatabaseTableRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetDatabaseTableRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetDatabaseTableRequestDeserializer
      extends JsonDeserializer<GetDatabaseTableRequest> {
    @Override
    public GetDatabaseTableRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetDatabaseTableRequestPb pb = mapper.readValue(p, GetDatabaseTableRequestPb.class);
      return GetDatabaseTableRequest.fromPb(pb);
    }
  }
}
