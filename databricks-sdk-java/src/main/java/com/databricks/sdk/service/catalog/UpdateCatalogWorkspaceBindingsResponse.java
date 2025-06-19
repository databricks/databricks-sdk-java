// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using =
        UpdateCatalogWorkspaceBindingsResponse.UpdateCatalogWorkspaceBindingsResponseSerializer
            .class)
@JsonDeserialize(
    using =
        UpdateCatalogWorkspaceBindingsResponse.UpdateCatalogWorkspaceBindingsResponseDeserializer
            .class)
public class UpdateCatalogWorkspaceBindingsResponse {
  /** A list of workspace IDs */
  private Collection<Long> workspaces;

  public UpdateCatalogWorkspaceBindingsResponse setWorkspaces(Collection<Long> workspaces) {
    this.workspaces = workspaces;
    return this;
  }

  public Collection<Long> getWorkspaces() {
    return workspaces;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCatalogWorkspaceBindingsResponse that = (UpdateCatalogWorkspaceBindingsResponse) o;
    return Objects.equals(workspaces, that.workspaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaces);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCatalogWorkspaceBindingsResponse.class)
        .add("workspaces", workspaces)
        .toString();
  }

  UpdateCatalogWorkspaceBindingsResponsePb toPb() {
    UpdateCatalogWorkspaceBindingsResponsePb pb = new UpdateCatalogWorkspaceBindingsResponsePb();
    pb.setWorkspaces(workspaces);

    return pb;
  }

  static UpdateCatalogWorkspaceBindingsResponse fromPb(
      UpdateCatalogWorkspaceBindingsResponsePb pb) {
    UpdateCatalogWorkspaceBindingsResponse model = new UpdateCatalogWorkspaceBindingsResponse();
    model.setWorkspaces(pb.getWorkspaces());

    return model;
  }

  public static class UpdateCatalogWorkspaceBindingsResponseSerializer
      extends JsonSerializer<UpdateCatalogWorkspaceBindingsResponse> {
    @Override
    public void serialize(
        UpdateCatalogWorkspaceBindingsResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      UpdateCatalogWorkspaceBindingsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateCatalogWorkspaceBindingsResponseDeserializer
      extends JsonDeserializer<UpdateCatalogWorkspaceBindingsResponse> {
    @Override
    public UpdateCatalogWorkspaceBindingsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateCatalogWorkspaceBindingsResponsePb pb =
          mapper.readValue(p, UpdateCatalogWorkspaceBindingsResponsePb.class);
      return UpdateCatalogWorkspaceBindingsResponse.fromPb(pb);
    }
  }
}
