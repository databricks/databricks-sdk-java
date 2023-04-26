// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Success class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Success {
  /** */
  @JsonProperty("message")
  private SuccessMessage message;

  /**
   * <p>Setter for the field <code>message</code>.</p>
   *
   * @param message a {@link com.databricks.sdk.service.sql.SuccessMessage} object
   * @return a {@link com.databricks.sdk.service.sql.Success} object
   */
  public Success setMessage(SuccessMessage message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Getter for the field <code>message</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.SuccessMessage} object
   */
  public SuccessMessage getMessage() {
    return message;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Success that = (Success) o;
    return Objects.equals(message, that.message);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Success.class).add("message", message).toString();
  }
}
