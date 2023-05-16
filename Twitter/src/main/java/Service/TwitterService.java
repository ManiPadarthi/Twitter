package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.twitter;
import Repository.TwitterRepository;
@Service
public class TwitterService {
	
	@Autowired
	private TwitterRepository twitterRepository;

	public List<twitter> searchPeoples(String query) {
		
		return twitterRepository.searchppl(query);
	}

	public List<twitter> getpeople(long id) {
		// TODO Auto-generated method stub
		return twitterRepository.getpeopledata(id);
	}

}
