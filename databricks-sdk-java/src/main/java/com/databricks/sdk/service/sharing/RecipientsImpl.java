// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import org.apache.http.client.methods.*;

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
    return apiClient.POST(path, request, RecipientInfo.class);
  }

  @Override
  public void delete(DeleteRecipientRequest request) {
    String path = String.format("/api/2.1/unity-catalog/recipients/%s", request.getName());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public RecipientInfo get(GetRecipientRequest request) {
    String path = String.format("/api/2.1/unity-catalog/recipients/%s", request.getName());
    return apiClient.GET(path, request, RecipientInfo.class);
  }

  @Override
  public ListRecipientsResponse list(ListRecipientsRequest request) {
    String path = "/api/2.1/unity-catalog/recipients";
    return apiClient.GET(path, request, ListRecipientsResponse.class);
  }

  @Override
  public RecipientInfo rotateToken(RotateRecipientToken request) {
    String path =
        String.format("/api/2.1/unity-catalog/recipients/%s/rotate-token", request.getName());
    return apiClient.POST(path, request, RecipientInfo.class);
  }

  @Override
  public GetRecipientSharePermissionsResponse sharePermissions(SharePermissionsRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/recipients/%s/share-permissions", request.getName());
    return apiClient.GET(path, request, GetRecipientSharePermissionsResponse.class);
  }

  @Override
  public void update(UpdateRecipient request) {
    String path = String.format("/api/2.1/unity-catalog/recipients/%s", request.getName());
    apiClient.PATCH(path, request, Void.class);
  }
}
