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

/** Delete a quality monitor */
@Generated
@JsonSerialize(using = DeleteQualityMonitorRequest.DeleteQualityMonitorRequestSerializer.class)
@JsonDeserialize(using = DeleteQualityMonitorRequest.DeleteQualityMonitorRequestDeserializer.class)
public class DeleteQualityMonitorRequest {
  /** The uuid of the request object. For example, schema id. */
  private String objectId;

  /** The type of the monitored object. Can be one of the following: schema. */
  private String objectType;

  public DeleteQualityMonitorRequest setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public DeleteQualityMonitorRequest setObjectType(String objectType) {
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
    DeleteQualityMonitorRequest that = (DeleteQualityMonitorRequest) o;
    return Objects.equals(objectId, that.objectId) && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteQualityMonitorRequest.class)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  DeleteQualityMonitorRequestPb toPb() {
    DeleteQualityMonitorRequestPb pb = new DeleteQualityMonitorRequestPb();
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static DeleteQualityMonitorRequest fromPb(DeleteQualityMonitorRequestPb pb) {
    DeleteQualityMonitorRequest model = new DeleteQualityMonitorRequest();
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class DeleteQualityMonitorRequestSerializer
      extends JsonSerializer<DeleteQualityMonitorRequest> {
    @Override
    public void serialize(
        DeleteQualityMonitorRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteQualityMonitorRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteQualityMonitorRequestDeserializer
      extends JsonDeserializer<DeleteQualityMonitorRequest> {
    @Override
    public DeleteQualityMonitorRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteQualityMonitorRequestPb pb = mapper.readValue(p, DeleteQualityMonitorRequestPb.class);
      return DeleteQualityMonitorRequest.fromPb(pb);
    }
  }
}
