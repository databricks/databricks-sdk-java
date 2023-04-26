// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RenameModelRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RenameModelRequest {
  /** Registered model unique name identifier. */
  @JsonProperty("name")
  private String name;

  /** If provided, updates the name for this `registered_model`. */
  @JsonProperty("new_name")
  private String newName;

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.RenameModelRequest} object
   */
  public RenameModelRequest setName(String name) {
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
   * <p>Setter for the field <code>newName</code>.</p>
   *
   * @param newName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.RenameModelRequest} object
   */
  public RenameModelRequest setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * <p>Getter for the field <code>newName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNewName() {
    return newName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RenameModelRequest that = (RenameModelRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(newName, that.newName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(name, newName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RenameModelRequest.class)
        .add("name", name)
        .add("newName", newName)
        .toString();
  }
}
