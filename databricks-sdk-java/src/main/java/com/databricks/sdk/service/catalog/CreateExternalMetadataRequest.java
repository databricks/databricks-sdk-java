// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateExternalMetadataRequest {
  /** */
  @JsonProperty("external_metadata")
  private ExternalMetadata externalMetadata;

  public CreateExternalMetadataRequest setExternalMetadata(ExternalMetadata externalMetadata) {
    this.externalMetadata = externalMetadata;
    return this;
  }

  public ExternalMetadata getExternalMetadata() {
    return externalMetadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateExternalMetadataRequest that = (CreateExternalMetadataRequest) o;
    return Objects.equals(externalMetadata, that.externalMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalMetadata);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExternalMetadataRequest.class)
        .add("externalMetadata", externalMetadata)
        .toString();
  }
}
