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
   * data representations and might not match the final size in the requested {@code format}. If the
   * result was truncated due to the byte limit, then {@code truncated} in the response is set to
   * {@code true}. When using {@code EXTERNAL_LINKS} disposition, a default {@code byte_limit} of
   * 100 GiB is applied if {@code byte_limit} is not explicitly set.
   */
  @JsonProperty("byte_limit")
  private Long byteLimit;

  /**
   * Sets default catalog for statement execution, similar to <a
   * href="https://docs.databricks.com/sql/language-manual/sql-ref-syntax-ddl-use-catalog.html">{@code
   * USE CATALOG}</a> in SQL.
   */
  @JsonProperty("catalog")
  private String catalog;

  /**
   * The fetch disposition provides two modes of fetching results: {@code INLINE} and {@code
   * EXTERNAL_LINKS}.
   *
   * <p>Statements executed with {@code INLINE} disposition will return result data inline, in
   * {@code JSON_ARRAY} format, in a series of chunks. If a given statement produces a result set
   * with a size larger than 25 MiB, that statement execution is aborted, and no result set will be
   * available.
   *
   * <p><b>NOTE</b> Byte limits are computed based upon internal representations of the result set
   * data, and might not match the sizes visible in JSON responses.
   *
   * <p>Statements executed with {@code EXTERNAL_LINKS} disposition will return result data as
   * external links: URLs that point to cloud storage internal to the workspace. Using {@code
   * EXTERNAL_LINKS} disposition allows statements to generate arbitrarily sized result sets for
   * fetching up to 100 GiB. The resulting links have two important properties:
   *
   * <ol>
   *   <li>They point to resources <i>external</i> to the Databricks compute; therefore any
   *       associated authentication information (typically a personal access token, OAuth token, or
   *       similar) <i>must be removed</i> when fetching from these links.
   *   <li>These are URLs with a specific expiration, indicated in the response. The behavior when
   *       attempting to use an expired link is cloud specific.
   * </ol>
   */
  @JsonProperty("disposition")
  private Disposition disposition;

  /**
   * Statement execution supports three result formats: {@code JSON_ARRAY} (default), {@code
   * ARROW_STREAM}, and {@code CSV}.
   *
   * <p>Important: The formats {@code ARROW_STREAM} and {@code CSV} are supported only with {@code
   * EXTERNAL_LINKS} disposition. {@code JSON_ARRAY} is supported in {@code INLINE} and {@code
   * EXTERNAL_LINKS} disposition.
   *
   * <p>When specifying {@code format=JSON_ARRAY}, result data will be formatted as an array of
   * arrays of values, where each value is either the <i>string representation</i> of a value, or
   * {@code null}. For example, the output of {@code SELECT concat('id-', id) AS strCol, id AS
   * intCol, null AS nullCol FROM range(3)} would look like this:
   *
   * <pre>{@code
   * [
   * [ "id-1", "1", null ],
   * [ "id-2", "2", null ],
   * [ "id-3", "3", null ],
   * ]
   * }</pre>
   *
   * <p>When specifying {@code format=JSON_ARRAY} and {@code disposition=EXTERNAL_LINKS}, each chunk
   * in the result contains compact JSON with no indentation or extra whitespace.
   *
   * <p>When specifying {@code format=ARROW_STREAM} and {@code disposition=EXTERNAL_LINKS}, each
   * chunk in the result will be formatted as Apache Arrow Stream. See the <a
   * href="https://arrow.apache.org/docs/format/Columnar.html#ipc-streaming-format">Apache Arrow
   * streaming format</a>.
   *
   * <p>When specifying {@code format=CSV} and {@code disposition=EXTERNAL_LINKS}, each chunk in the
   * result will be a CSV according to <a href="https://www.rfc-editor.org/rfc/rfc4180">RFC 4180</a>
   * standard. All the columns values will have <i>string representation</i> similar to the {@code
   * JSON_ARRAY} format, and {@code null} values will be encoded as “null”. Only the first chunk in
   * the result would contain a header row with column names. For example, the output of {@code
   * SELECT concat('id-', id) AS strCol, id AS intCol, null as nullCol FROM range(3)} would look
   * like this:
   *
   * <pre>{@code
   * strCol,intCol,nullCol
   * id-1,1,null
   * id-2,2,null
   * id-3,3,null
   * }</pre>
   */
  @JsonProperty("format")
  private Format format;

  /**
   * When {@code wait_timeout > 0s}, the call will block up to the specified time. If the statement
   * execution doesn't finish within this time, {@code on_wait_timeout} determines whether the
   * execution should continue or be canceled. When set to {@code CONTINUE}, the statement execution
   * continues asynchronously and the call returns a statement ID which can be used for polling with
   * :method:statementexecution/getStatement. When set to {@code CANCEL}, the statement execution is
   * canceled and the call returns with a {@code CANCELED} state.
   */
  @JsonProperty("on_wait_timeout")
  private ExecuteStatementRequestOnWaitTimeout onWaitTimeout;

  /**
   * A list of parameters to pass into a SQL statement containing parameter markers. A parameter
   * consists of a name, a value, and optionally a type. To represent a NULL value, the {@code
   * value} field may be omitted or set to {@code null} explicitly. If the {@code type} field is
   * omitted, the value is interpreted as a string.
   *
   * <p>If the type is given, parameters will be checked for type correctness according to the given
   * type. A value is correct if the provided string can be converted to the requested type using
   * the {@code cast} function. The exact semantics are described in the section <a
   * href="https://docs.databricks.com/sql/language-manual/functions/cast.html">{@code cast}
   * function</a> of the SQL language reference.
   *
   * <p>For example, the following statement contains two parameters, {@code my_name} and {@code
   * my_date}:
   *
   * <pre>{@code
   * SELECT * FROM my_table WHERE name = :my_name AND date = :my_date
   * }</pre>
   *
   * <p>The parameters can be passed in the request body as follows:
   *
   * <p>{@code { ..., "statement": "SELECT * FROM my_table WHERE name = :my_name AND date =
   * :my_date", "parameters": [ { "name": "my_name", "value": "the name" }, { "name": "my_date",
   * "value": "2020-01-01", "type": "DATE" } ] }}
   *
   * <p>Currently, positional parameters denoted by a {@code ?} marker are not supported by the
   * Databricks SQL Statement Execution API.
   *
   * <p>Also see the section <a
   * href="https://docs.databricks.com/sql/language-manual/sql-ref-parameter-marker.html">Parameter
   * markers</a> of the SQL language reference.
   */
  @JsonProperty("parameters")
  private Collection<StatementParameterListItem> parameters;

  /**
   * An array of query tags to annotate a SQL statement. A query tag consists of a non-empty key
   * and, optionally, a value. To represent a NULL value, either omit the {@code value} field or
   * manually set it to {@code null} or white space. Refer to the SQL language reference for the
   * format specification of query tags. There's no significance to the order of tags. Only one
   * value per key will be recorded. A sequence in excess of 20 query tags will be coerced to 20.
   * Example:
   *
   * <p>{ ..., "query_tags": [ { "key": "team", "value": "eng" }, { "key": "some key only tag" } ] }
   */
  @JsonProperty("query_tags")
  private Collection<QueryTag> queryTags;

  /**
   * Applies the given row limit to the statement's result set, but unlike the {@code LIMIT} clause
   * in SQL, it also sets the {@code truncated} field in the response to indicate whether the result
   * was trimmed due to the limit or not.
   */
  @JsonProperty("row_limit")
  private Long rowLimit;

  /**
   * Sets default schema for statement execution, similar to <a
   * href="https://docs.databricks.com/sql/language-manual/sql-ref-syntax-ddl-use-schema.html">{@code
   * USE SCHEMA}</a> in SQL.
   */
  @JsonProperty("schema")
  private String schema;

  /**
   * The SQL statement to execute. The statement can optionally be parameterized, see {@code
   * parameters}. The maximum query text size is 16 MiB.
   */
  @JsonProperty("statement")
  private String statement;

  /**
   * The time in seconds the call will wait for the statement's result set as {@code Ns}, where
   * {@code N} can be set to 0 or to a value between 5 and 50.
   *
   * <p>When set to {@code 0s}, the statement will execute in asynchronous mode and the call will
   * not wait for the execution to finish. In this case, the call returns directly with {@code
   * PENDING} state and a statement ID which can be used for polling with
   * :method:statementexecution/getStatement.
   *
   * <p>When set between 5 and 50 seconds, the call will behave synchronously up to this timeout and
   * wait for the statement execution to finish. If the execution finishes within this time, the
   * call returns immediately with a manifest and result data (or a {@code FAILED} state in case of
   * an execution error). If the statement takes longer to execute, {@code on_wait_timeout}
   * determines what should happen after the timeout is reached.
   */
  @JsonProperty("wait_timeout")
  private String waitTimeout;

  /**
   * Warehouse upon which to execute a statement. See also <a
   * href="https://docs.databricks.com/sql/admin/warehouse-type.html">What are SQL warehouses?</a>
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

  public ExecuteStatementRequest setQueryTags(Collection<QueryTag> queryTags) {
    this.queryTags = queryTags;
    return this;
  }

  public Collection<QueryTag> getQueryTags() {
    return queryTags;
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
        && Objects.equals(queryTags, that.queryTags)
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
        queryTags,
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
        .add("queryTags", queryTags)
        .add("rowLimit", rowLimit)
        .add("schema", schema)
        .add("statement", statement)
        .add("waitTimeout", waitTimeout)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
