// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateExternalLineageRelationshipRequest {
  /** */
  @JsonProperty("external_lineage_relationship")
  private CreateRequestExternalLineage externalLineageRelationship;

  public CreateExternalLineageRelationshipRequest setExternalLineageRelationship(
      CreateRequestExternalLineage externalLineageRelationship) {
    this.externalLineageRelationship = externalLineageRelationship;
    return this;
  }

  public CreateRequestExternalLineage getExternalLineageRelationship() {
    return externalLineageRelationship;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateExternalLineageRelationshipRequest that = (CreateExternalLineageRelationshipRequest) o;
    return Objects.equals(externalLineageRelationship, that.externalLineageRelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalLineageRelationship);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExternalLineageRelationshipRequest.class)
        .add("externalLineageRelationship", externalLineageRelationship)
        .toString();
  }
}
