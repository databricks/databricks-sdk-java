// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List service principal secrets */
@Generated
class ListServicePrincipalSecretsRequestPb {
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  @JsonIgnore private Long servicePrincipalId;

  public ListServicePrincipalSecretsRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListServicePrincipalSecretsRequestPb setServicePrincipalId(Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListServicePrincipalSecretsRequestPb that = (ListServicePrincipalSecretsRequestPb) o;
    return Objects.equals(pageToken, that.pageToken)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageToken, servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListServicePrincipalSecretsRequestPb.class)
        .add("pageToken", pageToken)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }
}
