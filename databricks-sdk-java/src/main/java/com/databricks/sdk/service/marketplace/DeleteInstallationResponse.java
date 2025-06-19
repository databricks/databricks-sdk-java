// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = DeleteInstallationResponse.DeleteInstallationResponseSerializer.class)
@JsonDeserialize(using = DeleteInstallationResponse.DeleteInstallationResponseDeserializer.class)
public class DeleteInstallationResponse {

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
    return new ToStringer(DeleteInstallationResponse.class).toString();
  }

  DeleteInstallationResponsePb toPb() {
    DeleteInstallationResponsePb pb = new DeleteInstallationResponsePb();

    return pb;
  }

  static DeleteInstallationResponse fromPb(DeleteInstallationResponsePb pb) {
    DeleteInstallationResponse model = new DeleteInstallationResponse();

    return model;
  }

  public static class DeleteInstallationResponseSerializer
      extends JsonSerializer<DeleteInstallationResponse> {
    @Override
    public void serialize(
        DeleteInstallationResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteInstallationResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteInstallationResponseDeserializer
      extends JsonDeserializer<DeleteInstallationResponse> {
    @Override
    public DeleteInstallationResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteInstallationResponsePb pb = mapper.readValue(p, DeleteInstallationResponsePb.class);
      return DeleteInstallationResponse.fromPb(pb);
    }
  }
}
