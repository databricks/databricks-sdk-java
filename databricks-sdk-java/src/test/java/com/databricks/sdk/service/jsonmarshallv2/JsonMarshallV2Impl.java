// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.jsonmarshallv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of JsonMarshallV2 */
@Generated
class JsonMarshallV2Impl implements JsonMarshallV2Service {
  private final ApiClient apiClient;

  public JsonMarshallV2Impl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Resource getResource(GetResourceRequest request) {
    String path = String.format("/api/2.0/json-marshall/%s", request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Resource.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
