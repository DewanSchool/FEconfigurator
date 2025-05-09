package nl.hu.testendpoint.resources;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObjectBuilder;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import nl.hu.testendpoint.domain.Component;
import nl.hu.testendpoint.services.ConfiguratorService;

@Path("/configurator")
public class ConfiguratorResource {
    @GET
    @Path("/{name}")
    @Produces("application/json")
    public String getConfiguration(@PathParam("name") String name) {
        JsonArrayBuilder jab = Json.createArrayBuilder();

        for (Component component : ConfiguratorService.getConfigurator(name).getAllComponents()) {
            JsonObjectBuilder job = Json.createObjectBuilder();
            job.add("id", component.getId());
            job.add("type", component.getType());
            job.add("name", component.getName());
            job.add("description", component.getDescription());
            job.add("price", component.getPrice());
            jab.add(job);
        }

        return jab.build().toString();
    }
}
