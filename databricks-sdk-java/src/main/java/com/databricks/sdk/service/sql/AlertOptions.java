// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Alert configuration options.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AlertOptions {
  /** Name of column in the query result to compare in alert evaluation. */
  @JsonProperty("column")
  private String column;

  /**
   * Custom body of alert notification, if it exists. See [here] for custom templating instructions.
   *
   * <p>[here]: https://docs.databricks.com/sql/user/alerts/index.html
   */
  @JsonProperty("custom_body")
  private String customBody;

  /**
   * Custom subject of alert notification, if it exists. This includes email subject, Slack
   * notification header, etc. See [here] for custom templating instructions.
   *
   * <p>[here]: https://docs.databricks.com/sql/user/alerts/index.html
   */
  @JsonProperty("custom_subject")
  private String customSubject;

  /**
   * Whether or not the alert is muted. If an alert is muted, it will not notify users and
   * notification destinations when triggered.
   */
  @JsonProperty("muted")
  private Boolean muted;

  /** Operator used to compare in alert evaluation: `>`, `>=`, `<`, `<=`, `==`, `!=` */
  @JsonProperty("op")
  private String op;

  /** Value used to compare in alert evaluation. */
  @JsonProperty("value")
  private String value;

  /**
   * <p>Setter for the field <code>column</code>.</p>
   *
   * @param column a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.AlertOptions} object
   */
  public AlertOptions setColumn(String column) {
    this.column = column;
    return this;
  }

  /**
   * <p>Getter for the field <code>column</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getColumn() {
    return column;
  }

  /**
   * <p>Setter for the field <code>customBody</code>.</p>
   *
   * @param customBody a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.AlertOptions} object
   */
  public AlertOptions setCustomBody(String customBody) {
    this.customBody = customBody;
    return this;
  }

  /**
   * <p>Getter for the field <code>customBody</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCustomBody() {
    return customBody;
  }

  /**
   * <p>Setter for the field <code>customSubject</code>.</p>
   *
   * @param customSubject a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.AlertOptions} object
   */
  public AlertOptions setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  /**
   * <p>Getter for the field <code>customSubject</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCustomSubject() {
    return customSubject;
  }

  /**
   * <p>Setter for the field <code>muted</code>.</p>
   *
   * @param muted a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.AlertOptions} object
   */
  public AlertOptions setMuted(Boolean muted) {
    this.muted = muted;
    return this;
  }

  /**
   * <p>Getter for the field <code>muted</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getMuted() {
    return muted;
  }

  /**
   * <p>Setter for the field <code>op</code>.</p>
   *
   * @param op a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.AlertOptions} object
   */
  public AlertOptions setOp(String op) {
    this.op = op;
    return this;
  }

  /**
   * <p>Getter for the field <code>op</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getOp() {
    return op;
  }

  /**
   * <p>Setter for the field <code>value</code>.</p>
   *
   * @param value a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.AlertOptions} object
   */
  public AlertOptions setValue(String value) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertOptions that = (AlertOptions) o;
    return Objects.equals(column, that.column)
        && Objects.equals(customBody, that.customBody)
        && Objects.equals(customSubject, that.customSubject)
        && Objects.equals(muted, that.muted)
        && Objects.equals(op, that.op)
        && Objects.equals(value, that.value);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(column, customBody, customSubject, muted, op, value);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(AlertOptions.class)
        .add("column", column)
        .add("customBody", customBody)
        .add("customSubject", customSubject)
        .add("muted", muted)
        .add("op", op)
        .add("value", value)
        .toString();
  }
}
