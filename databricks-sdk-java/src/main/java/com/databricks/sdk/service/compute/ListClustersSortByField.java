// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * The sorting criteria. By default, clusters are sorted by 3 columns from highest to lowest
 * precedence: cluster state, pinned or unpinned, then cluster name.
 */
@Generated
public enum ListClustersSortByField {
  CLUSTER_NAME,
  DEFAULT,
}
