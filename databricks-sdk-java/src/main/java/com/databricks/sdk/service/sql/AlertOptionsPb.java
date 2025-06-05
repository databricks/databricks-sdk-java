// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Alert configuration options. */
@Generated
class AlertOptionsPb {
  @JsonProperty("column")
  private String column;

  @JsonProperty("custom_body")
  private String customBody;

  @JsonProperty("custom_subject")
  private String customSubject;

  @JsonProperty("empty_result_state")
  private AlertOptionsEmptyResultState emptyResultState;

  @JsonProperty("muted")
  private Boolean muted;

  @JsonProperty("op")
  private String op;

  @JsonProperty("value")
  private Object value;

  public AlertOptionsPb setColumn(String column) {
    this.column = column;
    return this;
  }

  public String getColumn() {
    return column;
  }

  public AlertOptionsPb setCustomBody(String customBody) {
    this.customBody = customBody;
    return this;
  }

  public String getCustomBody() {
    return customBody;
  }

  public AlertOptionsPb setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  public String getCustomSubject() {
    return customSubject;
  }

  public AlertOptionsPb setEmptyResultState(AlertOptionsEmptyResultState emptyResultState) {
    this.emptyResultState = emptyResultState;
    return this;
  }

  public AlertOptionsEmptyResultState getEmptyResultState() {
    return emptyResultState;
  }

  public AlertOptionsPb setMuted(Boolean muted) {
    this.muted = muted;
    return this;
  }

  public Boolean getMuted() {
    return muted;
  }

  public AlertOptionsPb setOp(String op) {
    this.op = op;
    return this;
  }

  public String getOp() {
    return op;
  }

  public AlertOptionsPb setValue(Object value) {
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
    AlertOptionsPb that = (AlertOptionsPb) o;
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
    return new ToStringer(AlertOptionsPb.class)
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
