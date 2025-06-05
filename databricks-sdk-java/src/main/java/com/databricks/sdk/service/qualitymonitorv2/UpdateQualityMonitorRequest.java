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

/** Update a quality monitor */
@Generated
@JsonSerialize(using = UpdateQualityMonitorRequest.UpdateQualityMonitorRequestSerializer.class)
@JsonDeserialize(using = UpdateQualityMonitorRequest.UpdateQualityMonitorRequestDeserializer.class)
public class UpdateQualityMonitorRequest {
  /** The uuid of the request object. For example, schema id. */
  private String objectId;

  /** The type of the monitored object. Can be one of the following: schema. */
  private String objectType;

  /** */
  private QualityMonitor qualityMonitor;

  public UpdateQualityMonitorRequest setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public UpdateQualityMonitorRequest setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  public UpdateQualityMonitorRequest setQualityMonitor(QualityMonitor qualityMonitor) {
    this.qualityMonitor = qualityMonitor;
    return this;
  }

  public QualityMonitor getQualityMonitor() {
    return qualityMonitor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateQualityMonitorRequest that = (UpdateQualityMonitorRequest) o;
    return Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType)
        && Objects.equals(qualityMonitor, that.qualityMonitor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType, qualityMonitor);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateQualityMonitorRequest.class)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .add("qualityMonitor", qualityMonitor)
        .toString();
  }

  UpdateQualityMonitorRequestPb toPb() {
    UpdateQualityMonitorRequestPb pb = new UpdateQualityMonitorRequestPb();
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);
    pb.setQualityMonitor(qualityMonitor);

    return pb;
  }

  static UpdateQualityMonitorRequest fromPb(UpdateQualityMonitorRequestPb pb) {
    UpdateQualityMonitorRequest model = new UpdateQualityMonitorRequest();
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());
    model.setQualityMonitor(pb.getQualityMonitor());

    return model;
  }

  public static class UpdateQualityMonitorRequestSerializer
      extends JsonSerializer<UpdateQualityMonitorRequest> {
    @Override
    public void serialize(
        UpdateQualityMonitorRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateQualityMonitorRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateQualityMonitorRequestDeserializer
      extends JsonDeserializer<UpdateQualityMonitorRequest> {
    @Override
    public UpdateQualityMonitorRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateQualityMonitorRequestPb pb = mapper.readValue(p, UpdateQualityMonitorRequestPb.class);
      return UpdateQualityMonitorRequest.fromPb(pb);
    }
  }
}
