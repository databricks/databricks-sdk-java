// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create an output catalog */
@Generated
public class CreateCleanRoomOutputCatalogRequest {
  /** Name of the clean room. */
  @JsonIgnore private String cleanRoomName;

  /** */
  @JsonProperty("output_catalog")
  private CleanRoomOutputCatalog outputCatalog;

  public CreateCleanRoomOutputCatalogRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public CreateCleanRoomOutputCatalogRequest setOutputCatalog(
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
    CreateCleanRoomOutputCatalogRequest that = (CreateCleanRoomOutputCatalogRequest) o;
    return Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(outputCatalog, that.outputCatalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoomName, outputCatalog);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCleanRoomOutputCatalogRequest.class)
        .add("cleanRoomName", cleanRoomName)
        .add("outputCatalog", outputCatalog)
        .toString();
  }
}
