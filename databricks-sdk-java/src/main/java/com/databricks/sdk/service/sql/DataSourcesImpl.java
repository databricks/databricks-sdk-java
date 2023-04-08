// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import java.util.List;
import org.apache.http.client.methods.*;

/** Package-local implementation of DataSources */
class DataSourcesImpl implements DataSourcesService {
  private final ApiClient apiClient;

  public DataSourcesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public List<DataSource> list() {
    String path = "/api/2.0/preview/sql/data_sources";
    return apiClient.GET(path, List.class);
  }
}
