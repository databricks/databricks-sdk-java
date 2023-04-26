// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>EditAlert class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class EditAlert {
  /** */
  private String alertId;

  /** Name of the alert. */
  @JsonProperty("name")
  private String name;

  /** Alert configuration options. */
  @JsonProperty("options")
  private AlertOptions options;

  /** ID of the query evaluated by the alert. */
  @JsonProperty("query_id")
  private String queryId;

  /**
   * Number of seconds after being triggered before the alert rearms itself and can be triggered
   * again. If `null`, alert will never be triggered again.
   */
  @JsonProperty("rearm")
  private Long rearm;

  /**
   * <p>Setter for the field <code>alertId</code>.</p>
   *
   * @param alertId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.EditAlert} object
   */
  public EditAlert setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  /**
   * <p>Getter for the field <code>alertId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAlertId() {
    return alertId;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.EditAlert} object
   */
  public EditAlert setName(String name) {
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
   * @param options a {@link com.databricks.sdk.service.sql.AlertOptions} object
   * @return a {@link com.databricks.sdk.service.sql.EditAlert} object
   */
  public EditAlert setOptions(AlertOptions options) {
    this.options = options;
    return this;
  }

  /**
   * <p>Getter for the field <code>options</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.AlertOptions} object
   */
  public AlertOptions getOptions() {
    return options;
  }

  /**
   * <p>Setter for the field <code>queryId</code>.</p>
   *
   * @param queryId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.EditAlert} object
   */
  public EditAlert setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * <p>Getter for the field <code>queryId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getQueryId() {
    return queryId;
  }

  /**
   * <p>Setter for the field <code>rearm</code>.</p>
   *
   * @param rearm a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.EditAlert} object
   */
  public EditAlert setRearm(Long rearm) {
    this.rearm = rearm;
    return this;
  }

  /**
   * <p>Getter for the field <code>rearm</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRearm() {
    return rearm;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EditAlert that = (EditAlert) o;
    return Objects.equals(alertId, that.alertId)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(rearm, that.rearm);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(alertId, name, options, queryId, rearm);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(EditAlert.class)
        .add("alertId", alertId)
        .add("name", name)
        .add("options", options)
        .add("queryId", queryId)
        .add("rearm", rearm)
        .toString();
  }
}
