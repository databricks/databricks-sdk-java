// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateVectorIndexResponse {
  /** */
  @JsonProperty("vector_index")
  private VectorIndex vectorIndex;

  public CreateVectorIndexResponse setVectorIndex(VectorIndex vectorIndex) {
    this.vectorIndex = vectorIndex;
    return this;
  }

  public VectorIndex getVectorIndex() {
    return vectorIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateVectorIndexResponse that = (CreateVectorIndexResponse) o;
    return Objects.equals(vectorIndex, that.vectorIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vectorIndex);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateVectorIndexResponse.class)
        .add("vectorIndex", vectorIndex)
        .toString();
  }
}
