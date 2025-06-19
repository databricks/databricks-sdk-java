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
@JsonSerialize(using = UpdateInstallationRequest.UpdateInstallationRequestSerializer.class)
@JsonDeserialize(using = UpdateInstallationRequest.UpdateInstallationRequestDeserializer.class)
public class UpdateInstallationRequest {
  /** */
  private InstallationDetail installation;

  /** */
  private String installationId;

  /** */
  private String listingId;

  /** */
  private Boolean rotateToken;

  public UpdateInstallationRequest setInstallation(InstallationDetail installation) {
    this.installation = installation;
    return this;
  }

  public InstallationDetail getInstallation() {
    return installation;
  }

  public UpdateInstallationRequest setInstallationId(String installationId) {
    this.installationId = installationId;
    return this;
  }

  public String getInstallationId() {
    return installationId;
  }

  public UpdateInstallationRequest setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public UpdateInstallationRequest setRotateToken(Boolean rotateToken) {
    this.rotateToken = rotateToken;
    return this;
  }

  public Boolean getRotateToken() {
    return rotateToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateInstallationRequest that = (UpdateInstallationRequest) o;
    return Objects.equals(installation, that.installation)
        && Objects.equals(installationId, that.installationId)
        && Objects.equals(listingId, that.listingId)
        && Objects.equals(rotateToken, that.rotateToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installation, installationId, listingId, rotateToken);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateInstallationRequest.class)
        .add("installation", installation)
        .add("installationId", installationId)
        .add("listingId", listingId)
        .add("rotateToken", rotateToken)
        .toString();
  }

  UpdateInstallationRequestPb toPb() {
    UpdateInstallationRequestPb pb = new UpdateInstallationRequestPb();
    pb.setInstallation(installation);
    pb.setInstallationId(installationId);
    pb.setListingId(listingId);
    pb.setRotateToken(rotateToken);

    return pb;
  }

  static UpdateInstallationRequest fromPb(UpdateInstallationRequestPb pb) {
    UpdateInstallationRequest model = new UpdateInstallationRequest();
    model.setInstallation(pb.getInstallation());
    model.setInstallationId(pb.getInstallationId());
    model.setListingId(pb.getListingId());
    model.setRotateToken(pb.getRotateToken());

    return model;
  }

  public static class UpdateInstallationRequestSerializer
      extends JsonSerializer<UpdateInstallationRequest> {
    @Override
    public void serialize(
        UpdateInstallationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateInstallationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateInstallationRequestDeserializer
      extends JsonDeserializer<UpdateInstallationRequest> {
    @Override
    public UpdateInstallationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateInstallationRequestPb pb = mapper.readValue(p, UpdateInstallationRequestPb.class);
      return UpdateInstallationRequest.fromPb(pb);
    }
  }
}
