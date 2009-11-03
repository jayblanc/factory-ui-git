package org.qualipso.factory.git.ui.gwt.impl;

import org.qualipso.factory.git.ui.gwt.service.GITService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * @author Jerome Blanchard (jayblanc@gmail.com)
 * @date 2 november 2009
 */
public class GITServiceImpl extends RemoteServiceServlet implements GITService {

	private GITService git;
	
	@Override
	public String sayGIT() {
		String message = "";
		try {
			message = "GIT dear "; 
		} catch ( Exception e ) {
			e.printStackTrace();
		}
		return message; 
	}

}
