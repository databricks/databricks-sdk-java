// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

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

/** Read a quality monitor */
@Generated
@JsonSerialize(using = GetQualityMonitorRequest.GetQualityMonitorRequestSerializer.class)
@JsonDeserialize(using = GetQualityMonitorRequest.GetQualityMonitorRequestDeserializer.class)
public class GetQualityMonitorRequest {
  /** The uuid of the request object. For example, schema id. */
  private String objectId;

  /** The type of the monitored object. Can be one of the following: schema. */
  private String objectType;

  public GetQualityMonitorRequest setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public GetQualityMonitorRequest setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetQualityMonitorRequest that = (GetQualityMonitorRequest) o;
    return Objects.equals(objectId, that.objectId) && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetQualityMonitorRequest.class)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  GetQualityMonitorRequestPb toPb() {
    GetQualityMonitorRequestPb pb = new GetQualityMonitorRequestPb();
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static GetQualityMonitorRequest fromPb(GetQualityMonitorRequestPb pb) {
    GetQualityMonitorRequest model = new GetQualityMonitorRequest();
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class GetQualityMonitorRequestSerializer
      extends JsonSerializer<GetQualityMonitorRequest> {
    @Override
    public void serialize(
        GetQualityMonitorRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetQualityMonitorRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetQualityMonitorRequestDeserializer
      extends JsonDeserializer<GetQualityMonitorRequest> {
    @Override
    public GetQualityMonitorRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetQualityMonitorRequestPb pb = mapper.readValue(p, GetQualityMonitorRequestPb.class);
      return GetQualityMonitorRequest.fromPb(pb);
    }
  }
}
