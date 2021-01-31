package spring.project.com.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.project.com.model.Owner;
import spring.project.com.model.Pet;
import spring.project.com.model.PetType;
import spring.project.com.model.Vet;
import spring.project.com.service.OwnerService;
import spring.project.com.service.PetTypeService;
import spring.project.com.service.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Doug");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Garfield");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Scott");
        owner1.setAddress("123 Street");
        owner1.setCity("Pasadena");
        owner1.setTelephone("123456");

        Pet michaelsPet = new Pet();
        michaelsPet.setPetType(savedDogPetType);
        michaelsPet.setOwner(owner1);
        michaelsPet.setBirthDate(LocalDate.now());
        michaelsPet.setName("Chikaka");
        owner1.getPets().add(michaelsPet);


        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Felulla");
        owner2.setLastName("Geller");
        owner2.setAddress("Elm Street");
        owner2.setCity("New York");
        owner2.setTelephone("12345678");
        ownerService.save(owner2);

        Pet phoebesCat = new Pet();
        phoebesCat.setName("SmellyCat");
        phoebesCat.setPetType(savedCatPetType);
        phoebesCat.setBirthDate(LocalDate.now());
        phoebesCat.setOwner(owner2);
        owner2.getPets().add(phoebesCat);

        System.out.println("Loaded owners.");

        Vet vet1 = new Vet();
        vet1.setFirstName("Chandler");
        vet1.setLastName("Bing");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Phoebe");
        vet2.setLastName("Buffay");
        vetService.save(vet2);

        System.out.println("Loaded vets");
    }
}
