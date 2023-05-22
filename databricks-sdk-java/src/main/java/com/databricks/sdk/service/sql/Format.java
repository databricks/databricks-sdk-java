// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * Statement execution supports two result formats: `JSON_ARRAY` (default), and `ARROW_STREAM`.
 *
 * <p>When specifying `format=JSON_ARRAY`, result data will be formatted as an array of arrays of
 * values, where each value is either the *string representation* of a value, or `null`. For
 * example, the output of `SELECT concat('id-', id) AS strId, id AS intId FROM range(3)` would look
 * like this:
 *
 * <p>``` [ [ "id-1", "1" ], [ "id-2", "2" ], [ "id-3", "3" ], ] ```
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
 * <p>[Apache Arrow streaming format]:
 * https://arrow.apache.org/docs/format/Columnar.html#ipc-streaming-format
 */
@Generated
public enum Format {
  ARROW_STREAM,
  JSON_ARRAY,
}
