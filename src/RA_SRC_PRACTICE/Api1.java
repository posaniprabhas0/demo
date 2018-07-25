

		package RA_SRC_PRACTICE;

		import io.restassured.RestAssured;
		import io.restassured.http.ContentType;

		import static io.restassured.RestAssured.given;
		import static org.hamcrest.Matchers.equalTo;

		public class Api1  {

		public static void main(String[] args) {
		    // TODO Auto-generated method stub
		    

		            //BaseURL or Host
		            RestAssured.baseURI="https://maps.googleapis.com";
		            
		            given().
		                   param("location","16.5034957,80.665532").
		                   param("radius","500").
		                   param("key","AIzaSyBaK6bTfzKPCtXHWQJnQYalbHYqhScvBi0").
		            when().
		                   get("/maps/api/place/nearbysearch/json").
		            then().
		                   assertThat().statusCode(200).and().
		                   assertThat().contentType(ContentType.JSON).
		                   body("results[0].name",equalTo("Sri Anjaneya Restaurants")).and().
		                   body("results[0].place_id", equalTo("6c9d0b94f1cc59772c13692f1a58a546a15ce44f")).and().
		                   header("Server","scaffolding on HTTPServer2");
		              
                
		}
		public void prabhas() {
			
			System.out.println("Git commit");
		}
		}