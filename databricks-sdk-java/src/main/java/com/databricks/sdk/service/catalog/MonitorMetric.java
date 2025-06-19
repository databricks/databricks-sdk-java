// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = MonitorMetric.MonitorMetricSerializer.class)
@JsonDeserialize(using = MonitorMetric.MonitorMetricDeserializer.class)
public class MonitorMetric {
  /**
   * Jinja template for a SQL expression that specifies how to compute the metric. See [create
   * metric definition].
   *
   * <p>[create metric definition]:
   * https://docs.databricks.com/en/lakehouse-monitoring/custom-metrics.html#create-definition
   */
  private String definition;

  /**
   * A list of column names in the input table the metric should be computed for. Can use
   * ``":table"`` to indicate that the metric needs information from multiple columns.
   */
  private Collection<String> inputColumns;

  /** Name of the metric in the output tables. */
  private String name;

  /** The output type of the custom metric. */
  private String outputDataType;

  /**
   * Can only be one of ``"CUSTOM_METRIC_TYPE_AGGREGATE"``, ``"CUSTOM_METRIC_TYPE_DERIVED"``, or
   * ``"CUSTOM_METRIC_TYPE_DRIFT"``. The ``"CUSTOM_METRIC_TYPE_AGGREGATE"`` and
   * ``"CUSTOM_METRIC_TYPE_DERIVED"`` metrics are computed on a single table, whereas the
   * ``"CUSTOM_METRIC_TYPE_DRIFT"`` compare metrics across baseline and input table, or across the
   * two consecutive time windows. - CUSTOM_METRIC_TYPE_AGGREGATE: only depend on the existing
   * columns in your table - CUSTOM_METRIC_TYPE_DERIVED: depend on previously computed aggregate
   * metrics - CUSTOM_METRIC_TYPE_DRIFT: depend on previously computed aggregate or derived metrics
   */
  private MonitorMetricType typeValue;

  public MonitorMetric setDefinition(String definition) {
    this.definition = definition;
    return this;
  }

  public String getDefinition() {
    return definition;
  }

  public MonitorMetric setInputColumns(Collection<String> inputColumns) {
    this.inputColumns = inputColumns;
    return this;
  }

  public Collection<String> getInputColumns() {
    return inputColumns;
  }

  public MonitorMetric setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public MonitorMetric setOutputDataType(String outputDataType) {
    this.outputDataType = outputDataType;
    return this;
  }

  public String getOutputDataType() {
    return outputDataType;
  }

  public MonitorMetric setType(MonitorMetricType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public MonitorMetricType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorMetric that = (MonitorMetric) o;
    return Objects.equals(definition, that.definition)
        && Objects.equals(inputColumns, that.inputColumns)
        && Objects.equals(name, that.name)
        && Objects.equals(outputDataType, that.outputDataType)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, inputColumns, name, outputDataType, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorMetric.class)
        .add("definition", definition)
        .add("inputColumns", inputColumns)
        .add("name", name)
        .add("outputDataType", outputDataType)
        .add("typeValue", typeValue)
        .toString();
  }

  MonitorMetricPb toPb() {
    MonitorMetricPb pb = new MonitorMetricPb();
    pb.setDefinition(definition);
    pb.setInputColumns(inputColumns);
    pb.setName(name);
    pb.setOutputDataType(outputDataType);
    pb.setType(typeValue);

    return pb;
  }

  static MonitorMetric fromPb(MonitorMetricPb pb) {
    MonitorMetric model = new MonitorMetric();
    model.setDefinition(pb.getDefinition());
    model.setInputColumns(pb.getInputColumns());
    model.setName(pb.getName());
    model.setOutputDataType(pb.getOutputDataType());
    model.setType(pb.getType());

    return model;
  }

  public static class MonitorMetricSerializer extends JsonSerializer<MonitorMetric> {
    @Override
    public void serialize(MonitorMetric value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MonitorMetricPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MonitorMetricDeserializer extends JsonDeserializer<MonitorMetric> {
    @Override
    public MonitorMetric deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MonitorMetricPb pb = mapper.readValue(p, MonitorMetricPb.class);
      return MonitorMetric.fromPb(pb);
    }
  }
}
