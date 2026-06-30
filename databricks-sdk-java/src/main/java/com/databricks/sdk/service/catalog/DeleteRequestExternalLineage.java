// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DeleteRequestExternalLineage {
  /** Unique identifier of the external lineage relationship. */
  @JsonProperty("id")
  @QueryParam("id")
  private String id;

  /** Source object of the external lineage relationship. */
  @JsonProperty("source")
  @QueryParam("source")
  private ExternalLineageObject source;

  /** Target object of the external lineage relationship. */
  @JsonProperty("target")
  @QueryParam("target")
  private ExternalLineageObject target;

  public DeleteRequestExternalLineage setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public DeleteRequestExternalLineage setSource(ExternalLineageObject source) {
    this.source = source;
    return this;
  }

  public ExternalLineageObject getSource() {
    return source;
  }

  public DeleteRequestExternalLineage setTarget(ExternalLineageObject target) {
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
    DeleteRequestExternalLineage that = (DeleteRequestExternalLineage) o;
    return Objects.equals(id, that.id)
        && Objects.equals(source, that.source)
        && Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, target);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteRequestExternalLineage.class)
        .add("id", id)
        .add("source", source)
        .add("target", target)
        .toString();
  }
}
