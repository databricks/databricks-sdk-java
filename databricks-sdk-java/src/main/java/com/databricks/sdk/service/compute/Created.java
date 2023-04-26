// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Created class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Created {
  /** */
  @JsonProperty("id")
  private String id;

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Created} object
   */
  public Created setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Created that = (Created) o;
    return Objects.equals(id, that.id);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Created.class).add("id", id).toString();
  }
}
