package cucumber.steps;

import com.emobg.microservice.entity.Resource;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class ResourceCreationSteps {

    private List<Resource> resources;
    private Resource resource;

    @Given("an empty list of resources")
    public void an_empty_list_of_resources() {
        this.resources = new ArrayList<>();
    }


    @When("adding a new Resource")
    public void adding_a_new_resource() {
        // Write code here that turns the phrase above into concrete actions
        this.resource = new Resource("id","name", "25/12/2015");
        this.resources.add(resource);
    }

    @Then("the list contains {int} resource")
    public void the_list_contains_resource(Integer expectedResources) {
        // Write code here that turns the phrase above into concrete actions
        assertNumberOfResources(expectedResources);
    }


    private void assertNumberOfResources(final int expectedNumber){
        Assertions.assertEquals(expectedNumber, this.resources.size());
    }
}
