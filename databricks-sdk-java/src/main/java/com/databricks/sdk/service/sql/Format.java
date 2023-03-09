// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Statement execution supports two result formats: `JSON_ARRAY` (default), and
 * `ARROW_STREAM`.
 * 
 * **NOTE**
 * 
 * Currently `JSON_ARRAY` is only available for requests with
 * `disposition=INLINE`, and `ARROW_STREAM` is only available for requests with
 * `disposition=EXTERNAL_LINKS`.
 * 
 * When specifying `format=JSON_ARRAY`, result data will be formatted as an
 * array of arrays of values, where each value is either the *string
 * representation* of a value, or `null`. For example, the output of `SELECT
 * concat('id-', id) AS strId, id AS intId FROM range(3)` would look like this:
 * 
 * ``` [ [ "id-1", "1" ], [ "id-2", "2" ], [ "id-3", "3" ], ] ```
 * 
 * `INLINE` `JSON_ARRAY` data can be found within
 * `StatementResponse.result.chunk.data_array` or `ResultData.chunk.data_array`.
 * 
 * When specifying `format=ARROW_STREAM`, results fetched through
 * `external_links` will be chunks of result data, formatted as Apache Arrow
 * Stream. See [Apache Arrow Streaming Format] for more details.
 * 
 * [Apache Arrow Streaming Format]: https://arrow.apache.org/docs/format/Columnar.html#ipc-streaming-format
 */
public enum Format{
    ARROW_STREAM,
    JSON_ARRAY,
    
}