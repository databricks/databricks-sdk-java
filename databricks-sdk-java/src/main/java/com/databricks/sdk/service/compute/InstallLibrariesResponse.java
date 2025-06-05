// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = InstallLibrariesResponse.InstallLibrariesResponseSerializer.class)
@JsonDeserialize(using = InstallLibrariesResponse.InstallLibrariesResponseDeserializer.class)
public class InstallLibrariesResponse {

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
    return new ToStringer(InstallLibrariesResponse.class).toString();
  }

  InstallLibrariesResponsePb toPb() {
    InstallLibrariesResponsePb pb = new InstallLibrariesResponsePb();

    return pb;
  }

  static InstallLibrariesResponse fromPb(InstallLibrariesResponsePb pb) {
    InstallLibrariesResponse model = new InstallLibrariesResponse();

    return model;
  }

  public static class InstallLibrariesResponseSerializer
      extends JsonSerializer<InstallLibrariesResponse> {
    @Override
    public void serialize(
        InstallLibrariesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstallLibrariesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstallLibrariesResponseDeserializer
      extends JsonDeserializer<InstallLibrariesResponse> {
    @Override
    public InstallLibrariesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstallLibrariesResponsePb pb = mapper.readValue(p, InstallLibrariesResponsePb.class);
      return InstallLibrariesResponse.fromPb(pb);
    }
  }
}
