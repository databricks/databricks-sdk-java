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
    using = GetCatalogWorkspaceBindingsResponse.GetCatalogWorkspaceBindingsResponseSerializer.class)
@JsonDeserialize(
    using =
        GetCatalogWorkspaceBindingsResponse.GetCatalogWorkspaceBindingsResponseDeserializer.class)
public class GetCatalogWorkspaceBindingsResponse {
  /** A list of workspace IDs */
  private Collection<Long> workspaces;

  public GetCatalogWorkspaceBindingsResponse setWorkspaces(Collection<Long> workspaces) {
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
    GetCatalogWorkspaceBindingsResponse that = (GetCatalogWorkspaceBindingsResponse) o;
    return Objects.equals(workspaces, that.workspaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaces);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCatalogWorkspaceBindingsResponse.class)
        .add("workspaces", workspaces)
        .toString();
  }

  GetCatalogWorkspaceBindingsResponsePb toPb() {
    GetCatalogWorkspaceBindingsResponsePb pb = new GetCatalogWorkspaceBindingsResponsePb();
    pb.setWorkspaces(workspaces);

    return pb;
  }

  static GetCatalogWorkspaceBindingsResponse fromPb(GetCatalogWorkspaceBindingsResponsePb pb) {
    GetCatalogWorkspaceBindingsResponse model = new GetCatalogWorkspaceBindingsResponse();
    model.setWorkspaces(pb.getWorkspaces());

    return model;
  }

  public static class GetCatalogWorkspaceBindingsResponseSerializer
      extends JsonSerializer<GetCatalogWorkspaceBindingsResponse> {
    @Override
    public void serialize(
        GetCatalogWorkspaceBindingsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetCatalogWorkspaceBindingsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetCatalogWorkspaceBindingsResponseDeserializer
      extends JsonDeserializer<GetCatalogWorkspaceBindingsResponse> {
    @Override
    public GetCatalogWorkspaceBindingsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetCatalogWorkspaceBindingsResponsePb pb =
          mapper.readValue(p, GetCatalogWorkspaceBindingsResponsePb.class);
      return GetCatalogWorkspaceBindingsResponse.fromPb(pb);
    }
  }
}
