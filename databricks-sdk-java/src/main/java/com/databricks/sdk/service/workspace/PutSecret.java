// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>PutSecret class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PutSecret {
  /** If specified, value will be stored as bytes. */
  @JsonProperty("bytes_value")
  private String bytesValue;

  /** A unique name to identify the secret. */
  @JsonProperty("key")
  private String key;

  /** The name of the scope to which the secret will be associated with. */
  @JsonProperty("scope")
  private String scope;

  /** If specified, note that the value will be stored in UTF-8 (MB4) form. */
  @JsonProperty("string_value")
  private String stringValue;

  /**
   * <p>Setter for the field <code>bytesValue</code>.</p>
   *
   * @param bytesValue a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.PutSecret} object
   */
  public PutSecret setBytesValue(String bytesValue) {
    this.bytesValue = bytesValue;
    return this;
  }

  /**
   * <p>Getter for the field <code>bytesValue</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getBytesValue() {
    return bytesValue;
  }

  /**
   * <p>Setter for the field <code>key</code>.</p>
   *
   * @param key a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.PutSecret} object
   */
  public PutSecret setKey(String key) {
    this.key = key;
    return this;
  }

  /**
   * <p>Getter for the field <code>key</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getKey() {
    return key;
  }

  /**
   * <p>Setter for the field <code>scope</code>.</p>
   *
   * @param scope a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.PutSecret} object
   */
  public PutSecret setScope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * <p>Getter for the field <code>scope</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getScope() {
    return scope;
  }

  /**
   * <p>Setter for the field <code>stringValue</code>.</p>
   *
   * @param stringValue a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.PutSecret} object
   */
  public PutSecret setStringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  /**
   * <p>Getter for the field <code>stringValue</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStringValue() {
    return stringValue;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PutSecret that = (PutSecret) o;
    return Objects.equals(bytesValue, that.bytesValue)
        && Objects.equals(key, that.key)
        && Objects.equals(scope, that.scope)
        && Objects.equals(stringValue, that.stringValue);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(bytesValue, key, scope, stringValue);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PutSecret.class)
        .add("bytesValue", bytesValue)
        .add("key", key)
        .add("scope", scope)
        .add("stringValue", stringValue)
        .toString();
  }
}
