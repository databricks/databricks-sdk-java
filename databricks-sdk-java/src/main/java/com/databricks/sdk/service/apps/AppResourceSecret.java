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
@JsonSerialize(using = AppResourceSecret.AppResourceSecretSerializer.class)
@JsonDeserialize(using = AppResourceSecret.AppResourceSecretDeserializer.class)
public class AppResourceSecret {
  /** Key of the secret to grant permission on. */
  private String key;

  /**
   * Permission to grant on the secret scope. For secrets, only one permission is allowed.
   * Permission must be one of: "READ", "WRITE", "MANAGE".
   */
  private AppResourceSecretSecretPermission permission;

  /** Scope of the secret to grant permission on. */
  private String scope;

  public AppResourceSecret setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public AppResourceSecret setPermission(AppResourceSecretSecretPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceSecretSecretPermission getPermission() {
    return permission;
  }

  public AppResourceSecret setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceSecret that = (AppResourceSecret) o;
    return Objects.equals(key, that.key)
        && Objects.equals(permission, that.permission)
        && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, permission, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceSecret.class)
        .add("key", key)
        .add("permission", permission)
        .add("scope", scope)
        .toString();
  }

  AppResourceSecretPb toPb() {
    AppResourceSecretPb pb = new AppResourceSecretPb();
    pb.setKey(key);
    pb.setPermission(permission);
    pb.setScope(scope);

    return pb;
  }

  static AppResourceSecret fromPb(AppResourceSecretPb pb) {
    AppResourceSecret model = new AppResourceSecret();
    model.setKey(pb.getKey());
    model.setPermission(pb.getPermission());
    model.setScope(pb.getScope());

    return model;
  }

  public static class AppResourceSecretSerializer extends JsonSerializer<AppResourceSecret> {
    @Override
    public void serialize(AppResourceSecret value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AppResourceSecretPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AppResourceSecretDeserializer extends JsonDeserializer<AppResourceSecret> {
    @Override
    public AppResourceSecret deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AppResourceSecretPb pb = mapper.readValue(p, AppResourceSecretPb.class);
      return AppResourceSecret.fromPb(pb);
    }
  }
}
