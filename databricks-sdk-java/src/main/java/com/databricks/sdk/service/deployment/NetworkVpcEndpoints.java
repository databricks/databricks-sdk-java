// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

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
public class NetworkVpcEndpoints {
  /**
   * The VPC endpoint ID used by this network to access the Databricks secure cluster connectivity
   * relay. See [Secure Cluster Connectivity].
   *
   * <p>This is a list type for future compatibility, but currently only one VPC endpoint ID should
   * be supplied.
   *
   * <p>**Note**: This is the Databricks-specific ID of the VPC endpoint object in the Account API,
   * not the AWS VPC endpoint ID that you see for your endpoint in the AWS Console.
   *
   * <p>[Secure Cluster Connectivity]:
   * https://docs.databricks.com/security/secure-cluster-connectivity.html
   */
  @JsonProperty("dataplane_relay")
  private Collection<String> dataplaneRelay;

  /**
   * The VPC endpoint ID used by this network to access the Databricks REST API. Databricks clusters
   * make calls to our REST API as part of cluster creation, mlflow tracking, and many other
   * features. Thus, this is required even if your workspace allows public access to the REST API.
   *
   * <p>This is a list type for future compatibility, but currently only one VPC endpoint ID should
   * be supplied.
   *
   * <p>**Note**: This is the Databricks-specific ID of the VPC endpoint object in the Account API,
   * not the AWS VPC endpoint ID that you see for your endpoint in the AWS Console.
   */
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
