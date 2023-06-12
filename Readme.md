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
   curl --location 'http://localhost:8080/website/category?urls=http%3A%2F%2Fwww.starwars.com%2Chttps%3A%2F%2Fwww.imdb.com%2Ffind%3Fq%3Dstar%2Bwars%2526ref_%3Dnv_sr_sm%2Chttps%3A%2F%2Fedition.cnn.com%2Fsport'
   ```
<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
## Usage

Using this API is done either via Shell, Postman or equivalent
![Shell](./assets/shell.png?raw=true "Shell screenshot")

![Postman](./assets/postman.png?raw=true "Postman screenshot")
<p align="right">(<a href="#readme-top">back to top</a>)</p>


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