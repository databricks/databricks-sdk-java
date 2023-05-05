// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.util.Collection;
import org.apache.http.client.methods.*;

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
    JavaType tpe =
        apiClient
            .getObjectMapper()
            .getTypeFactory()
            .constructCollectionType(Collection.class, DataSource.class);
    try {
      return apiClient.getObjectMapper().readValue(apiClient.GET(path, Collection.class), tpe);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
