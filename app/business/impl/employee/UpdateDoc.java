package business.impl.employee;

import business.impl.Command;
import models.UploadDocs;
import models.exception.BusinessException;
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
