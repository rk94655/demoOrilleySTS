import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Greeting;

public class Temp {

	public Temp() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String [] args) {
		RestTemplate restTemplate = new RestTemplate();
		Greeting response = restTemplate.getForObject("http://localhost:8081/rest", Greeting.class);
		System.out.println(response.getMessage());
	}

}
