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
@JsonSerialize(using = GetWorkspaceBindingsResponse.GetWorkspaceBindingsResponseSerializer.class)
@JsonDeserialize(
    using = GetWorkspaceBindingsResponse.GetWorkspaceBindingsResponseDeserializer.class)
public class GetWorkspaceBindingsResponse {
  /** List of workspace bindings */
  private Collection<WorkspaceBinding> bindings;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  public GetWorkspaceBindingsResponse setBindings(Collection<WorkspaceBinding> bindings) {
    this.bindings = bindings;
    return this;
  }

  public Collection<WorkspaceBinding> getBindings() {
    return bindings;
  }

  public GetWorkspaceBindingsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetWorkspaceBindingsResponse that = (GetWorkspaceBindingsResponse) o;
    return Objects.equals(bindings, that.bindings)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindings, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceBindingsResponse.class)
        .add("bindings", bindings)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  GetWorkspaceBindingsResponsePb toPb() {
    GetWorkspaceBindingsResponsePb pb = new GetWorkspaceBindingsResponsePb();
    pb.setBindings(bindings);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static GetWorkspaceBindingsResponse fromPb(GetWorkspaceBindingsResponsePb pb) {
    GetWorkspaceBindingsResponse model = new GetWorkspaceBindingsResponse();
    model.setBindings(pb.getBindings());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class GetWorkspaceBindingsResponseSerializer
      extends JsonSerializer<GetWorkspaceBindingsResponse> {
    @Override
    public void serialize(
        GetWorkspaceBindingsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetWorkspaceBindingsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetWorkspaceBindingsResponseDeserializer
      extends JsonDeserializer<GetWorkspaceBindingsResponse> {
    @Override
    public GetWorkspaceBindingsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetWorkspaceBindingsResponsePb pb = mapper.readValue(p, GetWorkspaceBindingsResponsePb.class);
      return GetWorkspaceBindingsResponse.fromPb(pb);
    }
  }
}
