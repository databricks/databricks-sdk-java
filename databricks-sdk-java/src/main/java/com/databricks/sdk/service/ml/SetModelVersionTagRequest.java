// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SetModelVersionTagRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SetModelVersionTagRequest {
  /**
   * Name of the tag. Maximum size depends on storage backend. If a tag with this name already
   * exists, its preexisting value will be replaced by the specified `value`. All storage backends
   * are guaranteed to support key values up to 250 bytes in size.
   */
  @JsonProperty("key")
  private String key;

  /** Unique name of the model. */
  @JsonProperty("name")
  private String name;

  /**
   * String value of the tag being logged. Maximum size depends on storage backend. All storage
   * backends are guaranteed to support key values up to 5000 bytes in size.
   */
  @JsonProperty("value")
  private String value;

  /** Model version number. */
  @JsonProperty("version")
  private String version;

  /**
   * <p>Setter for the field <code>key</code>.</p>
   *
   * @param key a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.SetModelVersionTagRequest} object
   */
  public SetModelVersionTagRequest setKey(String key) {
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
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.SetModelVersionTagRequest} object
   */
  public SetModelVersionTagRequest setName(String name) {
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

  /**
   * <p>Setter for the field <code>value</code>.</p>
   *
   * @param value a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.SetModelVersionTagRequest} object
   */
  public SetModelVersionTagRequest setValue(String value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Getter for the field <code>value</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getValue() {
    return value;
  }

  /**
   * <p>Setter for the field <code>version</code>.</p>
   *
   * @param version a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.SetModelVersionTagRequest} object
   */
  public SetModelVersionTagRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  /**
   * <p>Getter for the field <code>version</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getVersion() {
    return version;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SetModelVersionTagRequest that = (SetModelVersionTagRequest) o;
    return Objects.equals(key, that.key)
        && Objects.equals(name, that.name)
        && Objects.equals(value, that.value)
        && Objects.equals(version, that.version);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(key, name, value, version);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SetModelVersionTagRequest.class)
        .add("key", key)
        .add("name", name)
        .add("value", value)
        .add("version", version)
        .toString();
  }
}
