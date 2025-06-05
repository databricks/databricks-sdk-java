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

@Generated
@JsonSerialize(using = AlertV2OperandColumn.AlertV2OperandColumnSerializer.class)
@JsonDeserialize(using = AlertV2OperandColumn.AlertV2OperandColumnDeserializer.class)
public class AlertV2OperandColumn {
  /** */
  private Aggregation aggregation;

  /** */
  private String display;

  /** */
  private String name;

  public AlertV2OperandColumn setAggregation(Aggregation aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  public Aggregation getAggregation() {
    return aggregation;
  }

  public AlertV2OperandColumn setDisplay(String display) {
    this.display = display;
    return this;
  }

  public String getDisplay() {
    return display;
  }

  public AlertV2OperandColumn setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertV2OperandColumn that = (AlertV2OperandColumn) o;
    return Objects.equals(aggregation, that.aggregation)
        && Objects.equals(display, that.display)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, display, name);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertV2OperandColumn.class)
        .add("aggregation", aggregation)
        .add("display", display)
        .add("name", name)
        .toString();
  }

  AlertV2OperandColumnPb toPb() {
    AlertV2OperandColumnPb pb = new AlertV2OperandColumnPb();
    pb.setAggregation(aggregation);
    pb.setDisplay(display);
    pb.setName(name);

    return pb;
  }

  static AlertV2OperandColumn fromPb(AlertV2OperandColumnPb pb) {
    AlertV2OperandColumn model = new AlertV2OperandColumn();
    model.setAggregation(pb.getAggregation());
    model.setDisplay(pb.getDisplay());
    model.setName(pb.getName());

    return model;
  }

  public static class AlertV2OperandColumnSerializer extends JsonSerializer<AlertV2OperandColumn> {
    @Override
    public void serialize(
        AlertV2OperandColumn value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AlertV2OperandColumnPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AlertV2OperandColumnDeserializer
      extends JsonDeserializer<AlertV2OperandColumn> {
    @Override
    public AlertV2OperandColumn deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AlertV2OperandColumnPb pb = mapper.readValue(p, AlertV2OperandColumnPb.class);
      return AlertV2OperandColumn.fromPb(pb);
    }
  }
}
