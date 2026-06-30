// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteMaterializedFeatureRequest {
  /** The ID of the materialized feature to delete. */
  @JsonIgnore private String materializedFeatureId;

  public DeleteMaterializedFeatureRequest setMaterializedFeatureId(String materializedFeatureId) {
    this.materializedFeatureId = materializedFeatureId;
    return this;
  }

  public String getMaterializedFeatureId() {
    return materializedFeatureId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteMaterializedFeatureRequest that = (DeleteMaterializedFeatureRequest) o;
    return Objects.equals(materializedFeatureId, that.materializedFeatureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materializedFeatureId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteMaterializedFeatureRequest.class)
        .add("materializedFeatureId", materializedFeatureId)
        .toString();
  }
}
