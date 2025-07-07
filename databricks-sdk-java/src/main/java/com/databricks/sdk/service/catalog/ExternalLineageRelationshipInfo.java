// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class ExternalLineageRelationshipInfo {
  /** List of column relationships between source and target objects. */
  @JsonProperty("columns")
  private Collection<ColumnRelationship> columns;

  /** Unique identifier of the external lineage relationship. */
  @JsonProperty("id")
  private String id;

  /** Key-value properties associated with the external lineage relationship. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  /** Source object of the external lineage relationship. */
  @JsonProperty("source")
  private ExternalLineageObject source;

  /** Target object of the external lineage relationship. */
  @JsonProperty("target")
  private ExternalLineageObject target;

  public ExternalLineageRelationshipInfo setColumns(Collection<ColumnRelationship> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<ColumnRelationship> getColumns() {
    return columns;
  }

  public ExternalLineageRelationshipInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ExternalLineageRelationshipInfo setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public ExternalLineageRelationshipInfo setSource(ExternalLineageObject source) {
    this.source = source;
    return this;
  }

  public ExternalLineageObject getSource() {
    return source;
  }

  public ExternalLineageRelationshipInfo setTarget(ExternalLineageObject target) {
    this.target = target;
    return this;
  }

  public ExternalLineageObject getTarget() {
    return target;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalLineageRelationshipInfo that = (ExternalLineageRelationshipInfo) o;
    return Objects.equals(columns, that.columns)
        && Objects.equals(id, that.id)
        && Objects.equals(properties, that.properties)
        && Objects.equals(source, that.source)
        && Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, id, properties, source, target);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalLineageRelationshipInfo.class)
        .add("columns", columns)
        .add("id", id)
        .add("properties", properties)
        .add("source", source)
        .add("target", target)
        .toString();
  }
}
