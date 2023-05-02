// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Alert configuration options. */
@Generated
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

  public AlertOptions setColumn(String column) {
    this.column = column;
    return this;
  }

  public String getColumn() {
    return column;
  }

  public AlertOptions setCustomBody(String customBody) {
    this.customBody = customBody;
    return this;
  }

  public String getCustomBody() {
    return customBody;
  }

  public AlertOptions setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  public String getCustomSubject() {
    return customSubject;
  }

  public AlertOptions setMuted(Boolean muted) {
    this.muted = muted;
    return this;
  }

  public Boolean getMuted() {
    return muted;
  }

  public AlertOptions setOp(String op) {
    this.op = op;
    return this;
  }

  public String getOp() {
    return op;
  }

  public AlertOptions setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

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

  @Override
  public int hashCode() {
    return Objects.hash(column, customBody, customSubject, muted, op, value);
  }

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
