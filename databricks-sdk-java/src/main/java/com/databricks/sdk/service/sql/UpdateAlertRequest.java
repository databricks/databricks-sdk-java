// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = UpdateAlertRequest.UpdateAlertRequestSerializer.class)
@JsonDeserialize(using = UpdateAlertRequest.UpdateAlertRequestDeserializer.class)
public class UpdateAlertRequest {
  /** */
  private UpdateAlertRequestAlert alert;

  /**
   * If true, automatically resolve alert display name conflicts. Otherwise, fail the request if the
   * alert's display name conflicts with an existing alert's display name.
   */
  private Boolean autoResolveDisplayName;

  /** */
  private String id;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
   */
  private String updateMask;

  public UpdateAlertRequest setAlert(UpdateAlertRequestAlert alert) {
    this.alert = alert;
    return this;
  }

  public UpdateAlertRequestAlert getAlert() {
    return alert;
  }

  public UpdateAlertRequest setAutoResolveDisplayName(Boolean autoResolveDisplayName) {
    this.autoResolveDisplayName = autoResolveDisplayName;
    return this;
  }

  public Boolean getAutoResolveDisplayName() {
    return autoResolveDisplayName;
  }

  public UpdateAlertRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateAlertRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateAlertRequest that = (UpdateAlertRequest) o;
    return Objects.equals(alert, that.alert)
        && Objects.equals(autoResolveDisplayName, that.autoResolveDisplayName)
        && Objects.equals(id, that.id)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert, autoResolveDisplayName, id, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAlertRequest.class)
        .add("alert", alert)
        .add("autoResolveDisplayName", autoResolveDisplayName)
        .add("id", id)
        .add("updateMask", updateMask)
        .toString();
  }

  UpdateAlertRequestPb toPb() {
    UpdateAlertRequestPb pb = new UpdateAlertRequestPb();
    pb.setAlert(alert);
    pb.setAutoResolveDisplayName(autoResolveDisplayName);
    pb.setId(id);
    pb.setUpdateMask(updateMask);

    return pb;
  }

  static UpdateAlertRequest fromPb(UpdateAlertRequestPb pb) {
    UpdateAlertRequest model = new UpdateAlertRequest();
    model.setAlert(pb.getAlert());
    model.setAutoResolveDisplayName(pb.getAutoResolveDisplayName());
    model.setId(pb.getId());
    model.setUpdateMask(pb.getUpdateMask());

    return model;
  }

  public static class UpdateAlertRequestSerializer extends JsonSerializer<UpdateAlertRequest> {
    @Override
    public void serialize(UpdateAlertRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateAlertRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateAlertRequestDeserializer extends JsonDeserializer<UpdateAlertRequest> {
    @Override
    public UpdateAlertRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateAlertRequestPb pb = mapper.readValue(p, UpdateAlertRequestPb.class);
      return UpdateAlertRequest.fromPb(pb);
    }
  }
}
