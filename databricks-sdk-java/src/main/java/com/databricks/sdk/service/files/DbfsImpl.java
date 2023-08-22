// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Dbfs */
@Generated
class DbfsImpl implements DbfsService {
  private final ApiClient apiClient;

  public DbfsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void addBlock(AddBlock request) {
    String path = "/api/2.0/dbfs/add-block";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void close(Close request) {
    String path = "/api/2.0/dbfs/close";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public CreateResponse create(Create request) {
    String path = "/api/2.0/dbfs/create";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateResponse.class, headers);
  }

  @Override
  public void delete(Delete request) {
    String path = "/api/2.0/dbfs/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public FileInfo getStatus(GetStatusRequest request) {
    String path = "/api/2.0/dbfs/get-status";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, FileInfo.class, headers);
  }

  @Override
  public ListStatusResponse list(ListDbfsRequest request) {
    String path = "/api/2.0/dbfs/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListStatusResponse.class, headers);
  }

  @Override
  public void mkdirs(MkDirs request) {
    String path = "/api/2.0/dbfs/mkdirs";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void move(Move request) {
    String path = "/api/2.0/dbfs/move";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void put(Put request) {
    String path = "/api/2.0/dbfs/put";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public ReadResponse read(ReadDbfsRequest request) {
    String path = "/api/2.0/dbfs/read";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ReadResponse.class, headers);
  }
}
