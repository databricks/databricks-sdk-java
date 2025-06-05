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
    using = UpdateWorkspaceBindingsParameters.UpdateWorkspaceBindingsParametersSerializer.class)
@JsonDeserialize(
    using = UpdateWorkspaceBindingsParameters.UpdateWorkspaceBindingsParametersDeserializer.class)
public class UpdateWorkspaceBindingsParameters {
  /** List of workspace bindings. */
  private Collection<WorkspaceBinding> add;

  /** List of workspace bindings. */
  private Collection<WorkspaceBinding> remove;

  /** The name of the securable. */
  private String securableName;

  /**
   * The type of the securable to bind to a workspace (catalog, storage_credential, credential, or
   * external_location).
   */
  private String securableType;

  public UpdateWorkspaceBindingsParameters setAdd(Collection<WorkspaceBinding> add) {
    this.add = add;
    return this;
  }

  public Collection<WorkspaceBinding> getAdd() {
    return add;
  }

  public UpdateWorkspaceBindingsParameters setRemove(Collection<WorkspaceBinding> remove) {
    this.remove = remove;
    return this;
  }

  public Collection<WorkspaceBinding> getRemove() {
    return remove;
  }

  public UpdateWorkspaceBindingsParameters setSecurableName(String securableName) {
    this.securableName = securableName;
    return this;
  }

  public String getSecurableName() {
    return securableName;
  }

  public UpdateWorkspaceBindingsParameters setSecurableType(String securableType) {
    this.securableType = securableType;
    return this;
  }

  public String getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceBindingsParameters that = (UpdateWorkspaceBindingsParameters) o;
    return Objects.equals(add, that.add)
        && Objects.equals(remove, that.remove)
        && Objects.equals(securableName, that.securableName)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, remove, securableName, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceBindingsParameters.class)
        .add("add", add)
        .add("remove", remove)
        .add("securableName", securableName)
        .add("securableType", securableType)
        .toString();
  }

  UpdateWorkspaceBindingsParametersPb toPb() {
    UpdateWorkspaceBindingsParametersPb pb = new UpdateWorkspaceBindingsParametersPb();
    pb.setAdd(add);
    pb.setRemove(remove);
    pb.setSecurableName(securableName);
    pb.setSecurableType(securableType);

    return pb;
  }

  static UpdateWorkspaceBindingsParameters fromPb(UpdateWorkspaceBindingsParametersPb pb) {
    UpdateWorkspaceBindingsParameters model = new UpdateWorkspaceBindingsParameters();
    model.setAdd(pb.getAdd());
    model.setRemove(pb.getRemove());
    model.setSecurableName(pb.getSecurableName());
    model.setSecurableType(pb.getSecurableType());

    return model;
  }

  public static class UpdateWorkspaceBindingsParametersSerializer
      extends JsonSerializer<UpdateWorkspaceBindingsParameters> {
    @Override
    public void serialize(
        UpdateWorkspaceBindingsParameters value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateWorkspaceBindingsParametersPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateWorkspaceBindingsParametersDeserializer
      extends JsonDeserializer<UpdateWorkspaceBindingsParameters> {
    @Override
    public UpdateWorkspaceBindingsParameters deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateWorkspaceBindingsParametersPb pb =
          mapper.readValue(p, UpdateWorkspaceBindingsParametersPb.class);
      return UpdateWorkspaceBindingsParameters.fromPb(pb);
    }
  }
}
