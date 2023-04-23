// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Volumes */
class VolumesImpl implements VolumesService {
  private final ApiClient apiClient;

  public VolumesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public VolumeInfo create(CreateVolumeRequestContent request) {
    String path = "/api/2.1/unity-catalog/volumes";
    return apiClient.POST(path, request, VolumeInfo.class);
  }

  @Override
  public void delete(DeleteVolumeRequest request) {
    String path = String.format("/api/2.1/unity-catalog/volumes/%s", request.getFullNameArg());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public ListVolumesResponseContent list(ListVolumesRequest request) {
    String path = "/api/2.1/unity-catalog/volumes";
    return apiClient.GET(path, request, ListVolumesResponseContent.class);
  }

  @Override
  public VolumeInfo read(ReadVolumeRequest request) {
    String path = String.format("/api/2.1/unity-catalog/volumes/%s", request.getFullNameArg());
    return apiClient.GET(path, request, VolumeInfo.class);
  }

  @Override
  public VolumeInfo update(UpdateVolumeRequestContent request) {
    String path = String.format("/api/2.1/unity-catalog/volumes/%s", request.getFullNameArg());
    return apiClient.PATCH(path, request, VolumeInfo.class);
  }
}
