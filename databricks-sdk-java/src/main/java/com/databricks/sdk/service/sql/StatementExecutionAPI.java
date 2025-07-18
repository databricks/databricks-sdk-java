// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Databricks SQL Statement Execution API can be used to execute SQL statements on a SQL
 * warehouse and fetch the result.
 *
 * <p>**Getting started**
 *
 * <p>We suggest beginning with the [Databricks SQL Statement Execution API tutorial].
 *
 * <p>**Overview of statement execution and result fetching**
 *
 * <p>Statement execution begins by issuing a :method:statementexecution/executeStatement request
 * with a valid SQL statement and warehouse ID, along with optional parameters such as the data
 * catalog and output format. If no other parameters are specified, the server will wait for up to
 * 10s before returning a response. If the statement has completed within this timespan, the
 * response will include the result data as a JSON array and metadata. Otherwise, if no result is
 * available after the 10s timeout expired, the response will provide the statement ID that can be
 * used to poll for results by using a :method:statementexecution/getStatement request.
 *
 * <p>You can specify whether the call should behave synchronously, asynchronously or start
 * synchronously with a fallback to asynchronous execution. This is controlled with the
 * `wait_timeout` and `on_wait_timeout` settings. If `wait_timeout` is set between 5-50 seconds
 * (default: 10s), the call waits for results up to the specified timeout; when set to `0s`, the
 * call is asynchronous and responds immediately with a statement ID. The `on_wait_timeout` setting
 * specifies what should happen when the timeout is reached while the statement execution has not
 * yet finished. This can be set to either `CONTINUE`, to fallback to asynchronous mode, or it can
 * be set to `CANCEL`, which cancels the statement.
 *
 * <p>In summary: - Synchronous mode - `wait_timeout=30s` and `on_wait_timeout=CANCEL` - The call
 * waits up to 30 seconds; if the statement execution finishes within this time, the result data is
 * returned directly in the response. If the execution takes longer than 30 seconds, the execution
 * is canceled and the call returns with a `CANCELED` state. - Asynchronous mode - `wait_timeout=0s`
 * (`on_wait_timeout` is ignored) - The call doesn't wait for the statement to finish but returns
 * directly with a statement ID. The status of the statement execution can be polled by issuing
 * :method:statementexecution/getStatement with the statement ID. Once the execution has succeeded,
 * this call also returns the result and metadata in the response. - Hybrid mode (default) -
 * `wait_timeout=10s` and `on_wait_timeout=CONTINUE` - The call waits for up to 10 seconds; if the
 * statement execution finishes within this time, the result data is returned directly in the
 * response. If the execution takes longer than 10 seconds, a statement ID is returned. The
 * statement ID can be used to fetch status and results in the same way as in the asynchronous mode.
 *
 * <p>Depending on the size, the result can be split into multiple chunks. If the statement
 * execution is successful, the statement response contains a manifest and the first chunk of the
 * result. The manifest contains schema information and provides metadata for each chunk in the
 * result. Result chunks can be retrieved by index with
 * :method:statementexecution/getStatementResultChunkN which may be called in any order and in
 * parallel. For sequential fetching, each chunk, apart from the last, also contains a
 * `next_chunk_index` and `next_chunk_internal_link` that point to the next chunk.
 *
 * <p>A statement can be canceled with :method:statementexecution/cancelExecution.
 *
 * <p>**Fetching result data: format and disposition**
 *
 * <p>To specify the format of the result data, use the `format` field, which can be set to one of
 * the following options: `JSON_ARRAY` (JSON), `ARROW_STREAM` ([Apache Arrow Columnar]), or `CSV`.
 *
 * <p>There are two ways to receive statement results, controlled by the `disposition` setting,
 * which can be either `INLINE` or `EXTERNAL_LINKS`:
 *
 * <p>- `INLINE`: In this mode, the result data is directly included in the response. It's best
 * suited for smaller results. This mode can only be used with the `JSON_ARRAY` format.
 *
 * <p>- `EXTERNAL_LINKS`: In this mode, the response provides links that can be used to download the
 * result data in chunks separately. This approach is ideal for larger results and offers higher
 * throughput. This mode can be used with all the formats: `JSON_ARRAY`, `ARROW_STREAM`, and `CSV`.
 *
 * <p>By default, the API uses `format=JSON_ARRAY` and `disposition=INLINE`.
 *
 * <p>**Limits and limitations**
 *
 * <p>Note: The byte limit for INLINE disposition is based on internal storage metrics and will not
 * exactly match the byte count of the actual payload.
 *
 * <p>- Statements with `disposition=INLINE` are limited to 25 MiB and will fail when this limit is
 * exceeded. - Statements with `disposition=EXTERNAL_LINKS` are limited to 100 GiB. Result sets
 * larger than this limit will be truncated. Truncation is indicated by the `truncated` field in the
 * result manifest. - The maximum query text size is 16 MiB. - Cancelation might silently fail. A
 * successful response from a cancel request indicates that the cancel request was successfully
 * received and sent to the processing engine. However, an outstanding statement might have already
 * completed execution when the cancel request arrives. Polling for status until a terminal state is
 * reached is a reliable way to determine the final state. - Wait timeouts are approximate, occur
 * server-side, and cannot account for things such as caller delays and network latency from caller
 * to service. - To guarantee that the statement is kept alive, you must poll at least once every 15
 * minutes. - The results are only available for one hour after success; polling does not extend
 * this. - The SQL Execution API must be used for the entire lifecycle of the statement. For
 * example, you cannot use the Jobs API to execute the command, and then the SQL Execution API to
 * cancel it.
 *
 * <p>[Apache Arrow Columnar]: https://arrow.apache.org/overview/ [Databricks SQL Statement
 * Execution API tutorial]: https://docs.databricks.com/sql/api/sql-execution-tutorial.html
 */
