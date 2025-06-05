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
@JsonSerialize(using = LegacyAlert.LegacyAlertSerializer.class)
@JsonDeserialize(using = LegacyAlert.LegacyAlertDeserializer.class)
public class LegacyAlert {
  /** Timestamp when the alert was created. */
  private String createdAt;

  /** Alert ID. */
  private String id;

  /** Timestamp when the alert was last triggered. */
  private String lastTriggeredAt;

  /** Name of the alert. */
  private String name;

  /** Alert configuration options. */
  private AlertOptions options;

  /** The identifier of the workspace folder containing the object. */
  private String parent;

  /** */
  private AlertQuery query;

  /**
   * Number of seconds after being triggered before the alert rearms itself and can be triggered
   * again. If `null`, alert will never be triggered again.
   */
  private Long rearm;

  /**
   * State of the alert. Possible values are: `unknown` (yet to be evaluated), `triggered`
   * (evaluated and fulfilled trigger conditions), or `ok` (evaluated and did not fulfill trigger
   * conditions).
   */
  private LegacyAlertState state;

  /** Timestamp when the alert was last updated. */
  private String updatedAt;

  /** */
  private User user;

  public LegacyAlert setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public LegacyAlert setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public LegacyAlert setLastTriggeredAt(String lastTriggeredAt) {
    this.lastTriggeredAt = lastTriggeredAt;
    return this;
  }

  public String getLastTriggeredAt() {
    return lastTriggeredAt;
  }

  public LegacyAlert setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public LegacyAlert setOptions(AlertOptions options) {
    this.options = options;
    return this;
  }

  public AlertOptions getOptions() {
    return options;
  }

  public LegacyAlert setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public LegacyAlert setQuery(AlertQuery query) {
    this.query = query;
    return this;
  }

  public AlertQuery getQuery() {
    return query;
  }

  public LegacyAlert setRearm(Long rearm) {
    this.rearm = rearm;
    return this;
  }

  public Long getRearm() {
    return rearm;
  }

  public LegacyAlert setState(LegacyAlertState state) {
    this.state = state;
    return this;
  }

  public LegacyAlertState getState() {
    return state;
  }

  public LegacyAlert setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public LegacyAlert setUser(User user) {
    this.user = user;
    return this;
  }

  public User getUser() {
    return user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LegacyAlert that = (LegacyAlert) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(id, that.id)
        && Objects.equals(lastTriggeredAt, that.lastTriggeredAt)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(parent, that.parent)
        && Objects.equals(query, that.query)
        && Objects.equals(rearm, that.rearm)
        && Objects.equals(state, that.state)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(user, that.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        id,
        lastTriggeredAt,
        name,
        options,
        parent,
        query,
        rearm,
        state,
        updatedAt,
        user);
  }

  @Override
  public String toString() {
    return new ToStringer(LegacyAlert.class)
        .add("createdAt", createdAt)
        .add("id", id)
        .add("lastTriggeredAt", lastTriggeredAt)
        .add("name", name)
        .add("options", options)
        .add("parent", parent)
        .add("query", query)
        .add("rearm", rearm)
        .add("state", state)
        .add("updatedAt", updatedAt)
        .add("user", user)
        .toString();
  }

  LegacyAlertPb toPb() {
    LegacyAlertPb pb = new LegacyAlertPb();
    pb.setCreatedAt(createdAt);
    pb.setId(id);
    pb.setLastTriggeredAt(lastTriggeredAt);
    pb.setName(name);
    pb.setOptions(options);
    pb.setParent(parent);
    pb.setQuery(query);
    pb.setRearm(rearm);
    pb.setState(state);
    pb.setUpdatedAt(updatedAt);
    pb.setUser(user);

    return pb;
  }

  static LegacyAlert fromPb(LegacyAlertPb pb) {
    LegacyAlert model = new LegacyAlert();
    model.setCreatedAt(pb.getCreatedAt());
    model.setId(pb.getId());
    model.setLastTriggeredAt(pb.getLastTriggeredAt());
    model.setName(pb.getName());
    model.setOptions(pb.getOptions());
    model.setParent(pb.getParent());
    model.setQuery(pb.getQuery());
    model.setRearm(pb.getRearm());
    model.setState(pb.getState());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUser(pb.getUser());

    return model;
  }

  public static class LegacyAlertSerializer extends JsonSerializer<LegacyAlert> {
    @Override
    public void serialize(LegacyAlert value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LegacyAlertPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LegacyAlertDeserializer extends JsonDeserializer<LegacyAlert> {
    @Override
    public LegacyAlert deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LegacyAlertPb pb = mapper.readValue(p, LegacyAlertPb.class);
      return LegacyAlert.fromPb(pb);
    }
  }
}
