// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

@Generated
@JsonSerialize(
    using = EnforceClusterComplianceRequest.EnforceClusterComplianceRequestSerializer.class)
@JsonDeserialize(
    using = EnforceClusterComplianceRequest.EnforceClusterComplianceRequestDeserializer.class)
public class EnforceClusterComplianceRequest {
  /** The ID of the cluster you want to enforce policy compliance on. */
  private String clusterId;

  /**
   * If set, previews the changes that would be made to a cluster to enforce compliance but does not
   * update the cluster.
   */
  private Boolean validateOnly;

  public EnforceClusterComplianceRequest setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public EnforceClusterComplianceRequest setValidateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  public Boolean getValidateOnly() {
    return validateOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnforceClusterComplianceRequest that = (EnforceClusterComplianceRequest) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(validateOnly, that.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, validateOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(EnforceClusterComplianceRequest.class)
        .add("clusterId", clusterId)
        .add("validateOnly", validateOnly)
        .toString();
  }

  EnforceClusterComplianceRequestPb toPb() {
    EnforceClusterComplianceRequestPb pb = new EnforceClusterComplianceRequestPb();
    pb.setClusterId(clusterId);
    pb.setValidateOnly(validateOnly);

    return pb;
  }

  static EnforceClusterComplianceRequest fromPb(EnforceClusterComplianceRequestPb pb) {
    EnforceClusterComplianceRequest model = new EnforceClusterComplianceRequest();
    model.setClusterId(pb.getClusterId());
    model.setValidateOnly(pb.getValidateOnly());

    return model;
  }

  public static class EnforceClusterComplianceRequestSerializer
      extends JsonSerializer<EnforceClusterComplianceRequest> {
    @Override
    public void serialize(
        EnforceClusterComplianceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EnforceClusterComplianceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EnforceClusterComplianceRequestDeserializer
      extends JsonDeserializer<EnforceClusterComplianceRequest> {
    @Override
    public EnforceClusterComplianceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EnforceClusterComplianceRequestPb pb =
          mapper.readValue(p, EnforceClusterComplianceRequestPb.class);
      return EnforceClusterComplianceRequest.fromPb(pb);
    }
  }
}
