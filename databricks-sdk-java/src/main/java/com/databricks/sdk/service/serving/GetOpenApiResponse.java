// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.util.Objects;

@Generated
public class GetOpenApiResponse {
  /** */
  @JsonIgnore private InputStream contents;

  public GetOpenApiResponse setContents(InputStream contents) {
    this.contents = contents;
    return this;
  }

  public InputStream getContents() {
    return contents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetOpenApiResponse that = (GetOpenApiResponse) o;
    return Objects.equals(contents, that.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents);
  }

  @Override
  public String toString() {
    return new ToStringer(GetOpenApiResponse.class).add("contents", contents).toString();
  }
}
