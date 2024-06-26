/*
 * Gitea API
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.21.10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.github.constasj.gitea.api;

import io.swagger.client.model.Activity;
import io.swagger.client.model.CreateHookOption;
import io.swagger.client.model.CreateLabelOption;
import io.swagger.client.model.CreateOrUpdateSecretOption;
import io.swagger.client.model.CreateOrgOption;
import io.swagger.client.model.CreateRepoOption;
import io.swagger.client.model.CreateTeamOption;
import io.swagger.client.model.EditHookOption;
import io.swagger.client.model.EditLabelOption;
import io.swagger.client.model.EditOrgOption;
import io.swagger.client.model.EditTeamOption;
import io.swagger.client.model.Hook;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.Label;
import org.threeten.bp.LocalDate;
import io.swagger.client.model.Organization;
import io.swagger.client.model.OrganizationPermissions;
import io.swagger.client.model.Repository;
import io.swagger.client.model.Secret;
import io.swagger.client.model.Team;
import io.swagger.client.model.UpdateUserAvatarOption;
import io.swagger.client.model.User;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OrganizationApi
 */
@Ignore
public class OrganizationApiTest {

    private final OrganizationApi api = new OrganizationApi();

    /**
     * Create a repository in an organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createOrgRepoTest() throws Exception {
        String org = null;
        CreateRepoOption body = null;
        Repository response = api.createOrgRepo(org, body);

        // TODO: test validations
    }
    /**
     * Create a repository in an organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createOrgRepoDeprecatedTest() throws Exception {
        String org = null;
        CreateRepoOption body = null;
        Repository response = api.createOrgRepoDeprecated(org, body);

        // TODO: test validations
    }
    /**
     * Delete a secret in an organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteOrgSecretTest() throws Exception {
        String org = null;
        String secretname = null;
        api.deleteOrgSecret(org, secretname);

        // TODO: test validations
    }
    /**
     * Add a team member
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgAddTeamMemberTest() throws Exception {
        Long id = null;
        String username = null;
        api.orgAddTeamMember(id, username);

        // TODO: test validations
    }
    /**
     * Add a repository to a team
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgAddTeamRepositoryTest() throws Exception {
        Long id = null;
        String org = null;
        String repo = null;
        api.orgAddTeamRepository(id, org, repo);

        // TODO: test validations
    }
    /**
     * Conceal a user&#x27;s membership
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgConcealMemberTest() throws Exception {
        String org = null;
        String username = null;
        api.orgConcealMember(org, username);

        // TODO: test validations
    }
    /**
     * Create an organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgCreateTest() throws Exception {
        CreateOrgOption body = null;
        Organization response = api.orgCreate(body);

        // TODO: test validations
    }
    /**
     * Create a hook
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgCreateHookTest() throws Exception {
        CreateHookOption body = null;
        String org = null;
        Hook response = api.orgCreateHook(body, org);

        // TODO: test validations
    }
    /**
     * Create a label for an organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgCreateLabelTest() throws Exception {
        String org = null;
        CreateLabelOption body = null;
        Label response = api.orgCreateLabel(org, body);

        // TODO: test validations
    }
    /**
     * Create a team
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgCreateTeamTest() throws Exception {
        String org = null;
        CreateTeamOption body = null;
        Team response = api.orgCreateTeam(org, body);

        // TODO: test validations
    }
    /**
     * Delete an organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgDeleteTest() throws Exception {
        String org = null;
        api.orgDelete(org);

        // TODO: test validations
    }
    /**
     * Delete Avatar
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgDeleteAvatarTest() throws Exception {
        String org = null;
        api.orgDeleteAvatar(org);

        // TODO: test validations
    }
    /**
     * Delete a hook
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgDeleteHookTest() throws Exception {
        String org = null;
        Long id = null;
        api.orgDeleteHook(org, id);

        // TODO: test validations
    }
    /**
     * Delete a label
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgDeleteLabelTest() throws Exception {
        String org = null;
        Long id = null;
        api.orgDeleteLabel(org, id);

        // TODO: test validations
    }
    /**
     * Remove a member from an organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgDeleteMemberTest() throws Exception {
        String org = null;
        String username = null;
        api.orgDeleteMember(org, username);

        // TODO: test validations
    }
    /**
     * Delete a team
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgDeleteTeamTest() throws Exception {
        Long id = null;
        api.orgDeleteTeam(id);

        // TODO: test validations
    }
    /**
     * Edit an organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgEditTest() throws Exception {
        EditOrgOption body = null;
        String org = null;
        Organization response = api.orgEdit(body, org);

        // TODO: test validations
    }
    /**
     * Update a hook
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgEditHookTest() throws Exception {
        String org = null;
        Long id = null;
        EditHookOption body = null;
        Hook response = api.orgEditHook(org, id, body);

        // TODO: test validations
    }
    /**
     * Update a label
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgEditLabelTest() throws Exception {
        String org = null;
        Long id = null;
        EditLabelOption body = null;
        Label response = api.orgEditLabel(org, id, body);

        // TODO: test validations
    }
    /**
     * Edit a team
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgEditTeamTest() throws Exception {
        Integer id = null;
        EditTeamOption body = null;
        Team response = api.orgEditTeam(id, body);

        // TODO: test validations
    }
    /**
     * Get an organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgGetTest() throws Exception {
        String org = null;
        Organization response = api.orgGet(org);

        // TODO: test validations
    }
    /**
     * Get list of organizations
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgGetAllTest() throws Exception {
        Integer page = null;
        Integer limit = null;
        List<Organization> response = api.orgGetAll(page, limit);

        // TODO: test validations
    }
    /**
     * Get a hook
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgGetHookTest() throws Exception {
        String org = null;
        Long id = null;
        Hook response = api.orgGetHook(org, id);

        // TODO: test validations
    }
    /**
     * Get a single label
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgGetLabelTest() throws Exception {
        String org = null;
        Long id = null;
        Label response = api.orgGetLabel(org, id);

        // TODO: test validations
    }
    /**
     * Get a team
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgGetTeamTest() throws Exception {
        Long id = null;
        Team response = api.orgGetTeam(id);

        // TODO: test validations
    }
    /**
     * Get user permissions in organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgGetUserPermissionsTest() throws Exception {
        String username = null;
        String org = null;
        OrganizationPermissions response = api.orgGetUserPermissions(username, org);

        // TODO: test validations
    }
    /**
     * Check if a user is a member of an organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgIsMemberTest() throws Exception {
        String org = null;
        String username = null;
        api.orgIsMember(org, username);

        // TODO: test validations
    }
    /**
     * Check if a user is a public member of an organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgIsPublicMemberTest() throws Exception {
        String org = null;
        String username = null;
        api.orgIsPublicMember(org, username);

        // TODO: test validations
    }
    /**
     * List an organization&#x27;s actions secrets
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListActionsSecretsTest() throws Exception {
        String org = null;
        Integer page = null;
        Integer limit = null;
        List<Secret> response = api.orgListActionsSecrets(org, page, limit);

        // TODO: test validations
    }
    /**
     * List an organization&#x27;s activity feeds
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListActivityFeedsTest() throws Exception {
        String org = null;
        LocalDate date = null;
        Integer page = null;
        Integer limit = null;
        List<Activity> response = api.orgListActivityFeeds(org, date, page, limit);

        // TODO: test validations
    }
    /**
     * List the current user&#x27;s organizations
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListCurrentUserOrgsTest() throws Exception {
        Integer page = null;
        Integer limit = null;
        List<Organization> response = api.orgListCurrentUserOrgs(page, limit);

        // TODO: test validations
    }
    /**
     * List an organization&#x27;s webhooks
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListHooksTest() throws Exception {
        String org = null;
        Integer page = null;
        Integer limit = null;
        List<Hook> response = api.orgListHooks(org, page, limit);

        // TODO: test validations
    }
    /**
     * List an organization&#x27;s labels
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListLabelsTest() throws Exception {
        String org = null;
        Integer page = null;
        Integer limit = null;
        List<Label> response = api.orgListLabels(org, page, limit);

        // TODO: test validations
    }
    /**
     * List an organization&#x27;s members
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListMembersTest() throws Exception {
        String org = null;
        Integer page = null;
        Integer limit = null;
        List<User> response = api.orgListMembers(org, page, limit);

        // TODO: test validations
    }
    /**
     * List an organization&#x27;s public members
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListPublicMembersTest() throws Exception {
        String org = null;
        Integer page = null;
        Integer limit = null;
        List<User> response = api.orgListPublicMembers(org, page, limit);

        // TODO: test validations
    }
    /**
     * List an organization&#x27;s repos
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListReposTest() throws Exception {
        String org = null;
        Integer page = null;
        Integer limit = null;
        List<Repository> response = api.orgListRepos(org, page, limit);

        // TODO: test validations
    }
    /**
     * List a team&#x27;s activity feeds
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListTeamActivityFeedsTest() throws Exception {
        Long id = null;
        LocalDate date = null;
        Integer page = null;
        Integer limit = null;
        List<Activity> response = api.orgListTeamActivityFeeds(id, date, page, limit);

        // TODO: test validations
    }
    /**
     * List a particular member of team
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListTeamMemberTest() throws Exception {
        Long id = null;
        String username = null;
        User response = api.orgListTeamMember(id, username);

        // TODO: test validations
    }
    /**
     * List a team&#x27;s members
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListTeamMembersTest() throws Exception {
        Long id = null;
        Integer page = null;
        Integer limit = null;
        List<User> response = api.orgListTeamMembers(id, page, limit);

        // TODO: test validations
    }
    /**
     * List a particular repo of team
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListTeamRepoTest() throws Exception {
        Long id = null;
        String org = null;
        String repo = null;
        Repository response = api.orgListTeamRepo(id, org, repo);

        // TODO: test validations
    }
    /**
     * List a team&#x27;s repos
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListTeamReposTest() throws Exception {
        Long id = null;
        Integer page = null;
        Integer limit = null;
        List<Repository> response = api.orgListTeamRepos(id, page, limit);

        // TODO: test validations
    }
    /**
     * List an organization&#x27;s teams
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListTeamsTest() throws Exception {
        String org = null;
        Integer page = null;
        Integer limit = null;
        List<Team> response = api.orgListTeams(org, page, limit);

        // TODO: test validations
    }
    /**
     * List a user&#x27;s organizations
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgListUserOrgsTest() throws Exception {
        String username = null;
        Integer page = null;
        Integer limit = null;
        List<Organization> response = api.orgListUserOrgs(username, page, limit);

        // TODO: test validations
    }
    /**
     * Publicize a user&#x27;s membership
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgPublicizeMemberTest() throws Exception {
        String org = null;
        String username = null;
        api.orgPublicizeMember(org, username);

        // TODO: test validations
    }
    /**
     * Remove a team member
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgRemoveTeamMemberTest() throws Exception {
        Long id = null;
        String username = null;
        api.orgRemoveTeamMember(id, username);

        // TODO: test validations
    }
    /**
     * Remove a repository from a team
     *
     * This does not delete the repository, it only removes the repository from the team.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgRemoveTeamRepositoryTest() throws Exception {
        Long id = null;
        String org = null;
        String repo = null;
        api.orgRemoveTeamRepository(id, org, repo);

        // TODO: test validations
    }
    /**
     * Update Avatar
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void orgUpdateAvatarTest() throws Exception {
        String org = null;
        UpdateUserAvatarOption body = null;
        api.orgUpdateAvatar(org, body);

        // TODO: test validations
    }
    /**
     * Search for teams within an organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void teamSearchTest() throws Exception {
        String org = null;
        String q = null;
        Boolean includeDesc = null;
        Integer page = null;
        Integer limit = null;
        InlineResponse200 response = api.teamSearch(org, q, includeDesc, page, limit);

        // TODO: test validations
    }
    /**
     * Create or Update a secret value in an organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateOrgSecretTest() throws Exception {
        String org = null;
        String secretname = null;
        CreateOrUpdateSecretOption body = null;
        api.updateOrgSecret(org, secretname, body);

        // TODO: test validations
    }
}
