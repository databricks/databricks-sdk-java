// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * The field that search results are ordered by. SEVERITY breaks ties by last_seen_time, in the same
 * direction. Results are grouped by status first (PENDING, RESOLVED, then REJECTED, whatever the
 * sort_order), and remaining ties are broken by issue ID, so paging is stable.
 */
@Generated
public enum IssueSortKey {
  CREATE_TIME,
  LAST_SEEN_TIME,
  SEVERITY,
  UPDATE_TIME,
}
