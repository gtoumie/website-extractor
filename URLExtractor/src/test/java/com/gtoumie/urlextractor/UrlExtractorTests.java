package com.gtoumie.urlextractor;


import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.*;

public class UrlExtractorTests {
    public UrlExtractorTests() {
    }

    @Test
    public void testReadWebsiteList() {
        List<String> urls = Arrays.asList(
                "https://www.msn.com/en-nz/health/other/queen-elizabeth-s-10-daily-habits-that-helped-her-live-96-years/ar-AA11EmVv?ocid=hpmsn%26cvid=4ac35602878e4b30bacb92bc690cc71c%26ei=18",
                "https://www.newstalkzb.co.nz/news/sport/super-rugby-pacific-highlanders-lose-to-force-in-dismal-defeat/",
                "https://www.glamour.de/frisuren/artikel/dauerwelle",
                "https://www.bbc.com",
                "https://www3.forbes.com/business/2020-upcoming-hottest-new-vehicles/13/?nowelcome",
                "https://www.tvblog.it/post/1681999/valerio-fabrizio-salvatori-gli-inseparabili-chi-sono-pechino-express-2020",
                "http://edition.cnn.com/");
        Map<String, String> result = UrlExtractor.readWebsiteList(urls);
        assertEquals(urls.size(), result.size());
        for (String url : urls) {
            assertTrue(result.containsKey(url));
            assertFalse(result.get(url).startsWith("ERROR"));
        }
    }

    @Test
    public void testReadWebsite() throws IOException {
        String url = "https://www.bbc.com";
        String websiteText = UrlExtractor.readWebsite(url);
        assertNotNull(websiteText);
        assertFalse(websiteText.isEmpty());
    }
}
