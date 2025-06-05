// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ExecuteStatementRequestPb {
  @JsonProperty("byte_limit")
  private Long byteLimit;

  @JsonProperty("catalog")
  private String catalog;

  @JsonProperty("disposition")
  private Disposition disposition;

  @JsonProperty("format")
  private Format format;

  @JsonProperty("on_wait_timeout")
  private ExecuteStatementRequestOnWaitTimeout onWaitTimeout;

  @JsonProperty("parameters")
  private Collection<StatementParameterListItem> parameters;

  @JsonProperty("row_limit")
  private Long rowLimit;

  @JsonProperty("schema")
  private String schema;

  @JsonProperty("statement")
  private String statement;

  @JsonProperty("wait_timeout")
  private String waitTimeout;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public ExecuteStatementRequestPb setByteLimit(Long byteLimit) {
    this.byteLimit = byteLimit;
    return this;
  }

  public Long getByteLimit() {
    return byteLimit;
  }

  public ExecuteStatementRequestPb setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public ExecuteStatementRequestPb setDisposition(Disposition disposition) {
    this.disposition = disposition;
    return this;
  }

  public Disposition getDisposition() {
    return disposition;
  }

  public ExecuteStatementRequestPb setFormat(Format format) {
    this.format = format;
    return this;
  }

  public Format getFormat() {
    return format;
  }

  public ExecuteStatementRequestPb setOnWaitTimeout(
      ExecuteStatementRequestOnWaitTimeout onWaitTimeout) {
    this.onWaitTimeout = onWaitTimeout;
    return this;
  }

  public ExecuteStatementRequestOnWaitTimeout getOnWaitTimeout() {
    return onWaitTimeout;
  }

  public ExecuteStatementRequestPb setParameters(
      Collection<StatementParameterListItem> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<StatementParameterListItem> getParameters() {
    return parameters;
  }

  public ExecuteStatementRequestPb setRowLimit(Long rowLimit) {
    this.rowLimit = rowLimit;
    return this;
  }

  public Long getRowLimit() {
    return rowLimit;
  }

  public ExecuteStatementRequestPb setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public ExecuteStatementRequestPb setStatement(String statement) {
    this.statement = statement;
    return this;
  }

  public String getStatement() {
    return statement;
  }

  public ExecuteStatementRequestPb setWaitTimeout(String waitTimeout) {
    this.waitTimeout = waitTimeout;
    return this;
  }

  public String getWaitTimeout() {
    return waitTimeout;
  }

  public ExecuteStatementRequestPb setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExecuteStatementRequestPb that = (ExecuteStatementRequestPb) o;
    return Objects.equals(byteLimit, that.byteLimit)
        && Objects.equals(catalog, that.catalog)
        && Objects.equals(disposition, that.disposition)
        && Objects.equals(format, that.format)
        && Objects.equals(onWaitTimeout, that.onWaitTimeout)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(rowLimit, that.rowLimit)
        && Objects.equals(schema, that.schema)
        && Objects.equals(statement, that.statement)
        && Objects.equals(waitTimeout, that.waitTimeout)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        byteLimit,
        catalog,
        disposition,
        format,
        onWaitTimeout,
        parameters,
        rowLimit,
        schema,
        statement,
        waitTimeout,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(ExecuteStatementRequestPb.class)
        .add("byteLimit", byteLimit)
        .add("catalog", catalog)
        .add("disposition", disposition)
        .add("format", format)
        .add("onWaitTimeout", onWaitTimeout)
        .add("parameters", parameters)
        .add("rowLimit", rowLimit)
        .add("schema", schema)
        .add("statement", statement)
        .add("waitTimeout", waitTimeout)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
