// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateExternalLineageRelationshipRequest {
  /** */
  @JsonProperty("external_lineage_relationship")
  private UpdateRequestExternalLineage externalLineageRelationship;

  /**
   * The fields of the relationship to update. The field mask must be a single string, with multiple
   * fields separated by commas (no spaces), for example `columns,properties`. The `source` and
   * `target` identify the relationship and cannot be changed.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateExternalLineageRelationshipRequest setExternalLineageRelationship(
      UpdateRequestExternalLineage externalLineageRelationship) {
    this.externalLineageRelationship = externalLineageRelationship;
    return this;
  }

  public UpdateRequestExternalLineage getExternalLineageRelationship() {
    return externalLineageRelationship;
  }

  public UpdateExternalLineageRelationshipRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateExternalLineageRelationshipRequest that = (UpdateExternalLineageRelationshipRequest) o;
    return Objects.equals(externalLineageRelationship, that.externalLineageRelationship)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalLineageRelationship, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateExternalLineageRelationshipRequest.class)
        .add("externalLineageRelationship", externalLineageRelationship)
        .add("updateMask", updateMask)
        .toString();
  }
}
