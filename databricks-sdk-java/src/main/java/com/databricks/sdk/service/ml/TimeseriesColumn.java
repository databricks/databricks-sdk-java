// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TimeseriesColumn {
  /**
   * The name of the timeseries column. For Kafka sources, use dot-prefixed path notation to
   * reference fields within the key or value schema (e.g., "value.event_timestamp"). For nested
   * fields, the leaf node name (e.g., "event_timestamp" from "value.event_details.event_timestamp")
   * is what will be present in materialized tables and expected to match at query time.
   * TODO(FS-939): Colon-prefixed notation (e.g., "value:event_timestamp") is supported for
   * backwards compatibility but is deprecated; migrate to dot notation.
   */
  @JsonProperty("name")
  private String name;

  public TimeseriesColumn setName(String name) {
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
    TimeseriesColumn that = (TimeseriesColumn) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(TimeseriesColumn.class).add("name", name).toString();
  }
}
