// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Statement execution supports three result formats: `JSON_ARRAY` (default),
 * `ARROW_STREAM`, and `CSV`.
 * 
 * When specifying `format=JSON_ARRAY`, result data will be formatted as an
 * array of arrays of values, where each value is either the *string
 * representation* of a value, or `null`. For example, the output of `SELECT
 * concat('id-', id) AS strCol, id AS intCol, null AS nullCol FROM range(3)`
 * would look like this:
 * 
 * ``` [ [ "id-1", "1", null ], [ "id-2", "2", null ], [ "id-3", "3", null ], ]
 * ```
 * 
 * `JSON_ARRAY` is supported with `INLINE` and `EXTERNAL_LINKS` dispositions.
 * 
 * `INLINE` `JSON_ARRAY` data can be found at the path
 * `StatementResponse.result.data_array`.
 * 
 * For `EXTERNAL_LINKS` `JSON_ARRAY` results, each URL points to a file in cloud
 * storage that contains compact JSON with no indentation or extra whitespace.
 * 
 * When specifying `format=ARROW_STREAM`, each chunk in the result will be
 * formatted as Apache Arrow Stream. See the [Apache Arrow streaming format].
 * 
 * IMPORTANT: The format `ARROW_STREAM` is supported only with `EXTERNAL_LINKS`
 * disposition.
 * 
 * When specifying `format=CSV`, each chunk in the result will be a CSV
 * according to [RFC 4180] standard. All the columns values will have *string
 * representation* similar to the `JSON_ARRAY` format, and `null` values will be
 * encoded as “null”. Only the first chunk in the result would contain a
 * header row with column names. For example, the output of `SELECT
 * concat('id-', id) AS strCol, id AS intCol, null as nullCol FROM range(3)`
 * would look like this:
 * 
 * ``` strCol,intCol,nullCol id-1,1,null id-2,2,null id-3,3,null ```
 * 
 * IMPORTANT: The format `CSV` is supported only with `EXTERNAL_LINKS`
 * disposition.
 * 
 * [Apache Arrow streaming format]: https://arrow.apache.org/docs/format/Columnar.html#ipc-streaming-format
 * [RFC 4180]: https://www.rfc-editor.org/rfc/rfc4180
 */
@Generated
public enum Format{
  ARROW_STREAM,
  CSV,
  JSON_ARRAY,
  
}