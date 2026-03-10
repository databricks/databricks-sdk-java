// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class KafkaSource {
  /**
   * Deprecated: Use Feature.entity instead. Kept for backwards compatibility. The entity column
   * identifiers of the Kafka source.
   */
  @JsonProperty("entity_column_identifiers")
  private Collection<ColumnIdentifier> entityColumnIdentifiers;

  /** The filter condition applied to the source data before aggregation. */
  @JsonProperty("filter_condition")
  private String filterCondition;

  /**
   * Name of the Kafka source, used to identify it. This is used to look up the corresponding
   * KafkaConfig object. Can be distinct from topic name.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Deprecated: Use Feature.timeseries_column instead. Kept for backwards compatibility. The
   * timeseries column identifier of the Kafka source.
   */
  @JsonProperty("timeseries_column_identifier")
  private ColumnIdentifier timeseriesColumnIdentifier;

  public KafkaSource setEntityColumnIdentifiers(
      Collection<ColumnIdentifier> entityColumnIdentifiers) {
    this.entityColumnIdentifiers = entityColumnIdentifiers;
    return this;
  }

  public Collection<ColumnIdentifier> getEntityColumnIdentifiers() {
    return entityColumnIdentifiers;
  }

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

  public KafkaSource setTimeseriesColumnIdentifier(ColumnIdentifier timeseriesColumnIdentifier) {
    this.timeseriesColumnIdentifier = timeseriesColumnIdentifier;
    return this;
  }

  public ColumnIdentifier getTimeseriesColumnIdentifier() {
    return timeseriesColumnIdentifier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KafkaSource that = (KafkaSource) o;
    return Objects.equals(entityColumnIdentifiers, that.entityColumnIdentifiers)
        && Objects.equals(filterCondition, that.filterCondition)
        && Objects.equals(name, that.name)
        && Objects.equals(timeseriesColumnIdentifier, that.timeseriesColumnIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityColumnIdentifiers, filterCondition, name, timeseriesColumnIdentifier);
  }

  @Override
  public String toString() {
    return new ToStringer(KafkaSource.class)
        .add("entityColumnIdentifiers", entityColumnIdentifiers)
        .add("filterCondition", filterCondition)
        .add("name", name)
        .add("timeseriesColumnIdentifier", timeseriesColumnIdentifier)
        .toString();
  }
}
