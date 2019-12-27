package randomName;

import java.awt.Font;
import java.util.Locale;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.javafaker.Faker;

@Path("/randomname")
public class RandomNameGenerator {
	
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    
    
    public String randomname() {
    	
    	Locale locale = new Locale("en-US");
        Faker faker = new Faker(locale);
        
        String name = faker.name().fullName();
        
        return "Name: " + name;
    }
}