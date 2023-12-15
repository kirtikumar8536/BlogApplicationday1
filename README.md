**************************annotation********************************************
import org.springframework.web.bind.annotation.*;
1.	@GetMapping 
	when you want to map a controller method to a specific HTTP GET request. It also provides some additional benefits, such as automatic setting of the Content-Type header and support for content negotiation. @GetMapping("/view")
	In a @RestController, the @GetMapping annotation is often used to define RESTful endpoints that return JSON or XML responses
	Example @GetMapping 	
public List<Registration> getAllReg() {
 	List<Registration> reg = registrationRepo.findAll();
 		return reg; 	}

2.	@PostMapping
 	@PostMapping is often used in RESTful controllers to handle JSON or XML requests.The @RequestBody annotation is used to deserialize the request body into a Java object (JsonRequest in this case).
 	


3.	@RequestMapping 
 	It is a more general-purpose annotation that can be used to map any HTTP request method (GET, POST, PUT, DELETE, etc.) to a controller method.It is more powerful than @GetMapping, but it is also more verbose.
@RequestMapping(value = "/save", method = RequestMethod.POST)

4.	@ModelAttribute


5.	@RequestParam ex:
@RequestMapping("/deleteReg")
 	public String deleteRegistration(@RequestParam Long id, Model model) { }

6.	@RestController



7.	@PathVariable ex:
<a href="/mybooklist/${book.id}">add</a>
@GetMapping("/get-id/{id}")
public String getId(@PathVariable Long id) {}
@RequestMapping("/mybooklist/{id}")
public String MyBookList(@PathVariable("id") int id){}

@DeleteMapping("/{id}") 	
public void deleteRegistration(@PathVariable Long id){registrationRepo.deleteById(id);}

8.	@requestbody
 	@RequestBody is used to extract the HTTP request body data, often in JSON or XML format, and deserialize it into a Java object.
 	Spring automatically deserializes the JSON into a Java type, assuming an appropriate one is specified.
 	By default, the type we annotate with the @RequestBody annotation must correspond to the JSON sent from our client-side controller.


  9.	@DeleteMapping
 	The @DeleteMapping annotation is used to handle HTTP DELETE requests.
 	Using a tool like Postman or a similar HTTP client, you can send a DELETE request to the specified URL, for example, http://localhost:8080/registrations/1 where 1 is the ID of the entity you want to delete.
 	It is part of the Spring Web module and is commonly used in RESTful APIs to define methods that handle the deletion of resources.
[SPRING BOOT NOTES_KK.docx](https://github.com/kirtikumar8536/BlogApplicationday1/files/13682270/SPRING.BOOT.NOTES_KK.docx)
