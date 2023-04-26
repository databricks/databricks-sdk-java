// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateModelVersionRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateModelVersionRequest {
  /** If provided, updates the description for this `registered_model`. */
  @JsonProperty("description")
  private String description;

  /** Name of the registered model */
  @JsonProperty("name")
  private String name;

  /** Model version number */
  @JsonProperty("version")
  private String version;

  /**
   * <p>Setter for the field <code>description</code>.</p>
   *
   * @param description a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateModelVersionRequest} object
   */
  public UpdateModelVersionRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Getter for the field <code>description</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDescription() {
    return description;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateModelVersionRequest} object
   */
  public UpdateModelVersionRequest setName(String name) {
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
   * <p>Setter for the field <code>version</code>.</p>
   *
   * @param version a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateModelVersionRequest} object
   */
  public UpdateModelVersionRequest setVersion(String version) {
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
    UpdateModelVersionRequest that = (UpdateModelVersionRequest) o;
    return Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(version, that.version);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(description, name, version);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateModelVersionRequest.class)
        .add("description", description)
        .add("name", name)
        .add("version", version)
        .toString();
  }
}
