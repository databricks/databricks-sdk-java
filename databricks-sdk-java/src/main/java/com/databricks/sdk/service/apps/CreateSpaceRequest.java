// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateSpaceRequest {
  /** */
  @JsonProperty("space")
  private Space space;

  public CreateSpaceRequest setSpace(Space space) {
    this.space = space;
    return this;
  }

  public Space getSpace() {
    return space;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSpaceRequest that = (CreateSpaceRequest) o;
    return Objects.equals(space, that.space);
  }

  @Override
  public int hashCode() {
    return Objects.hash(space);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSpaceRequest.class).add("space", space).toString();
  }
}
