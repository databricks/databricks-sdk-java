// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List catalogs */
@Generated
public class ListCatalogsRequest {
  /**
   * Whether to include catalogs in the response for which the principal can only access selective
   * metadata for
   */
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  public ListCatalogsRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCatalogsRequest that = (ListCatalogsRequest) o;
    return Objects.equals(includeBrowse, that.includeBrowse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeBrowse);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCatalogsRequest.class).add("includeBrowse", includeBrowse).toString();
  }
}
