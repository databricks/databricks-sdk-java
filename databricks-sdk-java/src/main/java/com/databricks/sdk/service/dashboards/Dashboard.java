// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(using = Dashboard.DashboardSerializer.class)
@JsonDeserialize(using = Dashboard.DashboardDeserializer.class)
public class Dashboard {
  /** The timestamp of when the dashboard was created. */
  private String createTime;

  /** UUID identifying the dashboard. */
  private String dashboardId;

  /** The display name of the dashboard. */
  private String displayName;

  /**
   * The etag for the dashboard. Can be optionally provided on updates to ensure that the dashboard
   * has not been modified since the last read. This field is excluded in List Dashboards responses.
   */
  private String etag;

  /** The state of the dashboard resource. Used for tracking trashed status. */
  private LifecycleState lifecycleState;

  /**
   * The workspace path of the folder containing the dashboard. Includes leading slash and no
   * trailing slash. This field is excluded in List Dashboards responses.
   */
  private String parentPath;

  /**
   * The workspace path of the dashboard asset, including the file name. Exported dashboards always
   * have the file extension `.lvdash.json`. This field is excluded in List Dashboards responses.
   */
  private String path;

  /**
   * The contents of the dashboard in serialized string form. This field is excluded in List
   * Dashboards responses. Use the [get dashboard API] to retrieve an example response, which
   * includes the `serialized_dashboard` field. This field provides the structure of the JSON string
   * that represents the dashboard's layout and components.
   *
   * <p>[get dashboard API]: https://docs.databricks.com/api/workspace/lakeview/get
   */
  private String serializedDashboard;

  /**
   * The timestamp of when the dashboard was last updated by the user. This field is excluded in
   * List Dashboards responses.
   */
  private String updateTime;

  /** The warehouse ID used to run the dashboard. */
  private String warehouseId;

  public Dashboard setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public Dashboard setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public Dashboard setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Dashboard setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public Dashboard setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public Dashboard setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public Dashboard setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public Dashboard setSerializedDashboard(String serializedDashboard) {
    this.serializedDashboard = serializedDashboard;
    return this;
  }

  public String getSerializedDashboard() {
    return serializedDashboard;
  }

  public Dashboard setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public Dashboard setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dashboard that = (Dashboard) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(etag, that.etag)
        && Objects.equals(lifecycleState, that.lifecycleState)
        && Objects.equals(parentPath, that.parentPath)
        && Objects.equals(path, that.path)
        && Objects.equals(serializedDashboard, that.serializedDashboard)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        dashboardId,
        displayName,
        etag,
        lifecycleState,
        parentPath,
        path,
        serializedDashboard,
        updateTime,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(Dashboard.class)
        .add("createTime", createTime)
        .add("dashboardId", dashboardId)
        .add("displayName", displayName)
        .add("etag", etag)
        .add("lifecycleState", lifecycleState)
        .add("parentPath", parentPath)
        .add("path", path)
        .add("serializedDashboard", serializedDashboard)
        .add("updateTime", updateTime)
        .add("warehouseId", warehouseId)
        .toString();
  }

  DashboardPb toPb() {
    DashboardPb pb = new DashboardPb();
    pb.setCreateTime(createTime);
    pb.setDashboardId(dashboardId);
    pb.setDisplayName(displayName);
    pb.setEtag(etag);
    pb.setLifecycleState(lifecycleState);
    pb.setParentPath(parentPath);
    pb.setPath(path);
    pb.setSerializedDashboard(serializedDashboard);
    pb.setUpdateTime(updateTime);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static Dashboard fromPb(DashboardPb pb) {
    Dashboard model = new Dashboard();
    model.setCreateTime(pb.getCreateTime());
    model.setDashboardId(pb.getDashboardId());
    model.setDisplayName(pb.getDisplayName());
    model.setEtag(pb.getEtag());
    model.setLifecycleState(pb.getLifecycleState());
    model.setParentPath(pb.getParentPath());
    model.setPath(pb.getPath());
    model.setSerializedDashboard(pb.getSerializedDashboard());
    model.setUpdateTime(pb.getUpdateTime());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class DashboardSerializer extends JsonSerializer<Dashboard> {
    @Override
    public void serialize(Dashboard value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DashboardPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DashboardDeserializer extends JsonDeserializer<Dashboard> {
    @Override
    public Dashboard deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DashboardPb pb = mapper.readValue(p, DashboardPb.class);
      return Dashboard.fromPb(pb);
    }
  }
}
