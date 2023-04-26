// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Widget class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Widget {
  /** The unique ID for this widget. */
  @JsonProperty("id")
  private Long id;

  /** */
  @JsonProperty("options")
  private WidgetOptions options;

  /**
   * The visualization description API changes frequently and is unsupported. You can duplicate a
   * visualization by copying description objects received _from the API_ and then using them to
   * create a new one with a POST request to the same endpoint. Databricks does not recommend
   * constructing ad-hoc visualizations entirely in JSON.
   */
  @JsonProperty("visualization")
  private Visualization visualization;

  /** Unused field. */
  @JsonProperty("width")
  private Long width;

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.Widget} object
   */
  public Widget setId(Long id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>options</code>.</p>
   *
   * @param options a {@link com.databricks.sdk.service.sql.WidgetOptions} object
   * @return a {@link com.databricks.sdk.service.sql.Widget} object
   */
  public Widget setOptions(WidgetOptions options) {
    this.options = options;
    return this;
  }

  /**
   * <p>Getter for the field <code>options</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.WidgetOptions} object
   */
  public WidgetOptions getOptions() {
    return options;
  }

  /**
   * <p>Setter for the field <code>visualization</code>.</p>
   *
   * @param visualization a {@link com.databricks.sdk.service.sql.Visualization} object
   * @return a {@link com.databricks.sdk.service.sql.Widget} object
   */
  public Widget setVisualization(Visualization visualization) {
    this.visualization = visualization;
    return this;
  }

  /**
   * <p>Getter for the field <code>visualization</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.Visualization} object
   */
  public Visualization getVisualization() {
    return visualization;
  }

  /**
   * <p>Setter for the field <code>width</code>.</p>
   *
   * @param width a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.Widget} object
   */
  public Widget setWidth(Long width) {
    this.width = width;
    return this;
  }

  /**
   * <p>Getter for the field <code>width</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getWidth() {
    return width;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Widget that = (Widget) o;
    return Objects.equals(id, that.id)
        && Objects.equals(options, that.options)
        && Objects.equals(visualization, that.visualization)
        && Objects.equals(width, that.width);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(id, options, visualization, width);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Widget.class)
        .add("id", id)
        .add("options", options)
        .add("visualization", visualization)
        .add("width", width)
        .toString();
  }
}
