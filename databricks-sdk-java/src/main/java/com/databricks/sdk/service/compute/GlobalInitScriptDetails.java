// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = GlobalInitScriptDetails.GlobalInitScriptDetailsSerializer.class)
@JsonDeserialize(using = GlobalInitScriptDetails.GlobalInitScriptDetailsDeserializer.class)
public class GlobalInitScriptDetails {
  /** Time when the script was created, represented as a Unix timestamp in milliseconds. */
  private Long createdAt;

  /** The username of the user who created the script. */
  private String createdBy;

  /** Specifies whether the script is enabled. The script runs only if enabled. */
  private Boolean enabled;

  /** The name of the script */
  private String name;

  /**
   * The position of a script, where 0 represents the first script to run, 1 is the second script to
   * run, in ascending order.
   */
  private Long position;

  /** The global init script ID. */
  private String scriptId;

  /** Time when the script was updated, represented as a Unix timestamp in milliseconds. */
  private Long updatedAt;

  /** The username of the user who last updated the script */
  private String updatedBy;

  public GlobalInitScriptDetails setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public GlobalInitScriptDetails setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public GlobalInitScriptDetails setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public GlobalInitScriptDetails setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GlobalInitScriptDetails setPosition(Long position) {
    this.position = position;
    return this;
  }

  public Long getPosition() {
    return position;
  }

  public GlobalInitScriptDetails setScriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }

  public String getScriptId() {
    return scriptId;
  }

  public GlobalInitScriptDetails setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public GlobalInitScriptDetails setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GlobalInitScriptDetails that = (GlobalInitScriptDetails) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(enabled, that.enabled)
        && Objects.equals(name, that.name)
        && Objects.equals(position, that.position)
        && Objects.equals(scriptId, that.scriptId)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, createdBy, enabled, name, position, scriptId, updatedAt, updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(GlobalInitScriptDetails.class)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("enabled", enabled)
        .add("name", name)
        .add("position", position)
        .add("scriptId", scriptId)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }

  GlobalInitScriptDetailsPb toPb() {
    GlobalInitScriptDetailsPb pb = new GlobalInitScriptDetailsPb();
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setEnabled(enabled);
    pb.setName(name);
    pb.setPosition(position);
    pb.setScriptId(scriptId);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);

    return pb;
  }

  static GlobalInitScriptDetails fromPb(GlobalInitScriptDetailsPb pb) {
    GlobalInitScriptDetails model = new GlobalInitScriptDetails();
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setEnabled(pb.getEnabled());
    model.setName(pb.getName());
    model.setPosition(pb.getPosition());
    model.setScriptId(pb.getScriptId());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());

    return model;
  }

  public static class GlobalInitScriptDetailsSerializer
      extends JsonSerializer<GlobalInitScriptDetails> {
    @Override
    public void serialize(
        GlobalInitScriptDetails value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GlobalInitScriptDetailsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GlobalInitScriptDetailsDeserializer
      extends JsonDeserializer<GlobalInitScriptDetails> {
    @Override
    public GlobalInitScriptDetails deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GlobalInitScriptDetailsPb pb = mapper.readValue(p, GlobalInitScriptDetailsPb.class);
      return GlobalInitScriptDetails.fromPb(pb);
    }
  }
}
