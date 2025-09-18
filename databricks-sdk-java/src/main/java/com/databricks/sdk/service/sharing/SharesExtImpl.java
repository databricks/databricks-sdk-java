package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import java.io.IOException;

class SharesExtImpl implements SharesExtService {
  final ApiClient apiClient;

  public SharesExtImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ListSharesResponse list(ListSharesRequest request) {
    String path = "/api/2.1/unity-catalog/shares";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListSharesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
