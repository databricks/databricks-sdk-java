// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Dbfs */
class DbfsImpl implements DbfsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for DbfsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public DbfsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public void addBlock(AddBlock request) {
    String path = "/api/2.0/dbfs/add-block";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void close(Close request) {
    String path = "/api/2.0/dbfs/close";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public CreateResponse create(Create request) {
    String path = "/api/2.0/dbfs/create";
    return apiClient.POST(path, request, CreateResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(Delete request) {
    String path = "/api/2.0/dbfs/delete";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public FileInfo getStatus(GetStatusRequest request) {
    String path = "/api/2.0/dbfs/get-status";
    return apiClient.GET(path, request, FileInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListStatusResponse list(ListDbfsRequest request) {
    String path = "/api/2.0/dbfs/list";
    return apiClient.GET(path, request, ListStatusResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void mkdirs(MkDirs request) {
    String path = "/api/2.0/dbfs/mkdirs";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void move(Move request) {
    String path = "/api/2.0/dbfs/move";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void put(Put request) {
    String path = "/api/2.0/dbfs/put";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public ReadResponse read(ReadDbfsRequest request) {
    String path = "/api/2.0/dbfs/read";
    return apiClient.GET(path, request, ReadResponse.class);
  }
}
