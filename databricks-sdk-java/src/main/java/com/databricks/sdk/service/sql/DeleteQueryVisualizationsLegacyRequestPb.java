// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Remove visualization */
@Generated
class DeleteQueryVisualizationsLegacyRequestPb {
  @JsonIgnore private String id;

  public DeleteQueryVisualizationsLegacyRequestPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteQueryVisualizationsLegacyRequestPb that = (DeleteQueryVisualizationsLegacyRequestPb) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteQueryVisualizationsLegacyRequestPb.class).add("id", id).toString();
  }
}
