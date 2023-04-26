// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get the information of a file or directory
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetStatusRequest {
  /** The path of the file or directory. The path should be the absolute DBFS path. */
  @QueryParam("path")
  private String path;

  /**
   * <p>Setter for the field <code>path</code>.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.files.GetStatusRequest} object
   */
  public GetStatusRequest setPath(String path) {
    this.path = path;
    return this;
  }

  /**
   * <p>Getter for the field <code>path</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPath() {
    return path;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetStatusRequest that = (GetStatusRequest) o;
    return Objects.equals(path, that.path);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetStatusRequest.class).add("path", path).toString();
  }
}
