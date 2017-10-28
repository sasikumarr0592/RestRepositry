package com.intellect.controller;



import com.intellect.model.User;
import com.intellect.service.RestService;

@RestController
public class RestController {

	@Autowired
	private RestService restService;

	@PostMapping("/create")
	public User create(@RequestBody User user) {
		return restService.create(user);
	}

	@PutMapping("/update/{id}")
	public User update(@RequestBody User user, @PathVariable String id) {
		return restService.update(user, id);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id, String active) {
		if (id != null && active == "A") {
			restService.delete(id, active);
		}
	}
}
