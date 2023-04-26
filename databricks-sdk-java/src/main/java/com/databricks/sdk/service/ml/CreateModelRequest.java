// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>CreateModelRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateModelRequest {
  /** Optional description for registered model. */
  @JsonProperty("description")
  private String description;

  /** Register models under this name */
  @JsonProperty("name")
  private String name;

  /** Additional metadata for registered model. */
  @JsonProperty("tags")
  private Collection<ModelTag> tags;

  /**
   * <p>Setter for the field <code>description</code>.</p>
   *
   * @param description a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.CreateModelRequest} object
   */
  public CreateModelRequest setDescription(String description) {
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
   * @return a {@link com.databricks.sdk.service.ml.CreateModelRequest} object
   */
  public CreateModelRequest setName(String name) {
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
   * <p>Setter for the field <code>tags</code>.</p>
   *
   * @param tags a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.CreateModelRequest} object
   */
  public CreateModelRequest setTags(Collection<ModelTag> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * <p>Getter for the field <code>tags</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ModelTag> getTags() {
    return tags;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateModelRequest that = (CreateModelRequest) o;
    return Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(tags, that.tags);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(description, name, tags);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateModelRequest.class)
        .add("description", description)
        .add("name", name)
        .add("tags", tags)
        .toString();
  }
}
