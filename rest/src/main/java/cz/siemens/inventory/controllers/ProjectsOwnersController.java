package cz.siemens.inventory.controllers;

import cz.siemens.inventory.dao.GenericDao;
import cz.siemens.inventory.entity.Project;
import cz.siemens.inventory.controllers.exceptions.ResourceAlreadyExistsException;
import cz.siemens.inventory.controllers.exceptions.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiUris.ROOT_URI_PROJECTS)
public class ProjectsOwnersController {

    private GenericDao<Project> projectsDao;
    final static Logger logger = LoggerFactory.getLogger(ProjectsOwnersController.class);

    @Autowired
    public ProjectsOwnersController(GenericDao<Project> projectsDao) {
        this.projectsDao = projectsDao;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public final List<Project> findAllProjects(){
        logger.info("findAllProjects() called");
        return projectsDao.readAll();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public final Project findById(@PathVariable("id") Long id) throws Exception {
        logger.info("findById({id}) called", id);

        try {
            return projectsDao.read(id);
        } catch(Exception ex) {
            throw new ResourceNotFoundException();
        }
    }

    @RequestMapping(value = "/create", method= RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public final Project createProject(@RequestBody Project project) throws Exception {
        logger.info("createProject({0}) called", project.toString());

        try {
            projectsDao.create(project);
            return project;
        } catch(Exception ex) {
            throw new ResourceAlreadyExistsException();
        }
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public final void delete(@PathVariable("id") Long id) throws Exception {
        logger.info("delete({id}) called", id);

        try {
            projectsDao.delete(projectsDao.read(id));
        } catch (Exception ex) {
            throw new ResourceNotFoundException();
        }
    }
}