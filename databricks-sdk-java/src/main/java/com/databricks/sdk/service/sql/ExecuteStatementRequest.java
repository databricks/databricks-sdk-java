// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ExecuteStatementRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ExecuteStatementRequest {
  /**
   * Applies the given byte limit to the statement's result size. Byte counts are based on internal
   * representations and may not match measurable sizes in the requested `format`.
   */
  @JsonProperty("byte_limit")
  private Long byteLimit;

  /**
   * Sets default catalog for statement execution, similar to [`USE CATALOG`] in SQL.
   *
   * <p>[`USE CATALOG`]:
   * https://docs.databricks.com/sql/language-manual/sql-ref-syntax-ddl-use-catalog.html
   */
  @JsonProperty("catalog")
  private String catalog;

  /**
   * The fetch disposition provides two modes of fetching results: `INLINE` and `EXTERNAL_LINKS`.
   *
   * <p>Statements executed with `INLINE` disposition will return result data inline, in
   * `JSON_ARRAY` format, in a series of chunks. If a given statement produces a result set with a
   * size larger than 16 MiB, that statement execution is aborted, and no result set will be
   * available.
   *
   * <p>**NOTE** Byte limits are computed based upon internal representations of the result set
   * data, and may not match the sizes visible in JSON responses.
   *
   * <p>Statements executed with `EXTERNAL_LINKS` disposition will return result data as external
   * links: URLs that point to cloud storage internal to the workspace. Using `EXTERNAL_LINKS`
   * disposition allows statements to generate arbitrarily sized result sets for fetching up to 100
   * GiB. The resulting links have two important properties:
   *
   * <p>1. They point to resources _external_ to the Databricks compute; therefore any associated
   * authentication information (typically a personal access token, OAuth token, or similar) _must
   * be removed_ when fetching from these links.
   *
   * <p>2. These are presigned URLs with a specific expiration, indicated in the response. The
   * behavior when attempting to use an expired link is cloud specific.
   */
  @JsonProperty("disposition")
  private Disposition disposition;

  /**
   * Statement execution supports two result formats: `JSON_ARRAY` (default), and `ARROW_STREAM`.
   *
   * <p>**NOTE**
   *
   * <p>Currently `JSON_ARRAY` is only available for requests with `disposition=INLINE`, and
   * `ARROW_STREAM` is only available for requests with `disposition=EXTERNAL_LINKS`.
   *
   * <p>When specifying `format=JSON_ARRAY`, result data will be formatted as an array of arrays of
   * values, where each value is either the *string representation* of a value, or `null`. For
   * example, the output of `SELECT concat('id-', id) AS strId, id AS intId FROM range(3)` would
   * look like this:
   *
   * <p>``` [ [ "id-1", "1" ], [ "id-2", "2" ], [ "id-3", "3" ], ] ```
   *
   * <p>`INLINE` `JSON_ARRAY` data can be found within `StatementResponse.result.chunk.data_array`
   * or `ResultData.chunk.data_array`.
   *
   * <p>When specifying `format=ARROW_STREAM`, results fetched through `external_links` will be
   * chunks of result data, formatted as Apache Arrow Stream. See [Apache Arrow Streaming Format]
   * for more details.
   *
   * <p>[Apache Arrow Streaming Format]:
   * https://arrow.apache.org/docs/format/Columnar.html#ipc-streaming-format
   */
  @JsonProperty("format")
  private Format format;

  /**
   * When in synchronous mode with `wait_timeout > 0s` it determines the action taken when the
   * timeout is reached:
   *
   * <p>`CONTINUE` → the statement execution continues asynchronously and the call returns a
   * statement ID immediately.
   *
   * <p>`CANCEL` → the statement execution is canceled and the call returns immediately with a
   * `CANCELED` state.
   */
  @JsonProperty("on_wait_timeout")
  private TimeoutAction onWaitTimeout;

  /**
   * Sets default schema for statement execution, similar to [`USE SCHEMA`] in SQL.
   *
   * <p>[`USE SCHEMA`]:
   * https://docs.databricks.com/sql/language-manual/sql-ref-syntax-ddl-use-schema.html
   */
  @JsonProperty("schema")
  private String schema;

  /** SQL statement to execute */
  @JsonProperty("statement")
  private String statement;

  /**
   * The time in seconds the API service will wait for the statement's result set as `Ns`, where `N`
   * can be set to 0 or to a value between 5 and 50. When set to '0s' the statement will execute in
   * asynchronous mode."
   */
  @JsonProperty("wait_timeout")
  private String waitTimeout;

  /**
   * Warehouse upon which to execute a statement. See also [What are SQL
   * warehouses?](/sql/admin/warehouse-type.html)
   */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  /**
   * <p>Setter for the field <code>byteLimit</code>.</p>
   *
   * @param byteLimit a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ExecuteStatementRequest} object
   */
  public ExecuteStatementRequest setByteLimit(Long byteLimit) {
    this.byteLimit = byteLimit;
    return this;
  }

  /**
   * <p>Getter for the field <code>byteLimit</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getByteLimit() {
    return byteLimit;
  }

  /**
   * <p>Setter for the field <code>catalog</code>.</p>
   *
   * @param catalog a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.ExecuteStatementRequest} object
   */
  public ExecuteStatementRequest setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  /**
   * <p>Getter for the field <code>catalog</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCatalog() {
    return catalog;
  }

  /**
   * <p>Setter for the field <code>disposition</code>.</p>
   *
   * @param disposition a {@link com.databricks.sdk.service.sql.Disposition} object
   * @return a {@link com.databricks.sdk.service.sql.ExecuteStatementRequest} object
   */
  public ExecuteStatementRequest setDisposition(Disposition disposition) {
    this.disposition = disposition;
    return this;
  }

  /**
   * <p>Getter for the field <code>disposition</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.Disposition} object
   */
  public Disposition getDisposition() {
    return disposition;
  }

  /**
   * <p>Setter for the field <code>format</code>.</p>
   *
   * @param format a {@link com.databricks.sdk.service.sql.Format} object
   * @return a {@link com.databricks.sdk.service.sql.ExecuteStatementRequest} object
   */
  public ExecuteStatementRequest setFormat(Format format) {
    this.format = format;
    return this;
  }

  /**
   * <p>Getter for the field <code>format</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.Format} object
   */
  public Format getFormat() {
    return format;
  }

  /**
   * <p>Setter for the field <code>onWaitTimeout</code>.</p>
   *
   * @param onWaitTimeout a {@link com.databricks.sdk.service.sql.TimeoutAction} object
   * @return a {@link com.databricks.sdk.service.sql.ExecuteStatementRequest} object
   */
  public ExecuteStatementRequest setOnWaitTimeout(TimeoutAction onWaitTimeout) {
    this.onWaitTimeout = onWaitTimeout;
    return this;
  }

  /**
   * <p>Getter for the field <code>onWaitTimeout</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.TimeoutAction} object
   */
  public TimeoutAction getOnWaitTimeout() {
    return onWaitTimeout;
  }

  /**
   * <p>Setter for the field <code>schema</code>.</p>
   *
   * @param schema a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.ExecuteStatementRequest} object
   */
  public ExecuteStatementRequest setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  /**
   * <p>Getter for the field <code>schema</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSchema() {
    return schema;
  }

  /**
   * <p>Setter for the field <code>statement</code>.</p>
   *
   * @param statement a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.ExecuteStatementRequest} object
   */
  public ExecuteStatementRequest setStatement(String statement) {
    this.statement = statement;
    return this;
  }

  /**
   * <p>Getter for the field <code>statement</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStatement() {
    return statement;
  }

  /**
   * <p>Setter for the field <code>waitTimeout</code>.</p>
   *
   * @param waitTimeout a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.ExecuteStatementRequest} object
   */
  public ExecuteStatementRequest setWaitTimeout(String waitTimeout) {
    this.waitTimeout = waitTimeout;
    return this;
  }

  /**
   * <p>Getter for the field <code>waitTimeout</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWaitTimeout() {
    return waitTimeout;
  }

  /**
   * <p>Setter for the field <code>warehouseId</code>.</p>
   *
   * @param warehouseId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.ExecuteStatementRequest} object
   */
  public ExecuteStatementRequest setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  /**
   * <p>Getter for the field <code>warehouseId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWarehouseId() {
    return warehouseId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExecuteStatementRequest that = (ExecuteStatementRequest) o;
    return Objects.equals(byteLimit, that.byteLimit)
        && Objects.equals(catalog, that.catalog)
        && Objects.equals(disposition, that.disposition)
        && Objects.equals(format, that.format)
        && Objects.equals(onWaitTimeout, that.onWaitTimeout)
        && Objects.equals(schema, that.schema)
        && Objects.equals(statement, that.statement)
        && Objects.equals(waitTimeout, that.waitTimeout)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        byteLimit,
        catalog,
        disposition,
        format,
        onWaitTimeout,
        schema,
        statement,
        waitTimeout,
        warehouseId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ExecuteStatementRequest.class)
        .add("byteLimit", byteLimit)
        .add("catalog", catalog)
        .add("disposition", disposition)
        .add("format", format)
        .add("onWaitTimeout", onWaitTimeout)
        .add("schema", schema)
        .add("statement", statement)
        .add("waitTimeout", waitTimeout)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
