package Gsitm.Team2.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataRestController {

    DataService dataService;

    public DataRestController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping ("/data")
    List<DataResponse> findAll (){
        return dataService.findAll();
    }

    @GetMapping("/data/filter")
    List<DataResponse> findAllByFilter(
            @RequestParam(required = false) String codename,
            @RequestParam(required = false) String guname) {
        return dataService.findAllByFilter(codename, guname);
    }

    @GetMapping("/search")
    public List<EventListResponseDto> findByTitle(@RequestParam String title) {
        return dataService.findByTitle(title);
    }
}
