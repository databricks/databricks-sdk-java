// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = App.AppSerializer.class)
@JsonDeserialize(using = App.AppDeserializer.class)
public class App {
  /**
   * The active deployment of the app. A deployment is considered active when it has been deployed
   * to the app compute.
   */
  private AppDeployment activeDeployment;

  /** */
  private ApplicationStatus appStatus;

  /** */
  private String budgetPolicyId;

  /** */
  private ComputeStatus computeStatus;

  /** The creation time of the app. Formatted timestamp in ISO 6801. */
  private String createTime;

  /** The email of the user that created the app. */
  private String creator;

  /**
   * The default workspace file system path of the source code from which app deployment are
   * created. This field tracks the workspace source code path of the last active deployment.
   */
  private String defaultSourceCodePath;

  /** The description of the app. */
  private String description;

  /** */
  private String effectiveBudgetPolicyId;

  /** The effective api scopes granted to the user access token. */
  private Collection<String> effectiveUserApiScopes;

  /** The unique identifier of the app. */
  private String id;

  /**
   * The name of the app. The name must contain only lowercase alphanumeric characters and hyphens.
   * It must be unique within the workspace.
   */
  private String name;

  /** */
  private String oauth2AppClientId;

  /** */
  private String oauth2AppIntegrationId;

  /**
   * The pending deployment of the app. A deployment is considered pending when it is being prepared
   * for deployment to the app compute.
   */
  private AppDeployment pendingDeployment;

  /** Resources for the app. */
  private Collection<AppResource> resources;

  /** */
  private String servicePrincipalClientId;

  /** */
  private Long servicePrincipalId;

  /** */
  private String servicePrincipalName;

  /** The update time of the app. Formatted timestamp in ISO 6801. */
  private String updateTime;

  /** The email of the user that last updated the app. */
  private String updater;

  /** The URL of the app once it is deployed. */
  private String url;

  /** */
  private Collection<String> userApiScopes;

  public App setActiveDeployment(AppDeployment activeDeployment) {
    this.activeDeployment = activeDeployment;
    return this;
  }

  public AppDeployment getActiveDeployment() {
    return activeDeployment;
  }

  public App setAppStatus(ApplicationStatus appStatus) {
    this.appStatus = appStatus;
    return this;
  }

  public ApplicationStatus getAppStatus() {
    return appStatus;
  }

  public App setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public App setComputeStatus(ComputeStatus computeStatus) {
    this.computeStatus = computeStatus;
    return this;
  }

  public ComputeStatus getComputeStatus() {
    return computeStatus;
  }

  public App setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public App setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public App setDefaultSourceCodePath(String defaultSourceCodePath) {
    this.defaultSourceCodePath = defaultSourceCodePath;
    return this;
  }

  public String getDefaultSourceCodePath() {
    return defaultSourceCodePath;
  }

