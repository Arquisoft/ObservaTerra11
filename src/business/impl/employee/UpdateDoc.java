package business.impl.employee;

import business.impl.Command;
import model.UploadDocs;
import model.exception.BusinessException;
import persistence.util.Jpa;

public class UpdateDoc implements Command{
	
	UploadDocs doc;
	Long idEmployee;
	
	public UpdateDoc(UploadDocs doc, Long idEmployee)
	{
		this.doc = doc;
		this.idEmployee = idEmployee;
	}
	
	
	public Object execute() throws BusinessException
	{
		if(doc.getUser().getId() == idEmployee)
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
