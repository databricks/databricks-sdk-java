// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateComment {
  /** User-provided comment on the action. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the model. */
  @JsonProperty("name")
  private String name;

  /** Version of the model. */
  @JsonProperty("version")
  private String version;

  public CreateComment setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateComment setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateComment setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateComment that = (CreateComment) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateComment.class)
        .add("comment", comment)
        .add("name", name)
        .add("version", version)
        .toString();
  }
}
