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
   * Statement execution supports three result formats: `JSON_ARRAY` (default), `ARROW_STREAM`, and
   * `CSV`.
   *
   * <p>When specifying `format=JSON_ARRAY`, result data will be formatted as an array of arrays of
   * values, where each value is either the *string representation* of a value, or `null`. For
   * example, the output of `SELECT concat('id-', id) AS strCol, id AS intCol, null AS nullCol FROM
   * range(3)` would look like this:
   *
   * <p>``` [ [ "id-1", "1", null ], [ "id-2", "2", null ], [ "id-3", "3", null ], ] ```
   *
   * <p>`JSON_ARRAY` is supported with `INLINE` and `EXTERNAL_LINKS` dispositions.
   *
   * <p>`INLINE` `JSON_ARRAY` data can be found at the path `StatementResponse.result.data_array`.
   *
   * <p>For `EXTERNAL_LINKS` `JSON_ARRAY` results, each URL points to a file in cloud storage that
   * contains compact JSON with no indentation or extra whitespace.
   *
   * <p>When specifying `format=ARROW_STREAM`, each chunk in the result will be formatted as Apache
   * Arrow Stream. See the [Apache Arrow streaming format].
   *
   * <p>IMPORTANT: The format `ARROW_STREAM` is supported only with `EXTERNAL_LINKS` disposition.
   *
   * <p>When specifying `format=CSV`, each chunk in the result will be a CSV according to [RFC 4180]
   * standard. All the columns values will have *string representation* similar to the `JSON_ARRAY`
   * format, and `null` values will be encoded as “null”. Only the first chunk in the result would
   * contain a header row with column names. For example, the output of `SELECT concat('id-', id) AS
   * strCol, id AS intCol, null as nullCol FROM range(3)` would look like this:
   *
   * <p>``` strCol,intCol,nullCol id-1,1,null id-2,2,null id-3,3,null ```
   *
   * <p>IMPORTANT: The format `CSV` is supported only with `EXTERNAL_LINKS` disposition.
   *
   * <p>[Apache Arrow streaming format]:
   * https://arrow.apache.org/docs/format/Columnar.html#ipc-streaming-format [RFC 4180]:
   * https://www.rfc-editor.org/rfc/rfc4180
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
   * A list of parameters to pass into a SQL statement containing parameter markers. A parameter
   * consists of a name, a value, and optionally a type. To represent a NULL value, the `value`
   * field may be omitted. If the `type` field is omitted, the value is interpreted as a string.
   *
   * <p>If the type is given, parameters will be checked for type correctness according to the given
   * type. A value is correct if the provided string can be converted to the requested type using
   * the `cast` function. The exact semantics are described in the section [`cast` function] of the
   * SQL language reference.
   *
   * <p>For example, the following statement contains two parameters, `my_id` and `my_date`:
   *
   * <p>SELECT * FROM my_table WHERE name = :my_name AND date = :my_date
   *
   * <p>The parameters can be passed in the request body as follows:
   *
   * <p>{ ..., "statement": "SELECT * FROM my_table WHERE name = :my_name AND date = :my_date",
   * "parameters": [ { "name": "my_name", "value": "the name" }, { "name": "my_date", "value":
   * "2020-01-01", "type": "DATE" } ] }
   *
   * <p>Currently, positional parameters denoted by a `?` marker are not supported by the SQL
   * Statement Execution API.
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

  public ExecuteStatementRequest setOnWaitTimeout(TimeoutAction onWaitTimeout) {
    this.onWaitTimeout = onWaitTimeout;
    return this;
  }

  public TimeoutAction getOnWaitTimeout() {
    return onWaitTimeout;
  }

  public ExecuteStatementRequest setParameters(Collection<StatementParameterListItem> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<StatementParameterListItem> getParameters() {
    return parameters;
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
        .add("schema", schema)
        .add("statement", statement)
        .add("waitTimeout", waitTimeout)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
