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
@JsonSerialize(using = AppResourceUcSecurable.AppResourceUcSecurableSerializer.class)
@JsonDeserialize(using = AppResourceUcSecurable.AppResourceUcSecurableDeserializer.class)
public class AppResourceUcSecurable {
  /** */
  private AppResourceUcSecurableUcSecurablePermission permission;

  /** */
  private String securableFullName;

  /** */
  private AppResourceUcSecurableUcSecurableType securableType;

  public AppResourceUcSecurable setPermission(
      AppResourceUcSecurableUcSecurablePermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceUcSecurableUcSecurablePermission getPermission() {
    return permission;
  }

  public AppResourceUcSecurable setSecurableFullName(String securableFullName) {
    this.securableFullName = securableFullName;
    return this;
  }

  public String getSecurableFullName() {
    return securableFullName;
  }

  public AppResourceUcSecurable setSecurableType(
      AppResourceUcSecurableUcSecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public AppResourceUcSecurableUcSecurableType getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceUcSecurable that = (AppResourceUcSecurable) o;
    return Objects.equals(permission, that.permission)
        && Objects.equals(securableFullName, that.securableFullName)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, securableFullName, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceUcSecurable.class)
        .add("permission", permission)
        .add("securableFullName", securableFullName)
        .add("securableType", securableType)
        .toString();
  }

  AppResourceUcSecurablePb toPb() {
    AppResourceUcSecurablePb pb = new AppResourceUcSecurablePb();
    pb.setPermission(permission);
    pb.setSecurableFullName(securableFullName);
    pb.setSecurableType(securableType);

    return pb;
  }

  static AppResourceUcSecurable fromPb(AppResourceUcSecurablePb pb) {
    AppResourceUcSecurable model = new AppResourceUcSecurable();
    model.setPermission(pb.getPermission());
    model.setSecurableFullName(pb.getSecurableFullName());
    model.setSecurableType(pb.getSecurableType());

    return model;
  }

  public static class AppResourceUcSecurableSerializer
      extends JsonSerializer<AppResourceUcSecurable> {
    @Override
    public void serialize(
        AppResourceUcSecurable value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AppResourceUcSecurablePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AppResourceUcSecurableDeserializer
      extends JsonDeserializer<AppResourceUcSecurable> {
    @Override
    public AppResourceUcSecurable deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AppResourceUcSecurablePb pb = mapper.readValue(p, AppResourceUcSecurablePb.class);
      return AppResourceUcSecurable.fromPb(pb);
    }
  }
}