@Generated
public class StatementExecutionAPI {
  private static final Logger LOG = LoggerFactory.getLogger(StatementExecutionAPI.class);

  private final StatementExecutionService impl;

  /** Regular-use constructor */
  public StatementExecutionAPI(ApiClient apiClient) {
    impl = new StatementExecutionImpl(apiClient);
  }

  /** Constructor for mocks */
  public StatementExecutionAPI(StatementExecutionService mock) {
    impl = mock;
  }

  /**
   * Requests that an executing statement be canceled. Callers must poll for status to see the
   * terminal state.
   */
  public void cancelExecution(CancelExecutionRequest request) {
    impl.cancelExecution(request);
  }

  /** Execute a SQL statement */
  public StatementResponse executeStatement(ExecuteStatementRequest request) {
    return impl.executeStatement(request);
  }

  public StatementResponse getStatement(String statementId) {
    return getStatement(new GetStatementRequest().setStatementId(statementId));
  }

  /**
   * This request can be used to poll for the statement's status. When the `status.state` field is
   * `SUCCEEDED` it will also return the result manifest and the first chunk of the result data.
   * When the statement is in the terminal states `CANCELED`, `CLOSED` or `FAILED`, it returns HTTP
   * 200 with the state set. After at least 12 hours in terminal state, the statement is removed
   * from the warehouse and further calls will receive an HTTP 404 response.
   *
   * <p>**NOTE** This call currently might take up to 5 seconds to get the latest status and result.
   */
  public StatementResponse getStatement(GetStatementRequest request) {
    return impl.getStatement(request);
  }

  public ResultData getStatementResultChunkN(String statementId, long chunkIndex) {
    return getStatementResultChunkN(
        new GetStatementResultChunkNRequest()
            .setStatementId(statementId)
            .setChunkIndex(chunkIndex));
  }

  /**
   * After the statement execution has `SUCCEEDED`, this request can be used to fetch any chunk by
   * index. Whereas the first chunk with `chunk_index=0` is typically fetched with
   * :method:statementexecution/executeStatement or :method:statementexecution/getStatement, this
   * request can be used to fetch subsequent chunks. The response structure is identical to the
   * nested `result` element described in the :method:statementexecution/getStatement request, and
   * similarly includes the `next_chunk_index` and `next_chunk_internal_link` fields for simple
   * iteration through the result set.
   */
  public ResultData getStatementResultChunkN(GetStatementResultChunkNRequest request) {
    return impl.getStatementResultChunkN(request);
  }

  public StatementExecutionService impl() {
    return impl;
  }
}
