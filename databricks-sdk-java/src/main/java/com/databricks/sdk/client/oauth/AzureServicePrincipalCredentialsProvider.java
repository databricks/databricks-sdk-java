package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.CredentialsProvider;
import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.HeaderFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Adds refreshed Azure Active Directory (AAD) Service Principal OAuth tokens to every request, while automatically
 * resolving different Azure environment endpoints.
 */
public class AzureServicePrincipalCredentialsProvider implements CredentialsProvider {
    @Override
    public String authType() {
        return "azure-client-secret";
    }

    static RefreshableTokenSource tokenSourceFor(DatabricksConfig config, String resource) {
        String aadEndpoint = config.getAzureEnvironment().getActiveDirectoryEndpoint();
        Map<String, String> endpointParams = new HashMap<>();
        endpointParams.put("resource", resource);
        return new ClientCredentials(config.getAzureClientId(), config.getAzureClientSecret(),
                aadEndpoint + config.getAzureTenantId() + "/oauth2/token", endpointParams,
                null, true, false);
    }

    /** Resolves Azure Databricks workspace URL from ARM Resource ID */
    public void ensureHostPresent(DatabricksConfig cfg, BiFunction<DatabricksConfig, String, RefreshableTokenSource> tokenSourceFor) throws Exception {
        if (cfg.getHost() != null || cfg.getAzureWorkspaceResourceId() == null) {
            return;
        }

        String arm = cfg.getAzureEnvironment().getResourceManagerEndpoint();
        Token token = tokenSourceFor.apply(cfg, arm).refresh();
        String requestUrl = arm + cfg.getAzureWorkspaceResourceId() + "?api-version=2018-04-01";
        HttpGet httpGet = new HttpGet(requestUrl);
        httpGet.setHeader("Authorization", "Bearer " + token.getAccessToken());

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(httpGet)) {
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                throw new RuntimeException("Cannot resolve Azure Databricks workspace: " + EntityUtils.toString(response.getEntity()));
            }

            String responseBody = EntityUtils.toString(response.getEntity());
            ObjectMapper objectMapper = new ObjectMapper();
            ObjectNode jsonResponse = objectMapper.readValue(responseBody, ObjectNode.class);
            String workspaceUrl = jsonResponse.get("properties").get("workspaceUrl").asText();
            cfg.setHost("https://" + workspaceUrl);
        }
    }

    @Override
    public HeaderFactory configure(DatabricksConfig config) throws Exception {
        ensureHostPresent(config, AzureServicePrincipalCredentialsProvider::tokenSourceFor);
        RefreshableTokenSource inner = tokenSourceFor(config, config.getEffectiveAzureLoginAppId());
        RefreshableTokenSource cloud = tokenSourceFor(config, config.getAzureEnvironment().getServiceManagementEndpoint());

        return () -> {
            Map<String, String> headers = new HashMap<>();
            headers.put("Authorization", "Bearer " + inner.refresh().getAccessToken());
            headers.put("X-Databricks-Azure-SP-Management-Token", cloud.refresh().getAccessToken());
            if (config.getAzureWorkspaceResourceId() != null) {
                headers.put("X-Databricks-Azure-Workspace-Resource-Id", config.getAzureWorkspaceResourceId());
            }
            return headers;
        };
    }
}
