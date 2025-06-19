// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

/** Get object ACL */
@Generated
@JsonSerialize(using = GetDbsqlPermissionRequest.GetDbsqlPermissionRequestSerializer.class)
@JsonDeserialize(using = GetDbsqlPermissionRequest.GetDbsqlPermissionRequestDeserializer.class)
public class GetDbsqlPermissionRequest {
  /** Object ID. An ACL is returned for the object with this UUID. */
  private String objectId;

  /** The type of object permissions to check. */
  private ObjectTypePlural objectType;

  public GetDbsqlPermissionRequest setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public GetDbsqlPermissionRequest setObjectType(ObjectTypePlural objectType) {
    this.objectType = objectType;
    return this;
  }

  public ObjectTypePlural getObjectType() {
    return objectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetDbsqlPermissionRequest that = (GetDbsqlPermissionRequest) o;
    return Objects.equals(objectId, that.objectId) && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDbsqlPermissionRequest.class)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  GetDbsqlPermissionRequestPb toPb() {
    GetDbsqlPermissionRequestPb pb = new GetDbsqlPermissionRequestPb();
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static GetDbsqlPermissionRequest fromPb(GetDbsqlPermissionRequestPb pb) {
    GetDbsqlPermissionRequest model = new GetDbsqlPermissionRequest();
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class GetDbsqlPermissionRequestSerializer
      extends JsonSerializer<GetDbsqlPermissionRequest> {
    @Override
    public void serialize(
        GetDbsqlPermissionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetDbsqlPermissionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetDbsqlPermissionRequestDeserializer
      extends JsonDeserializer<GetDbsqlPermissionRequest> {
    @Override
    public GetDbsqlPermissionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetDbsqlPermissionRequestPb pb = mapper.readValue(p, GetDbsqlPermissionRequestPb.class);
      return GetDbsqlPermissionRequest.fromPb(pb);
    }
  }
}
