// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * The target resources that are supported by Network Connectivity Config. Note: some egress types
 * can support general types that are not defined in EgressResourceType. E.g.: Azure private
 * endpoint supports private link enabled Azure services.
 */
@Generated
public enum EgressResourceType {
  AZURE_BLOB_STORAGE,
}
