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
@JsonSerialize(using = UpdatePermissions.UpdatePermissionsSerializer.class)
@JsonDeserialize(using = UpdatePermissions.UpdatePermissionsDeserializer.class)
public class UpdatePermissions {
  /** Array of permissions change objects. */
  private Collection<PermissionsChange> changes;

  /** Full name of securable. */
  private String fullName;

  /** Type of securable. */
  private SecurableType securableType;

  public UpdatePermissions setChanges(Collection<PermissionsChange> changes) {
    this.changes = changes;
    return this;
  }

  public Collection<PermissionsChange> getChanges() {
    return changes;
  }

  public UpdatePermissions setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdatePermissions setSecurableType(SecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public SecurableType getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdatePermissions that = (UpdatePermissions) o;
    return Objects.equals(changes, that.changes)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, fullName, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePermissions.class)
        .add("changes", changes)
        .add("fullName", fullName)
        .add("securableType", securableType)
        .toString();
  }

  UpdatePermissionsPb toPb() {
    UpdatePermissionsPb pb = new UpdatePermissionsPb();
    pb.setChanges(changes);
    pb.setFullName(fullName);
    pb.setSecurableType(securableType);

    return pb;
  }

  static UpdatePermissions fromPb(UpdatePermissionsPb pb) {
    UpdatePermissions model = new UpdatePermissions();
    model.setChanges(pb.getChanges());
    model.setFullName(pb.getFullName());
    model.setSecurableType(pb.getSecurableType());

    return model;
  }

  public static class UpdatePermissionsSerializer extends JsonSerializer<UpdatePermissions> {
    @Override
    public void serialize(UpdatePermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdatePermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdatePermissionsDeserializer extends JsonDeserializer<UpdatePermissions> {
    @Override
    public UpdatePermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdatePermissionsPb pb = mapper.readValue(p, UpdatePermissionsPb.class);
      return UpdatePermissions.fromPb(pb);
    }
  }
}
