// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

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
  /**
   * Handle which should subsequently be passed into the AddBlock and Close calls when writing to a
   * file through a stream.
   */
  @JsonProperty("handle")
  private Long handle;

  /**
   * <p>Setter for the field <code>handle</code>.</p>
   *
   * @param handle a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.files.CreateResponse} object
   */
  public CreateResponse setHandle(Long handle) {
    this.handle = handle;
    return this;
  }

  /**
   * <p>Getter for the field <code>handle</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getHandle() {
    return handle;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateResponse that = (CreateResponse) o;
    return Objects.equals(handle, that.handle);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(handle);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateResponse.class).add("handle", handle).toString();
  }
}
