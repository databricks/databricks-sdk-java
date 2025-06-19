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
@JsonSerialize(
    using = DatabricksGcpServiceAccountRequest.DatabricksGcpServiceAccountRequestSerializer.class)
@JsonDeserialize(
    using = DatabricksGcpServiceAccountRequest.DatabricksGcpServiceAccountRequestDeserializer.class)
public class DatabricksGcpServiceAccountRequest {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(DatabricksGcpServiceAccountRequest.class).toString();
  }

  DatabricksGcpServiceAccountRequestPb toPb() {
    DatabricksGcpServiceAccountRequestPb pb = new DatabricksGcpServiceAccountRequestPb();

    return pb;
  }

  static DatabricksGcpServiceAccountRequest fromPb(DatabricksGcpServiceAccountRequestPb pb) {
    DatabricksGcpServiceAccountRequest model = new DatabricksGcpServiceAccountRequest();

    return model;
  }

  public static class DatabricksGcpServiceAccountRequestSerializer
      extends JsonSerializer<DatabricksGcpServiceAccountRequest> {
    @Override
    public void serialize(
        DatabricksGcpServiceAccountRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DatabricksGcpServiceAccountRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DatabricksGcpServiceAccountRequestDeserializer
      extends JsonDeserializer<DatabricksGcpServiceAccountRequest> {
    @Override
    public DatabricksGcpServiceAccountRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DatabricksGcpServiceAccountRequestPb pb =
          mapper.readValue(p, DatabricksGcpServiceAccountRequestPb.class);
      return DatabricksGcpServiceAccountRequest.fromPb(pb);
    }
  }
}
