// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DeleteRunsResponse {
  /** The number of runs deleted. */
  @JsonProperty("runs_deleted")
  private Long runsDeleted;

  public DeleteRunsResponse setRunsDeleted(Long runsDeleted) {
    this.runsDeleted = runsDeleted;
    return this;
  }

  public Long getRunsDeleted() {
    return runsDeleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteRunsResponse that = (DeleteRunsResponse) o;
    return Objects.equals(runsDeleted, that.runsDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runsDeleted);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteRunsResponse.class).add("runsDeleted", runsDeleted).toString();
  }
}
