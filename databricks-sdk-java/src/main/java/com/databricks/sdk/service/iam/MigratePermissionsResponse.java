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
@JsonSerialize(using = MigratePermissionsResponse.MigratePermissionsResponseSerializer.class)
@JsonDeserialize(using = MigratePermissionsResponse.MigratePermissionsResponseDeserializer.class)
public class MigratePermissionsResponse {
  /** Number of permissions migrated. */
  private Long permissionsMigrated;

  public MigratePermissionsResponse setPermissionsMigrated(Long permissionsMigrated) {
    this.permissionsMigrated = permissionsMigrated;
    return this;
  }

  public Long getPermissionsMigrated() {
    return permissionsMigrated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MigratePermissionsResponse that = (MigratePermissionsResponse) o;
    return Objects.equals(permissionsMigrated, that.permissionsMigrated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionsMigrated);
  }

  @Override
  public String toString() {
    return new ToStringer(MigratePermissionsResponse.class)
        .add("permissionsMigrated", permissionsMigrated)
        .toString();
  }

  MigratePermissionsResponsePb toPb() {
    MigratePermissionsResponsePb pb = new MigratePermissionsResponsePb();
    pb.setPermissionsMigrated(permissionsMigrated);

    return pb;
  }

  static MigratePermissionsResponse fromPb(MigratePermissionsResponsePb pb) {
    MigratePermissionsResponse model = new MigratePermissionsResponse();
    model.setPermissionsMigrated(pb.getPermissionsMigrated());

    return model;
  }

  public static class MigratePermissionsResponseSerializer
      extends JsonSerializer<MigratePermissionsResponse> {
    @Override
    public void serialize(
        MigratePermissionsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MigratePermissionsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MigratePermissionsResponseDeserializer
      extends JsonDeserializer<MigratePermissionsResponse> {
    @Override
    public MigratePermissionsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MigratePermissionsResponsePb pb = mapper.readValue(p, MigratePermissionsResponsePb.class);
      return MigratePermissionsResponse.fromPb(pb);
    }
  }
}
