package business.impl.generalAdmin;

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
		if(doc.getUser().getId() == idAdmin) //limita la capacidad de borrar a los dueños (es admin)
		{
			Jpa.getManager().merge(doc);
		}
		
		else
		{
			throw new BusinessException("No puedes modificar informaci�n aportada por otro empleado/administrador");
		}
		return null;
	}
}
