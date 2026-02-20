package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksEnvironment;
import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.utils.Cloud;
import com.databricks.sdk.support.InternalApi;
import java.util.HashMap;
import java.util.Map;

@InternalApi
public class PrivateLinkInfo {
  private final String serviceName;
  private final String endpointName;
  private final String referencePage;

  static final Map<Cloud, PrivateLinkInfo> PRIVATE_LINK_INFOS = loadPrivateLinkInfos();

  static Map<Cloud, PrivateLinkInfo> loadPrivateLinkInfos() {
    Map<Cloud, PrivateLinkInfo> privateLinkInfoMap = new HashMap<>();
    privateLinkInfoMap.put(
        Cloud.AWS,
        new PrivateLinkInfo(
            "AWS PrivateLink",
            "AWS VPC endpoint",
            "https://docs.databricks.com/en/security/network/classic/privatelink.html"));
    privateLinkInfoMap.put(
        Cloud.AZURE,
        new PrivateLinkInfo(
            "Azure Private Link",
            "Azure Private Link endpoint",
            "https://learn.microsoft.com/en-us/azure/databricks/security/network/classic/private-link-standard#authentication-troubleshooting"));
    privateLinkInfoMap.put(
        Cloud.GCP,
        new PrivateLinkInfo(
            "Private Service Connect",
            "GCP VPC endpoint",
            "https://docs.gcp.databricks.com/en/security/network/classic/private-service-connect.html"));
    return privateLinkInfoMap;
  }

  public PrivateLinkInfo(String serviceName, String endpointName, String referencePage) {
    this.serviceName = serviceName;
    this.endpointName = endpointName;
    this.referencePage = referencePage;
  }

  public String errorMessage() {
    return String.format(
        "The requested workspace has %s enabled and is not accessible from the current network. "
            + "Ensure that %s is properly configured and that your device has access to the %s. "
            + "For more information, see %s.",
        serviceName, serviceName, endpointName, referencePage);
  }

  public static boolean isPrivateLinkRedirect(Response resp) {
    return resp.getUrl().getPath().equals("/login.html")
        && (resp.getUrl().getQuery() != null
            && resp.getUrl().getQuery().contains("error=private-link-validation-error"));
  }

  static PrivateLinkValidationError createPrivateLinkValidationError(Response resp) {
    DatabricksEnvironment env =
        DatabricksEnvironment.getEnvironmentFromHostname(resp.getUrl().getHost());
    PrivateLinkInfo info = PRIVATE_LINK_INFOS.get(env.getCloud());
    return new PrivateLinkValidationError(info.errorMessage(), ErrorDetails.builder().build());
  }
}
