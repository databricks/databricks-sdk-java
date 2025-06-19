// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
@JsonSerialize(using = PermissionOutput.PermissionOutputSerializer.class)
@JsonDeserialize(using = PermissionOutput.PermissionOutputDeserializer.class)
public class PermissionOutput {
  /** The results of a permissions query. */
  private String description;

  /** */
  private WorkspacePermission permissionLevel;

  public PermissionOutput setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public PermissionOutput setPermissionLevel(WorkspacePermission permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public WorkspacePermission getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionOutput that = (PermissionOutput) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionOutput.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  PermissionOutputPb toPb() {
    PermissionOutputPb pb = new PermissionOutputPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static PermissionOutput fromPb(PermissionOutputPb pb) {
    PermissionOutput model = new PermissionOutput();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class PermissionOutputSerializer extends JsonSerializer<PermissionOutput> {
    @Override
    public void serialize(PermissionOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PermissionOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PermissionOutputDeserializer extends JsonDeserializer<PermissionOutput> {
    @Override
    public PermissionOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PermissionOutputPb pb = mapper.readValue(p, PermissionOutputPb.class);
      return PermissionOutput.fromPb(pb);
    }
  }
}
