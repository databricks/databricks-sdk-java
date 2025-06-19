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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = AppPermissionsRequest.AppPermissionsRequestSerializer.class)
@JsonDeserialize(using = AppPermissionsRequest.AppPermissionsRequestDeserializer.class)
public class AppPermissionsRequest {
  /** */
  private Collection<AppAccessControlRequest> accessControlList;

  /** The app for which to get or manage permissions. */
  private String appName;

  public AppPermissionsRequest setAccessControlList(
      Collection<AppAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<AppAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public AppPermissionsRequest setAppName(String appName) {
    this.appName = appName;
    return this;
  }

  public String getAppName() {
    return appName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppPermissionsRequest that = (AppPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(appName, that.appName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, appName);
  }

  @Override
  public String toString() {
    return new ToStringer(AppPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("appName", appName)
        .toString();
  }

  AppPermissionsRequestPb toPb() {
    AppPermissionsRequestPb pb = new AppPermissionsRequestPb();
    pb.setAccessControlList(accessControlList);
    pb.setAppName(appName);

    return pb;
  }

  static AppPermissionsRequest fromPb(AppPermissionsRequestPb pb) {
    AppPermissionsRequest model = new AppPermissionsRequest();
    model.setAccessControlList(pb.getAccessControlList());
    model.setAppName(pb.getAppName());

    return model;
  }

  public static class AppPermissionsRequestSerializer
      extends JsonSerializer<AppPermissionsRequest> {
    @Override
    public void serialize(
        AppPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AppPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AppPermissionsRequestDeserializer
      extends JsonDeserializer<AppPermissionsRequest> {
    @Override
    public AppPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AppPermissionsRequestPb pb = mapper.readValue(p, AppPermissionsRequestPb.class);
      return AppPermissionsRequest.fromPb(pb);
    }
  }
}
