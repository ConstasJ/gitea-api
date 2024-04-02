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

import io.swagger.client.model.CreateHookOption;
import io.swagger.client.model.CreateKeyOption;
import io.swagger.client.model.CreateOrgOption;
import io.swagger.client.model.CreateRepoOption;
import io.swagger.client.model.CreateUserOption;
import io.swagger.client.model.Cron;
import io.swagger.client.model.EditHookOption;
import io.swagger.client.model.EditUserOption;
import io.swagger.client.model.Email;
import io.swagger.client.model.Hook;
import io.swagger.client.model.Organization;
import io.swagger.client.model.PublicKey;
import io.swagger.client.model.RenameUserOption;
import io.swagger.client.model.Repository;
import io.swagger.client.model.User;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AdminApi
 */
@Ignore
public class AdminApiTest {

    private final AdminApi api = new AdminApi();

    /**
     * Adopt unadopted files as a repository
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminAdoptRepositoryTest() throws Exception {
        String owner = null;
        String repo = null;
        api.adminAdoptRepository(owner, repo);

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
    public void adminCreateHookTest() throws Exception {
        CreateHookOption body = null;
        Hook response = api.adminCreateHook(body);

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
    public void adminCreateOrgTest() throws Exception {
        CreateOrgOption body = null;
        String username = null;
        Organization response = api.adminCreateOrg(body, username);

        // TODO: test validations
    }
    /**
     * Add a public key on behalf of a user
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminCreatePublicKeyTest() throws Exception {
        String username = null;
        CreateKeyOption body = null;
        PublicKey response = api.adminCreatePublicKey(username, body);

        // TODO: test validations
    }
    /**
     * Create a repository on behalf of a user
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminCreateRepoTest() throws Exception {
        CreateRepoOption body = null;
        String username = null;
        Repository response = api.adminCreateRepo(body, username);

        // TODO: test validations
    }
    /**
     * Create a user
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminCreateUserTest() throws Exception {
        CreateUserOption body = null;
        User response = api.adminCreateUser(body);

        // TODO: test validations
    }
    /**
     * List cron tasks
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminCronListTest() throws Exception {
        Integer page = null;
        Integer limit = null;
        List<Cron> response = api.adminCronList(page, limit);

        // TODO: test validations
    }
    /**
     * Run cron task
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminCronRunTest() throws Exception {
        String task = null;
        api.adminCronRun(task);

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
    public void adminDeleteHookTest() throws Exception {
        Long id = null;
        api.adminDeleteHook(id);

        // TODO: test validations
    }
    /**
     * Delete unadopted files
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminDeleteUnadoptedRepositoryTest() throws Exception {
        String owner = null;
        String repo = null;
        api.adminDeleteUnadoptedRepository(owner, repo);

        // TODO: test validations
    }
    /**
     * Delete a user
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminDeleteUserTest() throws Exception {
        String username = null;
        Boolean purge = null;
        api.adminDeleteUser(username, purge);

        // TODO: test validations
    }
    /**
     * Delete a user&#x27;s public key
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminDeleteUserPublicKeyTest() throws Exception {
        String username = null;
        Long id = null;
        api.adminDeleteUserPublicKey(username, id);

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
    public void adminEditHookTest() throws Exception {
        Long id = null;
        EditHookOption body = null;
        Hook response = api.adminEditHook(id, body);

        // TODO: test validations
    }
    /**
     * Edit an existing user
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminEditUserTest() throws Exception {
        String username = null;
        EditUserOption body = null;
        User response = api.adminEditUser(username, body);

        // TODO: test validations
    }
    /**
     * List all emails
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminGetAllEmailsTest() throws Exception {
        Integer page = null;
        Integer limit = null;
        List<Email> response = api.adminGetAllEmails(page, limit);

        // TODO: test validations
    }
    /**
     * List all organizations
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminGetAllOrgsTest() throws Exception {
        Integer page = null;
        Integer limit = null;
        List<Organization> response = api.adminGetAllOrgs(page, limit);

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
    public void adminGetHookTest() throws Exception {
        Long id = null;
        Hook response = api.adminGetHook(id);

        // TODO: test validations
    }
    /**
     * List system&#x27;s webhooks
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminListHooksTest() throws Exception {
        Integer page = null;
        Integer limit = null;
        List<Hook> response = api.adminListHooks(page, limit);

        // TODO: test validations
    }
    /**
     * Rename a user
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminRenameUserTest() throws Exception {
        RenameUserOption body = null;
        String username = null;
        api.adminRenameUser(body, username);

        // TODO: test validations
    }
    /**
     * Search all emails
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminSearchEmailsTest() throws Exception {
        String q = null;
        Integer page = null;
        Integer limit = null;
        List<Email> response = api.adminSearchEmails(q, page, limit);

        // TODO: test validations
    }
    /**
     * Search users according filter conditions
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminSearchUsersTest() throws Exception {
        Long sourceId = null;
        String loginName = null;
        Integer page = null;
        Integer limit = null;
        List<User> response = api.adminSearchUsers(sourceId, loginName, page, limit);

        // TODO: test validations
    }
    /**
     * List unadopted repositories
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminUnadoptedListTest() throws Exception {
        Integer page = null;
        Integer limit = null;
        String pattern = null;
        List<String> response = api.adminUnadoptedList(page, limit, pattern);

        // TODO: test validations
    }
}