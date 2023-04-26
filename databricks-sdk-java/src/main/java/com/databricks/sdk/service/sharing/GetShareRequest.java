// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get a share
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetShareRequest {
  /** Query for data to include in the share. */
  @QueryParam("include_shared_data")
  private Boolean includeSharedData;

  /** The name of the share. */
  private String name;

  /**
   * <p>Setter for the field <code>includeSharedData</code>.</p>
   *
   * @param includeSharedData a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sharing.GetShareRequest} object
   */
  public GetShareRequest setIncludeSharedData(Boolean includeSharedData) {
    this.includeSharedData = includeSharedData;
    return this;
  }

  /**
   * <p>Getter for the field <code>includeSharedData</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIncludeSharedData() {
    return includeSharedData;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.GetShareRequest} object
   */
  public GetShareRequest setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetShareRequest that = (GetShareRequest) o;
    return Objects.equals(includeSharedData, that.includeSharedData)
        && Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(includeSharedData, name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetShareRequest.class)
        .add("includeSharedData", includeSharedData)
        .add("name", name)
        .toString();
  }
}
