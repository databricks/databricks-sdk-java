// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get an init script
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetGlobalInitScriptRequest {
  /** The ID of the global init script. */
  private String scriptId;

  /**
   * <p>Setter for the field <code>scriptId</code>.</p>
   *
   * @param scriptId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.GetGlobalInitScriptRequest} object
   */
  public GetGlobalInitScriptRequest setScriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }

  /**
   * <p>Getter for the field <code>scriptId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getScriptId() {
    return scriptId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetGlobalInitScriptRequest that = (GetGlobalInitScriptRequest) o;
    return Objects.equals(scriptId, that.scriptId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(scriptId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetGlobalInitScriptRequest.class).add("scriptId", scriptId).toString();
  }
}
