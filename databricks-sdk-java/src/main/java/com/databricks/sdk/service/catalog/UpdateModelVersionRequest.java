// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateModelVersionRequest {
  /** The comment attached to the model version */
  @JsonProperty("comment")
  private String comment;

  /** The three-level (fully qualified) name of the model version */
  private String fullName;

  /** The integer version number of the model version */
  private Long version;

  public UpdateModelVersionRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateModelVersionRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdateModelVersionRequest setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateModelVersionRequest that = (UpdateModelVersionRequest) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, fullName, version);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateModelVersionRequest.class)
        .add("comment", comment)
        .add("fullName", fullName)
        .add("version", version)
        .toString();
  }
}
