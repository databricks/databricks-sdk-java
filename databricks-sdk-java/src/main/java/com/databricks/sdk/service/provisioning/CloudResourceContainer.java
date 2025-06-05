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

/** The general workspace configurations that are specific to cloud providers. */
@Generated
@JsonSerialize(using = CloudResourceContainer.CloudResourceContainerSerializer.class)
@JsonDeserialize(using = CloudResourceContainer.CloudResourceContainerDeserializer.class)
public class CloudResourceContainer {
  /** The general workspace configurations that are specific to Google Cloud. */
  private CustomerFacingGcpCloudResourceContainer gcp;

  public CloudResourceContainer setGcp(CustomerFacingGcpCloudResourceContainer gcp) {
    this.gcp = gcp;
    return this;
  }

  public CustomerFacingGcpCloudResourceContainer getGcp() {
    return gcp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CloudResourceContainer that = (CloudResourceContainer) o;
    return Objects.equals(gcp, that.gcp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcp);
  }

  @Override
  public String toString() {
    return new ToStringer(CloudResourceContainer.class).add("gcp", gcp).toString();
  }

  CloudResourceContainerPb toPb() {
    CloudResourceContainerPb pb = new CloudResourceContainerPb();
    pb.setGcp(gcp);

    return pb;
  }

  static CloudResourceContainer fromPb(CloudResourceContainerPb pb) {
    CloudResourceContainer model = new CloudResourceContainer();
    model.setGcp(pb.getGcp());

    return model;
  }

  public static class CloudResourceContainerSerializer
      extends JsonSerializer<CloudResourceContainer> {
    @Override
    public void serialize(
        CloudResourceContainer value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CloudResourceContainerPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CloudResourceContainerDeserializer
      extends JsonDeserializer<CloudResourceContainer> {
    @Override
    public CloudResourceContainer deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CloudResourceContainerPb pb = mapper.readValue(p, CloudResourceContainerPb.class);
      return CloudResourceContainer.fromPb(pb);
    }
  }
}
