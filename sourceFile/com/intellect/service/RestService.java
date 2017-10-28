package com.intellect.service;



import com.intellect.model.User;
import com.intellect.repository.RestRepository;

@Service
public class RestService {

	@Autowired
	private RestRepository restRepository;

	public User create (User user){
		return restRepository.create(user);
	}


	public User update ( User user, String id){
		return restRepository.update(user, id);
	}


	public void delete ( String userid,String active){
		if(userid!=null && active=="A"){
			restRepository.delete(userid);
		}

	}
}
