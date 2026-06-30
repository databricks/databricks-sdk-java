// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateCleanRoomOutputCatalogResponse {
  /** */
  @JsonProperty("output_catalog")
  private CleanRoomOutputCatalog outputCatalog;

  public CreateCleanRoomOutputCatalogResponse setOutputCatalog(
      CleanRoomOutputCatalog outputCatalog) {
    this.outputCatalog = outputCatalog;
    return this;
  }

  public CleanRoomOutputCatalog getOutputCatalog() {
    return outputCatalog;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCleanRoomOutputCatalogResponse that = (CreateCleanRoomOutputCatalogResponse) o;
    return Objects.equals(outputCatalog, that.outputCatalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputCatalog);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCleanRoomOutputCatalogResponse.class)
        .add("outputCatalog", outputCatalog)
        .toString();
  }
}
