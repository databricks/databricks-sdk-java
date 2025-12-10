package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.CachedTokenSource;
import com.databricks.sdk.core.oauth.OAuthHeaderFactory;
import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.utils.AzureUtils;
import com.databricks.sdk.support.InternalApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@InternalApi
public class AzureCliCredentialsProvider implements CredentialsProvider {
  private final ObjectMapper mapper = new ObjectMapper();
  private static final Logger LOG = LoggerFactory.getLogger(AzureCliCredentialsProvider.class);

  public static final String AZURE_CLI = "azure-cli";

  @Override
  public String authType() {
    return AZURE_CLI;
  }

  public CachedTokenSource tokenSourceFor(DatabricksConfig config, String resource) {
    String azPath =
        Optional.ofNullable(config.getEnv()).map(env -> env.get("AZ_PATH")).orElse("az");

    List<String> cmd =
        new ArrayList<>(
            Arrays.asList(
                azPath, "account", "get-access-token", "--resource", resource, "--output", "json"));
    Optional<String> subscription = getSubscription(config);
    if (subscription.isPresent()) {
      // This will fail if the user has access to the workspace, but not to the subscription
      // itself.
      // In such case, we fall back to not using the subscription.
      List<String> extendedCmd = new ArrayList<>(cmd);
      extendedCmd.addAll(Arrays.asList("--subscription", subscription.get()));
      try {
        return getTokenSource(config, extendedCmd);
      } catch (DatabricksException ex) {
        LOG.warn("Failed to get token for subscription. Using resource only token.");
      }
    } else {
      LOG.warn(
          "azure_workspace_resource_id field not provided. "
              + "It is recommended to specify this field in the Databricks configuration to avoid authentication errors.");
    }

    return getTokenSource(config, cmd);
  }

  protected CachedTokenSource getTokenSource(DatabricksConfig config, List<String> cmd) {
    CliTokenSource tokenSource =
        new CliTokenSource(cmd, "tokenType", "accessToken", "expiresOn", config.getEnv());
    CachedTokenSource cachedTokenSource =
        new CachedTokenSource.Builder(tokenSource)
            .setAsyncDisabled(config.getDisableAsyncTokenRefresh())
            .build();
    cachedTokenSource.getToken(); // Check if the CLI is installed and to validate the config.
    return cachedTokenSource;
  }

  private Optional<String> getSubscription(DatabricksConfig config) {
    String resourceId = config.getAzureWorkspaceResourceId();
    if (resourceId == null || resourceId.equals("")) {
      return Optional.empty();
    }
    String[] components = resourceId.split("/");
    if (components.length < 3) {
      LOG.warn("Invalid azure workspace resource ID");
      return Optional.empty();
    }
    return Optional.of(components[2]);
  }

  @Override
  public OAuthHeaderFactory configure(DatabricksConfig config) {
    if (!config.isAzure()) {
      return null;
    }

    try {
      AzureUtils.ensureHostPresent(config, mapper, this::tokenSourceFor);
      String resource = config.getEffectiveAzureLoginAppId();
      CachedTokenSource tokenSource = tokenSourceFor(config, resource);
      CachedTokenSource mgmtTokenSource;
      try {
        mgmtTokenSource =
            tokenSourceFor(config, config.getAzureEnvironment().getServiceManagementEndpoint());
      } catch (Exception e) {
        LOG.debug("Not including service management token in headers", e);
        mgmtTokenSource = null;
      }
      CachedTokenSource finalMgmtTokenSource = mgmtTokenSource;
      return OAuthHeaderFactory.fromSuppliers(
          tokenSource::getToken,
          () -> {
            Token token = tokenSource.getToken();
            Map<String, String> headers = new HashMap<>();
            headers.put("Authorization", token.getTokenType() + " " + token.getAccessToken());
            if (finalMgmtTokenSource != null) {
              AzureUtils.addSpManagementToken(finalMgmtTokenSource, headers);
            }
            return AzureUtils.addWorkspaceResourceId(config, headers);
          });
    } catch (DatabricksException e) {
      String stderr = e.getMessage();
      if (stderr.contains("not found")) {
        String doc = "https://docs.microsoft.com/en-us/cli/azure/?view=azure-cli-latest";
        LOG.info(String.format("Most likely Azure CLI is not installed. See %s for details", doc));
        return null;
      }
      throw e;
    }
  }
}
