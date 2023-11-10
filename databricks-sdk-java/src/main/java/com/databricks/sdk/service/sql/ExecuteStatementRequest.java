// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ExecuteStatementRequest {
  /**
   * Applies the given byte limit to the statement's result size. Byte counts are based on internal
   * data representations and might not match the final size in the requested `format`. If the
   * result was truncated due to the byte limit, then `truncated` in the response is set to `true`.
   * When using `EXTERNAL_LINKS` disposition, a default `byte_limit` of 100 GiB is applied if
   * `byte_limit` is not explcitly set.
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
   * size larger than 25 MiB, that statement execution is aborted, and no result set will be
   * available.
   *
   * <p>**NOTE** Byte limits are computed based upon internal representations of the result set
   * data, and might not match the sizes visible in JSON responses.
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
   * Statement execution supports three result formats: `JSON_ARRAY` (default), `ARROW_STREAM`, and
   * `CSV`.
   *
   * <p>Important: The formats `ARROW_STREAM` and `CSV` are supported only with `EXTERNAL_LINKS`
   * disposition. `JSON_ARRAY` is supported in `INLINE` and `EXTERNAL_LINKS` disposition.
   *
   * <p>When specifying `format=JSON_ARRAY`, result data will be formatted as an array of arrays of
   * values, where each value is either the *string representation* of a value, or `null`. For
   * example, the output of `SELECT concat('id-', id) AS strCol, id AS intCol, null AS nullCol FROM
   * range(3)` would look like this:
   *
   * <p>``` [ [ "id-1", "1", null ], [ "id-2", "2", null ], [ "id-3", "3", null ], ] ```
   *
   * <p>When specifying `format=JSON_ARRAY` and `disposition=EXTERNAL_LINKS`, each chunk in the
   * result contains compact JSON with no indentation or extra whitespace.
   *
   * <p>When specifying `format=ARROW_STREAM` and `disposition=EXTERNAL_LINKS`, each chunk in the
   * result will be formatted as Apache Arrow Stream. See the [Apache Arrow streaming format].
   *
   * <p>When specifying `format=CSV` and `disposition=EXTERNAL_LINKS`, each chunk in the result will
   * be a CSV according to [RFC 4180] standard. All the columns values will have *string
   * representation* similar to the `JSON_ARRAY` format, and `null` values will be encoded as
   * “null”. Only the first chunk in the result would contain a header row with column names. For
   * example, the output of `SELECT concat('id-', id) AS strCol, id AS intCol, null as nullCol FROM
   * range(3)` would look like this:
   *
   * <p>``` strCol,intCol,nullCol id-1,1,null id-2,2,null id-3,3,null ```
   *
   * <p>[Apache Arrow streaming format]:
   * https://arrow.apache.org/docs/format/Columnar.html#ipc-streaming-format [RFC 4180]:
   * https://www.rfc-editor.org/rfc/rfc4180
   */
  @JsonProperty("format")
  private Format format;

  /**
   * When `wait_timeout > 0s`, the call will block up to the specified time. If the statement
   * execution doesn't finish within this time, `on_wait_timeout` determines whether the execution
   * should continue or be canceled. When set to `CONTINUE`, the statement execution continues
   * asynchronously and the call returns a statement ID which can be used for polling with
   * :method:statementexecution/getStatement. When set to `CANCEL`, the statement execution is
   * canceled and the call returns with a `CANCELED` state.
   */
  @JsonProperty("on_wait_timeout")
  private ExecuteStatementRequestOnWaitTimeout onWaitTimeout;

  /**
   * A list of parameters to pass into a SQL statement containing parameter markers. A parameter
   * consists of a name, a value, and optionally a type. To represent a NULL value, the `value`
   * field may be omitted or set to `null` explicitly. If the `type` field is omitted, the value is
   * interpreted as a string.
   *
   * <p>If the type is given, parameters will be checked for type correctness according to the given
   * type. A value is correct if the provided string can be converted to the requested type using
   * the `cast` function. The exact semantics are described in the section [`cast` function] of the
   * SQL language reference.
   *
   * <p>For example, the following statement contains two parameters, `my_name` and `my_date`:
   *
   * <p>SELECT * FROM my_table WHERE name = :my_name AND date = :my_date
   *
   * <p>The parameters can be passed in the request body as follows:
   *
   * <p>{ ..., "statement": "SELECT * FROM my_table WHERE name = :my_name AND date = :my_date",
   * "parameters": [ { "name": "my_name", "value": "the name" }, { "name": "my_date", "value":
   * "2020-01-01", "type": "DATE" } ] }
   *
   * <p>Currently, positional parameters denoted by a `?` marker are not supported by the Databricks
   * SQL Statement Execution API.
   *
   * <p>Also see the section [Parameter markers] of the SQL language reference.
   *
   * <p>[Parameter markers]:
   * https://docs.databricks.com/sql/language-manual/sql-ref-parameter-marker.html [`cast`
   * function]: https://docs.databricks.com/sql/language-manual/functions/cast.html
   */
  @JsonProperty("parameters")
  private Collection<StatementParameterListItem> parameters;

  /**
   * Applies the given row limit to the statement's result set, but unlike the `LIMIT` clause in
   * SQL, it also sets the `truncated` field in the response to indicate whether the result was
   * trimmed due to the limit or not.
   */
  @JsonProperty("row_limit")
  private Long rowLimit;

  /**
   * Sets default schema for statement execution, similar to [`USE SCHEMA`] in SQL.
   *
   * <p>[`USE SCHEMA`]:
   * https://docs.databricks.com/sql/language-manual/sql-ref-syntax-ddl-use-schema.html
   */
  @JsonProperty("schema")
  private String schema;

  /**
   * The SQL statement to execute. The statement can optionally be parameterized, see `parameters`.
   */
  @JsonProperty("statement")
  private String statement;

  /**
   * The time in seconds the call will wait for the statement's result set as `Ns`, where `N` can be
   * set to 0 or to a value between 5 and 50.
   *
   * <p>When set to `0s`, the statement will execute in asynchronous mode and the call will not wait
   * for the execution to finish. In this case, the call returns directly with `PENDING` state and a
   * statement ID which can be used for polling with :method:statementexecution/getStatement.
   *
   * <p>When set between 5 and 50 seconds, the call will behave synchronously up to this timeout and
   * wait for the statement execution to finish. If the execution finishes within this time, the
   * call returns immediately with a manifest and result data (or a `FAILED` state in case of an
   * execution error). If the statement takes longer to execute, `on_wait_timeout` determines what
   * should happen after the timeout is reached.
   */
  @JsonProperty("wait_timeout")
  private String waitTimeout;

  /**
   * Warehouse upon which to execute a statement. See also [What are SQL
   * warehouses?](/sql/admin/warehouse-type.html)
   */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public ExecuteStatementRequest setByteLimit(Long byteLimit) {
    this.byteLimit = byteLimit;
    return this;
  }

  public Long getByteLimit() {
    return byteLimit;
  }

  public ExecuteStatementRequest setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public ExecuteStatementRequest setDisposition(Disposition disposition) {
    this.disposition = disposition;
    return this;
  }

  public Disposition getDisposition() {
    return disposition;
  }

  public ExecuteStatementRequest setFormat(Format format) {
    this.format = format;
    return this;
  }

  public Format getFormat() {
    return format;
  }

  public ExecuteStatementRequest setOnWaitTimeout(
      ExecuteStatementRequestOnWaitTimeout onWaitTimeout) {
    this.onWaitTimeout = onWaitTimeout;
    return this;
  }

  public ExecuteStatementRequestOnWaitTimeout getOnWaitTimeout() {
    return onWaitTimeout;
  }

  public ExecuteStatementRequest setParameters(Collection<StatementParameterListItem> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<StatementParameterListItem> getParameters() {
    return parameters;
  }

  public ExecuteStatementRequest setRowLimit(Long rowLimit) {
    this.rowLimit = rowLimit;
    return this;
  }

  public Long getRowLimit() {
    return rowLimit;
  }

  public ExecuteStatementRequest setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public ExecuteStatementRequest setStatement(String statement) {
    this.statement = statement;
    return this;
  }

  public String getStatement() {
    return statement;
  }

  public ExecuteStatementRequest setWaitTimeout(String waitTimeout) {
    this.waitTimeout = waitTimeout;
    return this;
  }

  public String getWaitTimeout() {
    return waitTimeout;
  }

  public ExecuteStatementRequest setWarehouseId(String warehouseId) {
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
    ExecuteStatementRequest that = (ExecuteStatementRequest) o;
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
    return new ToStringer(ExecuteStatementRequest.class)
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
