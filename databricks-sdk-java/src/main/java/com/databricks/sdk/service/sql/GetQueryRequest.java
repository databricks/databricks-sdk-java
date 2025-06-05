// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

/** Get a query */
@Generated
@JsonSerialize(using = GetQueryRequest.GetQueryRequestSerializer.class)
@JsonDeserialize(using = GetQueryRequest.GetQueryRequestDeserializer.class)
public class GetQueryRequest {
  /** */
  private String id;

  public GetQueryRequest setId(String id) {
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
    GetQueryRequest that = (GetQueryRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetQueryRequest.class).add("id", id).toString();
  }

  GetQueryRequestPb toPb() {
    GetQueryRequestPb pb = new GetQueryRequestPb();
    pb.setId(id);

    return pb;
  }

  static GetQueryRequest fromPb(GetQueryRequestPb pb) {
    GetQueryRequest model = new GetQueryRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class GetQueryRequestSerializer extends JsonSerializer<GetQueryRequest> {
    @Override
    public void serialize(GetQueryRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetQueryRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetQueryRequestDeserializer extends JsonDeserializer<GetQueryRequest> {
    @Override
    public GetQueryRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetQueryRequestPb pb = mapper.readValue(p, GetQueryRequestPb.class);
      return GetQueryRequest.fromPb(pb);
    }
  }
}
