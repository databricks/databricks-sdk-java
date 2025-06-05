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

/** Get app permissions */
@Generated
@JsonSerialize(using = GetAppPermissionsRequest.GetAppPermissionsRequestSerializer.class)
@JsonDeserialize(using = GetAppPermissionsRequest.GetAppPermissionsRequestDeserializer.class)
public class GetAppPermissionsRequest {
  /** The app for which to get or manage permissions. */
  private String appName;

  public GetAppPermissionsRequest setAppName(String appName) {
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
    GetAppPermissionsRequest that = (GetAppPermissionsRequest) o;
    return Objects.equals(appName, that.appName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAppPermissionsRequest.class).add("appName", appName).toString();
  }

  GetAppPermissionsRequestPb toPb() {
    GetAppPermissionsRequestPb pb = new GetAppPermissionsRequestPb();
    pb.setAppName(appName);

    return pb;
  }

  static GetAppPermissionsRequest fromPb(GetAppPermissionsRequestPb pb) {
    GetAppPermissionsRequest model = new GetAppPermissionsRequest();
    model.setAppName(pb.getAppName());

    return model;
  }

  public static class GetAppPermissionsRequestSerializer
      extends JsonSerializer<GetAppPermissionsRequest> {
    @Override
    public void serialize(
        GetAppPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAppPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAppPermissionsRequestDeserializer
      extends JsonDeserializer<GetAppPermissionsRequest> {
    @Override
    public GetAppPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAppPermissionsRequestPb pb = mapper.readValue(p, GetAppPermissionsRequestPb.class);
      return GetAppPermissionsRequest.fromPb(pb);
    }
  }
}
