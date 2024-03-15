package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */

        if (outsourcedPartRepository.count() == 0) {
            addParts();
        }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        if (productRepository.count() == 0) {
            addProducts();
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }

    public void addParts() {

        OutsourcedPart woodenPlank3Pack = new OutsourcedPart();
        woodenPlank3Pack.setCompanyName("Steve's Tree Farm");
        woodenPlank3Pack.setName("Wooden Plank - 3 Pack");
        woodenPlank3Pack.setInv(20);
        woodenPlank3Pack.setPrice(60.0);
        woodenPlank3Pack.setId(101L);
        woodenPlank3Pack.setMinInv(5);
        woodenPlank3Pack.setMaxInv(500);
        outsourcedPartRepository.save(woodenPlank3Pack);

        OutsourcedPart woodenPlank8Pack = new OutsourcedPart();
        woodenPlank8Pack.setCompanyName("Steve's Tree Farm");
        woodenPlank8Pack.setName("Wooden Plank - 8 Pack");
        woodenPlank8Pack.setInv(20);
        woodenPlank8Pack.setPrice(160.0);
        woodenPlank8Pack.setId(102L);
        woodenPlank8Pack.setMinInv(5);
        woodenPlank8Pack.setMaxInv(500);
        outsourcedPartRepository.save(woodenPlank8Pack);

        OutsourcedPart wool3Pack = new OutsourcedPart();
        wool3Pack.setCompanyName("Steve's Sheep Farm");
        wool3Pack.setName("Wool - 3 Pack");
        wool3Pack.setInv(20);
        wool3Pack.setPrice(90.0);
        wool3Pack.setId(200L);
        wool3Pack.setMinInv(5);
        wool3Pack.setMaxInv(500);
        outsourcedPartRepository.save(wool3Pack);

        OutsourcedPart cobblestone8Pack = new OutsourcedPart();
        cobblestone8Pack.setCompanyName("Steve's Stone Quarry");
        cobblestone8Pack.setName("Cobblestone - 8 Pack");
        cobblestone8Pack.setInv(20);
        cobblestone8Pack.setPrice(160.0);
        cobblestone8Pack.setId(300L);
        cobblestone8Pack.setMinInv(5);
        cobblestone8Pack.setMaxInv(500);
        outsourcedPartRepository.save(cobblestone8Pack);

        OutsourcedPart stick = new OutsourcedPart();
        stick.setCompanyName("Steve's Tree Farm");
        stick.setName("Stick");
        stick.setInv(50);
        stick.setPrice(5.0);
        stick.setId(400L);
        stick.setMinInv(5);
        stick.setMaxInv(500);
        outsourcedPartRepository.save(stick);

        OutsourcedPart stick7Pack = new OutsourcedPart();
        stick7Pack.setCompanyName("Steve's Tree Farm");
        stick7Pack.setName("Stick - 7 Pack");
        stick7Pack.setInv(20);
        stick7Pack.setPrice(35.0);
        stick7Pack.setId(401L);
        stick7Pack.setMinInv(5);
        stick7Pack.setMaxInv(500);
        outsourcedPartRepository.save(stick7Pack);


        OutsourcedPart coal = new OutsourcedPart();
        coal.setCompanyName("Steve's Stone Quarry");
        coal.setName("Coal");
        coal.setInv(50);
        coal.setPrice(15.0);
        coal.setId(500L);
        coal.setMinInv(5);
        coal.setMaxInv(500);
        outsourcedPartRepository.save(coal);
    }

    public void addProducts() {

        Product chest = new Product("Chest",200.0,10);
        Product ladder = new Product("Ladder",50.0,10);
        Product bed = new Product("Bed", 250.0,5);
        Product torch = new Product("Torch", 25.0, 100);
        Product furnace = new Product("Furnace", 200.0,5);
        productRepository.save(chest);
        productRepository.save(ladder);
        productRepository.save(bed);
        productRepository.save(torch);
        productRepository.save(furnace);

    }






}
