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

  /** State that alert evaluates to when query result is empty. */
  @JsonProperty("empty_result_state")
  private AlertOptionsEmptyResultState emptyResultState;

  /**
   * Whether or not the alert is muted. If an alert is muted, it will not notify users and
   * notification destinations when triggered.
   */
  @JsonProperty("muted")
  private Boolean muted;

  /** Operator used to compare in alert evaluation: `>`, `>=`, `<`, `<=`, `==`, `!=` */
  @JsonProperty("op")
  private String op;

  /**
   * Value used to compare in alert evaluation. Supported types include strings (eg. 'foobar'),
   * floats (eg. 123.4), and booleans (true).
   */
  @JsonProperty("value")
  private Object value;

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

  public AlertOptions setEmptyResultState(AlertOptionsEmptyResultState emptyResultState) {
    this.emptyResultState = emptyResultState;
    return this;
  }

  public AlertOptionsEmptyResultState getEmptyResultState() {
    return emptyResultState;
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

  public AlertOptions setValue(Object value) {
    this.value = value;
    return this;
  }

  public Object getValue() {
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
        && Objects.equals(emptyResultState, that.emptyResultState)
        && Objects.equals(muted, that.muted)
        && Objects.equals(op, that.op)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, customBody, customSubject, emptyResultState, muted, op, value);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertOptions.class)
        .add("column", column)
        .add("customBody", customBody)
        .add("customSubject", customSubject)
        .add("emptyResultState", emptyResultState)
        .add("muted", muted)
        .add("op", op)
        .add("value", value)
        .toString();
  }
}
