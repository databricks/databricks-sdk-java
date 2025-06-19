// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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
    using = DeleteCustomAppIntegrationOutput.DeleteCustomAppIntegrationOutputSerializer.class)
@JsonDeserialize(
    using = DeleteCustomAppIntegrationOutput.DeleteCustomAppIntegrationOutputDeserializer.class)
public class DeleteCustomAppIntegrationOutput {

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
    return new ToStringer(DeleteCustomAppIntegrationOutput.class).toString();
  }

  DeleteCustomAppIntegrationOutputPb toPb() {
    DeleteCustomAppIntegrationOutputPb pb = new DeleteCustomAppIntegrationOutputPb();

    return pb;
  }

  static DeleteCustomAppIntegrationOutput fromPb(DeleteCustomAppIntegrationOutputPb pb) {
    DeleteCustomAppIntegrationOutput model = new DeleteCustomAppIntegrationOutput();

    return model;
  }

  public static class DeleteCustomAppIntegrationOutputSerializer
      extends JsonSerializer<DeleteCustomAppIntegrationOutput> {
    @Override
    public void serialize(
        DeleteCustomAppIntegrationOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteCustomAppIntegrationOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteCustomAppIntegrationOutputDeserializer
      extends JsonDeserializer<DeleteCustomAppIntegrationOutput> {
    @Override
    public DeleteCustomAppIntegrationOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteCustomAppIntegrationOutputPb pb =
          mapper.readValue(p, DeleteCustomAppIntegrationOutputPb.class);
      return DeleteCustomAppIntegrationOutput.fromPb(pb);
    }
  }
}
