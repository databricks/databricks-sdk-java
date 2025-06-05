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

@Generated
@JsonSerialize(
    using = SetWorkspaceWarehouseConfigResponse.SetWorkspaceWarehouseConfigResponseSerializer.class)
@JsonDeserialize(
    using =
        SetWorkspaceWarehouseConfigResponse.SetWorkspaceWarehouseConfigResponseDeserializer.class)
public class SetWorkspaceWarehouseConfigResponse {

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
    return new ToStringer(SetWorkspaceWarehouseConfigResponse.class).toString();
  }

  SetWorkspaceWarehouseConfigResponsePb toPb() {
    SetWorkspaceWarehouseConfigResponsePb pb = new SetWorkspaceWarehouseConfigResponsePb();

    return pb;
  }

  static SetWorkspaceWarehouseConfigResponse fromPb(SetWorkspaceWarehouseConfigResponsePb pb) {
    SetWorkspaceWarehouseConfigResponse model = new SetWorkspaceWarehouseConfigResponse();

    return model;
  }

  public static class SetWorkspaceWarehouseConfigResponseSerializer
      extends JsonSerializer<SetWorkspaceWarehouseConfigResponse> {
    @Override
    public void serialize(
        SetWorkspaceWarehouseConfigResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SetWorkspaceWarehouseConfigResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SetWorkspaceWarehouseConfigResponseDeserializer
      extends JsonDeserializer<SetWorkspaceWarehouseConfigResponse> {
    @Override
    public SetWorkspaceWarehouseConfigResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SetWorkspaceWarehouseConfigResponsePb pb =
          mapper.readValue(p, SetWorkspaceWarehouseConfigResponsePb.class);
      return SetWorkspaceWarehouseConfigResponse.fromPb(pb);
    }
  }
}
