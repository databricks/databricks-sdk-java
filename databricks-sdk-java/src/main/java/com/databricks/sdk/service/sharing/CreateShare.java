// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateShare {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the share. */
  @JsonProperty("name")
  private String name;

  public CreateShare setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateShare setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateShare that = (CreateShare) o;
    return Objects.equals(comment, that.comment) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateShare.class).add("comment", comment).add("name", name).toString();
  }
}
