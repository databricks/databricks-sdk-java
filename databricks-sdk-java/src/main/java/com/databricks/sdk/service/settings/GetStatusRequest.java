// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Check configuration status
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetStatusRequest {
  /** */
  @QueryParam("keys")
  private String keys;

  /**
   * <p>Setter for the field <code>keys</code>.</p>
   *
   * @param keys a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.GetStatusRequest} object
   */
  public GetStatusRequest setKeys(String keys) {
    this.keys = keys;
    return this;
  }

  /**
   * <p>Getter for the field <code>keys</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getKeys() {
    return keys;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetStatusRequest that = (GetStatusRequest) o;
    return Objects.equals(keys, that.keys);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(keys);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetStatusRequest.class).add("keys", keys).toString();
  }
}
