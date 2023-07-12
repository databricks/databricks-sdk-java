// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;

/** Package-local implementation of DataSources */
@Generated
class DataSourcesImpl implements DataSourcesService {
  private final ApiClient apiClient;

  public DataSourcesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Collection<DataSource> list() {
    String path = "/api/2.0/preview/sql/data_sources";
    return apiClient.getCollection(path, null, DataSource.class);
  }
}
