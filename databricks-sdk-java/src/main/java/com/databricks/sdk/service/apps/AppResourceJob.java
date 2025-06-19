// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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
@JsonSerialize(using = AppResourceJob.AppResourceJobSerializer.class)
@JsonDeserialize(using = AppResourceJob.AppResourceJobDeserializer.class)
public class AppResourceJob {
  /** Id of the job to grant permission on. */
  private String id;

  /**
   * Permissions to grant on the Job. Supported permissions are: "CAN_MANAGE", "IS_OWNER",
   * "CAN_MANAGE_RUN", "CAN_VIEW".
   */
  private AppResourceJobJobPermission permission;

  public AppResourceJob setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public AppResourceJob setPermission(AppResourceJobJobPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceJobJobPermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceJob that = (AppResourceJob) o;
    return Objects.equals(id, that.id) && Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceJob.class)
        .add("id", id)
        .add("permission", permission)
        .toString();
  }

  AppResourceJobPb toPb() {
    AppResourceJobPb pb = new AppResourceJobPb();
    pb.setId(id);
    pb.setPermission(permission);

    return pb;
  }

  static AppResourceJob fromPb(AppResourceJobPb pb) {
    AppResourceJob model = new AppResourceJob();
    model.setId(pb.getId());
    model.setPermission(pb.getPermission());

    return model;
  }

  public static class AppResourceJobSerializer extends JsonSerializer<AppResourceJob> {
    @Override
    public void serialize(AppResourceJob value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AppResourceJobPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AppResourceJobDeserializer extends JsonDeserializer<AppResourceJob> {
    @Override
    public AppResourceJob deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AppResourceJobPb pb = mapper.readValue(p, AppResourceJobPb.class);
      return AppResourceJob.fromPb(pb);
    }
  }
}
