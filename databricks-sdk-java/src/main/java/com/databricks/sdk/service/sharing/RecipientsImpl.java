// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Recipients */
class RecipientsImpl implements RecipientsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for RecipientsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public RecipientsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public RecipientInfo create(CreateRecipient request) {
    String path = "/api/2.1/unity-catalog/recipients";
    return apiClient.POST(path, request, RecipientInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteRecipientRequest request) {
    String path = String.format("/api/2.1/unity-catalog/recipients/%s", request.getName());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public RecipientInfo get(GetRecipientRequest request) {
    String path = String.format("/api/2.1/unity-catalog/recipients/%s", request.getName());
    return apiClient.GET(path, request, RecipientInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListRecipientsResponse list(ListRecipientsRequest request) {
    String path = "/api/2.1/unity-catalog/recipients";
    return apiClient.GET(path, request, ListRecipientsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public RecipientInfo rotateToken(RotateRecipientToken request) {
    String path =
        String.format("/api/2.1/unity-catalog/recipients/%s/rotate-token", request.getName());
    return apiClient.POST(path, request, RecipientInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public GetRecipientSharePermissionsResponse sharePermissions(SharePermissionsRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/recipients/%s/share-permissions", request.getName());
    return apiClient.GET(path, request, GetRecipientSharePermissionsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void update(UpdateRecipient request) {
    String path = String.format("/api/2.1/unity-catalog/recipients/%s", request.getName());
    apiClient.PATCH(path, request, Void.class);
  }
}
