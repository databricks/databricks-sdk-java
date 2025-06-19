// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
    using =
        DeleteNetworkConnectivityConfigurationResponse
            .DeleteNetworkConnectivityConfigurationResponseSerializer.class)
@JsonDeserialize(
    using =
        DeleteNetworkConnectivityConfigurationResponse
            .DeleteNetworkConnectivityConfigurationResponseDeserializer.class)
public class DeleteNetworkConnectivityConfigurationResponse {

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
    return new ToStringer(DeleteNetworkConnectivityConfigurationResponse.class).toString();
  }

  DeleteNetworkConnectivityConfigurationResponsePb toPb() {
    DeleteNetworkConnectivityConfigurationResponsePb pb =
        new DeleteNetworkConnectivityConfigurationResponsePb();

    return pb;
  }

  static DeleteNetworkConnectivityConfigurationResponse fromPb(
      DeleteNetworkConnectivityConfigurationResponsePb pb) {
    DeleteNetworkConnectivityConfigurationResponse model =
        new DeleteNetworkConnectivityConfigurationResponse();

    return model;
  }

  public static class DeleteNetworkConnectivityConfigurationResponseSerializer
      extends JsonSerializer<DeleteNetworkConnectivityConfigurationResponse> {
    @Override
    public void serialize(
        DeleteNetworkConnectivityConfigurationResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      DeleteNetworkConnectivityConfigurationResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteNetworkConnectivityConfigurationResponseDeserializer
      extends JsonDeserializer<DeleteNetworkConnectivityConfigurationResponse> {
    @Override
    public DeleteNetworkConnectivityConfigurationResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteNetworkConnectivityConfigurationResponsePb pb =
          mapper.readValue(p, DeleteNetworkConnectivityConfigurationResponsePb.class);
      return DeleteNetworkConnectivityConfigurationResponse.fromPb(pb);
    }
  }
}
