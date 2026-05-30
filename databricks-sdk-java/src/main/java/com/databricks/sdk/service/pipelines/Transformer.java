// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Specifies how to transform binary data into structured data. */
@Generated
public class Transformer {
  /** Required: the wire format of the data. */
  @JsonProperty("format")
  private TransformerFormat format;

  /** */
  @JsonProperty("json_options")
  private JsonTransformerOptions jsonOptions;

  public Transformer setFormat(TransformerFormat format) {
    this.format = format;
    return this;
  }

  public TransformerFormat getFormat() {
    return format;
  }

  public Transformer setJsonOptions(JsonTransformerOptions jsonOptions) {
    this.jsonOptions = jsonOptions;
    return this;
  }

  public JsonTransformerOptions getJsonOptions() {
    return jsonOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Transformer that = (Transformer) o;
    return Objects.equals(format, that.format) && Objects.equals(jsonOptions, that.jsonOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, jsonOptions);
  }

  @Override
  public String toString() {
    return new ToStringer(Transformer.class)
        .add("format", format)
        .add("jsonOptions", jsonOptions)
        .toString();
  }
}
