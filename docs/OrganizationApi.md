# OrganizationApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrgRepo**](OrganizationApi.md#createOrgRepo) | **POST** /orgs/{org}/repos | Create a repository in an organization
[**createOrgRepoDeprecated**](OrganizationApi.md#createOrgRepoDeprecated) | **POST** /org/{org}/repos | Create a repository in an organization
[**deleteOrgSecret**](OrganizationApi.md#deleteOrgSecret) | **DELETE** /orgs/{org}/actions/secrets/{secretname} | Delete a secret in an organization
[**orgAddTeamMember**](OrganizationApi.md#orgAddTeamMember) | **PUT** /teams/{id}/members/{username} | Add a team member
[**orgAddTeamRepository**](OrganizationApi.md#orgAddTeamRepository) | **PUT** /teams/{id}/repos/{org}/{repo} | Add a repository to a team
[**orgConcealMember**](OrganizationApi.md#orgConcealMember) | **DELETE** /orgs/{org}/public_members/{username} | Conceal a user&#x27;s membership
[**orgCreate**](OrganizationApi.md#orgCreate) | **POST** /orgs | Create an organization
[**orgCreateHook**](OrganizationApi.md#orgCreateHook) | **POST** /orgs/{org}/hooks | Create a hook
[**orgCreateLabel**](OrganizationApi.md#orgCreateLabel) | **POST** /orgs/{org}/labels | Create a label for an organization
[**orgCreateTeam**](OrganizationApi.md#orgCreateTeam) | **POST** /orgs/{org}/teams | Create a team
[**orgDelete**](OrganizationApi.md#orgDelete) | **DELETE** /orgs/{org} | Delete an organization
[**orgDeleteAvatar**](OrganizationApi.md#orgDeleteAvatar) | **DELETE** /orgs/{org}/avatar | Delete Avatar
[**orgDeleteHook**](OrganizationApi.md#orgDeleteHook) | **DELETE** /orgs/{org}/hooks/{id} | Delete a hook
[**orgDeleteLabel**](OrganizationApi.md#orgDeleteLabel) | **DELETE** /orgs/{org}/labels/{id} | Delete a label
[**orgDeleteMember**](OrganizationApi.md#orgDeleteMember) | **DELETE** /orgs/{org}/members/{username} | Remove a member from an organization
[**orgDeleteTeam**](OrganizationApi.md#orgDeleteTeam) | **DELETE** /teams/{id} | Delete a team
[**orgEdit**](OrganizationApi.md#orgEdit) | **PATCH** /orgs/{org} | Edit an organization
[**orgEditHook**](OrganizationApi.md#orgEditHook) | **PATCH** /orgs/{org}/hooks/{id} | Update a hook
[**orgEditLabel**](OrganizationApi.md#orgEditLabel) | **PATCH** /orgs/{org}/labels/{id} | Update a label
[**orgEditTeam**](OrganizationApi.md#orgEditTeam) | **PATCH** /teams/{id} | Edit a team
[**orgGet**](OrganizationApi.md#orgGet) | **GET** /orgs/{org} | Get an organization
[**orgGetAll**](OrganizationApi.md#orgGetAll) | **GET** /orgs | Get list of organizations
[**orgGetHook**](OrganizationApi.md#orgGetHook) | **GET** /orgs/{org}/hooks/{id} | Get a hook
[**orgGetLabel**](OrganizationApi.md#orgGetLabel) | **GET** /orgs/{org}/labels/{id} | Get a single label
[**orgGetTeam**](OrganizationApi.md#orgGetTeam) | **GET** /teams/{id} | Get a team
[**orgGetUserPermissions**](OrganizationApi.md#orgGetUserPermissions) | **GET** /users/{username}/orgs/{org}/permissions | Get user permissions in organization
[**orgIsMember**](OrganizationApi.md#orgIsMember) | **GET** /orgs/{org}/members/{username} | Check if a user is a member of an organization
[**orgIsPublicMember**](OrganizationApi.md#orgIsPublicMember) | **GET** /orgs/{org}/public_members/{username} | Check if a user is a public member of an organization
[**orgListActionsSecrets**](OrganizationApi.md#orgListActionsSecrets) | **GET** /orgs/{org}/actions/secrets | List an organization&#x27;s actions secrets
[**orgListActivityFeeds**](OrganizationApi.md#orgListActivityFeeds) | **GET** /orgs/{org}/activities/feeds | List an organization&#x27;s activity feeds
[**orgListCurrentUserOrgs**](OrganizationApi.md#orgListCurrentUserOrgs) | **GET** /user/orgs | List the current user&#x27;s organizations
[**orgListHooks**](OrganizationApi.md#orgListHooks) | **GET** /orgs/{org}/hooks | List an organization&#x27;s webhooks
[**orgListLabels**](OrganizationApi.md#orgListLabels) | **GET** /orgs/{org}/labels | List an organization&#x27;s labels
[**orgListMembers**](OrganizationApi.md#orgListMembers) | **GET** /orgs/{org}/members | List an organization&#x27;s members
[**orgListPublicMembers**](OrganizationApi.md#orgListPublicMembers) | **GET** /orgs/{org}/public_members | List an organization&#x27;s public members
[**orgListRepos**](OrganizationApi.md#orgListRepos) | **GET** /orgs/{org}/repos | List an organization&#x27;s repos
[**orgListTeamActivityFeeds**](OrganizationApi.md#orgListTeamActivityFeeds) | **GET** /teams/{id}/activities/feeds | List a team&#x27;s activity feeds
[**orgListTeamMember**](OrganizationApi.md#orgListTeamMember) | **GET** /teams/{id}/members/{username} | List a particular member of team
[**orgListTeamMembers**](OrganizationApi.md#orgListTeamMembers) | **GET** /teams/{id}/members | List a team&#x27;s members
[**orgListTeamRepo**](OrganizationApi.md#orgListTeamRepo) | **GET** /teams/{id}/repos/{org}/{repo} | List a particular repo of team
[**orgListTeamRepos**](OrganizationApi.md#orgListTeamRepos) | **GET** /teams/{id}/repos | List a team&#x27;s repos
[**orgListTeams**](OrganizationApi.md#orgListTeams) | **GET** /orgs/{org}/teams | List an organization&#x27;s teams
[**orgListUserOrgs**](OrganizationApi.md#orgListUserOrgs) | **GET** /users/{username}/orgs | List a user&#x27;s organizations
[**orgPublicizeMember**](OrganizationApi.md#orgPublicizeMember) | **PUT** /orgs/{org}/public_members/{username} | Publicize a user&#x27;s membership
[**orgRemoveTeamMember**](OrganizationApi.md#orgRemoveTeamMember) | **DELETE** /teams/{id}/members/{username} | Remove a team member
[**orgRemoveTeamRepository**](OrganizationApi.md#orgRemoveTeamRepository) | **DELETE** /teams/{id}/repos/{org}/{repo} | Remove a repository from a team
[**orgUpdateAvatar**](OrganizationApi.md#orgUpdateAvatar) | **POST** /orgs/{org}/avatar | Update Avatar
[**teamSearch**](OrganizationApi.md#teamSearch) | **GET** /orgs/{org}/teams/search | Search for teams within an organization
[**updateOrgSecret**](OrganizationApi.md#updateOrgSecret) | **PUT** /orgs/{org}/actions/secrets/{secretname} | Create or Update a secret value in an organization

<a name="createOrgRepo"></a>
# **createOrgRepo**
> Repository createOrgRepo(org, body)

Create a repository in an organization

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of organization
CreateRepoOption body = new CreateRepoOption(); // CreateRepoOption | 
try {
    Repository result = apiInstance.createOrgRepo(org, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#createOrgRepo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of organization |
 **body** | [**CreateRepoOption**](CreateRepoOption.md)|  | [optional]

### Return type

[**Repository**](Repository.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrgRepoDeprecated"></a>
# **createOrgRepoDeprecated**
> Repository createOrgRepoDeprecated(org, body)

Create a repository in an organization

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of organization
CreateRepoOption body = new CreateRepoOption(); // CreateRepoOption | 
try {
    Repository result = apiInstance.createOrgRepoDeprecated(org, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#createOrgRepoDeprecated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of organization |
 **body** | [**CreateRepoOption**](CreateRepoOption.md)|  | [optional]

### Return type

[**Repository**](Repository.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrgSecret"></a>
# **deleteOrgSecret**
> deleteOrgSecret(org, secretname)

Delete a secret in an organization

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of organization
String secretname = "secretname_example"; // String | name of the secret
try {
    apiInstance.deleteOrgSecret(org, secretname);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#deleteOrgSecret");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of organization |
 **secretname** | **String**| name of the secret |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgAddTeamMember"></a>
# **orgAddTeamMember**
> orgAddTeamMember(id, username)

Add a team member

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
Long id = 789L; // Long | id of the team
String username = "username_example"; // String | username of the user to add
try {
    apiInstance.orgAddTeamMember(id, username);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgAddTeamMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of the team |
 **username** | **String**| username of the user to add |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgAddTeamRepository"></a>
# **orgAddTeamRepository**
> orgAddTeamRepository(id, org, repo)

Add a repository to a team

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
Long id = 789L; // Long | id of the team
String org = "org_example"; // String | organization that owns the repo to add
String repo = "repo_example"; // String | name of the repo to add
try {
    apiInstance.orgAddTeamRepository(id, org, repo);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgAddTeamRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of the team |
 **org** | **String**| organization that owns the repo to add |
 **repo** | **String**| name of the repo to add |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgConcealMember"></a>
# **orgConcealMember**
> orgConcealMember(org, username)

Conceal a user&#x27;s membership

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
String username = "username_example"; // String | username of the user
try {
    apiInstance.orgConcealMember(org, username);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgConcealMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **username** | **String**| username of the user |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgCreate"></a>
# **orgCreate**
> Organization orgCreate(body)

Create an organization

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
CreateOrgOption body = new CreateOrgOption(); // CreateOrgOption | 
try {
    Organization result = apiInstance.orgCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateOrgOption**](CreateOrgOption.md)|  |

### Return type

[**Organization**](Organization.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgCreateHook"></a>
# **orgCreateHook**
> Hook orgCreateHook(body, org)

Create a hook

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
CreateHookOption body = new CreateHookOption(); // CreateHookOption | 
String org = "org_example"; // String | name of the organization
try {
    Hook result = apiInstance.orgCreateHook(body, org);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgCreateHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateHookOption**](CreateHookOption.md)|  |
 **org** | **String**| name of the organization |

### Return type

[**Hook**](Hook.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgCreateLabel"></a>
# **orgCreateLabel**
> Label orgCreateLabel(org, body)

Create a label for an organization

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
CreateLabelOption body = new CreateLabelOption(); // CreateLabelOption | 
try {
    Label result = apiInstance.orgCreateLabel(org, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgCreateLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **body** | [**CreateLabelOption**](CreateLabelOption.md)|  | [optional]

### Return type

[**Label**](Label.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgCreateTeam"></a>
# **orgCreateTeam**
> Team orgCreateTeam(org, body)

Create a team

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
CreateTeamOption body = new CreateTeamOption(); // CreateTeamOption | 
try {
    Team result = apiInstance.orgCreateTeam(org, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgCreateTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **body** | [**CreateTeamOption**](CreateTeamOption.md)|  | [optional]

### Return type

[**Team**](Team.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgDelete"></a>
# **orgDelete**
> orgDelete(org)

Delete an organization

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | organization that is to be deleted
try {
    apiInstance.orgDelete(org);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| organization that is to be deleted |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgDeleteAvatar"></a>
# **orgDeleteAvatar**
> orgDeleteAvatar(org)

Delete Avatar

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
try {
    apiInstance.orgDeleteAvatar(org);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgDeleteAvatar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgDeleteHook"></a>
# **orgDeleteHook**
> orgDeleteHook(org, id)

Delete a hook

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
Long id = 789L; // Long | id of the hook to delete
try {
    apiInstance.orgDeleteHook(org, id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgDeleteHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **id** | **Long**| id of the hook to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgDeleteLabel"></a>
# **orgDeleteLabel**
> orgDeleteLabel(org, id)

Delete a label

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
Long id = 789L; // Long | id of the label to delete
try {
    apiInstance.orgDeleteLabel(org, id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgDeleteLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **id** | **Long**| id of the label to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgDeleteMember"></a>
# **orgDeleteMember**
> orgDeleteMember(org, username)

Remove a member from an organization

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
String username = "username_example"; // String | username of the user
try {
    apiInstance.orgDeleteMember(org, username);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgDeleteMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **username** | **String**| username of the user |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgDeleteTeam"></a>
# **orgDeleteTeam**
> orgDeleteTeam(id)

Delete a team

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
Long id = 789L; // Long | id of the team to delete
try {
    apiInstance.orgDeleteTeam(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgDeleteTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of the team to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgEdit"></a>
# **orgEdit**
> Organization orgEdit(body, org)

Edit an organization

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
EditOrgOption body = new EditOrgOption(); // EditOrgOption | 
String org = "org_example"; // String | name of the organization to edit
try {
    Organization result = apiInstance.orgEdit(body, org);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgEdit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditOrgOption**](EditOrgOption.md)|  |
 **org** | **String**| name of the organization to edit |

### Return type

[**Organization**](Organization.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgEditHook"></a>
# **orgEditHook**
> Hook orgEditHook(org, id, body)

Update a hook

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
Long id = 789L; // Long | id of the hook to update
EditHookOption body = new EditHookOption(); // EditHookOption | 
try {
    Hook result = apiInstance.orgEditHook(org, id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgEditHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **id** | **Long**| id of the hook to update |
 **body** | [**EditHookOption**](EditHookOption.md)|  | [optional]

### Return type

[**Hook**](Hook.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgEditLabel"></a>
# **orgEditLabel**
> Label orgEditLabel(org, id, body)

Update a label

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
Long id = 789L; // Long | id of the label to edit
EditLabelOption body = new EditLabelOption(); // EditLabelOption | 
try {
    Label result = apiInstance.orgEditLabel(org, id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgEditLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **id** | **Long**| id of the label to edit |
 **body** | [**EditLabelOption**](EditLabelOption.md)|  | [optional]

### Return type

[**Label**](Label.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgEditTeam"></a>
# **orgEditTeam**
> Team orgEditTeam(id, body)

Edit a team

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
Integer id = 56; // Integer | id of the team to edit
EditTeamOption body = new EditTeamOption(); // EditTeamOption | 
try {
    Team result = apiInstance.orgEditTeam(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgEditTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the team to edit |
 **body** | [**EditTeamOption**](EditTeamOption.md)|  | [optional]

### Return type

[**Team**](Team.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orgGet"></a>
# **orgGet**
> Organization orgGet(org)

Get an organization

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization to get
try {
    Organization result = apiInstance.orgGet(org);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization to get |

### Return type

[**Organization**](Organization.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgGetAll"></a>
# **orgGetAll**
> List&lt;Organization&gt; orgGetAll(page, limit)

Get list of organizations

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Organization> result = apiInstance.orgGetAll(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgGetHook"></a>
# **orgGetHook**
> Hook orgGetHook(org, id)

Get a hook

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
Long id = 789L; // Long | id of the hook to get
try {
    Hook result = apiInstance.orgGetHook(org, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgGetHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **id** | **Long**| id of the hook to get |

### Return type

[**Hook**](Hook.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgGetLabel"></a>
# **orgGetLabel**
> Label orgGetLabel(org, id)

Get a single label

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
Long id = 789L; // Long | id of the label to get
try {
    Label result = apiInstance.orgGetLabel(org, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgGetLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **id** | **Long**| id of the label to get |

### Return type

[**Label**](Label.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgGetTeam"></a>
# **orgGetTeam**
> Team orgGetTeam(id)

Get a team

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
Long id = 789L; // Long | id of the team to get
try {
    Team result = apiInstance.orgGetTeam(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgGetTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of the team to get |

### Return type

[**Team**](Team.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgGetUserPermissions"></a>
# **orgGetUserPermissions**
> OrganizationPermissions orgGetUserPermissions(username, org)

Get user permissions in organization

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String username = "username_example"; // String | username of user
String org = "org_example"; // String | name of the organization
try {
    OrganizationPermissions result = apiInstance.orgGetUserPermissions(username, org);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgGetUserPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username of user |
 **org** | **String**| name of the organization |

### Return type

[**OrganizationPermissions**](OrganizationPermissions.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgIsMember"></a>
# **orgIsMember**
> orgIsMember(org, username)

Check if a user is a member of an organization

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
String username = "username_example"; // String | username of the user
try {
    apiInstance.orgIsMember(org, username);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgIsMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **username** | **String**| username of the user |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgIsPublicMember"></a>
# **orgIsPublicMember**
> orgIsPublicMember(org, username)

Check if a user is a public member of an organization

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
String username = "username_example"; // String | username of the user
try {
    apiInstance.orgIsPublicMember(org, username);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgIsPublicMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **username** | **String**| username of the user |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgListActionsSecrets"></a>
# **orgListActionsSecrets**
> List&lt;Secret&gt; orgListActionsSecrets(org, page, limit)

List an organization&#x27;s actions secrets

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Secret> result = apiInstance.orgListActionsSecrets(org, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListActionsSecrets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Secret&gt;**](Secret.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgListActivityFeeds"></a>
# **orgListActivityFeeds**
> List&lt;Activity&gt; orgListActivityFeeds(org, date, page, limit)

List an organization&#x27;s activity feeds

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the org
LocalDate date = new LocalDate(); // LocalDate | the date of the activities to be found
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Activity> result = apiInstance.orgListActivityFeeds(org, date, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListActivityFeeds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the org |
 **date** | **LocalDate**| the date of the activities to be found | [optional]
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Activity&gt;**](Activity.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgListCurrentUserOrgs"></a>
# **orgListCurrentUserOrgs**
> List&lt;Organization&gt; orgListCurrentUserOrgs(page, limit)

List the current user&#x27;s organizations

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Organization> result = apiInstance.orgListCurrentUserOrgs(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListCurrentUserOrgs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgListHooks"></a>
# **orgListHooks**
> List&lt;Hook&gt; orgListHooks(org, page, limit)

List an organization&#x27;s webhooks

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Hook> result = apiInstance.orgListHooks(org, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListHooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Hook&gt;**](Hook.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgListLabels"></a>
# **orgListLabels**
> List&lt;Label&gt; orgListLabels(org, page, limit)

List an organization&#x27;s labels

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Label> result = apiInstance.orgListLabels(org, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Label&gt;**](Label.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgListMembers"></a>
# **orgListMembers**
> List&lt;User&gt; orgListMembers(org, page, limit)

List an organization&#x27;s members

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<User> result = apiInstance.orgListMembers(org, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgListPublicMembers"></a>
# **orgListPublicMembers**
> List&lt;User&gt; orgListPublicMembers(org, page, limit)

List an organization&#x27;s public members

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<User> result = apiInstance.orgListPublicMembers(org, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListPublicMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgListRepos"></a>
# **orgListRepos**
> List&lt;Repository&gt; orgListRepos(org, page, limit)

List an organization&#x27;s repos

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Repository> result = apiInstance.orgListRepos(org, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListRepos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Repository&gt;**](Repository.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgListTeamActivityFeeds"></a>
# **orgListTeamActivityFeeds**
> List&lt;Activity&gt; orgListTeamActivityFeeds(id, date, page, limit)

List a team&#x27;s activity feeds

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
Long id = 789L; // Long | id of the team
LocalDate date = new LocalDate(); // LocalDate | the date of the activities to be found
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Activity> result = apiInstance.orgListTeamActivityFeeds(id, date, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListTeamActivityFeeds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of the team |
 **date** | **LocalDate**| the date of the activities to be found | [optional]
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Activity&gt;**](Activity.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgListTeamMember"></a>
# **orgListTeamMember**
> User orgListTeamMember(id, username)

List a particular member of team

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
Long id = 789L; // Long | id of the team
String username = "username_example"; // String | username of the member to list
try {
    User result = apiInstance.orgListTeamMember(id, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListTeamMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of the team |
 **username** | **String**| username of the member to list |

### Return type

[**User**](User.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgListTeamMembers"></a>
# **orgListTeamMembers**
> List&lt;User&gt; orgListTeamMembers(id, page, limit)

List a team&#x27;s members

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
Long id = 789L; // Long | id of the team
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<User> result = apiInstance.orgListTeamMembers(id, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListTeamMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of the team |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgListTeamRepo"></a>
# **orgListTeamRepo**
> Repository orgListTeamRepo(id, org, repo)

List a particular repo of team

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
Long id = 789L; // Long | id of the team
String org = "org_example"; // String | organization that owns the repo to list
String repo = "repo_example"; // String | name of the repo to list
try {
    Repository result = apiInstance.orgListTeamRepo(id, org, repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListTeamRepo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of the team |
 **org** | **String**| organization that owns the repo to list |
 **repo** | **String**| name of the repo to list |

### Return type

[**Repository**](Repository.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgListTeamRepos"></a>
# **orgListTeamRepos**
> List&lt;Repository&gt; orgListTeamRepos(id, page, limit)

List a team&#x27;s repos

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
Long id = 789L; // Long | id of the team
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Repository> result = apiInstance.orgListTeamRepos(id, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListTeamRepos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of the team |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Repository&gt;**](Repository.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgListTeams"></a>
# **orgListTeams**
> List&lt;Team&gt; orgListTeams(org, page, limit)

List an organization&#x27;s teams

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Team> result = apiInstance.orgListTeams(org, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListTeams");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgListUserOrgs"></a>
# **orgListUserOrgs**
> List&lt;Organization&gt; orgListUserOrgs(username, page, limit)

List a user&#x27;s organizations

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String username = "username_example"; // String | username of user
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Organization> result = apiInstance.orgListUserOrgs(username, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgListUserOrgs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username of user |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orgPublicizeMember"></a>
# **orgPublicizeMember**
> orgPublicizeMember(org, username)

Publicize a user&#x27;s membership

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
String username = "username_example"; // String | username of the user
try {
    apiInstance.orgPublicizeMember(org, username);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgPublicizeMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **username** | **String**| username of the user |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgRemoveTeamMember"></a>
# **orgRemoveTeamMember**
> orgRemoveTeamMember(id, username)

Remove a team member

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
Long id = 789L; // Long | id of the team
String username = "username_example"; // String | username of the user to remove
try {
    apiInstance.orgRemoveTeamMember(id, username);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgRemoveTeamMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of the team |
 **username** | **String**| username of the user to remove |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgRemoveTeamRepository"></a>
# **orgRemoveTeamRepository**
> orgRemoveTeamRepository(id, org, repo)

Remove a repository from a team

This does not delete the repository, it only removes the repository from the team.

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
Long id = 789L; // Long | id of the team
String org = "org_example"; // String | organization that owns the repo to remove
String repo = "repo_example"; // String | name of the repo to remove
try {
    apiInstance.orgRemoveTeamRepository(id, org, repo);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgRemoveTeamRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of the team |
 **org** | **String**| organization that owns the repo to remove |
 **repo** | **String**| name of the repo to remove |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orgUpdateAvatar"></a>
# **orgUpdateAvatar**
> orgUpdateAvatar(org, body)

Update Avatar

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
UpdateUserAvatarOption body = new UpdateUserAvatarOption(); // UpdateUserAvatarOption | 
try {
    apiInstance.orgUpdateAvatar(org, body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#orgUpdateAvatar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **body** | [**UpdateUserAvatarOption**](UpdateUserAvatarOption.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: Not defined

<a name="teamSearch"></a>
# **teamSearch**
> InlineResponse200 teamSearch(org, q, includeDesc, page, limit)

Search for teams within an organization

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of the organization
String q = "q_example"; // String | keywords to search
Boolean includeDesc = true; // Boolean | include search within team description (defaults to true)
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    InlineResponse200 result = apiInstance.teamSearch(org, q, includeDesc, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#teamSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of the organization |
 **q** | **String**| keywords to search | [optional]
 **includeDesc** | **Boolean**| include search within team description (defaults to true) | [optional]
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrgSecret"></a>
# **updateOrgSecret**
> updateOrgSecret(org, secretname, body)

Create or Update a secret value in an organization

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String org = "org_example"; // String | name of organization
String secretname = "secretname_example"; // String | name of the secret
CreateOrUpdateSecretOption body = new CreateOrUpdateSecretOption(); // CreateOrUpdateSecretOption | 
try {
    apiInstance.updateOrgSecret(org, secretname, body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#updateOrgSecret");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**| name of organization |
 **secretname** | **String**| name of the secret |
 **body** | [**CreateOrUpdateSecretOption**](CreateOrUpdateSecretOption.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

