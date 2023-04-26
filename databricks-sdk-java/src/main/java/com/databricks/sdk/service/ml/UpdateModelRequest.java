// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateModelRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateModelRequest {
  /** If provided, updates the description for this `registered_model`. */
  @JsonProperty("description")
  private String description;

  /** Registered model unique name identifier. */
  @JsonProperty("name")
  private String name;

  /**
   * <p>Setter for the field <code>description</code>.</p>
   *
   * @param description a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateModelRequest} object
   */
  public UpdateModelRequest setDescription(String description) {
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
   * @return a {@link com.databricks.sdk.service.ml.UpdateModelRequest} object
   */
  public UpdateModelRequest setName(String name) {
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
    UpdateModelRequest that = (UpdateModelRequest) o;
    return Objects.equals(description, that.description) && Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateModelRequest.class)
        .add("description", description)
        .add("name", name)
        .toString();
  }
}
