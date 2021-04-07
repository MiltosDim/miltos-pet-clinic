package miltos.springframework.miltospetclinic.bootstrap;

import miltos.springframework.miltospetclinic.model.Owner;
import miltos.springframework.miltospetclinic.model.Vet;
import miltos.springframework.miltospetclinic.services.OwnerService;
import miltos.springframework.miltospetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Marios");
        owner1.setLastName("Dimi");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Miltos");
        owner2.setLastName("Lol");
        ownerService.save(owner2);

        System.err.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Pfff");
        vet1.setLastName("Epi8eto");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("fffsfs");
        vet2.setLastName("dsdssds");
        vetService.save(vet2);

        System.err.println("Loaded vets...");
    }
}
