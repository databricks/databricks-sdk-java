// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.RequestOptions;
import com.databricks.sdk.core.oauth.DataPlaneTokenSource;
import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.support.Generated;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/** Package-local implementation of ServingEndpointsDataPlane */
@Generated
class ServingEndpointsDataPlaneImpl implements ServingEndpointsDataPlaneService {
  private final ApiClient apiClient;
  private final ServingEndpointsAPI controlPlane;
  private final DataPlaneTokenSource dataPlaneTokenSource;
  private final ConcurrentHashMap<String, DataPlaneInfo> infos;

  public ServingEndpointsDataPlaneImpl(
      ApiClient apiClient, DatabricksConfig config, ServingEndpointsAPI controlPlane) {
    this.apiClient = apiClient;
    this.controlPlane = controlPlane;
    this.dataPlaneTokenSource =
        new DataPlaneTokenSource(
            apiClient.getHttpClient(), config.getTokenSource(), config.getHost());
    this.infos = new ConcurrentHashMap<>();
  }

  private DataPlaneInfo dataPlaneInfoQuery(QueryEndpointInput request) {
    String key = String.format("Query/%s", request.getName());

    return infos.computeIfAbsent(
        key,
        k -> {
          ServingEndpointDetailed response =
              controlPlane.get(new GetServingEndpointRequest().setName(request.getName()));
          return response.getDataPlaneInfo().getQueryInfo();
        });
  }

  @Override
  public QueryEndpointResponse query(QueryEndpointInput request) {
    DataPlaneInfo dataPlaneInfo = dataPlaneInfoQuery(request);

    Token token =
        dataPlaneTokenSource.getToken(
            dataPlaneInfo.getEndpointUrl(), dataPlaneInfo.getAuthorizationDetails());

    try {
      Request req =
          new Request("POST", dataPlaneInfo.getEndpointUrl(), apiClient.serialize(request));
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");

      RequestOptions options =
          new RequestOptions()
              .withAuthorization("Bearer " + token.getAccessToken())
              .withUrl(dataPlaneInfo.getEndpointUrl());

      return apiClient.execute(req, QueryEndpointResponse.class, options);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
