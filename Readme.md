## About The Project
This repo contains a webservice that parses and categorises websites
according to predefined set of keywords.

This Project consists of the below:
* API - exposes two APIs 
* URLExtractor - Extracts website's contents
* WebCategorizer - Categorizes a website
<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With
- Gradle
- Spring boot
<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Getting Started
In this section we'll discuss how to get the project up and running
### Prerequisites
You'll need to have gradle installed
* to start the webservice using gradle, please type the below command
  ```sh
  ./gradlew bootRun
  ```

### Installation

_Below is an example of how you can instruct your audience on installing and setting up your app. This template doesn't rely on any external dependencies or services._

1. Get a free API Key at [https://example.com](https://example.com)
2. Clone the repo
   ```bash
   git clone https://github.com/gtoumie/website-extractor.git
   ```
3. Start SpringBoot webservice using gradle
   ```bash
   ./gradlew bootRun
   ```
4. Call the `getWebsiteText` API
   ```bash
   curl --location 'http://localhost:8080/website/text?urls=https%3A%2F%2Fwww.msn.com%2Fen-nz%2Fhealth%2Fother%2Fqueen-elizabeth-s-10-daily-habits-that-helped-her-live-96-years%2Far-AA11EmVv%3Focid%3Dhpmsn%2526cvid%3D4ac35602878e4b30bacb92bc690cc71c%2526ei%3D18%2Chttps%3A%2F%2Fwww.newstalkzb.co.nz%2Fnews%2Fsport%2Fsuper-rugby-pacific-highlanders-lose-to-force-in-dismal-defeat%2F%2Chttps%3A%2F%2Fwww.glamour.de%2Ffrisuren%2Fartikel%2Fdauerwelle%2Chttps%3A%2F%2Fwww.bbc.com%2Chttps%3A%2F%2Fwww3.forbes.com%2Fbusiness%2F2020-upcoming-hottest-new-vehicles%2F13%2F%3Fnowelcome%2Chttps%3A%2F%2Fwww.tvblog.it%2Fpost%2F1681999%2Fvalerio-fabrizio-salvatori-gli-inseparabili-chi-sono-pechino-express-2020%2Chttp%3A%2F%2Fedition.cnn.com%2F'
   ```
5. Call the `getWebsiteCategory` API
   ```bash
   curl --location 'http://localhost:8080/website/category?urls=http%3A%2F%2Fwww.starwars.com%2Chttps%3A%2F%2Fwww.imdb.com%2Ffind%3Fq%3Dstar%2Bwars%26ref_%3Dnv_sr_sm%2Chttps%3A%2F%2Fedition.cnn.com%2Fsport'
   ```
6. Start Unit Test 
    ```bash
   ./gradlew test
    ```
<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
## Usage

Using this API is done either via Shell, Postman or equivalent
![Shell](./assets/shell.png?raw=true "Shell screenshot")

![Postman-2](./assets/postman-2.png?raw=true "Postman-2 screenshot")

![Postman](./assets/postman.png?raw=true "Postman screenshot")
<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Discussion
### Complexity
Currently the complexity of the process is `O(NMK)` as 
- `N` is the length of the text
- `M` is the number of Categories
- `K` is the max keyword length

Improved complexity could be achieved by using a HashMap instead of
List to store the Keywords within a category then finding the keyword will 
not require a loop and can be done in `O(1)`
the format will be `HashSet<String>` the key is the keyword and keywords are 
stored directly as strings inside this set or extending HashSet and overriding 
hashCode and equals functions.

### Deployment
We can consider using the following components in our K8s deployment:
- Deployment: to create and manage the replicas of the application
- Service: to provide a stable IP address and DNS name for the application
- Ingress: to expose the application to the outside world
- ConfigMap: to store the keyword categories and their associated keywords as a configuration file 
- Secret: to store any sensitive information like API keys or passwords 
- Prometheus: to monitor the application and collect metrics 
- Grafana: to visualize the metrics and create dashboards 
- Horizontal Pod Autoscaler (HPA): to automatically scale the application based on CPU or memory usage


## License
Distributed under the MIT License. See `LICENSE.txt` for more information.
<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Contact
Ghassan Toumie - [@Linkedin](https://www.linkedin.com/in/ghassan-toumie-38450155) - gtoumie@gmail.com

Project Link: [https://github.com/gtoumie/website-extractor.git](https://github.com/your_username/repo_name)
<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Acknowledgments
The below resources helped me

* [Best README Template](https://github.com/othneildrew/Best-README-Template.git)
* [jsoup: Java HTML Parser](https://github.com/jhy/jsoup)

<p align="right">(<a href="#readme-top">back to top</a>)</p>