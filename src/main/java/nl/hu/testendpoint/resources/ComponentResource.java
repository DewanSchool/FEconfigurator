package nl.hu.testendpoint.resources;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObjectBuilder;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import nl.hu.testendpoint.domain.Component;
import nl.hu.testendpoint.services.ComponentService;

@Path(("/components"))
public class ComponentResource {

    @GET
    @Produces("application/json")
    public String getComponents() {
        JsonArrayBuilder jab = Json.createArrayBuilder();

        for (Component component : ComponentService.getComponents().getAllComponents()) {
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

    @GET
    @Path("/{type}")
    @Produces("application/json")
    public String getSpecificComponents(@PathParam("type") String type) {
        JsonArrayBuilder jab = Json.createArrayBuilder();

        for (Component component : ComponentService.getTypeComponent(type).getAllComponents()) {
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
