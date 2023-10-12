package org.example.scraping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter @Setter @ToString
public class MovieMeta {
    private String year;
    private String time;
    private String rate;
}
