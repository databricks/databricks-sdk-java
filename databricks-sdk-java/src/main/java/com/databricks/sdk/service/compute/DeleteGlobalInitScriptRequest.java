// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete init script
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteGlobalInitScriptRequest {
  /** The ID of the global init script. */
  private String scriptId;

  /**
   * <p>Setter for the field <code>scriptId</code>.</p>
   *
   * @param scriptId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.DeleteGlobalInitScriptRequest} object
   */
  public DeleteGlobalInitScriptRequest setScriptId(String scriptId) {
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
    DeleteGlobalInitScriptRequest that = (DeleteGlobalInitScriptRequest) o;
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
    return new ToStringer(DeleteGlobalInitScriptRequest.class).add("scriptId", scriptId).toString();
  }
}
