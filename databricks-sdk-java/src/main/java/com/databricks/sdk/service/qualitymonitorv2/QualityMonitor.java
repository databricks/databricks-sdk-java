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

@Generated
@JsonSerialize(using = QualityMonitor.QualityMonitorSerializer.class)
@JsonDeserialize(using = QualityMonitor.QualityMonitorDeserializer.class)
public class QualityMonitor {
  /** */
  private AnomalyDetectionConfig anomalyDetectionConfig;

  /** The uuid of the request object. For example, schema id. */
  private String objectId;

  /** The type of the monitored object. Can be one of the following: schema. */
  private String objectType;

  public QualityMonitor setAnomalyDetectionConfig(AnomalyDetectionConfig anomalyDetectionConfig) {
    this.anomalyDetectionConfig = anomalyDetectionConfig;
    return this;
  }

  public AnomalyDetectionConfig getAnomalyDetectionConfig() {
    return anomalyDetectionConfig;
  }

  public QualityMonitor setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public QualityMonitor setObjectType(String objectType) {
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
    QualityMonitor that = (QualityMonitor) o;
    return Objects.equals(anomalyDetectionConfig, that.anomalyDetectionConfig)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anomalyDetectionConfig, objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(QualityMonitor.class)
        .add("anomalyDetectionConfig", anomalyDetectionConfig)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  QualityMonitorPb toPb() {
    QualityMonitorPb pb = new QualityMonitorPb();
    pb.setAnomalyDetectionConfig(anomalyDetectionConfig);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static QualityMonitor fromPb(QualityMonitorPb pb) {
    QualityMonitor model = new QualityMonitor();
    model.setAnomalyDetectionConfig(pb.getAnomalyDetectionConfig());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class QualityMonitorSerializer extends JsonSerializer<QualityMonitor> {
    @Override
    public void serialize(QualityMonitor value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QualityMonitorPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QualityMonitorDeserializer extends JsonDeserializer<QualityMonitor> {
    @Override
    public QualityMonitor deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QualityMonitorPb pb = mapper.readValue(p, QualityMonitorPb.class);
      return QualityMonitor.fromPb(pb);
    }
  }
}
