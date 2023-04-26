// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The visualization description API changes frequently and is unsupported. You can duplicate a
 * visualization by copying description objects received _from the API_ and then using them to
 * create a new one with a POST request to the same endpoint. Databricks does not recommend
 * constructing ad-hoc visualizations entirely in JSON.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Visualization {
  /** */
  @JsonProperty("created_at")
  private String createdAt;

  /** A short description of this visualization. This is not displayed in the UI. */
  @JsonProperty("description")
  private String description;

  /** The UUID for this visualization. */
  @JsonProperty("id")
  private String id;

  /** The name of the visualization that appears on dashboards and the query screen. */
  @JsonProperty("name")
  private String name;

  /**
   * The options object varies widely from one visualization type to the next and is unsupported.
   * Databricks does not recommend modifying visualization settings in JSON.
   */
  @JsonProperty("options")
  private Object /* MISSING TYPE */ options;

  /** The type of visualization: chart, table, pivot table, and so on. */
  @JsonProperty("type")
  private String typeValue;

  /** */
  @JsonProperty("updated_at")
  private String updatedAt;

  /**
   * <p>Setter for the field <code>createdAt</code>.</p>
   *
   * @param createdAt a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Visualization} object
   */
  public Visualization setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdAt</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * <p>Setter for the field <code>description</code>.</p>
   *
   * @param description a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Visualization} object
   */
  public Visualization setDescription(String description) {
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
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Visualization} object
   */
  public Visualization setId(String id) {
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

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Visualization} object
   */
  public Visualization setName(String name) {
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
   * <p>Setter for the field <code>options</code>.</p>
   *
   * @param options a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.sql.Visualization} object
   */
  public Visualization setOptions(Object /* MISSING TYPE */ options) {
    this.options = options;
    return this;
  }

  /**
   * <p>Getter for the field <code>options</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getOptions() {
    return options;
  }

  /**
   * <p>setType.</p>
   *
   * @param typeValue a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Visualization} object
   */
  public Visualization setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  /**
   * <p>getType.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getType() {
    return typeValue;
  }

  /**
   * <p>Setter for the field <code>updatedAt</code>.</p>
   *
   * @param updatedAt a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Visualization} object
   */
  public Visualization setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedAt</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUpdatedAt() {
    return updatedAt;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Visualization that = (Visualization) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(updatedAt, that.updatedAt);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, id, name, options, typeValue, updatedAt);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Visualization.class)
        .add("createdAt", createdAt)
        .add("description", description)
        .add("id", id)
        .add("name", name)
        .add("options", options)
        .add("typeValue", typeValue)
        .add("updatedAt", updatedAt)
        .toString();
  }
}
