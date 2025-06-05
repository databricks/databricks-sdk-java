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
import java.util.Objects;

/** The configurations for the GKE cluster of a Databricks workspace. */
@Generated
@JsonSerialize(using = GkeConfig.GkeConfigSerializer.class)
@JsonDeserialize(using = GkeConfig.GkeConfigDeserializer.class)
public class GkeConfig {
  /**
   * Specifies the network connectivity types for the GKE nodes and the GKE master network.
   *
   * <p>Set to `PRIVATE_NODE_PUBLIC_MASTER` for a private GKE cluster for the workspace. The GKE
   * nodes will not have public IPs.
   *
   * <p>Set to `PUBLIC_NODE_PUBLIC_MASTER` for a public GKE cluster. The nodes of a public GKE
   * cluster have public IP addresses.
   */
  private GkeConfigConnectivityType connectivityType;

  /**
   * The IP range from which to allocate GKE cluster master resources. This field will be ignored if
   * GKE private cluster is not enabled.
   *
   * <p>It must be exactly as big as `/28`.
   */
  private String masterIpRange;

  public GkeConfig setConnectivityType(GkeConfigConnectivityType connectivityType) {
    this.connectivityType = connectivityType;
    return this;
  }

  public GkeConfigConnectivityType getConnectivityType() {
    return connectivityType;
  }

  public GkeConfig setMasterIpRange(String masterIpRange) {
    this.masterIpRange = masterIpRange;
    return this;
  }

  public String getMasterIpRange() {
    return masterIpRange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GkeConfig that = (GkeConfig) o;
    return Objects.equals(connectivityType, that.connectivityType)
        && Objects.equals(masterIpRange, that.masterIpRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivityType, masterIpRange);
  }

  @Override
  public String toString() {
    return new ToStringer(GkeConfig.class)
        .add("connectivityType", connectivityType)
        .add("masterIpRange", masterIpRange)
        .toString();
  }

  GkeConfigPb toPb() {
    GkeConfigPb pb = new GkeConfigPb();
    pb.setConnectivityType(connectivityType);
    pb.setMasterIpRange(masterIpRange);

    return pb;
  }

  static GkeConfig fromPb(GkeConfigPb pb) {
    GkeConfig model = new GkeConfig();
    model.setConnectivityType(pb.getConnectivityType());
    model.setMasterIpRange(pb.getMasterIpRange());

    return model;
  }

  public static class GkeConfigSerializer extends JsonSerializer<GkeConfig> {
    @Override
    public void serialize(GkeConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GkeConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GkeConfigDeserializer extends JsonDeserializer<GkeConfig> {
    @Override
    public GkeConfig deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GkeConfigPb pb = mapper.readValue(p, GkeConfigPb.class);
      return GkeConfig.fromPb(pb);
    }
  }
}
