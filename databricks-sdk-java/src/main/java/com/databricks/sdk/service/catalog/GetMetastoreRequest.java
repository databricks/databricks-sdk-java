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

/** Get a metastore */
@Generated
@JsonSerialize(using = GetMetastoreRequest.GetMetastoreRequestSerializer.class)
@JsonDeserialize(using = GetMetastoreRequest.GetMetastoreRequestDeserializer.class)
public class GetMetastoreRequest {
  /** Unique ID of the metastore. */
  private String id;

  public GetMetastoreRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetMetastoreRequest that = (GetMetastoreRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetMetastoreRequest.class).add("id", id).toString();
  }

  GetMetastoreRequestPb toPb() {
    GetMetastoreRequestPb pb = new GetMetastoreRequestPb();
    pb.setId(id);

    return pb;
  }

  static GetMetastoreRequest fromPb(GetMetastoreRequestPb pb) {
    GetMetastoreRequest model = new GetMetastoreRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class GetMetastoreRequestSerializer extends JsonSerializer<GetMetastoreRequest> {
    @Override
    public void serialize(GetMetastoreRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetMetastoreRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetMetastoreRequestDeserializer
      extends JsonDeserializer<GetMetastoreRequest> {
    @Override
    public GetMetastoreRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetMetastoreRequestPb pb = mapper.readValue(p, GetMetastoreRequestPb.class);
      return GetMetastoreRequest.fromPb(pb);
    }
  }
}
