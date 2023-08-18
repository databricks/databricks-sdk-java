// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Volumes */
@Generated
class VolumesImpl implements VolumesService {
  private final ApiClient apiClient;

  public VolumesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public VolumeInfo create(CreateVolumeRequestContent request) {
    String path = "/api/2.1/unity-catalog/volumes";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    return apiClient.POST(path, request, VolumeInfo.class, headers);
  }

  @Override
  public void delete(DeleteVolumeRequest request) {
    String path = String.format("/api/2.1/unity-catalog/volumes/%s", request.getFullNameArg());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public ListVolumesResponseContent list(ListVolumesRequest request) {
    String path = "/api/2.1/unity-catalog/volumes";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, ListVolumesResponseContent.class, headers);
  }

  @Override
  public VolumeInfo read(ReadVolumeRequest request) {
    String path = String.format("/api/2.1/unity-catalog/volumes/%s", request.getFullNameArg());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, VolumeInfo.class, headers);
  }

  @Override
  public VolumeInfo update(UpdateVolumeRequestContent request) {
    String path = String.format("/api/2.1/unity-catalog/volumes/%s", request.getFullNameArg());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    return apiClient.PATCH(path, request, VolumeInfo.class, headers);
  }
}
