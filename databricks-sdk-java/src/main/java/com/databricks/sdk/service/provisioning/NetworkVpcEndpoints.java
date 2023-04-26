// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * If specified, contains the VPC endpoints used to allow cluster communication from this VPC over
 * [AWS PrivateLink].
 *
 * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink/
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>dataplaneRelay</code>.</p>
   *
   * @param dataplaneRelay a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.provisioning.NetworkVpcEndpoints} object
   */
  public NetworkVpcEndpoints setDataplaneRelay(Collection<String> dataplaneRelay) {
    this.dataplaneRelay = dataplaneRelay;
    return this;
  }

  /**
   * <p>Getter for the field <code>dataplaneRelay</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getDataplaneRelay() {
    return dataplaneRelay;
  }

  /**
   * <p>Setter for the field <code>restApi</code>.</p>
   *
   * @param restApi a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.provisioning.NetworkVpcEndpoints} object
   */
  public NetworkVpcEndpoints setRestApi(Collection<String> restApi) {
    this.restApi = restApi;
    return this;
  }

  /**
   * <p>Getter for the field <code>restApi</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getRestApi() {
    return restApi;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NetworkVpcEndpoints that = (NetworkVpcEndpoints) o;
    return Objects.equals(dataplaneRelay, that.dataplaneRelay)
        && Objects.equals(restApi, that.restApi);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(dataplaneRelay, restApi);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(NetworkVpcEndpoints.class)
        .add("dataplaneRelay", dataplaneRelay)
        .add("restApi", restApi)
        .toString();
  }
}
