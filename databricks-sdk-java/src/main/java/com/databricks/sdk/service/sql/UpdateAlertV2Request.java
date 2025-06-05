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

/** Update an alert */
@Generated
@JsonSerialize(using = UpdateAlertV2Request.UpdateAlertV2RequestSerializer.class)
@JsonDeserialize(using = UpdateAlertV2Request.UpdateAlertV2RequestDeserializer.class)
public class UpdateAlertV2Request {
  /** */
  private AlertV2 alert;

  /** UUID identifying the alert. */
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

  public UpdateAlertV2Request setAlert(AlertV2 alert) {
    this.alert = alert;
    return this;
  }

  public AlertV2 getAlert() {
    return alert;
  }

  public UpdateAlertV2Request setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateAlertV2Request setUpdateMask(String updateMask) {
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
    UpdateAlertV2Request that = (UpdateAlertV2Request) o;
    return Objects.equals(alert, that.alert)
        && Objects.equals(id, that.id)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert, id, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAlertV2Request.class)
        .add("alert", alert)
        .add("id", id)
        .add("updateMask", updateMask)
        .toString();
  }

  UpdateAlertV2RequestPb toPb() {
    UpdateAlertV2RequestPb pb = new UpdateAlertV2RequestPb();
    pb.setAlert(alert);
    pb.setId(id);
    pb.setUpdateMask(updateMask);

    return pb;
  }

  static UpdateAlertV2Request fromPb(UpdateAlertV2RequestPb pb) {
    UpdateAlertV2Request model = new UpdateAlertV2Request();
    model.setAlert(pb.getAlert());
    model.setId(pb.getId());
    model.setUpdateMask(pb.getUpdateMask());

    return model;
  }

  public static class UpdateAlertV2RequestSerializer extends JsonSerializer<UpdateAlertV2Request> {
    @Override
    public void serialize(
        UpdateAlertV2Request value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateAlertV2RequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateAlertV2RequestDeserializer
      extends JsonDeserializer<UpdateAlertV2Request> {
    @Override
    public UpdateAlertV2Request deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateAlertV2RequestPb pb = mapper.readValue(p, UpdateAlertV2RequestPb.class);
      return UpdateAlertV2Request.fromPb(pb);
    }
  }
}
