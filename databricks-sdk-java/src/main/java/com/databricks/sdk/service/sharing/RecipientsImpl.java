// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Recipients */
@Generated
class RecipientsImpl implements RecipientsService {
  private final ApiClient apiClient;

  public RecipientsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public RecipientInfo create(CreateRecipient request) {
    String path = "/api/2.1/unity-catalog/recipients";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    return apiClient.POST(path, request, RecipientInfo.class, headers);
  }

  @Override
  public void delete(DeleteRecipientRequest request) {
    String path = String.format("/api/2.1/unity-catalog/recipients/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public RecipientInfo get(GetRecipientRequest request) {
    String path = String.format("/api/2.1/unity-catalog/recipients/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, RecipientInfo.class, headers);
  }

  @Override
  public ListRecipientsResponse list(ListRecipientsRequest request) {
    String path = "/api/2.1/unity-catalog/recipients";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, ListRecipientsResponse.class, headers);
  }

  @Override
  public RecipientInfo rotateToken(RotateRecipientToken request) {
    String path =
        String.format("/api/2.1/unity-catalog/recipients/%s/rotate-token", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    return apiClient.POST(path, request, RecipientInfo.class, headers);
  }

  @Override
  public GetRecipientSharePermissionsResponse sharePermissions(SharePermissionsRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/recipients/%s/share-permissions", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, GetRecipientSharePermissionsResponse.class, headers);
  }

  @Override
  public void update(UpdateRecipient request) {
    String path = String.format("/api/2.1/unity-catalog/recipients/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    apiClient.PATCH(path, request, Void.class, headers);
  }
}
