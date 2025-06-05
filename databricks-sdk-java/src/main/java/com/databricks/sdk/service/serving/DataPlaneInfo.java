// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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

/** Details necessary to query this object's API through the DataPlane APIs. */
@Generated
@JsonSerialize(using = DataPlaneInfo.DataPlaneInfoSerializer.class)
@JsonDeserialize(using = DataPlaneInfo.DataPlaneInfoDeserializer.class)
public class DataPlaneInfo {
  /** Authorization details as a string. */
  private String authorizationDetails;

  /** The URL of the endpoint for this operation in the dataplane. */
  private String endpointUrl;

  public DataPlaneInfo setAuthorizationDetails(String authorizationDetails) {
    this.authorizationDetails = authorizationDetails;
    return this;
  }

  public String getAuthorizationDetails() {
    return authorizationDetails;
  }

  public DataPlaneInfo setEndpointUrl(String endpointUrl) {
    this.endpointUrl = endpointUrl;
    return this;
  }

  public String getEndpointUrl() {
    return endpointUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataPlaneInfo that = (DataPlaneInfo) o;
    return Objects.equals(authorizationDetails, that.authorizationDetails)
        && Objects.equals(endpointUrl, that.endpointUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationDetails, endpointUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(DataPlaneInfo.class)
        .add("authorizationDetails", authorizationDetails)
        .add("endpointUrl", endpointUrl)
        .toString();
  }

  DataPlaneInfoPb toPb() {
    DataPlaneInfoPb pb = new DataPlaneInfoPb();
    pb.setAuthorizationDetails(authorizationDetails);
    pb.setEndpointUrl(endpointUrl);

    return pb;
  }

  static DataPlaneInfo fromPb(DataPlaneInfoPb pb) {
    DataPlaneInfo model = new DataPlaneInfo();
    model.setAuthorizationDetails(pb.getAuthorizationDetails());
    model.setEndpointUrl(pb.getEndpointUrl());

    return model;
  }

  public static class DataPlaneInfoSerializer extends JsonSerializer<DataPlaneInfo> {
    @Override
    public void serialize(DataPlaneInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DataPlaneInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DataPlaneInfoDeserializer extends JsonDeserializer<DataPlaneInfo> {
    @Override
    public DataPlaneInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DataPlaneInfoPb pb = mapper.readValue(p, DataPlaneInfoPb.class);
      return DataPlaneInfo.fromPb(pb);
    }
  }
}
