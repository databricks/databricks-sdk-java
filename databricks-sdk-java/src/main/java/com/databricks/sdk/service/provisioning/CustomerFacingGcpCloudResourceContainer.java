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

/** The general workspace configurations that are specific to Google Cloud. */
@Generated
@JsonSerialize(
    using =
        CustomerFacingGcpCloudResourceContainer.CustomerFacingGcpCloudResourceContainerSerializer
            .class)
@JsonDeserialize(
    using =
        CustomerFacingGcpCloudResourceContainer.CustomerFacingGcpCloudResourceContainerDeserializer
            .class)
public class CustomerFacingGcpCloudResourceContainer {
  /**
   * The Google Cloud project ID, which the workspace uses to instantiate cloud resources for your
   * workspace.
   */
  private String projectId;

  public CustomerFacingGcpCloudResourceContainer setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingGcpCloudResourceContainer that = (CustomerFacingGcpCloudResourceContainer) o;
    return Objects.equals(projectId, that.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingGcpCloudResourceContainer.class)
        .add("projectId", projectId)
        .toString();
  }

  CustomerFacingGcpCloudResourceContainerPb toPb() {
    CustomerFacingGcpCloudResourceContainerPb pb = new CustomerFacingGcpCloudResourceContainerPb();
    pb.setProjectId(projectId);

    return pb;
  }

  static CustomerFacingGcpCloudResourceContainer fromPb(
      CustomerFacingGcpCloudResourceContainerPb pb) {
    CustomerFacingGcpCloudResourceContainer model = new CustomerFacingGcpCloudResourceContainer();
    model.setProjectId(pb.getProjectId());

    return model;
  }

  public static class CustomerFacingGcpCloudResourceContainerSerializer
      extends JsonSerializer<CustomerFacingGcpCloudResourceContainer> {
    @Override
    public void serialize(
        CustomerFacingGcpCloudResourceContainer value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      CustomerFacingGcpCloudResourceContainerPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CustomerFacingGcpCloudResourceContainerDeserializer
      extends JsonDeserializer<CustomerFacingGcpCloudResourceContainer> {
    @Override
    public CustomerFacingGcpCloudResourceContainer deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CustomerFacingGcpCloudResourceContainerPb pb =
          mapper.readValue(p, CustomerFacingGcpCloudResourceContainerPb.class);
      return CustomerFacingGcpCloudResourceContainer.fromPb(pb);
    }
  }
}
