// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;

/**
 * Based on
 * https://docs.databricks.com/aws/en/ingestion/cloud-object-storage/auto-loader/schema#how-does-auto-loader-schema-evolution-work
 */
@Generated
public enum FileIngestionOptionsSchemaEvolutionMode {
  ADD_NEW_COLUMNS,
  ADD_NEW_COLUMNS_WITH_TYPE_WIDENING,
  FAIL_ON_NEW_COLUMNS,
  NONE,
  RESCUE,
}
