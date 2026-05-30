// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyRequestDestination {
  /** */
  @JsonProperty("account_api")
  private CustomerFacingIngressNetworkPolicyAccountApiDestination accountApi;

  /** */
  @JsonProperty("account_databricks_one")
  private CustomerFacingIngressNetworkPolicyAccountDatabricksOneDestination accountDatabricksOne;

  /** */
  @JsonProperty("account_ui")
  private CustomerFacingIngressNetworkPolicyAccountUiDestination accountUi;

  /**
   * When true, match all destinations, no other destination fields can be set. When not set or
   * false, at least one specific destination must be provided.
   */
  @JsonProperty("all_destinations")
  private Boolean allDestinations;

  /** */
  @JsonProperty("apps_runtime")
  private CustomerFacingIngressNetworkPolicyAppsRuntimeDestination appsRuntime;

  /** */
  @JsonProperty("lakebase_runtime")
  private CustomerFacingIngressNetworkPolicyLakebaseRuntimeDestination lakebaseRuntime;

  /** */
  @JsonProperty("workspace_api")
  private CustomerFacingIngressNetworkPolicyWorkspaceApiDestination workspaceApi;

  /** */
  @JsonProperty("workspace_ui")
  private CustomerFacingIngressNetworkPolicyWorkspaceUiDestination workspaceUi;

  public CustomerFacingIngressNetworkPolicyRequestDestination setAccountApi(
      CustomerFacingIngressNetworkPolicyAccountApiDestination accountApi) {
    this.accountApi = accountApi;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyAccountApiDestination getAccountApi() {
    return accountApi;
  }

  public CustomerFacingIngressNetworkPolicyRequestDestination setAccountDatabricksOne(
      CustomerFacingIngressNetworkPolicyAccountDatabricksOneDestination accountDatabricksOne) {
    this.accountDatabricksOne = accountDatabricksOne;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyAccountDatabricksOneDestination
      getAccountDatabricksOne() {
    return accountDatabricksOne;
  }

  public CustomerFacingIngressNetworkPolicyRequestDestination setAccountUi(
      CustomerFacingIngressNetworkPolicyAccountUiDestination accountUi) {
    this.accountUi = accountUi;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyAccountUiDestination getAccountUi() {
    return accountUi;
  }

  public CustomerFacingIngressNetworkPolicyRequestDestination setAllDestinations(
      Boolean allDestinations) {
    this.allDestinations = allDestinations;
    return this;
  }

  public Boolean getAllDestinations() {
    return allDestinations;
  }

  public CustomerFacingIngressNetworkPolicyRequestDestination setAppsRuntime(
      CustomerFacingIngressNetworkPolicyAppsRuntimeDestination appsRuntime) {
    this.appsRuntime = appsRuntime;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyAppsRuntimeDestination getAppsRuntime() {
    return appsRuntime;
  }

  public CustomerFacingIngressNetworkPolicyRequestDestination setLakebaseRuntime(
      CustomerFacingIngressNetworkPolicyLakebaseRuntimeDestination lakebaseRuntime) {
    this.lakebaseRuntime = lakebaseRuntime;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyLakebaseRuntimeDestination getLakebaseRuntime() {
    return lakebaseRuntime;
  }

  public CustomerFacingIngressNetworkPolicyRequestDestination setWorkspaceApi(
      CustomerFacingIngressNetworkPolicyWorkspaceApiDestination workspaceApi) {
    this.workspaceApi = workspaceApi;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyWorkspaceApiDestination getWorkspaceApi() {
    return workspaceApi;
  }

  public CustomerFacingIngressNetworkPolicyRequestDestination setWorkspaceUi(
      CustomerFacingIngressNetworkPolicyWorkspaceUiDestination workspaceUi) {
    this.workspaceUi = workspaceUi;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyWorkspaceUiDestination getWorkspaceUi() {
    return workspaceUi;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyRequestDestination that =
        (CustomerFacingIngressNetworkPolicyRequestDestination) o;
    return Objects.equals(accountApi, that.accountApi)
        && Objects.equals(accountDatabricksOne, that.accountDatabricksOne)
        && Objects.equals(accountUi, that.accountUi)
        && Objects.equals(allDestinations, that.allDestinations)
        && Objects.equals(appsRuntime, that.appsRuntime)
        && Objects.equals(lakebaseRuntime, that.lakebaseRuntime)
        && Objects.equals(workspaceApi, that.workspaceApi)
        && Objects.equals(workspaceUi, that.workspaceUi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountApi,
        accountDatabricksOne,
        accountUi,
        allDestinations,
        appsRuntime,
        lakebaseRuntime,
        workspaceApi,
        workspaceUi);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyRequestDestination.class)
        .add("accountApi", accountApi)
        .add("accountDatabricksOne", accountDatabricksOne)
        .add("accountUi", accountUi)
        .add("allDestinations", allDestinations)
        .add("appsRuntime", appsRuntime)
        .add("lakebaseRuntime", lakebaseRuntime)
        .add("workspaceApi", workspaceApi)
        .add("workspaceUi", workspaceUi)
        .toString();
  }
}
