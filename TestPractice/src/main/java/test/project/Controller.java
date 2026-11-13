package test.project;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class Controller {

    private List<Details> detailsList = new ArrayList<>();

    // GET API → Fetch all details
    @GetMapping("/details")
    public List<Details> getAllDetails() {
        return detailsList;
    }

    // POST API → Add new detail
    @PostMapping("/details")
    public String addDetails(@RequestBody Details details) {
        detailsList.add(details);
        return "Data Inserted Successfully";
    }

    // PUT API → Update detail by ID
    @PutMapping("/details/{id}")
    public String updateDetails(@PathVariable int id, @RequestBody Details updatedDetails) {
        for (Details details : detailsList) {
            if (details.getId() == id) {
                details.setName(updatedDetails.getName());
                return "Data Updated Successfully";
            }
        }
        return "Detail not found!";
    }

    // DELETE API → Remove detail by ID
    @DeleteMapping("/details/{id}")
    public String deleteDetails(@PathVariable int id) {
        detailsList.removeIf(details -> details.getId() == id);
        return "Data Deleted Successfully";
    }
}
