// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A request-time data source whose value is provided at inference time: offline batch scoring or
 * online serving endpoint
 */
@Generated
public class RequestSource {
  /** A flat schema with scalar-typed fields only. */
  @JsonProperty("flat_schema")
  private FlatSchema flatSchema;

  public RequestSource setFlatSchema(FlatSchema flatSchema) {
    this.flatSchema = flatSchema;
    return this;
  }

  public FlatSchema getFlatSchema() {
    return flatSchema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RequestSource that = (RequestSource) o;
    return Objects.equals(flatSchema, that.flatSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flatSchema);
  }

  @Override
  public String toString() {
    return new ToStringer(RequestSource.class).add("flatSchema", flatSchema).toString();
  }
}
