// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(using = SyncIndexResponse.SyncIndexResponseSerializer.class)
@JsonDeserialize(using = SyncIndexResponse.SyncIndexResponseDeserializer.class)
public class SyncIndexResponse {

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
    return new ToStringer(SyncIndexResponse.class).toString();
  }

  SyncIndexResponsePb toPb() {
    SyncIndexResponsePb pb = new SyncIndexResponsePb();

    return pb;
  }

  static SyncIndexResponse fromPb(SyncIndexResponsePb pb) {
    SyncIndexResponse model = new SyncIndexResponse();

    return model;
  }

  public static class SyncIndexResponseSerializer extends JsonSerializer<SyncIndexResponse> {
    @Override
    public void serialize(SyncIndexResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SyncIndexResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SyncIndexResponseDeserializer extends JsonDeserializer<SyncIndexResponse> {
    @Override
    public SyncIndexResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SyncIndexResponsePb pb = mapper.readValue(p, SyncIndexResponsePb.class);
      return SyncIndexResponse.fromPb(pb);
    }
  }
}
