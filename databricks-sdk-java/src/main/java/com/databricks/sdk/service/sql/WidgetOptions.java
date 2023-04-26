// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>WidgetOptions class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class WidgetOptions {
  /** Timestamp when this object was created */
  @JsonProperty("created_at")
  private String createdAt;

  /** The dashboard ID to which this widget belongs. Each widget can belong to one dashboard. */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /** Whether this widget is hidden on the dashboard. */
  @JsonProperty("isHidden")
  private Boolean isHidden;

  /**
   * How parameters used by the visualization in this widget relate to other widgets on the
   * dashboard. Databricks does not recommend modifying this definition in JSON.
   */
  @JsonProperty("parameterMappings")
  private Object /* MISSING TYPE */ parameterMappings;

  /**
   * Coordinates of this widget on a dashboard. This portion of the API changes frequently and is
   * unsupported.
   */
  @JsonProperty("position")
  private Object /* MISSING TYPE */ position;

  /**
   * If this is a textbox widget, the application displays this text. This field is ignored if the
   * widget contains a visualization in the `visualization` field.
   */
  @JsonProperty("text")
  private String text;

  /** Timestamp of the last time this object was updated. */
  @JsonProperty("updated_at")
  private String updatedAt;

  /**
   * <p>Setter for the field <code>createdAt</code>.</p>
   *
   * @param createdAt a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.WidgetOptions} object
   */
  public WidgetOptions setCreatedAt(String createdAt) {
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
   * <p>Setter for the field <code>dashboardId</code>.</p>
   *
   * @param dashboardId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.WidgetOptions} object
   */
  public WidgetOptions setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  /**
   * <p>Getter for the field <code>dashboardId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDashboardId() {
    return dashboardId;
  }

  /**
   * <p>Setter for the field <code>isHidden</code>.</p>
   *
   * @param isHidden a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.WidgetOptions} object
   */
  public WidgetOptions setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * <p>Getter for the field <code>isHidden</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsHidden() {
    return isHidden;
  }

  /**
   * <p>Setter for the field <code>parameterMappings</code>.</p>
   *
   * @param parameterMappings a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.sql.WidgetOptions} object
   */
  public WidgetOptions setParameterMappings(Object /* MISSING TYPE */ parameterMappings) {
    this.parameterMappings = parameterMappings;
    return this;
  }

  /**
   * <p>Getter for the field <code>parameterMappings</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getParameterMappings() {
    return parameterMappings;
  }

  /**
   * <p>Setter for the field <code>position</code>.</p>
   *
   * @param position a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.sql.WidgetOptions} object
   */
  public WidgetOptions setPosition(Object /* MISSING TYPE */ position) {
    this.position = position;
    return this;
  }

  /**
   * <p>Getter for the field <code>position</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getPosition() {
    return position;
  }

  /**
   * <p>Setter for the field <code>text</code>.</p>
   *
   * @param text a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.WidgetOptions} object
   */
  public WidgetOptions setText(String text) {
    this.text = text;
    return this;
  }

  /**
   * <p>Getter for the field <code>text</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getText() {
    return text;
  }

  /**
   * <p>Setter for the field <code>updatedAt</code>.</p>
   *
   * @param updatedAt a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.WidgetOptions} object
   */
  public WidgetOptions setUpdatedAt(String updatedAt) {
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
    WidgetOptions that = (WidgetOptions) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(isHidden, that.isHidden)
        && Objects.equals(parameterMappings, that.parameterMappings)
        && Objects.equals(position, that.position)
        && Objects.equals(text, that.text)
        && Objects.equals(updatedAt, that.updatedAt);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, dashboardId, isHidden, parameterMappings, position, text, updatedAt);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(WidgetOptions.class)
        .add("createdAt", createdAt)
        .add("dashboardId", dashboardId)
        .add("isHidden", isHidden)
        .add("parameterMappings", parameterMappings)
        .add("position", position)
        .add("text", text)
        .add("updatedAt", updatedAt)
        .toString();
  }
}
