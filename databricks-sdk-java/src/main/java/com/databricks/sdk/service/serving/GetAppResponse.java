// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetAppResponse {
  /** */
  @JsonProperty("current_services")
  private Collection<AppServiceStatus> currentServices;

  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("pending_services")
  private Collection<AppServiceStatus> pendingServices;

  /** */
  @JsonProperty("url")
  private String url;

  public GetAppResponse setCurrentServices(Collection<AppServiceStatus> currentServices) {
    this.currentServices = currentServices;
    return this;
  }

  public Collection<AppServiceStatus> getCurrentServices() {
    return currentServices;
  }

  public GetAppResponse setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetAppResponse setPendingServices(Collection<AppServiceStatus> pendingServices) {
    this.pendingServices = pendingServices;
    return this;
  }

  public Collection<AppServiceStatus> getPendingServices() {
    return pendingServices;
  }

  public GetAppResponse setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAppResponse that = (GetAppResponse) o;
    return Objects.equals(currentServices, that.currentServices)
        && Objects.equals(name, that.name)
        && Objects.equals(pendingServices, that.pendingServices)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentServices, name, pendingServices, url);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAppResponse.class)
        .add("currentServices", currentServices)
        .add("name", name)
        .add("pendingServices", pendingServices)
        .add("url", url)
        .toString();
  }
}
