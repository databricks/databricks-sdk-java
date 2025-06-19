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
@JsonSerialize(using = CreateAlertRequestAlert.CreateAlertRequestAlertSerializer.class)
@JsonDeserialize(using = CreateAlertRequestAlert.CreateAlertRequestAlertDeserializer.class)
public class CreateAlertRequestAlert {
  /** Trigger conditions of the alert. */
  private AlertCondition condition;

  /**
   * Custom body of alert notification, if it exists. See [here] for custom templating instructions.
   *
   * <p>[here]: https://docs.databricks.com/sql/user/alerts/index.html
   */
  private String customBody;

  /**
   * Custom subject of alert notification, if it exists. This can include email subject entries and
   * Slack notification headers, for example. See [here] for custom templating instructions.
   *
   * <p>[here]: https://docs.databricks.com/sql/user/alerts/index.html
   */
  private String customSubject;

  /** The display name of the alert. */
  private String displayName;

  /** Whether to notify alert subscribers when alert returns back to normal. */
  private Boolean notifyOnOk;

  /** The workspace path of the folder containing the alert. */
  private String parentPath;

  /** UUID of the query attached to the alert. */
  private String queryId;

  /**
   * Number of seconds an alert must wait after being triggered to rearm itself. After rearming, it
   * can be triggered again. If 0 or not specified, the alert will not be triggered again.
   */
  private Long secondsToRetrigger;

  public CreateAlertRequestAlert setCondition(AlertCondition condition) {
    this.condition = condition;
    return this;
  }

  public AlertCondition getCondition() {
    return condition;
  }

  public CreateAlertRequestAlert setCustomBody(String customBody) {
    this.customBody = customBody;
    return this;
  }

  public String getCustomBody() {
    return customBody;
  }

  public CreateAlertRequestAlert setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  public String getCustomSubject() {
    return customSubject;
  }

  public CreateAlertRequestAlert setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateAlertRequestAlert setNotifyOnOk(Boolean notifyOnOk) {
    this.notifyOnOk = notifyOnOk;
    return this;
  }

  public Boolean getNotifyOnOk() {
    return notifyOnOk;
  }

  public CreateAlertRequestAlert setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public CreateAlertRequestAlert setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public CreateAlertRequestAlert setSecondsToRetrigger(Long secondsToRetrigger) {
    this.secondsToRetrigger = secondsToRetrigger;
    return this;
  }

  public Long getSecondsToRetrigger() {
    return secondsToRetrigger;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAlertRequestAlert that = (CreateAlertRequestAlert) o;
    return Objects.equals(condition, that.condition)
        && Objects.equals(customBody, that.customBody)
        && Objects.equals(customSubject, that.customSubject)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(notifyOnOk, that.notifyOnOk)
        && Objects.equals(parentPath, that.parentPath)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(secondsToRetrigger, that.secondsToRetrigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        condition,
        customBody,
        customSubject,
        displayName,
        notifyOnOk,
        parentPath,
        queryId,
        secondsToRetrigger);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAlertRequestAlert.class)
        .add("condition", condition)
        .add("customBody", customBody)
        .add("customSubject", customSubject)
        .add("displayName", displayName)
        .add("notifyOnOk", notifyOnOk)
        .add("parentPath", parentPath)
        .add("queryId", queryId)
        .add("secondsToRetrigger", secondsToRetrigger)
        .toString();
  }

  CreateAlertRequestAlertPb toPb() {
    CreateAlertRequestAlertPb pb = new CreateAlertRequestAlertPb();
    pb.setCondition(condition);
    pb.setCustomBody(customBody);
    pb.setCustomSubject(customSubject);
    pb.setDisplayName(displayName);
    pb.setNotifyOnOk(notifyOnOk);
    pb.setParentPath(parentPath);
    pb.setQueryId(queryId);
    pb.setSecondsToRetrigger(secondsToRetrigger);

    return pb;
  }

  static CreateAlertRequestAlert fromPb(CreateAlertRequestAlertPb pb) {
    CreateAlertRequestAlert model = new CreateAlertRequestAlert();
    model.setCondition(pb.getCondition());
    model.setCustomBody(pb.getCustomBody());
    model.setCustomSubject(pb.getCustomSubject());
    model.setDisplayName(pb.getDisplayName());
    model.setNotifyOnOk(pb.getNotifyOnOk());
    model.setParentPath(pb.getParentPath());
    model.setQueryId(pb.getQueryId());
    model.setSecondsToRetrigger(pb.getSecondsToRetrigger());

    return model;
  }

  public static class CreateAlertRequestAlertSerializer
      extends JsonSerializer<CreateAlertRequestAlert> {
    @Override
    public void serialize(
        CreateAlertRequestAlert value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateAlertRequestAlertPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateAlertRequestAlertDeserializer
      extends JsonDeserializer<CreateAlertRequestAlert> {
    @Override
    public CreateAlertRequestAlert deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateAlertRequestAlertPb pb = mapper.readValue(p, CreateAlertRequestAlertPb.class);
      return CreateAlertRequestAlert.fromPb(pb);
    }
  }
}
