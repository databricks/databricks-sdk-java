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
@JsonSerialize(using = GlobalInitScriptCreateRequest.GlobalInitScriptCreateRequestSerializer.class)
@JsonDeserialize(
    using = GlobalInitScriptCreateRequest.GlobalInitScriptCreateRequestDeserializer.class)
public class GlobalInitScriptCreateRequest {
  /** Specifies whether the script is enabled. The script runs only if enabled. */
  private Boolean enabled;

  /** The name of the script */
  private String name;

  /**
   * The position of a global init script, where 0 represents the first script to run, 1 is the
   * second script to run, in ascending order.
   *
   * <p>If you omit the numeric position for a new global init script, it defaults to last position.
   * It will run after all current scripts. Setting any value greater than the position of the last
   * script is equivalent to the last position. Example: Take three existing scripts with positions
   * 0, 1, and 2. Any position of (3) or greater puts the script in the last position. If an
   * explicit position value conflicts with an existing script value, your request succeeds, but the
   * original script at that position and all later scripts have their positions incremented by 1.
   */
  private Long position;

  /** The Base64-encoded content of the script. */
  private String script;

  public GlobalInitScriptCreateRequest setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public GlobalInitScriptCreateRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GlobalInitScriptCreateRequest setPosition(Long position) {
    this.position = position;
    return this;
  }

  public Long getPosition() {
    return position;
  }

  public GlobalInitScriptCreateRequest setScript(String script) {
    this.script = script;
    return this;
  }

  public String getScript() {
    return script;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GlobalInitScriptCreateRequest that = (GlobalInitScriptCreateRequest) o;
    return Objects.equals(enabled, that.enabled)
        && Objects.equals(name, that.name)
        && Objects.equals(position, that.position)
        && Objects.equals(script, that.script);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, name, position, script);
  }

  @Override
  public String toString() {
    return new ToStringer(GlobalInitScriptCreateRequest.class)
        .add("enabled", enabled)
        .add("name", name)
        .add("position", position)
        .add("script", script)
        .toString();
  }

  GlobalInitScriptCreateRequestPb toPb() {
    GlobalInitScriptCreateRequestPb pb = new GlobalInitScriptCreateRequestPb();
    pb.setEnabled(enabled);
    pb.setName(name);
    pb.setPosition(position);
    pb.setScript(script);

    return pb;
  }

  static GlobalInitScriptCreateRequest fromPb(GlobalInitScriptCreateRequestPb pb) {
    GlobalInitScriptCreateRequest model = new GlobalInitScriptCreateRequest();
    model.setEnabled(pb.getEnabled());
    model.setName(pb.getName());
    model.setPosition(pb.getPosition());
    model.setScript(pb.getScript());

    return model;
  }

  public static class GlobalInitScriptCreateRequestSerializer
      extends JsonSerializer<GlobalInitScriptCreateRequest> {
    @Override
    public void serialize(
        GlobalInitScriptCreateRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GlobalInitScriptCreateRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GlobalInitScriptCreateRequestDeserializer
      extends JsonDeserializer<GlobalInitScriptCreateRequest> {
    @Override
    public GlobalInitScriptCreateRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GlobalInitScriptCreateRequestPb pb =
          mapper.readValue(p, GlobalInitScriptCreateRequestPb.class);
      return GlobalInitScriptCreateRequest.fromPb(pb);
    }
  }
}
