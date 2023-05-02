// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

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
 * example, the output of `SELECT concat('id-', id) AS strId, id AS intId FROM range(3)` would look
 * like this:
 *
 * <p>``` [ [ "id-1", "1" ], [ "id-2", "2" ], [ "id-3", "3" ], ] ```
 *
 * <p>`INLINE` `JSON_ARRAY` data can be found within `StatementResponse.result.chunk.data_array` or
 * `ResultData.chunk.data_array`.
 *
 * <p>When specifying `format=ARROW_STREAM`, results fetched through `external_links` will be chunks
 * of result data, formatted as Apache Arrow Stream. See [Apache Arrow Streaming Format] for more
 * details.
 *
 * <p>[Apache Arrow Streaming Format]:
 * https://arrow.apache.org/docs/format/Columnar.html#ipc-streaming-format
 */
@Generated
public enum Format {
  ARROW_STREAM,
  JSON_ARRAY,
}
