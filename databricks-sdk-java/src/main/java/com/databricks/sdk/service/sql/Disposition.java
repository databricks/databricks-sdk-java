// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * The fetch disposition provides two modes of fetching results: `INLINE` and `EXTERNAL_LINKS`.
 *
 * <p>Statements executed with `INLINE` disposition will return result data inline, in `JSON_ARRAY`
 * format, in a series of chunks. If a given statement produces a result set with a size larger than
 * 16 MiB, that statement execution is aborted, and no result set will be available.
 *
 * <p>**NOTE** Byte limits are computed based upon internal representations of the result set data,
 * and may not match the sizes visible in JSON responses.
 *
 * <p>Statements executed with `EXTERNAL_LINKS` disposition will return result data as external
 * links: URLs that point to cloud storage internal to the workspace. Using `EXTERNAL_LINKS`
 * disposition allows statements to generate arbitrarily sized result sets for fetching up to 100
 * GiB. The resulting links have two important properties:
 *
 * <p>1. They point to resources _external_ to the Databricks compute; therefore any associated
 * authentication information (typically a personal access token, OAuth token, or similar) _must be
 * removed_ when fetching from these links.
 *
 * <p>2. These are presigned URLs with a specific expiration, indicated in the response. The
 * behavior when attempting to use an expired link is cloud specific.
 */
@Generated
public enum Disposition {
  EXTERNAL_LINKS,
  INLINE,
}
