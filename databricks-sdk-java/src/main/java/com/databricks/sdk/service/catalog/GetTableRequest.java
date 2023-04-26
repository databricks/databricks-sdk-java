// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get a table
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetTableRequest {
  /** Full name of the table. */
  private String fullName;

  /** Whether delta metadata should be included in the response. */
  @QueryParam("include_delta_metadata")
  private Boolean includeDeltaMetadata;

  /**
   * <p>Setter for the field <code>fullName</code>.</p>
   *
   * @param fullName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetTableRequest} object
   */
  public GetTableRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFullName() {
    return fullName;
  }

  /**
   * <p>Setter for the field <code>includeDeltaMetadata</code>.</p>
   *
   * @param includeDeltaMetadata a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.GetTableRequest} object
   */
  public GetTableRequest setIncludeDeltaMetadata(Boolean includeDeltaMetadata) {
    this.includeDeltaMetadata = includeDeltaMetadata;
    return this;
  }

  /**
   * <p>Getter for the field <code>includeDeltaMetadata</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIncludeDeltaMetadata() {
    return includeDeltaMetadata;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetTableRequest that = (GetTableRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(includeDeltaMetadata, that.includeDeltaMetadata);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeDeltaMetadata);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetTableRequest.class)
        .add("fullName", fullName)
        .add("includeDeltaMetadata", includeDeltaMetadata)
        .toString();
  }
}
