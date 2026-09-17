// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Specifies how to transform binary data into structured data. */
@Generated
public class Transformer {
  /** */
  @JsonProperty("avro_options")
  private AvroTransformerOptions avroOptions;

  /** Required: the wire format of the data. */
  @JsonProperty("format")
  private TransformerFormat format;

  /**
   * Optional input column to transform. When set, the transformer reads from this column instead of
   * the default source column.
   */
  @JsonProperty("input_column")
  private String inputColumn;

  /** */
  @JsonProperty("json_options")
  private JsonTransformerOptions jsonOptions;

  /**
   * Optional output column name. When set, the transformed result is written to this column instead
   * of replacing the input column.
   */
  @JsonProperty("output_column")
  private String outputColumn;

  /** */
  @JsonProperty("protobuf_options")
  private ProtobufTransformerOptions protobufOptions;

  public Transformer setAvroOptions(AvroTransformerOptions avroOptions) {
    this.avroOptions = avroOptions;
    return this;
  }

  public AvroTransformerOptions getAvroOptions() {
    return avroOptions;
  }

  public Transformer setFormat(TransformerFormat format) {
    this.format = format;
    return this;
  }

  public TransformerFormat getFormat() {
    return format;
  }

  public Transformer setInputColumn(String inputColumn) {
    this.inputColumn = inputColumn;
    return this;
  }

  public String getInputColumn() {
    return inputColumn;
  }

  public Transformer setJsonOptions(JsonTransformerOptions jsonOptions) {
    this.jsonOptions = jsonOptions;
    return this;
  }

  public JsonTransformerOptions getJsonOptions() {
    return jsonOptions;
  }

  public Transformer setOutputColumn(String outputColumn) {
    this.outputColumn = outputColumn;
    return this;
  }

  public String getOutputColumn() {
    return outputColumn;
  }

  public Transformer setProtobufOptions(ProtobufTransformerOptions protobufOptions) {
    this.protobufOptions = protobufOptions;
    return this;
  }

  public ProtobufTransformerOptions getProtobufOptions() {
    return protobufOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Transformer that = (Transformer) o;
    return Objects.equals(avroOptions, that.avroOptions)
        && Objects.equals(format, that.format)
        && Objects.equals(inputColumn, that.inputColumn)
        && Objects.equals(jsonOptions, that.jsonOptions)
        && Objects.equals(outputColumn, that.outputColumn)
        && Objects.equals(protobufOptions, that.protobufOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        avroOptions, format, inputColumn, jsonOptions, outputColumn, protobufOptions);
  }

  @Override
  public String toString() {
    return new ToStringer(Transformer.class)
        .add("avroOptions", avroOptions)
        .add("format", format)
        .add("inputColumn", inputColumn)
        .add("jsonOptions", jsonOptions)
        .add("outputColumn", outputColumn)
        .add("protobufOptions", protobufOptions)
        .toString();
  }
}
