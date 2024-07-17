package Gsitm.Team2.data;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    DataRepository dataRepository;
    DataMapper dataMapper;

    public DataService(DataRepository dataRepository, DataMapper dataMapper) {
        this.dataRepository = dataRepository;
        this.dataMapper = dataMapper;
    }

    public List<DataResponse> findAll() {
        return dataMapper.findAll();
    }

    public List<DataResponse> findAllByFilter(String codename, String guname) {
        return dataMapper.findAllByFilter(codename, guname);

    }

    public DataDetailResponse findById(Long id) {
        return dataMapper.findById(id);
    }
}
