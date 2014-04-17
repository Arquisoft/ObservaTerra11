package business.impl.adminONG;

import business.impl.Command;
import model.UploadDocs;
import model.exception.BusinessException;
import persistence.util.Jpa;

public class UpdateDoc implements Command{
	
	UploadDocs doc;
	Long idAdmin;
	
	public UpdateDoc(UploadDocs doc, Long idAdmin)
	{
		this.doc = doc;
		this.idAdmin = idAdmin;
	}
	
	
	public Object execute() throws BusinessException
	{
		if(doc.getUser().getId() == idAdmin)
		{
			Jpa.getManager().merge(doc);
		}
		
		else
		{
			throw new BusinessException("No puedes modificar información aportada por otro empleado/administrador");
		}
		return null;
	}
}
