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
@JsonSerialize(using = UpdateWorkspaceBindings.UpdateWorkspaceBindingsSerializer.class)
@JsonDeserialize(using = UpdateWorkspaceBindings.UpdateWorkspaceBindingsDeserializer.class)
public class UpdateWorkspaceBindings {
  /** A list of workspace IDs. */
  private Collection<Long> assignWorkspaces;

  /** The name of the catalog. */
  private String name;

  /** A list of workspace IDs. */
  private Collection<Long> unassignWorkspaces;

  public UpdateWorkspaceBindings setAssignWorkspaces(Collection<Long> assignWorkspaces) {
    this.assignWorkspaces = assignWorkspaces;
    return this;
  }

  public Collection<Long> getAssignWorkspaces() {
    return assignWorkspaces;
  }

  public UpdateWorkspaceBindings setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateWorkspaceBindings setUnassignWorkspaces(Collection<Long> unassignWorkspaces) {
    this.unassignWorkspaces = unassignWorkspaces;
    return this;
  }

  public Collection<Long> getUnassignWorkspaces() {
    return unassignWorkspaces;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceBindings that = (UpdateWorkspaceBindings) o;
    return Objects.equals(assignWorkspaces, that.assignWorkspaces)
        && Objects.equals(name, that.name)
        && Objects.equals(unassignWorkspaces, that.unassignWorkspaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignWorkspaces, name, unassignWorkspaces);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceBindings.class)
        .add("assignWorkspaces", assignWorkspaces)
        .add("name", name)
        .add("unassignWorkspaces", unassignWorkspaces)
        .toString();
  }

  UpdateWorkspaceBindingsPb toPb() {
    UpdateWorkspaceBindingsPb pb = new UpdateWorkspaceBindingsPb();
    pb.setAssignWorkspaces(assignWorkspaces);
    pb.setName(name);
    pb.setUnassignWorkspaces(unassignWorkspaces);

    return pb;
  }

  static UpdateWorkspaceBindings fromPb(UpdateWorkspaceBindingsPb pb) {
    UpdateWorkspaceBindings model = new UpdateWorkspaceBindings();
    model.setAssignWorkspaces(pb.getAssignWorkspaces());
    model.setName(pb.getName());
    model.setUnassignWorkspaces(pb.getUnassignWorkspaces());

    return model;
  }

  public static class UpdateWorkspaceBindingsSerializer
      extends JsonSerializer<UpdateWorkspaceBindings> {
    @Override
    public void serialize(
        UpdateWorkspaceBindings value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateWorkspaceBindingsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateWorkspaceBindingsDeserializer
      extends JsonDeserializer<UpdateWorkspaceBindings> {
    @Override
    public UpdateWorkspaceBindings deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateWorkspaceBindingsPb pb = mapper.readValue(p, UpdateWorkspaceBindingsPb.class);
      return UpdateWorkspaceBindings.fromPb(pb);
    }
  }
}
