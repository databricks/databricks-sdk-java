// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ExecuteStatementRequest {
    /**
     * Applies given byte limit to execution and result size; byte counts based
     * upon internal representations, and may not match measureable sizes in
     * requested `format`.
     */
    @JsonProperty("byte_limit")
    private Long byteLimit;
    
    /**
     * Sets default catalog for statement execution, similar to [`USE CATALOG`]
     * in SQL.
     * 
     * [`USE CATALOG`]: https://docs.databricks.com/sql/language-manual/sql-ref-syntax-ddl-use-catalog.html
     */
    @JsonProperty("catalog")
    private String catalog;
    
    /**
     * The fetch disposition provides for two modes of fetching results:
     * `INLINE`, and `EXTERNAL_LINKS`.
     * 
     * Statements executed with `INLINE` disposition will return result data
     * inline, in `JSON_ARRAY` format, in a series of chunks. If a given
     * statement produces a result set with a size larger than 16 MiB, that
     * statement execution is aborted, and no result set will be available.
     * 
     * **NOTE** Byte limits are computed based upon internal representations of
     * the result set data, and may not match the sizes visible in JSON
     * responses.
     * 
     * Statements executed with `EXTERNAL_LINKS` disposition will return result
     * data as external links: URLs that point to cloud storage internal to the
     * workspace. Using `EXTERNAL_LINKS` disposition allows statements to
     * generate arbitrarily sized result sets for fetching up to 100 GiB. The
     * resulting links have two important properties:
     * 
     * 1. They point to resources _external_ to the Databricks compute;
     * therefore any associated authentication information (typically a personal
     * access token, OAuth token, or similar) _must be removed_ when fetching
     * from these links.
     * 
     * 2. These are presigned URLs with a specific expiration, indicated in the
     * response. The behavior when attempting to use an expired link is cloud
     * specific.
     */
    @JsonProperty("disposition")
    private Disposition disposition;
    
    /**
     * Statement execution supports two result formats: `JSON_ARRAY` (default),
     * and `ARROW_STREAM`.
     * 
     * **NOTE**
     * 
     * Currently `JSON_ARRAY` is only available for requests with
     * `disposition=INLINE`, and `ARROW_STREAM` is only available for requests
     * with `disposition=EXTERNAL_LINKS`.
     * 
     * When specifying `format=JSON_ARRAY`, result data will be formatted as an
     * array of arrays of values, where each value is either the *string
     * representation* of a value, or `null`. For example, the output of `SELECT
     * concat('id-', id) AS strId, id AS intId FROM range(3)` would look like
     * this:
     * 
     * ``` [ [ "id-1", "1" ], [ "id-2", "2" ], [ "id-3", "3" ], ] ```
     * 
     * `INLINE` `JSON_ARRAY` data can be found within
     * `StatementResponse.result.chunk.data_array` or
     * `ResultData.chunk.data_array`.
     * 
     * When specifying `format=ARROW_STREAM`, results fetched through
     * `external_links` will be chunks of result data, formatted as Apache Arrow
     * Stream. See
     * [https://arrow.apache.org/docs/format/Columnar.html#ipc-streaming-format]
     * for more details.
     */
    @JsonProperty("format")
    private Format format;
    
    /**
     * When called in synchronous mode (`wait_timeout > 0s`), determines action
     * when timeout reached:
     * 
     * `CONTINUE` → statement execution continues asynchronously; the call
     * returns a statement ID immediately. `CANCEL` → statement execution
     * canceled; call returns immediately with `CANCELED` state.
     */
    @JsonProperty("on_wait_timeout")
    private TimeoutAction onWaitTimeout;
    
    /**
     * Applies given row limit to execution and result set, identical in
     * semantics to SQL term `LIMIT $N`.
     */
    @JsonProperty("row_limit")
    private Long rowLimit;
    
    /**
     * Sets default schema for statement execution, similar to [`USE SCHEMA`] in
     * SQL.
     * 
     * [`USE SCHEMA`]: https://docs.databricks.com/sql/language-manual/sql-ref-syntax-ddl-use-schema.html
     */
    @JsonProperty("schema")
    private String schema;
    
    /**
     * SQL statement to execute
     */
    @JsonProperty("statement")
    private String statement;
    
    /**
     * Time that the API service will wait for the statement result, in format
     * '{N}s'. N may be '0s' for asynchronous, or may wait between 5-50
     * seconds."
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
    
}
