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

/** Get app permission levels */
@Generated
@JsonSerialize(using = GetAppPermissionLevelsRequest.GetAppPermissionLevelsRequestSerializer.class)
@JsonDeserialize(
    using = GetAppPermissionLevelsRequest.GetAppPermissionLevelsRequestDeserializer.class)
public class GetAppPermissionLevelsRequest {
  /** The app for which to get or manage permissions. */
  private String appName;

  public GetAppPermissionLevelsRequest setAppName(String appName) {
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
    GetAppPermissionLevelsRequest that = (GetAppPermissionLevelsRequest) o;
    return Objects.equals(appName, that.appName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAppPermissionLevelsRequest.class).add("appName", appName).toString();
  }

  GetAppPermissionLevelsRequestPb toPb() {
    GetAppPermissionLevelsRequestPb pb = new GetAppPermissionLevelsRequestPb();
    pb.setAppName(appName);

    return pb;
  }

  static GetAppPermissionLevelsRequest fromPb(GetAppPermissionLevelsRequestPb pb) {
    GetAppPermissionLevelsRequest model = new GetAppPermissionLevelsRequest();
    model.setAppName(pb.getAppName());

    return model;
  }

  public static class GetAppPermissionLevelsRequestSerializer
      extends JsonSerializer<GetAppPermissionLevelsRequest> {
    @Override
    public void serialize(
        GetAppPermissionLevelsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAppPermissionLevelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAppPermissionLevelsRequestDeserializer
      extends JsonDeserializer<GetAppPermissionLevelsRequest> {
    @Override
    public GetAppPermissionLevelsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAppPermissionLevelsRequestPb pb =
          mapper.readValue(p, GetAppPermissionLevelsRequestPb.class);
      return GetAppPermissionLevelsRequest.fromPb(pb);
    }
  }
}
