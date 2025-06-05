// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * If specified, contains the VPC endpoints used to allow cluster communication from this VPC over
 * [AWS PrivateLink].
 *
 * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink/
 */
@Generated
class NetworkVpcEndpointsPb {
  @JsonProperty("dataplane_relay")
  private Collection<String> dataplaneRelay;

  @JsonProperty("rest_api")
  private Collection<String> restApi;

  public NetworkVpcEndpointsPb setDataplaneRelay(Collection<String> dataplaneRelay) {
    this.dataplaneRelay = dataplaneRelay;
    return this;
  }

  public Collection<String> getDataplaneRelay() {
    return dataplaneRelay;
  }

  public NetworkVpcEndpointsPb setRestApi(Collection<String> restApi) {
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
    NetworkVpcEndpointsPb that = (NetworkVpcEndpointsPb) o;
    return Objects.equals(dataplaneRelay, that.dataplaneRelay)
        && Objects.equals(restApi, that.restApi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataplaneRelay, restApi);
  }

  @Override
  public String toString() {
    return new ToStringer(NetworkVpcEndpointsPb.class)
        .add("dataplaneRelay", dataplaneRelay)
        .add("restApi", restApi)
        .toString();
  }
}
