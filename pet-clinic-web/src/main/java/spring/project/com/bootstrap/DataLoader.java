package spring.project.com.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.project.com.model.Owner;
import spring.project.com.model.Vet;
import spring.project.com.service.OwnerService;
import spring.project.com.service.VetService;

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
        owner1.setFirstName("Micheal");
        owner1.setLastName("Scott");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Felulla");
        owner2.setLastName("Geller");
        ownerService.save(owner2);

        System.out.println("Loaded owners.");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Chandler");
        vet1.setLastName("Bing");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Phoebe");
        vet2.setLastName("Buffay");
        vetService.save(vet2);

        System.out.println("Loaded vets");
    }
}
