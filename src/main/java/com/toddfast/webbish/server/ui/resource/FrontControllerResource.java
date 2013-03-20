package com.toddfast.webbish.server.ui.resource;

import com.sun.jersey.api.view.Viewable;
import java.net.URISyntaxException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 *
 * @author Todd Fast
 */
@Path("/")
public class FrontControllerResource {

	/**
	 *
	 *
	 */
    public FrontControllerResource() {
		super();
    }


	/**
	 *
	 *
	 */
	private void skipDefaultServices(HttpServletRequest request) {

		// Check for a session cookie. If one exists, we go ahead and execute
		// the default services. Otherwise, it should be safe to skip them.
//		Cookie[] cookies=request.getCookies();
//		if (cookies!=null) {
//			for (Cookie cookie: cookies) {
//				if (Constants.SESSION_COOKIE_NAME.equals(cookie.getName())) {
//					// Found a session, which may or may not be valid.
//					// Regardless, go ahead and execute the default services.
//					return;
//				}
//			}
//		}

		// TODO: Sanitize this parameter
		request.setAttribute("skipDefaultServices",Boolean.TRUE);
	}


	/**
	 *
	 *
	 */
	@GET
    @Produces(MediaType.TEXT_HTML)
	public Response index(@Context UriInfo uriInfo,
			@Context HttpServletRequest request)
			throws URISyntaxException {

		return Response.ok(
			new Viewable("/page/index.jsp",null)).build();
	}


	/**
	 *
	 *
	 */
	@GET
	@Path("/ping")
    @Produces(MediaType.TEXT_HTML)
	public Response ping(@Context UriInfo uriInfo,
			@Context HttpServletRequest request)
			throws URISyntaxException {

		return Response.ok(
			new Viewable("/ping.jsp",null)).build();
	}


	/**
	 *
	 *
	 */
//	@GET
//	@Path("/errors/{code}")
//    @Produces(MediaType.TEXT_HTML)
//	public Viewable error(@Context HttpServletRequest request,
//		@PathParam("code") String errorCode)
//		throws ServletException, IOException
//	{
//		Integer intCode=404;
//		try {
//			intCode=Integer.parseInt(errorCode);
//		}
//		catch (NumberFormatException e) {
//			// Ignore
//		}
//
//		// TODO: Sanitize this parameter
//		request.setAttribute("errorCode",intCode);
//		return new Viewable("/WEB-INF/jsp/error.jsp",null);
//	}
}
