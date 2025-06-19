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
@JsonSerialize(using = CreateAlert.CreateAlertSerializer.class)
@JsonDeserialize(using = CreateAlert.CreateAlertDeserializer.class)
public class CreateAlert {
  /** Name of the alert. */
  private String name;

  /** Alert configuration options. */
  private AlertOptions options;

  /** The identifier of the workspace folder containing the object. */
  private String parent;

  /** Query ID. */
  private String queryId;

  /**
   * Number of seconds after being triggered before the alert rearms itself and can be triggered
   * again. If `null`, alert will never be triggered again.
   */
  private Long rearm;

  public CreateAlert setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateAlert setOptions(AlertOptions options) {
    this.options = options;
    return this;
  }

  public AlertOptions getOptions() {
    return options;
  }

  public CreateAlert setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateAlert setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public CreateAlert setRearm(Long rearm) {
    this.rearm = rearm;
    return this;
  }

  public Long getRearm() {
    return rearm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAlert that = (CreateAlert) o;
    return Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(parent, that.parent)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(rearm, that.rearm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, options, parent, queryId, rearm);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAlert.class)
        .add("name", name)
        .add("options", options)
        .add("parent", parent)
        .add("queryId", queryId)
        .add("rearm", rearm)
        .toString();
  }

  CreateAlertPb toPb() {
    CreateAlertPb pb = new CreateAlertPb();
    pb.setName(name);
    pb.setOptions(options);
    pb.setParent(parent);
    pb.setQueryId(queryId);
    pb.setRearm(rearm);

    return pb;
  }

  static CreateAlert fromPb(CreateAlertPb pb) {
    CreateAlert model = new CreateAlert();
    model.setName(pb.getName());
    model.setOptions(pb.getOptions());
    model.setParent(pb.getParent());
    model.setQueryId(pb.getQueryId());
    model.setRearm(pb.getRearm());

    return model;
  }

  public static class CreateAlertSerializer extends JsonSerializer<CreateAlert> {
    @Override
    public void serialize(CreateAlert value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateAlertPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateAlertDeserializer extends JsonDeserializer<CreateAlert> {
    @Override
    public CreateAlert deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateAlertPb pb = mapper.readValue(p, CreateAlertPb.class);
      return CreateAlert.fromPb(pb);
    }
  }
}
