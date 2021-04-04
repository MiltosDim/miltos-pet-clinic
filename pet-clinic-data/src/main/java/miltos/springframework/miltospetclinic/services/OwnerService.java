package miltos.springframework.miltospetclinic.services;

import miltos.springframework.miltospetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