  public App setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public App setEffectiveBudgetPolicyId(String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  public App setEffectiveUserApiScopes(Collection<String> effectiveUserApiScopes) {
    this.effectiveUserApiScopes = effectiveUserApiScopes;
    return this;
  }

  public Collection<String> getEffectiveUserApiScopes() {
    return effectiveUserApiScopes;
  }

  public App setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public App setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public App setOauth2AppClientId(String oauth2AppClientId) {
    this.oauth2AppClientId = oauth2AppClientId;
    return this;
  }

  public String getOauth2AppClientId() {
    return oauth2AppClientId;
  }

  public App setOauth2AppIntegrationId(String oauth2AppIntegrationId) {
    this.oauth2AppIntegrationId = oauth2AppIntegrationId;
    return this;
  }

  public String getOauth2AppIntegrationId() {
    return oauth2AppIntegrationId;
  }

  public App setPendingDeployment(AppDeployment pendingDeployment) {
    this.pendingDeployment = pendingDeployment;
    return this;
  }

  public AppDeployment getPendingDeployment() {
    return pendingDeployment;
  }

  public App setResources(Collection<AppResource> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<AppResource> getResources() {
    return resources;
  }

  public App setServicePrincipalClientId(String servicePrincipalClientId) {
    this.servicePrincipalClientId = servicePrincipalClientId;
    return this;
  }

  public String getServicePrincipalClientId() {
    return servicePrincipalClientId;
  }

  public App setServicePrincipalId(Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  public App setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public App setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public App setUpdater(String updater) {
    this.updater = updater;
    return this;
  }

  public String getUpdater() {
    return updater;
  }

  public App setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public App setUserApiScopes(Collection<String> userApiScopes) {
    this.userApiScopes = userApiScopes;
    return this;
  }

  public Collection<String> getUserApiScopes() {
    return userApiScopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    App that = (App) o;
    return Objects.equals(activeDeployment, that.activeDeployment)
        && Objects.equals(appStatus, that.appStatus)
        && Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(computeStatus, that.computeStatus)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(defaultSourceCodePath, that.defaultSourceCodePath)
        && Objects.equals(description, that.description)
        && Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId)
        && Objects.equals(effectiveUserApiScopes, that.effectiveUserApiScopes)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(oauth2AppClientId, that.oauth2AppClientId)
        && Objects.equals(oauth2AppIntegrationId, that.oauth2AppIntegrationId)
        && Objects.equals(pendingDeployment, that.pendingDeployment)
        && Objects.equals(resources, that.resources)
        && Objects.equals(servicePrincipalClientId, that.servicePrincipalClientId)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updater, that.updater)
        && Objects.equals(url, that.url)
        && Objects.equals(userApiScopes, that.userApiScopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        activeDeployment,
        appStatus,
        budgetPolicyId,
        computeStatus,
        createTime,
        creator,
        defaultSourceCodePath,
        description,
        effectiveBudgetPolicyId,
        effectiveUserApiScopes,
        id,
        name,
        oauth2AppClientId,
        oauth2AppIntegrationId,
        pendingDeployment,
        resources,
        servicePrincipalClientId,
        servicePrincipalId,
        servicePrincipalName,
        updateTime,
        updater,
        url,
        userApiScopes);
  }

  @Override
  public String toString() {
    return new ToStringer(App.class)
        .add("activeDeployment", activeDeployment)
        .add("appStatus", appStatus)
        .add("budgetPolicyId", budgetPolicyId)
        .add("computeStatus", computeStatus)
        .add("createTime", createTime)
        .add("creator", creator)
        .add("defaultSourceCodePath", defaultSourceCodePath)
        .add("description", description)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
        .add("effectiveUserApiScopes", effectiveUserApiScopes)
        .add("id", id)
        .add("name", name)
        .add("oauth2AppClientId", oauth2AppClientId)
        .add("oauth2AppIntegrationId", oauth2AppIntegrationId)
        .add("pendingDeployment", pendingDeployment)
        .add("resources", resources)
        .add("servicePrincipalClientId", servicePrincipalClientId)
        .add("servicePrincipalId", servicePrincipalId)
        .add("servicePrincipalName", servicePrincipalName)
        .add("updateTime", updateTime)
        .add("updater", updater)
        .add("url", url)
        .add("userApiScopes", userApiScopes)
        .toString();
  }

  AppPb toPb() {
    AppPb pb = new AppPb();
    pb.setActiveDeployment(activeDeployment);
    pb.setAppStatus(appStatus);
    pb.setBudgetPolicyId(budgetPolicyId);
    pb.setComputeStatus(computeStatus);
    pb.setCreateTime(createTime);
    pb.setCreator(creator);
    pb.setDefaultSourceCodePath(defaultSourceCodePath);
    pb.setDescription(description);
    pb.setEffectiveBudgetPolicyId(effectiveBudgetPolicyId);
    pb.setEffectiveUserApiScopes(effectiveUserApiScopes);
    pb.setId(id);
    pb.setName(name);
    pb.setOauth2AppClientId(oauth2AppClientId);
    pb.setOauth2AppIntegrationId(oauth2AppIntegrationId);
    pb.setPendingDeployment(pendingDeployment);
    pb.setResources(resources);
    pb.setServicePrincipalClientId(servicePrincipalClientId);
    pb.setServicePrincipalId(servicePrincipalId);
    pb.setServicePrincipalName(servicePrincipalName);
    pb.setUpdateTime(updateTime);
    pb.setUpdater(updater);
    pb.setUrl(url);
    pb.setUserApiScopes(userApiScopes);

    return pb;
  }

  static App fromPb(AppPb pb) {
    App model = new App();
    model.setActiveDeployment(pb.getActiveDeployment());
    model.setAppStatus(pb.getAppStatus());
    model.setBudgetPolicyId(pb.getBudgetPolicyId());
    model.setComputeStatus(pb.getComputeStatus());
    model.setCreateTime(pb.getCreateTime());
    model.setCreator(pb.getCreator());
    model.setDefaultSourceCodePath(pb.getDefaultSourceCodePath());
    model.setDescription(pb.getDescription());
    model.setEffectiveBudgetPolicyId(pb.getEffectiveBudgetPolicyId());
    model.setEffectiveUserApiScopes(pb.getEffectiveUserApiScopes());
    model.setId(pb.getId());
    model.setName(pb.getName());
    model.setOauth2AppClientId(pb.getOauth2AppClientId());
    model.setOauth2AppIntegrationId(pb.getOauth2AppIntegrationId());
    model.setPendingDeployment(pb.getPendingDeployment());
    model.setResources(pb.getResources());
    model.setServicePrincipalClientId(pb.getServicePrincipalClientId());
    model.setServicePrincipalId(pb.getServicePrincipalId());
    model.setServicePrincipalName(pb.getServicePrincipalName());
    model.setUpdateTime(pb.getUpdateTime());
    model.setUpdater(pb.getUpdater());
    model.setUrl(pb.getUrl());
    model.setUserApiScopes(pb.getUserApiScopes());

    return model;
  }

  public static class AppSerializer extends JsonSerializer<App> {
    @Override
    public void serialize(App value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AppPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AppDeserializer extends JsonDeserializer<App> {
    @Override
    public App deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AppPb pb = mapper.readValue(p, AppPb.class);
      return App.fromPb(pb);
    }
  }
}
