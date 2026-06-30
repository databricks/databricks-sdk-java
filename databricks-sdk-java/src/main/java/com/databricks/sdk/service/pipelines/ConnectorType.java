// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;

/**
 * For certain database sources LakeFlow Connect offers both query based and cdc ingestion,
 * ConnectorType can bse used to convey the type of ingestion. If connection_name is provided for
 * database sources, we default to Query Based ingestion
 */
@Generated
public enum ConnectorType {
  CDC,
  QUERY_BASED,
}
