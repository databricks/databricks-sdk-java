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
@JsonSerialize(using = EditAlert.EditAlertSerializer.class)
@JsonDeserialize(using = EditAlert.EditAlertDeserializer.class)
public class EditAlert {
  /** */
  private String alertId;

  /** Name of the alert. */
  private String name;

  /** Alert configuration options. */
  private AlertOptions options;

  /** Query ID. */
  private String queryId;

  /**
   * Number of seconds after being triggered before the alert rearms itself and can be triggered
   * again. If `null`, alert will never be triggered again.
   */
  private Long rearm;

  public EditAlert setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }

  public EditAlert setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EditAlert setOptions(AlertOptions options) {
    this.options = options;
    return this;
  }

  public AlertOptions getOptions() {
    return options;
  }

  public EditAlert setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public EditAlert setRearm(Long rearm) {
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
    EditAlert that = (EditAlert) o;
    return Objects.equals(alertId, that.alertId)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(rearm, that.rearm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId, name, options, queryId, rearm);
  }

  @Override
  public String toString() {
    return new ToStringer(EditAlert.class)
        .add("alertId", alertId)
        .add("name", name)
        .add("options", options)
        .add("queryId", queryId)
        .add("rearm", rearm)
        .toString();
  }

  EditAlertPb toPb() {
    EditAlertPb pb = new EditAlertPb();
    pb.setAlertId(alertId);
    pb.setName(name);
    pb.setOptions(options);
    pb.setQueryId(queryId);
    pb.setRearm(rearm);

    return pb;
  }

  static EditAlert fromPb(EditAlertPb pb) {
    EditAlert model = new EditAlert();
    model.setAlertId(pb.getAlertId());
    model.setName(pb.getName());
    model.setOptions(pb.getOptions());
    model.setQueryId(pb.getQueryId());
    model.setRearm(pb.getRearm());

    return model;
  }

  public static class EditAlertSerializer extends JsonSerializer<EditAlert> {
    @Override
    public void serialize(EditAlert value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EditAlertPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EditAlertDeserializer extends JsonDeserializer<EditAlert> {
    @Override
    public EditAlert deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EditAlertPb pb = mapper.readValue(p, EditAlertPb.class);
      return EditAlert.fromPb(pb);
    }
  }
}
