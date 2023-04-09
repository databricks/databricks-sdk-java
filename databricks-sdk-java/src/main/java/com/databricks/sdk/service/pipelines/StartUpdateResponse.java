// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class StartUpdateResponse {
  /** */
  @JsonProperty("update_id")
  private String updateId;

  public StartUpdateResponse setUpdateId(String updateId) {
    this.updateId = updateId;
    return this;
  }

  public String getUpdateId() {
    return updateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StartUpdateResponse that = (StartUpdateResponse) o;
    return Objects.equals(updateId, that.updateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateId);
  }

  @Override
  public String toString() {
    return new ToStringer(StartUpdateResponse.class).add("updateId", updateId).toString();
  }
}
