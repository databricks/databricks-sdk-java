// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = UpdateInstallationResponse.UpdateInstallationResponseSerializer.class)
@JsonDeserialize(using = UpdateInstallationResponse.UpdateInstallationResponseDeserializer.class)
public class UpdateInstallationResponse {
  /** */
  private InstallationDetail installation;

  public UpdateInstallationResponse setInstallation(InstallationDetail installation) {
    this.installation = installation;
    return this;
  }

  public InstallationDetail getInstallation() {
    return installation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateInstallationResponse that = (UpdateInstallationResponse) o;
    return Objects.equals(installation, that.installation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installation);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateInstallationResponse.class)
        .add("installation", installation)
        .toString();
  }

  UpdateInstallationResponsePb toPb() {
    UpdateInstallationResponsePb pb = new UpdateInstallationResponsePb();
    pb.setInstallation(installation);

    return pb;
  }

  static UpdateInstallationResponse fromPb(UpdateInstallationResponsePb pb) {
    UpdateInstallationResponse model = new UpdateInstallationResponse();
    model.setInstallation(pb.getInstallation());

    return model;
  }

  public static class UpdateInstallationResponseSerializer
      extends JsonSerializer<UpdateInstallationResponse> {
    @Override
    public void serialize(
        UpdateInstallationResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateInstallationResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateInstallationResponseDeserializer
      extends JsonDeserializer<UpdateInstallationResponse> {
    @Override
    public UpdateInstallationResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateInstallationResponsePb pb = mapper.readValue(p, UpdateInstallationResponsePb.class);
      return UpdateInstallationResponse.fromPb(pb);
    }
  }
}
