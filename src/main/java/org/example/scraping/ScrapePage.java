package org.example.scraping;

import org.example.base.Assignment;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScrapePage  extends Assignment {

    private Document getJsoupObj(String url) {
        try {
            return Jsoup.connect(url).get();
        }catch (Exception exp){
            exp.printStackTrace();
        }
        return null;
    }

    private void getTitle(Document doc){
        displayMessage("Document Title: "+ doc.title() );
    }

    private String getMovieName(Element element){
        return  element.getElementsByClass("ipc-title__text").text();
    }

    private MovieMeta getMovieMeta(Element element){
        Elements metaElements = element.getElementsByClass("cli-title-metadata-item");
        return new MovieMeta(
                metaElements.get(0).text(),
                metaElements.get(1).text(),
                metaElements.get(2).text()
        );
    }

    private List<MovieModel> getTopMovies(Document doc){
        Elements elements = doc.getElementsByClass("ipc-metadata-list-summary-item");
        ArrayList<MovieModel> movieModels = new ArrayList<>();
        for(Element ele: elements){
            try {
                MovieModel model = new MovieModel();
                model.setMovieName(getMovieName(ele));
                model.setMovieMeta(getMovieMeta(ele));
                movieModels.add(model);
            }catch (Exception exp){
                exp.printStackTrace();
                System.out.println(exp);
            }
        }
        return movieModels;
    }


    @Override
    public void execute() {
        final String url = "https://www.imdb.com/chart/top/";
        Document doc = getJsoupObj(url);
        assert doc !=null;
        getTitle(doc);
        List<MovieModel> moviesList = getTopMovies(doc);
        System.out.println("Total Movies" + moviesList.size());
        for(MovieModel movie: moviesList){
            System.out.println(movie.toString());
        }

    }
}
