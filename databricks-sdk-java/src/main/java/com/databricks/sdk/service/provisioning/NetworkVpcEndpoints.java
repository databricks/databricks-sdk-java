// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

/**
 * If specified, contains the VPC endpoints used to allow cluster communication from this VPC over
 * [AWS PrivateLink].
 *
 * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink/
 */
@Generated
@JsonSerialize(using = NetworkVpcEndpoints.NetworkVpcEndpointsSerializer.class)
@JsonDeserialize(using = NetworkVpcEndpoints.NetworkVpcEndpointsDeserializer.class)
public class NetworkVpcEndpoints {
  /**
   * The VPC endpoint ID used by this network to access the Databricks secure cluster connectivity
   * relay.
   */
  private Collection<String> dataplaneRelay;

  /** The VPC endpoint ID used by this network to access the Databricks REST API. */
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

  NetworkVpcEndpointsPb toPb() {
    NetworkVpcEndpointsPb pb = new NetworkVpcEndpointsPb();
    pb.setDataplaneRelay(dataplaneRelay);
    pb.setRestApi(restApi);

    return pb;
  }

  static NetworkVpcEndpoints fromPb(NetworkVpcEndpointsPb pb) {
    NetworkVpcEndpoints model = new NetworkVpcEndpoints();
    model.setDataplaneRelay(pb.getDataplaneRelay());
    model.setRestApi(pb.getRestApi());

    return model;
  }

  public static class NetworkVpcEndpointsSerializer extends JsonSerializer<NetworkVpcEndpoints> {
    @Override
    public void serialize(NetworkVpcEndpoints value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NetworkVpcEndpointsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NetworkVpcEndpointsDeserializer
      extends JsonDeserializer<NetworkVpcEndpoints> {
    @Override
    public NetworkVpcEndpoints deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NetworkVpcEndpointsPb pb = mapper.readValue(p, NetworkVpcEndpointsPb.class);
      return NetworkVpcEndpoints.fromPb(pb);
    }
  }
}
