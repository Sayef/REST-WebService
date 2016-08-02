package com.sayef.rs;

/**
 * Created by sayef on 8/2/16.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// Plain old Java Object it does not extend as class or implements
// an interface

// The class registers its methods for the HTTP GET request using the @GET annotation.
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML.

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /hello
@Path("/hello")
public class HelloWorld {

    // This method is called if TEXT_PLAIN is request
    @GET
    @Path("/{param}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello(@PathParam("param") String msg) {
        return msg;
    }
/*

    // This method is called if XML is request
    @GET
    @Path("/{param}")
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello(@PathParam("param") String msg) {
        return "<?xml version=\"1.0\"?>" + "<hello> " + msg + " </hello>";
    }

    // This method is called if HTML is request
    @GET
    @Path("/{param}")
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello(@PathParam("param") String msg) {
        return "<html> " + "<title>" + msg + "</title>"
                + "<body><h1>" + msg + "</body></h1>" + "</html> ";
    }
*/

}