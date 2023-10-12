package org.example.scraping;


import lombok.*;

@NoArgsConstructor
@Getter @Setter @ToString
public class MovieModel {
    private String movieName;
    private MovieMeta movieMeta;

}
