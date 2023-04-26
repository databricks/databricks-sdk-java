// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ViewItem class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ViewItem {
  /** Content of the view. */
  @JsonProperty("content")
  private String content;

  /**
   * Name of the view item. In the case of code view, it would be the notebook’s name. In the case
   * of dashboard view, it would be the dashboard’s name.
   */
  @JsonProperty("name")
  private String name;

  /** Type of the view item. */
  @JsonProperty("type")
  private ViewType typeValue;

  /**
   * <p>Setter for the field <code>content</code>.</p>
   *
   * @param content a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.ViewItem} object
   */
  public ViewItem setContent(String content) {
    this.content = content;
    return this;
  }

  /**
   * <p>Getter for the field <code>content</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getContent() {
    return content;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.ViewItem} object
   */
  public ViewItem setName(String name) {
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
   * <p>setType.</p>
   *
   * @param typeValue a {@link com.databricks.sdk.service.jobs.ViewType} object
   * @return a {@link com.databricks.sdk.service.jobs.ViewItem} object
   */
  public ViewItem setType(ViewType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  /**
   * <p>getType.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.ViewType} object
   */
  public ViewType getType() {
    return typeValue;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ViewItem that = (ViewItem) o;
    return Objects.equals(content, that.content)
        && Objects.equals(name, that.name)
        && Objects.equals(typeValue, that.typeValue);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(content, name, typeValue);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ViewItem.class)
        .add("content", content)
        .add("name", name)
        .add("typeValue", typeValue)
        .toString();
  }
}
