// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class KafkaSource {
  /** The filter condition applied to the source data before aggregation. */
  @JsonProperty("filter_condition")
  private String filterCondition;

  /**
   * Name of the Kafka source, used to identify it. This is used to look up the corresponding
   * KafkaConfig object. Can be distinct from topic name.
   */
  @JsonProperty("name")
  private String name;

  public KafkaSource setFilterCondition(String filterCondition) {
    this.filterCondition = filterCondition;
    return this;
  }

  public String getFilterCondition() {
    return filterCondition;
  }

  public KafkaSource setName(String name) {
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
    KafkaSource that = (KafkaSource) o;
    return Objects.equals(filterCondition, that.filterCondition) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterCondition, name);
  }

  @Override
  public String toString() {
    return new ToStringer(KafkaSource.class)
        .add("filterCondition", filterCondition)
        .add("name", name)
        .toString();
  }
}
