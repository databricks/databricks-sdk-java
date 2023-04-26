// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RotateRecipientToken class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RotateRecipientToken {
  /**
   * The expiration time of the bearer token in ISO 8601 format. This will set the expiration_time
   * of existing token only to a smaller timestamp, it cannot extend the expiration_time. Use 0 to
   * expire the existing token immediately, negative number will return an error.
   */
  @JsonProperty("existing_token_expire_in_seconds")
  private Long existingTokenExpireInSeconds;

  /** The name of the recipient. */
  private String name;

  /**
   * <p>Setter for the field <code>existingTokenExpireInSeconds</code>.</p>
   *
   * @param existingTokenExpireInSeconds a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sharing.RotateRecipientToken} object
   */
  public RotateRecipientToken setExistingTokenExpireInSeconds(Long existingTokenExpireInSeconds) {
    this.existingTokenExpireInSeconds = existingTokenExpireInSeconds;
    return this;
  }

  /**
   * <p>Getter for the field <code>existingTokenExpireInSeconds</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getExistingTokenExpireInSeconds() {
    return existingTokenExpireInSeconds;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RotateRecipientToken} object
   */
  public RotateRecipientToken setName(String name) {
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
    RotateRecipientToken that = (RotateRecipientToken) o;
    return Objects.equals(existingTokenExpireInSeconds, that.existingTokenExpireInSeconds)
        && Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(existingTokenExpireInSeconds, name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RotateRecipientToken.class)
        .add("existingTokenExpireInSeconds", existingTokenExpireInSeconds)
        .add("name", name)
        .toString();
  }
}
