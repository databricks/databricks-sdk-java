// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteExternalLineageRelationshipRequest {
  /** */
  @JsonIgnore
  @QueryParam("external_lineage_relationship")
  private DeleteRequestExternalLineage externalLineageRelationship;

  public DeleteExternalLineageRelationshipRequest setExternalLineageRelationship(
      DeleteRequestExternalLineage externalLineageRelationship) {
    this.externalLineageRelationship = externalLineageRelationship;
    return this;
  }

  public DeleteRequestExternalLineage getExternalLineageRelationship() {
    return externalLineageRelationship;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteExternalLineageRelationshipRequest that = (DeleteExternalLineageRelationshipRequest) o;
    return Objects.equals(externalLineageRelationship, that.externalLineageRelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalLineageRelationship);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteExternalLineageRelationshipRequest.class)
        .add("externalLineageRelationship", externalLineageRelationship)
        .toString();
  }
}
