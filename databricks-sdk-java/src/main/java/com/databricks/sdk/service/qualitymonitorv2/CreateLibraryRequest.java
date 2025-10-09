// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateLibraryRequest {
  /** Library information about the resource */
  @JsonProperty("library")
  private Library library;

  public CreateLibraryRequest setLibrary(Library library) {
    this.library = library;
    return this;
  }

  public Library getLibrary() {
    return library;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateLibraryRequest that = (CreateLibraryRequest) o;
    return Objects.equals(library, that.library);
  }

  @Override
  public int hashCode() {
    return Objects.hash(library);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateLibraryRequest.class).add("library", library).toString();
  }
}
