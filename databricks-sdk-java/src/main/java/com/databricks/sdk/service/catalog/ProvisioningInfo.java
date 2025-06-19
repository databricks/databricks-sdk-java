// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** Status of an asynchronously provisioned resource. */
@Generated
@JsonSerialize(using = ProvisioningInfo.ProvisioningInfoSerializer.class)
@JsonDeserialize(using = ProvisioningInfo.ProvisioningInfoDeserializer.class)
public class ProvisioningInfo {
  /** The provisioning state of the resource. */
  private ProvisioningInfoState state;

  public ProvisioningInfo setState(ProvisioningInfoState state) {
    this.state = state;
    return this;
  }

  public ProvisioningInfoState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProvisioningInfo that = (ProvisioningInfo) o;
    return Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state);
  }

  @Override
  public String toString() {
    return new ToStringer(ProvisioningInfo.class).add("state", state).toString();
  }

  ProvisioningInfoPb toPb() {
    ProvisioningInfoPb pb = new ProvisioningInfoPb();
    pb.setState(state);

    return pb;
  }

  static ProvisioningInfo fromPb(ProvisioningInfoPb pb) {
    ProvisioningInfo model = new ProvisioningInfo();
    model.setState(pb.getState());

    return model;
  }

  public static class ProvisioningInfoSerializer extends JsonSerializer<ProvisioningInfo> {
    @Override
    public void serialize(ProvisioningInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ProvisioningInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ProvisioningInfoDeserializer extends JsonDeserializer<ProvisioningInfo> {
    @Override
    public ProvisioningInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ProvisioningInfoPb pb = mapper.readValue(p, ProvisioningInfoPb.class);
      return ProvisioningInfo.fromPb(pb);
    }
  }
}
