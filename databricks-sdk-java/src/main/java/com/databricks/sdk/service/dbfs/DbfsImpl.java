// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dbfs;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Dbfs */
class DbfsImpl implements DbfsService {
  private final ApiClient apiClient;

  public DbfsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void addBlock(AddBlock request) {
    String path = "/api/2.0/dbfs/add-block";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public void close(Close request) {
    String path = "/api/2.0/dbfs/close";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public CreateResponse create(Create request) {
    String path = "/api/2.0/dbfs/create";
    return apiClient.POST(path, request, CreateResponse.class);
  }

  @Override
  public void delete(Delete request) {
    String path = "/api/2.0/dbfs/delete";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public FileInfo getStatus(GetStatus request) {
    String path = "/api/2.0/dbfs/get-status";
    return apiClient.GET(path, request, FileInfo.class);
  }

  @Override
  public ListStatusResponse list(List request) {
    String path = "/api/2.0/dbfs/list";
    return apiClient.GET(path, request, ListStatusResponse.class);
  }

  @Override
  public void mkdirs(MkDirs request) {
    String path = "/api/2.0/dbfs/mkdirs";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public void move(Move request) {
    String path = "/api/2.0/dbfs/move";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public void put(Put request) {
    String path = "/api/2.0/dbfs/put";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public ReadResponse read(Read request) {
    String path = "/api/2.0/dbfs/read";
    return apiClient.GET(path, request, ReadResponse.class);
  }
}
