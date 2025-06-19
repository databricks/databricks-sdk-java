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

/** Get boolean reflecting if table exists */
@Generated
@JsonSerialize(using = ExistsRequest.ExistsRequestSerializer.class)
@JsonDeserialize(using = ExistsRequest.ExistsRequestDeserializer.class)
public class ExistsRequest {
  /** Full name of the table. */
  private String fullName;

  public ExistsRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExistsRequest that = (ExistsRequest) o;
    return Objects.equals(fullName, that.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName);
  }

  @Override
  public String toString() {
    return new ToStringer(ExistsRequest.class).add("fullName", fullName).toString();
  }

  ExistsRequestPb toPb() {
    ExistsRequestPb pb = new ExistsRequestPb();
    pb.setFullName(fullName);

    return pb;
  }

  static ExistsRequest fromPb(ExistsRequestPb pb) {
    ExistsRequest model = new ExistsRequest();
    model.setFullName(pb.getFullName());

    return model;
  }

  public static class ExistsRequestSerializer extends JsonSerializer<ExistsRequest> {
    @Override
    public void serialize(ExistsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExistsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExistsRequestDeserializer extends JsonDeserializer<ExistsRequest> {
    @Override
    public ExistsRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExistsRequestPb pb = mapper.readValue(p, ExistsRequestPb.class);
      return ExistsRequest.fromPb(pb);
    }
  }
}
