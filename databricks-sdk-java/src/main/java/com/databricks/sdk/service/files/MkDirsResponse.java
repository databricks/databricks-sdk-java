// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

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
@JsonSerialize(using = MkDirsResponse.MkDirsResponseSerializer.class)
@JsonDeserialize(using = MkDirsResponse.MkDirsResponseDeserializer.class)
public class MkDirsResponse {

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
    return new ToStringer(MkDirsResponse.class).toString();
  }

  MkDirsResponsePb toPb() {
    MkDirsResponsePb pb = new MkDirsResponsePb();

    return pb;
  }

  static MkDirsResponse fromPb(MkDirsResponsePb pb) {
    MkDirsResponse model = new MkDirsResponse();

    return model;
  }

  public static class MkDirsResponseSerializer extends JsonSerializer<MkDirsResponse> {
    @Override
    public void serialize(MkDirsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MkDirsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MkDirsResponseDeserializer extends JsonDeserializer<MkDirsResponse> {
    @Override
    public MkDirsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MkDirsResponsePb pb = mapper.readValue(p, MkDirsResponsePb.class);
      return MkDirsResponse.fromPb(pb);
    }
  }
}
