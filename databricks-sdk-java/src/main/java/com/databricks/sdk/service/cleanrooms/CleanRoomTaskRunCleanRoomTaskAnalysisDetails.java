// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CleanRoomTaskRunCleanRoomTaskAnalysisDetails {
  /** Etag of the asset executed in this task run, used to identify the asset version. */
  @JsonProperty("etag")
  private String etag;

  /** The timestamp of when the asset was last updated. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  public CleanRoomTaskRunCleanRoomTaskAnalysisDetails setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public CleanRoomTaskRunCleanRoomTaskAnalysisDetails setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomTaskRunCleanRoomTaskAnalysisDetails that =
        (CleanRoomTaskRunCleanRoomTaskAnalysisDetails) o;
    return Objects.equals(etag, that.etag) && Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, updatedAt);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomTaskRunCleanRoomTaskAnalysisDetails.class)
        .add("etag", etag)
        .add("updatedAt", updatedAt)
        .toString();
  }
}
