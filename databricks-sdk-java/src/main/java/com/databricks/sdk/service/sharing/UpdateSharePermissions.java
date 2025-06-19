// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
@JsonSerialize(using = UpdateSharePermissions.UpdateSharePermissionsSerializer.class)
@JsonDeserialize(using = UpdateSharePermissions.UpdateSharePermissionsDeserializer.class)
public class UpdateSharePermissions {
  /** Array of permission changes. */
  private Collection<PermissionsChange> changes;

  /** The name of the share. */
  private String name;

  /** Optional. Whether to return the latest permissions list of the share in the response. */
  private Boolean omitPermissionsList;

  public UpdateSharePermissions setChanges(Collection<PermissionsChange> changes) {
    this.changes = changes;
    return this;
  }

  public Collection<PermissionsChange> getChanges() {
    return changes;
  }

  public UpdateSharePermissions setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateSharePermissions setOmitPermissionsList(Boolean omitPermissionsList) {
    this.omitPermissionsList = omitPermissionsList;
    return this;
  }

  public Boolean getOmitPermissionsList() {
    return omitPermissionsList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateSharePermissions that = (UpdateSharePermissions) o;
    return Objects.equals(changes, that.changes)
        && Objects.equals(name, that.name)
        && Objects.equals(omitPermissionsList, that.omitPermissionsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, name, omitPermissionsList);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSharePermissions.class)
        .add("changes", changes)
        .add("name", name)
        .add("omitPermissionsList", omitPermissionsList)
        .toString();
  }

  UpdateSharePermissionsPb toPb() {
    UpdateSharePermissionsPb pb = new UpdateSharePermissionsPb();
    pb.setChanges(changes);
    pb.setName(name);
    pb.setOmitPermissionsList(omitPermissionsList);

    return pb;
  }

  static UpdateSharePermissions fromPb(UpdateSharePermissionsPb pb) {
    UpdateSharePermissions model = new UpdateSharePermissions();
    model.setChanges(pb.getChanges());
    model.setName(pb.getName());
    model.setOmitPermissionsList(pb.getOmitPermissionsList());

    return model;
  }

  public static class UpdateSharePermissionsSerializer
      extends JsonSerializer<UpdateSharePermissions> {
    @Override
    public void serialize(
        UpdateSharePermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateSharePermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateSharePermissionsDeserializer
      extends JsonDeserializer<UpdateSharePermissions> {
    @Override
    public UpdateSharePermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateSharePermissionsPb pb = mapper.readValue(p, UpdateSharePermissionsPb.class);
      return UpdateSharePermissions.fromPb(pb);
    }
  }
}
