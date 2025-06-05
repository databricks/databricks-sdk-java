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

/** The Google Cloud specific information for this Private Service Connect endpoint. */
@Generated
@JsonSerialize(using = GcpVpcEndpointInfo.GcpVpcEndpointInfoSerializer.class)
@JsonDeserialize(using = GcpVpcEndpointInfo.GcpVpcEndpointInfoDeserializer.class)
public class GcpVpcEndpointInfo {
  /** Region of the PSC endpoint. */
  private String endpointRegion;

  /** The Google Cloud project ID of the VPC network where the PSC connection resides. */
  private String projectId;

  /** The unique ID of this PSC connection. */
  private String pscConnectionId;

  /** The name of the PSC endpoint in the Google Cloud project. */
  private String pscEndpointName;

  /** The service attachment this PSC connection connects to. */
  private String serviceAttachmentId;

  public GcpVpcEndpointInfo setEndpointRegion(String endpointRegion) {
    this.endpointRegion = endpointRegion;
    return this;
  }

  public String getEndpointRegion() {
    return endpointRegion;
  }

  public GcpVpcEndpointInfo setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public GcpVpcEndpointInfo setPscConnectionId(String pscConnectionId) {
    this.pscConnectionId = pscConnectionId;
    return this;
  }

  public String getPscConnectionId() {
    return pscConnectionId;
  }

  public GcpVpcEndpointInfo setPscEndpointName(String pscEndpointName) {
    this.pscEndpointName = pscEndpointName;
    return this;
  }

  public String getPscEndpointName() {
    return pscEndpointName;
  }

  public GcpVpcEndpointInfo setServiceAttachmentId(String serviceAttachmentId) {
    this.serviceAttachmentId = serviceAttachmentId;
    return this;
  }

  public String getServiceAttachmentId() {
    return serviceAttachmentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpVpcEndpointInfo that = (GcpVpcEndpointInfo) o;
    return Objects.equals(endpointRegion, that.endpointRegion)
        && Objects.equals(projectId, that.projectId)
        && Objects.equals(pscConnectionId, that.pscConnectionId)
        && Objects.equals(pscEndpointName, that.pscEndpointName)
        && Objects.equals(serviceAttachmentId, that.serviceAttachmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        endpointRegion, projectId, pscConnectionId, pscEndpointName, serviceAttachmentId);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpVpcEndpointInfo.class)
        .add("endpointRegion", endpointRegion)
        .add("projectId", projectId)
        .add("pscConnectionId", pscConnectionId)
        .add("pscEndpointName", pscEndpointName)
        .add("serviceAttachmentId", serviceAttachmentId)
        .toString();
  }

  GcpVpcEndpointInfoPb toPb() {
    GcpVpcEndpointInfoPb pb = new GcpVpcEndpointInfoPb();
    pb.setEndpointRegion(endpointRegion);
    pb.setProjectId(projectId);
    pb.setPscConnectionId(pscConnectionId);
    pb.setPscEndpointName(pscEndpointName);
    pb.setServiceAttachmentId(serviceAttachmentId);

    return pb;
  }

  static GcpVpcEndpointInfo fromPb(GcpVpcEndpointInfoPb pb) {
    GcpVpcEndpointInfo model = new GcpVpcEndpointInfo();
    model.setEndpointRegion(pb.getEndpointRegion());
    model.setProjectId(pb.getProjectId());
    model.setPscConnectionId(pb.getPscConnectionId());
    model.setPscEndpointName(pb.getPscEndpointName());
    model.setServiceAttachmentId(pb.getServiceAttachmentId());

    return model;
  }

  public static class GcpVpcEndpointInfoSerializer extends JsonSerializer<GcpVpcEndpointInfo> {
    @Override
    public void serialize(GcpVpcEndpointInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GcpVpcEndpointInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GcpVpcEndpointInfoDeserializer extends JsonDeserializer<GcpVpcEndpointInfo> {
    @Override
    public GcpVpcEndpointInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GcpVpcEndpointInfoPb pb = mapper.readValue(p, GcpVpcEndpointInfoPb.class);
      return GcpVpcEndpointInfo.fromPb(pb);
    }
  }
}
