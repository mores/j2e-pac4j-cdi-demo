package org.pac4j.demo.j2e.ui;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@ManagedBean
public class DebugFileUploadView implements java.io.Serializable
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( DebugFileUploadView.class );

	private UploadedFile file;

	public UploadedFile getFile()
	{
		log.info( "getFile: " + file );
		return file;
	}

	public void setFile( UploadedFile file )
	{
		log.info( "setFile: " + file );
		this.file = file;
	}

	public void upload()
	{
		log.info( "upload" );
		if( file != null )
		{
			FacesMessage message = new FacesMessage( "Succesful", file.getFileName() + " is uploaded." );
			FacesContext.getCurrentInstance().addMessage( null, message );
		}
	}
}
