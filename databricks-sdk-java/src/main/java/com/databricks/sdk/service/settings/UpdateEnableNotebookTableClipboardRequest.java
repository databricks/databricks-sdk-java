// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Details required to update a setting. */
@Generated
@JsonSerialize(
    using =
        UpdateEnableNotebookTableClipboardRequest
            .UpdateEnableNotebookTableClipboardRequestSerializer.class)
@JsonDeserialize(
    using =
        UpdateEnableNotebookTableClipboardRequest
            .UpdateEnableNotebookTableClipboardRequestDeserializer.class)
public class UpdateEnableNotebookTableClipboardRequest {
  /** This should always be set to true for Settings API. Added for AIP compliance. */
  private Boolean allowMissing;

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
  private String fieldMask;

  /** */
  private EnableNotebookTableClipboard setting;

  public UpdateEnableNotebookTableClipboardRequest setAllowMissing(Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  public Boolean getAllowMissing() {
    return allowMissing;
  }

  public UpdateEnableNotebookTableClipboardRequest setFieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  public String getFieldMask() {
    return fieldMask;
  }

  public UpdateEnableNotebookTableClipboardRequest setSetting(
      EnableNotebookTableClipboard setting) {
    this.setting = setting;
    return this;
  }

  public EnableNotebookTableClipboard getSetting() {
    return setting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateEnableNotebookTableClipboardRequest that = (UpdateEnableNotebookTableClipboardRequest) o;
    return Objects.equals(allowMissing, that.allowMissing)
        && Objects.equals(fieldMask, that.fieldMask)
        && Objects.equals(setting, that.setting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMissing, fieldMask, setting);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateEnableNotebookTableClipboardRequest.class)
        .add("allowMissing", allowMissing)
        .add("fieldMask", fieldMask)
        .add("setting", setting)
        .toString();
  }

  UpdateEnableNotebookTableClipboardRequestPb toPb() {
    UpdateEnableNotebookTableClipboardRequestPb pb =
        new UpdateEnableNotebookTableClipboardRequestPb();
    pb.setAllowMissing(allowMissing);
    pb.setFieldMask(fieldMask);
    pb.setSetting(setting);

    return pb;
  }

  static UpdateEnableNotebookTableClipboardRequest fromPb(
      UpdateEnableNotebookTableClipboardRequestPb pb) {
    UpdateEnableNotebookTableClipboardRequest model =
        new UpdateEnableNotebookTableClipboardRequest();
    model.setAllowMissing(pb.getAllowMissing());
    model.setFieldMask(pb.getFieldMask());
    model.setSetting(pb.getSetting());

    return model;
  }

  public static class UpdateEnableNotebookTableClipboardRequestSerializer
      extends JsonSerializer<UpdateEnableNotebookTableClipboardRequest> {
    @Override
    public void serialize(
        UpdateEnableNotebookTableClipboardRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      UpdateEnableNotebookTableClipboardRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateEnableNotebookTableClipboardRequestDeserializer
      extends JsonDeserializer<UpdateEnableNotebookTableClipboardRequest> {
    @Override
    public UpdateEnableNotebookTableClipboardRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateEnableNotebookTableClipboardRequestPb pb =
          mapper.readValue(p, UpdateEnableNotebookTableClipboardRequestPb.class);
      return UpdateEnableNotebookTableClipboardRequest.fromPb(pb);
    }
  }
}
