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

import io.swagger.client.model.ModelPackage;
import io.swagger.client.model.PackageFile;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PackageApi
 */
@Ignore
public class PackageApiTest {

    private final PackageApi api = new PackageApi();

    /**
     * Delete a package
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deletePackageTest() throws Exception {
        String owner = null;
        String type = null;
        String name = null;
        String version = null;
        api.deletePackage(owner, type, name, version);

        // TODO: test validations
    }
    /**
     * Gets a package
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPackageTest() throws Exception {
        String owner = null;
        String type = null;
        String name = null;
        String version = null;
        ModelPackage response = api.getPackage(owner, type, name, version);

        // TODO: test validations
    }
    /**
     * Gets all files of a package
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listPackageFilesTest() throws Exception {
        String owner = null;
        String type = null;
        String name = null;
        String version = null;
        List<PackageFile> response = api.listPackageFiles(owner, type, name, version);

        // TODO: test validations
    }
    /**
     * Gets all packages of an owner
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listPackagesTest() throws Exception {
        String owner = null;
        Integer page = null;
        Integer limit = null;
        String type = null;
        String q = null;
        List<ModelPackage> response = api.listPackages(owner, page, limit, type, q);

        // TODO: test validations
    }
}
