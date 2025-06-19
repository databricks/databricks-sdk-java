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

/** A list of workspace IDs that are bound to the securable */
@Generated
@JsonSerialize(
    using = UpdateWorkspaceBindingsResponse.UpdateWorkspaceBindingsResponseSerializer.class)
@JsonDeserialize(
    using = UpdateWorkspaceBindingsResponse.UpdateWorkspaceBindingsResponseDeserializer.class)
public class UpdateWorkspaceBindingsResponse {
  /** List of workspace bindings. */
  private Collection<WorkspaceBinding> bindings;

  public UpdateWorkspaceBindingsResponse setBindings(Collection<WorkspaceBinding> bindings) {
    this.bindings = bindings;
    return this;
  }

  public Collection<WorkspaceBinding> getBindings() {
    return bindings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceBindingsResponse that = (UpdateWorkspaceBindingsResponse) o;
    return Objects.equals(bindings, that.bindings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindings);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceBindingsResponse.class)
        .add("bindings", bindings)
        .toString();
  }

  UpdateWorkspaceBindingsResponsePb toPb() {
    UpdateWorkspaceBindingsResponsePb pb = new UpdateWorkspaceBindingsResponsePb();
    pb.setBindings(bindings);

    return pb;
  }

  static UpdateWorkspaceBindingsResponse fromPb(UpdateWorkspaceBindingsResponsePb pb) {
    UpdateWorkspaceBindingsResponse model = new UpdateWorkspaceBindingsResponse();
    model.setBindings(pb.getBindings());

    return model;
  }

  public static class UpdateWorkspaceBindingsResponseSerializer
      extends JsonSerializer<UpdateWorkspaceBindingsResponse> {
    @Override
    public void serialize(
        UpdateWorkspaceBindingsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateWorkspaceBindingsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateWorkspaceBindingsResponseDeserializer
      extends JsonDeserializer<UpdateWorkspaceBindingsResponse> {
    @Override
    public UpdateWorkspaceBindingsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateWorkspaceBindingsResponsePb pb =
          mapper.readValue(p, UpdateWorkspaceBindingsResponsePb.class);
      return UpdateWorkspaceBindingsResponse.fromPb(pb);
    }
  }
}
