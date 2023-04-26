// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateResponse {
  /** The global init script ID. */
  @JsonProperty("script_id")
  private String scriptId;

  /**
   * <p>Setter for the field <code>scriptId</code>.</p>
   *
   * @param scriptId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.CreateResponse} object
   */
  public CreateResponse setScriptId(String scriptId) {
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
    CreateResponse that = (CreateResponse) o;
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
    return new ToStringer(CreateResponse.class).add("scriptId", scriptId).toString();
  }
}
