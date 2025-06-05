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
@JsonSerialize(using = UpdateClusterResponse.UpdateClusterResponseSerializer.class)
@JsonDeserialize(using = UpdateClusterResponse.UpdateClusterResponseDeserializer.class)
public class UpdateClusterResponse {

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
    return new ToStringer(UpdateClusterResponse.class).toString();
  }

  UpdateClusterResponsePb toPb() {
    UpdateClusterResponsePb pb = new UpdateClusterResponsePb();

    return pb;
  }

  static UpdateClusterResponse fromPb(UpdateClusterResponsePb pb) {
    UpdateClusterResponse model = new UpdateClusterResponse();

    return model;
  }

  public static class UpdateClusterResponseSerializer
      extends JsonSerializer<UpdateClusterResponse> {
    @Override
    public void serialize(
        UpdateClusterResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateClusterResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateClusterResponseDeserializer
      extends JsonDeserializer<UpdateClusterResponse> {
    @Override
    public UpdateClusterResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateClusterResponsePb pb = mapper.readValue(p, UpdateClusterResponsePb.class);
      return UpdateClusterResponse.fromPb(pb);
    }
  }
}
