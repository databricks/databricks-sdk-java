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

/** Delete a network connectivity configuration */
@Generated
@JsonSerialize(
    using =
        DeleteNetworkConnectivityConfigurationRequest
            .DeleteNetworkConnectivityConfigurationRequestSerializer.class)
@JsonDeserialize(
    using =
        DeleteNetworkConnectivityConfigurationRequest
            .DeleteNetworkConnectivityConfigurationRequestDeserializer.class)
public class DeleteNetworkConnectivityConfigurationRequest {
  /** Your Network Connectivity Configuration ID. */
  private String networkConnectivityConfigId;

  public DeleteNetworkConnectivityConfigurationRequest setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteNetworkConnectivityConfigurationRequest that =
        (DeleteNetworkConnectivityConfigurationRequest) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfigId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteNetworkConnectivityConfigurationRequest.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .toString();
  }

  DeleteNetworkConnectivityConfigurationRequestPb toPb() {
    DeleteNetworkConnectivityConfigurationRequestPb pb =
        new DeleteNetworkConnectivityConfigurationRequestPb();
    pb.setNetworkConnectivityConfigId(networkConnectivityConfigId);

    return pb;
  }

  static DeleteNetworkConnectivityConfigurationRequest fromPb(
      DeleteNetworkConnectivityConfigurationRequestPb pb) {
    DeleteNetworkConnectivityConfigurationRequest model =
        new DeleteNetworkConnectivityConfigurationRequest();
    model.setNetworkConnectivityConfigId(pb.getNetworkConnectivityConfigId());

    return model;
  }

  public static class DeleteNetworkConnectivityConfigurationRequestSerializer
      extends JsonSerializer<DeleteNetworkConnectivityConfigurationRequest> {
    @Override
    public void serialize(
        DeleteNetworkConnectivityConfigurationRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      DeleteNetworkConnectivityConfigurationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteNetworkConnectivityConfigurationRequestDeserializer
      extends JsonDeserializer<DeleteNetworkConnectivityConfigurationRequest> {
    @Override
    public DeleteNetworkConnectivityConfigurationRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteNetworkConnectivityConfigurationRequestPb pb =
          mapper.readValue(p, DeleteNetworkConnectivityConfigurationRequestPb.class);
      return DeleteNetworkConnectivityConfigurationRequest.fromPb(pb);
    }
  }
}
