// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateBatchRequest {
  /** The batch to create. */
  @JsonProperty("batch")
  private Batch batch;

  public CreateBatchRequest setBatch(Batch batch) {
    this.batch = batch;
    return this;
  }

  public Batch getBatch() {
    return batch;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateBatchRequest that = (CreateBatchRequest) o;
    return Objects.equals(batch, that.batch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batch);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBatchRequest.class).add("batch", batch).toString();
  }
}
