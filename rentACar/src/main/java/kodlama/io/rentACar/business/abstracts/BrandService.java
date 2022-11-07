package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponses;


import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponses> getAll();
    void add(CreateBrandRequest createBrandRequest);
    void delete(int id);
}
