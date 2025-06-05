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

/** Create a quality monitor */
@Generated
@JsonSerialize(using = CreateQualityMonitorRequest.CreateQualityMonitorRequestSerializer.class)
@JsonDeserialize(using = CreateQualityMonitorRequest.CreateQualityMonitorRequestDeserializer.class)
public class CreateQualityMonitorRequest {
  /** */
  private QualityMonitor qualityMonitor;

  public CreateQualityMonitorRequest setQualityMonitor(QualityMonitor qualityMonitor) {
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
    CreateQualityMonitorRequest that = (CreateQualityMonitorRequest) o;
    return Objects.equals(qualityMonitor, that.qualityMonitor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualityMonitor);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateQualityMonitorRequest.class)
        .add("qualityMonitor", qualityMonitor)
        .toString();
  }

  CreateQualityMonitorRequestPb toPb() {
    CreateQualityMonitorRequestPb pb = new CreateQualityMonitorRequestPb();
    pb.setQualityMonitor(qualityMonitor);

    return pb;
  }

  static CreateQualityMonitorRequest fromPb(CreateQualityMonitorRequestPb pb) {
    CreateQualityMonitorRequest model = new CreateQualityMonitorRequest();
    model.setQualityMonitor(pb.getQualityMonitor());

    return model;
  }

  public static class CreateQualityMonitorRequestSerializer
      extends JsonSerializer<CreateQualityMonitorRequest> {
    @Override
    public void serialize(
        CreateQualityMonitorRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateQualityMonitorRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateQualityMonitorRequestDeserializer
      extends JsonDeserializer<CreateQualityMonitorRequest> {
    @Override
    public CreateQualityMonitorRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateQualityMonitorRequestPb pb = mapper.readValue(p, CreateQualityMonitorRequestPb.class);
      return CreateQualityMonitorRequest.fromPb(pb);
    }
  }
}
