// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListServicePrincipalSecretsRequest {
  /** */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * An opaque page token which was the `next_page_token` in the response of the previous request to
   * list the secrets for this service principal. Provide this token to retrieve the next page of
   * secret entries. When providing a `page_token`, all other parameters provided to the request
   * must match the previous request. To list all of the secrets for a service principal, it is
   * necessary to continue requesting pages of entries until the response contains no
   * `next_page_token`. Note that the number of entries returned must not be used to determine when
   * the listing is complete.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** The service principal ID. */
  @JsonIgnore private String servicePrincipalId;

  public ListServicePrincipalSecretsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListServicePrincipalSecretsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListServicePrincipalSecretsRequest setServicePrincipalId(String servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public String getServicePrincipalId() {
    return servicePrincipalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListServicePrincipalSecretsRequest that = (ListServicePrincipalSecretsRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListServicePrincipalSecretsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }
}
