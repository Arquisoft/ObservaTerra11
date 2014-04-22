package business.impl.adminONG;

import business.impl.Command;
import model.UploadDocs;
import model.exception.BusinessException;
import persistence.util.Jpa;

public class UpdateDoc implements Command{
	
	UploadDocs doc;
	
	
	public UpdateDoc(UploadDocs doc)
	{
		this.doc = doc;
	}
	
	
	public Object execute() throws BusinessException
	{
			Jpa.getManager().merge(doc);
		
		return null;
	}
}
