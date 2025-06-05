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
@JsonSerialize(using = ListAlertsResponseAlert.ListAlertsResponseAlertSerializer.class)
@JsonDeserialize(using = ListAlertsResponseAlert.ListAlertsResponseAlertDeserializer.class)
public class ListAlertsResponseAlert {
  /** Trigger conditions of the alert. */
  private AlertCondition condition;

  /** The timestamp indicating when the alert was created. */
  private String createTime;

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

  /** UUID identifying the alert. */
  private String id;

  /** The workspace state of the alert. Used for tracking trashed status. */
  private LifecycleState lifecycleState;

  /** Whether to notify alert subscribers when alert returns back to normal. */
  private Boolean notifyOnOk;

  /** The owner's username. This field is set to "Unavailable" if the user has been deleted. */
  private String ownerUserName;

  /** UUID of the query attached to the alert. */
  private String queryId;

  /**
   * Number of seconds an alert must wait after being triggered to rearm itself. After rearming, it
   * can be triggered again. If 0 or not specified, the alert will not be triggered again.
   */
  private Long secondsToRetrigger;

  /**
   * Current state of the alert's trigger status. This field is set to UNKNOWN if the alert has not
   * yet been evaluated or ran into an error during the last evaluation.
   */
  private AlertState state;

  /** Timestamp when the alert was last triggered, if the alert has been triggered before. */
  private String triggerTime;

  /** The timestamp indicating when the alert was updated. */
  private String updateTime;

  public ListAlertsResponseAlert setCondition(AlertCondition condition) {
    this.condition = condition;
    return this;
  }

  public AlertCondition getCondition() {
    return condition;
  }

  public ListAlertsResponseAlert setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public ListAlertsResponseAlert setCustomBody(String customBody) {
    this.customBody = customBody;
    return this;
  }

  public String getCustomBody() {
    return customBody;
  }

  public ListAlertsResponseAlert setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  public String getCustomSubject() {
    return customSubject;
  }

  public ListAlertsResponseAlert setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ListAlertsResponseAlert setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ListAlertsResponseAlert setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public ListAlertsResponseAlert setNotifyOnOk(Boolean notifyOnOk) {
    this.notifyOnOk = notifyOnOk;
    return this;
  }

  public Boolean getNotifyOnOk() {
    return notifyOnOk;
  }

  public ListAlertsResponseAlert setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

  public String getOwnerUserName() {
    return ownerUserName;
  }

  public ListAlertsResponseAlert setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public ListAlertsResponseAlert setSecondsToRetrigger(Long secondsToRetrigger) {
    this.secondsToRetrigger = secondsToRetrigger;
    return this;
  }

  public Long getSecondsToRetrigger() {
    return secondsToRetrigger;
  }

  public ListAlertsResponseAlert setState(AlertState state) {
    this.state = state;
    return this;
  }

  public AlertState getState() {
    return state;
  }

  public ListAlertsResponseAlert setTriggerTime(String triggerTime) {
    this.triggerTime = triggerTime;
    return this;
  }

  public String getTriggerTime() {
    return triggerTime;
  }

  public ListAlertsResponseAlert setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAlertsResponseAlert that = (ListAlertsResponseAlert) o;
    return Objects.equals(condition, that.condition)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(customBody, that.customBody)
        && Objects.equals(customSubject, that.customSubject)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id)
        && Objects.equals(lifecycleState, that.lifecycleState)
        && Objects.equals(notifyOnOk, that.notifyOnOk)
        && Objects.equals(ownerUserName, that.ownerUserName)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(secondsToRetrigger, that.secondsToRetrigger)
        && Objects.equals(state, that.state)
        && Objects.equals(triggerTime, that.triggerTime)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        condition,
        createTime,
        customBody,
        customSubject,
        displayName,
        id,
        lifecycleState,
        notifyOnOk,
        ownerUserName,
        queryId,
        secondsToRetrigger,
        state,
        triggerTime,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAlertsResponseAlert.class)
        .add("condition", condition)
        .add("createTime", createTime)
        .add("customBody", customBody)
        .add("customSubject", customSubject)
        .add("displayName", displayName)
        .add("id", id)
        .add("lifecycleState", lifecycleState)
        .add("notifyOnOk", notifyOnOk)
        .add("ownerUserName", ownerUserName)
        .add("queryId", queryId)
        .add("secondsToRetrigger", secondsToRetrigger)
        .add("state", state)
        .add("triggerTime", triggerTime)
        .add("updateTime", updateTime)
        .toString();
  }

  ListAlertsResponseAlertPb toPb() {
    ListAlertsResponseAlertPb pb = new ListAlertsResponseAlertPb();
    pb.setCondition(condition);
    pb.setCreateTime(createTime);
    pb.setCustomBody(customBody);
    pb.setCustomSubject(customSubject);
    pb.setDisplayName(displayName);
    pb.setId(id);
    pb.setLifecycleState(lifecycleState);
    pb.setNotifyOnOk(notifyOnOk);
    pb.setOwnerUserName(ownerUserName);
    pb.setQueryId(queryId);
    pb.setSecondsToRetrigger(secondsToRetrigger);
    pb.setState(state);
    pb.setTriggerTime(triggerTime);
    pb.setUpdateTime(updateTime);

    return pb;
  }

  static ListAlertsResponseAlert fromPb(ListAlertsResponseAlertPb pb) {
    ListAlertsResponseAlert model = new ListAlertsResponseAlert();
    model.setCondition(pb.getCondition());
    model.setCreateTime(pb.getCreateTime());
    model.setCustomBody(pb.getCustomBody());
    model.setCustomSubject(pb.getCustomSubject());
    model.setDisplayName(pb.getDisplayName());
    model.setId(pb.getId());
    model.setLifecycleState(pb.getLifecycleState());
    model.setNotifyOnOk(pb.getNotifyOnOk());
    model.setOwnerUserName(pb.getOwnerUserName());
    model.setQueryId(pb.getQueryId());
    model.setSecondsToRetrigger(pb.getSecondsToRetrigger());
    model.setState(pb.getState());
    model.setTriggerTime(pb.getTriggerTime());
    model.setUpdateTime(pb.getUpdateTime());

    return model;
  }

  public static class ListAlertsResponseAlertSerializer
      extends JsonSerializer<ListAlertsResponseAlert> {
    @Override
    public void serialize(
        ListAlertsResponseAlert value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAlertsResponseAlertPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAlertsResponseAlertDeserializer
      extends JsonDeserializer<ListAlertsResponseAlert> {
    @Override
    public ListAlertsResponseAlert deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAlertsResponseAlertPb pb = mapper.readValue(p, ListAlertsResponseAlertPb.class);
      return ListAlertsResponseAlert.fromPb(pb);
    }
  }
}
