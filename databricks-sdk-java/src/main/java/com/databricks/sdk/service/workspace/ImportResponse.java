// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = ImportResponse.ImportResponseSerializer.class)
@JsonDeserialize(using = ImportResponse.ImportResponseDeserializer.class)
public class ImportResponse {

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
    return new ToStringer(ImportResponse.class).toString();
  }

  ImportResponsePb toPb() {
    ImportResponsePb pb = new ImportResponsePb();

    return pb;
  }

  static ImportResponse fromPb(ImportResponsePb pb) {
    ImportResponse model = new ImportResponse();

    return model;
  }

  public static class ImportResponseSerializer extends JsonSerializer<ImportResponse> {
    @Override
    public void serialize(ImportResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ImportResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ImportResponseDeserializer extends JsonDeserializer<ImportResponse> {
    @Override
    public ImportResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ImportResponsePb pb = mapper.readValue(p, ImportResponsePb.class);
      return ImportResponse.fromPb(pb);
    }
  }
}
