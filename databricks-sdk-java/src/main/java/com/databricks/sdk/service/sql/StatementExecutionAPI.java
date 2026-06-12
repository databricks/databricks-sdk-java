// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;

/**
 * The Databricks SQL Statement Execution API can be used to execute SQL statements on a SQL
 * warehouse and fetch the result.
 *
 * <p><b>Getting started</b>
 *
 * <p>We suggest beginning with the <a
 * href="https://docs.databricks.com/sql/api/sql-execution-tutorial.html">Databricks SQL Statement
 * Execution API tutorial</a>.
 *
 * <p><b>Overview of statement execution and result fetching</b>
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
 * synchronously with a fallback to asynchronous execution. This is controlled with the {@code
 * wait_timeout} and {@code on_wait_timeout} settings. If {@code wait_timeout} is set between 5-50
 * seconds (default: 10s), the call waits for results up to the specified timeout; when set to
 * {@code 0s}, the call is asynchronous and responds immediately with a statement ID. The {@code
 * on_wait_timeout} setting specifies what should happen when the timeout is reached while the
 * statement execution has not yet finished. This can be set to either {@code CONTINUE}, to fallback
 * to asynchronous mode, or it can be set to {@code CANCEL}, which cancels the statement.
 *
 * <p>In summary:
 *
 * <ul>
 *   <li><b>Synchronous mode</b> ({@code wait_timeout=30s} and {@code on_wait_timeout=CANCEL}): The
 *       call waits up to 30 seconds; if the statement execution finishes within this time, the
 *       result data is returned directly in the response. If the execution takes longer than 30
 *       seconds, the execution is canceled and the call returns with a {@code CANCELED} state.
 *   <li><b>Asynchronous mode</b> ({@code wait_timeout=0s} and {@code on_wait_timeout} is ignored):
 *       The call doesn't wait for the statement to finish but returns directly with a statement ID.
 *       The status of the statement execution can be polled by issuing
 *       :method:statementexecution/getStatement with the statement ID. Once the execution has
 *       succeeded, this call also returns the result and metadata in the response.
 *   <li><b>[Default] Hybrid mode</b> ({@code wait_timeout=10s} and {@code
 *       on_wait_timeout=CONTINUE}): The call waits for up to 10 seconds; if the statement execution
 *       finishes within this time, the result data is returned directly in the response. If the
 *       execution takes longer than 10 seconds, a statement ID is returned. The statement ID can be
 *       used to fetch status and results in the same way as in the asynchronous mode.
 * </ul>
 *
 * <p>Depending on the size, the result can be split into multiple chunks. If the statement
 * execution is successful, the statement response contains a manifest and the first chunk of the
 * result. The manifest contains schema information and provides metadata for each chunk in the
 * result. Result chunks can be retrieved by index with
 * :method:statementexecution/getStatementResultChunkN which may be called in any order and in
 * parallel. For sequential fetching, each chunk, apart from the last, also contains a {@code
 * next_chunk_index} and {@code next_chunk_internal_link} that point to the next chunk.
 *
 * <p>A statement can be canceled with :method:statementexecution/cancelExecution.
 *
 * <p><b>Fetching result data: format and disposition</b>
 *
 * <p>To specify the format of the result data, use the {@code format} field, which can be set to
 * one of the following options: {@code JSON_ARRAY} (JSON), {@code ARROW_STREAM} (<a
 * href="https://arrow.apache.org/overview/">Apache Arrow Columnar</a>), or {@code CSV}.
 *
 * <p>There are two ways to receive statement results, controlled by the {@code disposition}
 * setting, which can be either {@code INLINE} or {@code EXTERNAL_LINKS}:
 *
 * <ul>
 *   <li>{@code INLINE}: In this mode, the result data is directly included in the response. It's
 *       best suited for smaller results. This mode can only be used with the {@code JSON_ARRAY}
 *       format.
 *   <li>{@code EXTERNAL_LINKS}: In this mode, the response provides links that can be used to
 *       download the result data in chunks separately. This approach is ideal for larger results
 *       and offers higher throughput. This mode can be used with all the formats: {@code
 *       JSON_ARRAY}, {@code ARROW_STREAM}, and {@code CSV}.
 * </ul>
 *
 * <p>By default, the API uses {@code format=JSON_ARRAY} and {@code disposition=INLINE}.
 *
 * <p><b>Limits and limitations</b>
 *
 * <p>Note: The byte limit for INLINE disposition is based on internal storage metrics and will not
 * exactly match the byte count of the actual payload.
 *
 * <ul>
 *   <li>Statements with {@code disposition=INLINE} are limited to 25 MiB and will fail when this
 *       limit is exceeded.
 *   <li>Statements with {@code disposition=EXTERNAL_LINKS} are limited to 100 GiB. Result sets
 *       larger than this limit will be truncated. Truncation is indicated by the {@code truncated}
 *       field in the result manifest.
 *   <li>The maximum query text size is 16 MiB.
 *   <li>Cancelation might silently fail. A successful response from a cancel request indicates that
 *       the cancel request was successfully received and sent to the processing engine. However, an
 *       outstanding statement might have already completed execution when the cancel request
 *       arrives. Polling for status until a terminal state is reached is a reliable way to
 *       determine the final state.
 *   <li>Wait timeouts are approximate, occur server-side, and cannot account for things such as
 *       caller delays and network latency from caller to service.
 *   <li>To guarantee that the statement is kept alive, you must poll at least once every 15
 *       minutes.
 *   <li>The results are only available for one hour after success; polling does not extend this.
 *   <li>The SQL Execution API must be used for the entire lifecycle of the statement. For example,
 *       you cannot use the Jobs API to execute the command, and then the SQL Execution API to
 *       cancel it.
 * </ul>
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
   * terminal state. Cancel response is empty; receiving response indicates successful receipt.
   */
  public void cancelExecution(CancelExecutionRequest request) {
    impl.cancelExecution(request);
  }

  /**
   * Execute a SQL statement and optionally await its results for a specified time.
   *
   * <p><b>Use case: small result sets with INLINE + JSON_ARRAY</b>
   *
   * <p>For flows that generate small and predictable result sets (&lt;= 25 MiB), {@code INLINE}
   * responses of {@code JSON_ARRAY} result data are typically the simplest way to execute and fetch
   * result data.
   *
   * <p><b>Use case: large result sets with EXTERNAL_LINKS</b>
   *
   * <p>Using {@code EXTERNAL_LINKS} to fetch result data allows you to fetch large result sets
   * efficiently. The main differences from using {@code INLINE} disposition are that the result
   * data is accessed with URLs, and that there are 3 supported formats: {@code JSON_ARRAY}, {@code
   * ARROW_STREAM} and {@code CSV} compared to only {@code JSON_ARRAY} with {@code INLINE}.
   *
   * <p>** URLs**
   *
   * <p>External links point to data stored within your workspace's internal storage, in the form of
   * a URL. The URLs are valid for only a short period, &lt;= 15 minutes. Alongside each {@code
   * external_link} is an expiration field indicating the time at which the URL is no longer valid.
   * In {@code EXTERNAL_LINKS} mode, chunks can be resolved and fetched multiple times and in
   * parallel.
   *
   * <p><hr>
   *
   * <p><b><b>Warning: Databricks strongly recommends that you protect the URLs that are returned by
   * the {@code EXTERNAL_LINKS} disposition.</b></b>
   *
   * <p>When you use the {@code EXTERNAL_LINKS} disposition, a short-lived, URL is generated, which
   * can be used to download the results directly from . As a short-lived is embedded in this URL,
   * you should protect the URL.
   *
   * <p>Because URLs are already generated with embedded temporary s, you must not set an {@code
   * Authorization} header in the download requests.
   *
   * <p>The {@code EXTERNAL_LINKS} disposition can be disabled upon request by creating a support
   * case.
   *
   * <p>See also <a
   * href="https://docs.databricks.com/sql/admin/sql-execution-tutorial.html#security-best-practices">Security
   * best practices</a>.
   *
   * <p><hr>
   *
   * <p>StatementResponse contains {@code statement_id} and {@code status}; other fields might be
   * absent or present depending on context. If the SQL warehouse fails to execute the provided
   * statement, a 200 response is returned with {@code status.state} set to {@code FAILED} (in
   * contrast to a failure when accepting the request, which results in a non-200 response). Details
   * of the error can be found at {@code status.error} in case of execution failures.
   */
  public StatementResponse executeStatement(ExecuteStatementRequest request) {
    return impl.executeStatement(request);
  }

  public StatementResponse getStatement(String statementId) {
    return getStatement(new GetStatementRequest().setStatementId(statementId));
  }

  /**
   * This request can be used to poll for the statement's status. StatementResponse contains {@code
   * statement_id} and {@code status}; other fields might be absent or present depending on context.
   * When the {@code status.state} field is {@code SUCCEEDED} it will also return the result
   * manifest and the first chunk of the result data. When the statement is in the terminal states
   * {@code CANCELED}, {@code CLOSED} or {@code FAILED}, it returns HTTP 200 with the state set.
   * After at least 12 hours in terminal state, the statement is removed from the warehouse and
   * further calls will receive an HTTP 404 response.
   *
   * <p><b>NOTE</b> This call currently might take up to 5 seconds to get the latest status and
   * result.
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
   * After the statement execution has {@code SUCCEEDED}, this request can be used to fetch any
   * chunk by index. Whereas the first chunk with {@code chunk_index=0} is typically fetched with
   * :method:statementexecution/executeStatement or :method:statementexecution/getStatement, this
   * request can be used to fetch subsequent chunks. The response structure is identical to the
   * nested {@code result} element described in the :method:statementexecution/getStatement request,
   * and similarly includes the {@code next_chunk_index} and {@code next_chunk_internal_link} fields
   * for simple iteration through the result set. Depending on {@code disposition}, the response
   * returns chunks of data either inline, or as links.
   */
  public ResultData getStatementResultChunkN(GetStatementResultChunkNRequest request) {
    return impl.getStatementResultChunkN(request);
  }

  public StatementExecutionService impl() {
    return impl;
  }
}
