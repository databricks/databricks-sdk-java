// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete a serving endpoint
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteServingEndpointRequest {
  /** The name of the serving endpoint. This field is required. */
  private String name;

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.DeleteServingEndpointRequest} object
   */
  public DeleteServingEndpointRequest setName(String name) {
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
    DeleteServingEndpointRequest that = (DeleteServingEndpointRequest) o;
    return Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteServingEndpointRequest.class).add("name", name).toString();
  }
}
