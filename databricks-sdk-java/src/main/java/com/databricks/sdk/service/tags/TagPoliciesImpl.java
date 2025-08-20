// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.tags;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of TagPolicies */
@Generated
class TagPoliciesImpl implements TagPoliciesService {
  private final ApiClient apiClient;

  public TagPoliciesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public TagPolicy createTagPolicy(CreateTagPolicyRequest request) {
    String path = "/api/2.1/tag-policies";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getTagPolicy()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, TagPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteTagPolicy(DeleteTagPolicyRequest request) {
    String path = String.format("/api/2.1/tag-policies/%s", request.getTagKey());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public TagPolicy getTagPolicy(GetTagPolicyRequest request) {
    String path = String.format("/api/2.1/tag-policies/%s", request.getTagKey());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, TagPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListTagPoliciesResponse listTagPolicies(ListTagPoliciesRequest request) {
    String path = "/api/2.1/tag-policies";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListTagPoliciesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public TagPolicy updateTagPolicy(UpdateTagPolicyRequest request) {
    String path = String.format("/api/2.1/tag-policies/%s", request.getTagKey());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getTagPolicy()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, TagPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
