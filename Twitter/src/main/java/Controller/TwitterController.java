package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Entity.twitter;
import Service.TwitterService;

@RestController
@RequestMapping
public class TwitterController {
	
	@Autowired
	private TwitterService twitterService;
	
	 @GetMapping("/search")
	    public ResponseEntity<List<twitter>> searchPeople(@RequestParam("query") String query){
	        return ResponseEntity.ok(twitterService.searchPeoples(query));
	    }
	 
	 @GetMapping("/getdetailsby/{id}")
	    public ResponseEntity<Object> getPeople(@PathVariable long id){
	        return ResponseEntity.ok(twitterService.getpeople(id));
	    }

}
