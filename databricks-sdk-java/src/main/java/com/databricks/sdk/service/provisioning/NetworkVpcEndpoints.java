// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class NetworkVpcEndpoints {
  /**
   * The VPC endpoint ID used by this network to access the Databricks secure cluster connectivity
   * relay.
   */
  @JsonProperty("dataplane_relay")
  private Collection<String> dataplaneRelay;

  /** The VPC endpoint ID used by this network to access the Databricks REST API. */
  @JsonProperty("rest_api")
  private Collection<String> restApi;

  public NetworkVpcEndpoints setDataplaneRelay(Collection<String> dataplaneRelay) {
    this.dataplaneRelay = dataplaneRelay;
    return this;
  }

  public Collection<String> getDataplaneRelay() {
    return dataplaneRelay;
  }

  public NetworkVpcEndpoints setRestApi(Collection<String> restApi) {
    this.restApi = restApi;
    return this;
  }

  public Collection<String> getRestApi() {
    return restApi;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NetworkVpcEndpoints that = (NetworkVpcEndpoints) o;
    return Objects.equals(dataplaneRelay, that.dataplaneRelay)
        && Objects.equals(restApi, that.restApi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataplaneRelay, restApi);
  }

  @Override
  public String toString() {
    return new ToStringer(NetworkVpcEndpoints.class)
        .add("dataplaneRelay", dataplaneRelay)
        .add("restApi", restApi)
        .toString();
  }
}
